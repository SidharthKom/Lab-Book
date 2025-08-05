package Lab_1;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class qn_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Zone ID: ");
		String id = sc.nextLine();
		ZoneId zn = ZoneId.of(id);
		ZonedDateTime zoned = ZonedDateTime.now(zn);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss ");
		System.out.println("Date & Time in "+zn+" : "+zoned.format(formatter));
		
	}

}
