import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneBillCalculator {
	
	public static void main(String... args) {
		String INPUT = "00:01:07,400-234-090\n" +
	            "00:06:07,701-080-080\n" +
	            "00:05:00,400-234-090";
	    System.out.println(new PhoneBillCalculator().calculatePhoneBill(INPUT));
	}

	private static final Integer FIVE_MINUTE_CUT_OFF = 300;
	private static final Integer CENTS_PER_SECOND = 3;
	private static final Integer CENTS_PER_STARTED_MINUTE = 150;

	private static final Comparator<List<PhoneCall>> PHONE_CALL_LIST_COMPARATOR = (l1, l2) -> {
		int comparedValue = -1 * l1.stream().map(x -> x.seconds).reduce(0, (x, y) -> x + y)
				.compareTo(l2.stream().map(x -> x.seconds).reduce(0, (x, y) -> x + y));
		return comparedValue == 0 //This is important! The duration between two sets of 
				//calls could be the same, but the cost calc could be very different!
				? l1.stream().findFirst().get().phoneNumber.replace("-", "")
				.compareTo(l2.stream().findFirst().get().phoneNumber.replace("-", ""))
				: comparedValue;
	};

	public int calculatePhoneBill(String csvString) {
		return Arrays.stream(csvString.split("\r?\n"))
				.map(x -> x.split(","))
				.map(Arrays::asList)
				.map(PhoneCall::new) //Stream<PhoneCall>
				.collect(Collectors.groupingBy(x -> x.phoneNumber)) //Map<String, List<PhoneCall>>
				.values() //Only deal with the grouped phone numbers
				.stream()
				.sorted(PHONE_CALL_LIST_COMPARATOR) //Sort by longest duration/phone number
				.skip(1) //Remove the longest total duration
				.flatMap(List::stream) //flat map to a list of calls
				.reduce(0, (curCost, call) -> curCost + costCalc(call) , (curCost, addCost) -> curCost + addCost); 
				//Return the total cost of all calls, calculated individually
	}

	private int costCalc(PhoneCall phoneCall) {
		return phoneCall.totalSeconds >= FIVE_MINUTE_CUT_OFF
				? ((phoneCall.hours * 60) + (phoneCall.minutes) + (phoneCall.seconds > 0 ? 1 : 0)) * CENTS_PER_STARTED_MINUTE
				: ((phoneCall.minutes * 60) + (phoneCall.seconds)) * CENTS_PER_SECOND;
	}

	private static class PhoneCall {
		final String phoneNumber;
		final int hours;
		final int minutes;
		final int seconds;
		final int totalSeconds;

		PhoneCall(List<String> values) {
			phoneNumber = values.get(1);
			String[] durationArray = values.get(0).split(":");
			hours = Integer.valueOf(durationArray[0]);
			minutes = Integer.valueOf(durationArray[1]);
			seconds = Integer.valueOf(durationArray[2]);
			totalSeconds = (hours * 3600) + (minutes * 60) + (seconds);
		}
	}

}
