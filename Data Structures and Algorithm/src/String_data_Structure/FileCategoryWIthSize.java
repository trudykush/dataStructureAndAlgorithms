package String_data_Structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileCategoryWIthSize {

	public static void main(String[] args) {
		String S = "my.song.mp3 11b\r\n" + 
				"greatSong.flac 1000b\r\n" + 
				"not3.txt 5b\r\n" + 
				"video.mp4 200b\r\n" + 
				"game.exe 100b\r\n" + 
				"mov!e.mkv 10000b";
		String result = FileCategoryWIthSize.solution(S);
		System.out.println(result);
	}
	
	public static String solution(String S) {
        // write your code in Java SE 8
	 String result = "";
	 
	 List<String> file = new ArrayList<String>();
	 List<String> fileName = new ArrayList<String>();
	 List<String> fileSize = new ArrayList<String>();
	 
	 String[] musicFiles = new String[]{ "mp3", "aac", "flac" };
	 String[] imageFile = { "jpg", "bmp", "gif" };
	 String[] movieFile = { "mp4", "avi", "mkv" };
	 
	 String[] spaceSep = S.split("\\s+");
	 List<String> items = null;
	 
	 for (int i=0; i<spaceSep.length; i++) {
			 file.add(spaceSep[i]);
	 }
	 
	 boolean musicBool = false, imageBool = false, movieBool = false, otherBool = false;
	 int musicFileTotaliser = 0, imageFileTotaliser = 0, movieFileTotaliser = 0, otherFileTotaliser = 0;
	 
	 for (int i=0; i<file.size(); i++) {
		 if (file.get(i).equals("")) {
			 continue;
		 } else {
			 if (i % 2 == 0) {
				// File Name with Extension
				 String[] fileNameAndExtension = file.get(i).split(("\\.(?=[^\\.]+$)"));
				 
				 if (Arrays.asList(musicFiles).contains(fileNameAndExtension[1])) {
					 //System.out.println(fileNameAndExtension[0]);
					 musicBool = true;
				 } else if (Arrays.asList(imageFile).contains(fileNameAndExtension[1])) {
					 //System.out.println(fileNameAndExtension[0]);
					 imageBool = true;
				 } else if (Arrays.asList(movieFile).contains(fileNameAndExtension[1])) {
					 //System.out.println(fileNameAndExtension[0]);
					 movieBool = true;
				 } else {
					 //System.out.println(fileNameAndExtension[0]);
					 otherBool = true;
				 }
			 } else {
				 // File Size
				 String fileSizeString = file.get(i).substring(0,file.get(i).length() - 1);
				 int fileSizeValue = Integer.parseInt(fileSizeString);
				 
				 if (musicBool) {
					 musicFileTotaliser += fileSizeValue;
					 //System.out.println(musicFileTotaliser);
					 musicBool = false;
				 } else if (imageBool) {
					 imageFileTotaliser += fileSizeValue;
					 //System.out.println(imageFileTotaliser);
					 imageBool = false;
				 } else if (movieBool) {
					 movieFileTotaliser += fileSizeValue;
					 //System.out.println(movieFileTotaliser);
					 movieBool = false;
				 } else {
					 otherFileTotaliser += fileSizeValue;
					 //System.out.println(otherFileTotaliser);
					 otherBool = false;
				 }
				 //System.out.println();
			 }
		 }
	 }
	 
	System.out.println("Music " + musicFileTotaliser);
	System.out.println("Image " + imageFileTotaliser);
	System.out.println("Movie " + movieFileTotaliser);
	System.out.println("Other " + otherFileTotaliser);
	 
	 return result;
 }

}
