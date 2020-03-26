import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.time.temporal.ChronoUnit;

public class Test {

	private static int count;

	public static void main(String[] args) {

		int A[] = { 0, 1, 1000, 81, -91 };
		// solution(A);
		// additionOfTwoNumber(A);

		// month();
		/*
		 * int x = getLastDayOfMonth(String.valueOf(2)+ "/"+ 2020);
		 * System.out.println(x);
		 */
		int x = solution(2014, "January", "May", "Wednesday");
		System.out.println(x);
	}

	private static String month(String monthName) {
		Date date = null;
		try {
			date = new SimpleDateFormat("MMMM", Locale.ENGLISH).parse(monthName);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		System.out.println(cal.get(Calendar.MONTH));
		int monthNumber = cal.get(Calendar.MONTH) + 1;
		if (monthNumber < 10) {
			return "0" + monthNumber;
		} else {
			return "" + monthNumber;
		}

	}

	private static final String DATE_PATTERN = "MM/yyyy";

	public static int getLastDayOfMonth(String dateString) {
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern(DATE_PATTERN);
		YearMonth yearMonth = YearMonth.parse(dateString, pattern);
		LocalDate date = yearMonth.atEndOfMonth();
		return date.lengthOfMonth();
	}

	public static int solution(int Y, String A, String B, String W) {
		LocalDate tripStartDate;
		String startMontInt;
		String endMonthInt;
	    if (getMonthNumber(A) < 10) { 
			startMontInt =  "0" + (MonthName.valueOf(A).ordinal() + 1);
		} else {
			startMontInt =  "" + MonthName.valueOf(A).ordinal(); 
		} 
		
		if (getMonthNumber(A) < 10) { 
			endMonthInt =   "0" + MonthName.valueOf(B).ordinal(); 
		} else {
			endMonthInt =   "" + MonthName.valueOf(B).ordinal();
		}
		
		String startMonth = startMontInt;
		String endMonth = endMonthInt;

		int startDay = 1;
		int endDay = getLastDayOfMonth(endMonth + "/" + Y);
		LocalDate vacationStartDate = LocalDate.of(Y, Integer.parseInt(startMonth), startDay);
		if (vacationStartDate.getDayOfWeek() == DayOfWeek.MONDAY) {
			tripStartDate = vacationStartDate;
		} else {
			tripStartDate = vacationStartDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		}

		LocalDate vacationEndDate = LocalDate.of(Y, Integer.parseInt(endMonth), endDay);
		LocalDate tripEndDate = vacationEndDate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		if (tripEndDate.getMonthValue() != Integer.parseInt(endMonth)) {
			tripEndDate = vacationEndDate.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY));
		}

		int numOfWeeks = (int) (ChronoUnit.DAYS.between(tripStartDate, tripEndDate)) / 7;

		return numOfWeeks;
	}
	
	private static int getMonthNumber(String monthName) {
	    return Month.valueOf(monthName.toUpperCase()).getValue();
	}
	
	public enum Day{
		Monday,
		Tuesday,
		Wednesday,
		Thursday,
		Friday,
		Saturday,
		Sunday
		}

		public enum MonthName{
		January,
		February,
		March,
		April,
		May,
		June,
		July,
		August,
		September,
		October,
		November,
		December
		}

		//int startMonth = MonthName.valueOf(A).ordinal();



	private static int additionOfTwoNumber(int A[]) {
		List<Integer> numberList = new ArrayList<>();
		for (int i = 0; i < A.length; i++) {
			int length = (int) (Math.log10(Math.abs(A[i])) + 1);
			if (length == 2) {
				numberList.add(A[i]);
			}
		}
		int sum = numberList.stream().mapToInt(f -> f.intValue()).sum();
		return sum;
	}

	/*
	 * public static int solution(int[] A) {
	 * 
	 * count = 1; while(IntStream.of(A).anyMatch(x -> x == count)) { count++;
	 * 
	 * } System.out.println(count); return count; }
	 */

}
