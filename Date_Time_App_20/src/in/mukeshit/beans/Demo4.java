package in.mukeshit.beans;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo4 {
	public static void main(String[] args) {
		ZoneId of=ZoneId.of("America/Marigot");
		System.out.println("Zone ID:: "+of);
		ZonedDateTime now =ZonedDateTime.now();
		System.out.println( now );
		System.out.println("Year :: "+now.getYear());
		System.out.println("Month :: "+now.getMonthValue());
		System.out.println("Day:: "+now.getDayOfMonth());
		
	}

}
