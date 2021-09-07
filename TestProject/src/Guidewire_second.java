import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Guidewire_second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "my.song.mp3 11b\r\n" + 
				"greatSong.flac 1000b\r\n" + 
				"not3.txt 5b\r\n" + 
				"video.mp4 200b\r\n" + 
				"game.exe 100b\r\n" + 
				"mov!e.mkv 10000b";
		String result = Guidewire_second.solution(S);
		System.out.println(result);

	}
	
	 public static String solution(String S) {
	        // write your code in Java SE 8
		 String result = "";
		 
		 List<String> file = new ArrayList<String>();
		 List<String> fileName = new ArrayList<String>();
		 List<String> fileSize = new ArrayList<String>();
		 
		 String[] musicFiles = { "mp3", "aac", "flac" };
		 String[] imageFile = { "jpg", "bmp", "gif" };
		 String[] movieFile = { "mp4", "avi", "mkv" };
		 
		 String[] spaceSep = S.split(" ");
		 List<String> items = null;
		 
		 for (int i=0; i<spaceSep.length; i++) {
				 
				 file.add(spaceSep[i]);
				 System.out.println(file.get(i) + " ");
				items = Arrays.asList(file.get(i).split("\\s*,\\s*"));
		 }
		 
		 System.out.print(items.toString());
		 
		 for(int i = 0; i < file.size(); i += 2) {  // go through all the characters
			  //  System.out.println(file.get(i));
		}
		 
		 for (int i=0; i<file.size(); i++) {
			// System.out.println(file.get(i));
				if ( file.get(i).contains(".")) {
					String[] extensionSep = S.split("\\.(?=[^\\.]+$)");
					//System.out.println(extensionSep[i]);
				}
		 }
		
		 
		 return result;
	 }

}
