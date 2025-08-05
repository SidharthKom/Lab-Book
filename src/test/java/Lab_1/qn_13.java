package Lab_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class qn_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("Enter the Purchase Date: ");
		String a1 = sc.nextLine();
		LocalDate date = LocalDate.parse(a1,formatter);
		System.out.println("Enter the Warrenty period ");
		System.out.println("Year: ");
		int years = sc.nextInt();
		System.out.println("Month: ");
		int months = sc.nextInt();
		LocalDate war = date.plusYears(years).plusMonths(months);
		System.out.println("Expries on: "+war.format(formatter));
		
	}
}
