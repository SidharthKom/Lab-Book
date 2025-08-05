package Lab_1;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class qn_11{

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Enter the date");
        String a = sc.nextLine();
        LocalDate date = LocalDate.parse(a, formatter);
        LocalDate curDate = LocalDate.now();
        Period dur = Period.between(date, curDate);
        
        System.out.println("The Duration is: ");
        System.out.println("Years  : " +dur.getYears());
        System.out.println("Months : " + dur.getMonths());
        System.out.println("Days   : " +dur.getDays());

        
    }
}
