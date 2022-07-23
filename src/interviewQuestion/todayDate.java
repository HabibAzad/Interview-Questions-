package interviewQuestion;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class todayDate {

	public static void main(String[] args) {
		// how to get todays date in java
		
		//1. Using date object
		
	
		
// Local date with Time
		//Date date = new Date(06, 10, 2022);
		
        //System.out.println(date);
        // LocalDate.        
        LocalDate now = LocalDate.now();
        System.out.println(now);
        int year = now.getYear();
        System.out.println(year);
        Month month = now.getMonth();
        System.out.println(month.name());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getDayOfYear());
        //Local Date with Time.      
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
 
		
	}

}
