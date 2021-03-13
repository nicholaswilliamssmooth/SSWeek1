import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
/** 
 * More about answering questions, this program is mainly comments detailing how to work with the Date/Time API
 * in Java 8. Imports were only added for testing
 */

/**
 * @author Nicholas Williams
 *
 */
public class MainClass {

	/**
	 * @param args No arguments are used in this program
	 */
	public static void main(String[] args) {
		System.out.print("Printing here just to have output");
		
		
		//1. Which class would you use to store your birthday in years, months, days, seconds, and nanoseconds?
			/*
			LocalDateTime
			*/

		//2. Given a random date, how would you find the date of the previous Thursday?
			/*	
			while (!dt.getDayOfWeek().toString().equals("THURSDAY")) {
				dt = dt.minusDays(1);
			}
			*/
	
		//3. What is the difference between a ZoneId and a ZoneOffset?
			/*
			ZoneID uses geographical regions, and ZoneOffset uses the offset from UTC
			*/
		
		//4. How would you convert an Instant to a ZonedDateTime? How would you convert a ZonedDateTime to an Instant?
			/*
			Instant inst = Instant.now();
			ZonedDateTime zdt = inst.atZone(ZoneId.of("Europe/Berlin"));
			System.out.println("\n" + zdt);
			*/
		//5. Write an example that, for a given year, reports the length of each month within that year.
			/*
			LocalDate dt = LocalDate.of(2021, 1, 1);
			dt.getYear();
			dt.lengthOfMonth();
			for (int i = 0; i < 12; i++) {
				System.out.println(dt.lengthOfMonth());
				dt = dt.plusMonths(1);
			}
			*/


		//6. Write an example that, for a given month of the current year, lists all of the Mondays in that month.
			/*
			LocalDate dt = LocalDate.of(2021, LocalDate.now().getMonth(), 1);
			for (int i = 0; i < dt.getDayOfMonth(); i++) {
				if (dt.getDayOfWeek().toString().equals("MONDAY"))
					System.out.println(dt);
				dt = dt.plusDays(1);
			}
			*/
		
		//7. Write an example that tests whether a given date occurs on Friday the 13th.
			/*	
			if (dt.getDayOfWeek().toString().equals("MONDAY") && dt.getDayOfMonth() == 13) {
				return true;
			}
			*/


	}

}
