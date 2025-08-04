package Lab_1;
import java.util.Scanner;
public class qn_10 {
	boolean pos(String a) {
		StringBuilder str = new StringBuilder(a);
		for(int i =1;i<str.length();i++) {
			if(str.charAt(i) <= str.charAt(i-1)) {
				return false;
				
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		System.out.println("Enter the String: ");
		a = sc.nextLine();
		qn_10 obj = new qn_10();
		boolean result = obj.pos(a);
		if (result) {
	        System.out.println("It is a positive string.");
	    } else {
	        System.out.println("It is a Negative string.");
	    }
		
		
	}
}
