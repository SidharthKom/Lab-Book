package Lab_1;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class qn_12{

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Enter the Date 1:");
        String a1 = sc.nextLine();
        LocalDate date = LocalDate.parse(a1, formatter);
        System.out.println("Enter the Date 2:");
        String a2 = sc.nextLine();
        LocalDate date2 = LocalDate.parse(a2,formatter);
        Period dur = Period.between(date, date2);
        
        System.out.println("The Duration is: ");
        System.out.println("Years  : " +dur.getYears());
        System.out.println("Months : " + dur.getMonths());
        System.out.println("Days   : " +dur.getDays());
        
        
    }
}
