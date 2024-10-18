package utils;

import java.util.Date;

public class Timestamps {

	

	 public static String getEmailTimestamp() {
			
			Date date = new Date();
			return "rafiqueltaj"+date.toString().replace(" ", "_").replace(":", "_")+"@gmail.com";
	
	 }
	
	
	
	
	
}
