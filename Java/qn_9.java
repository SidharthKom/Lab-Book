package Lab_1;

import java.util.Scanner;

public class qn_9 {
	void add(String str1) {
		String added = str1+str1;
		System.out.println("Added String: "+ added);
	}
	
	void replace(String str1) {
		StringBuilder re = new StringBuilder(str1);
		for(int i =0;i<re.length();i++) {
			if(i%2 ==0)
				re.setCharAt(i, '#');
		}
		System.out.println("Replaced: "+ re);
	}
	
	void removeDuplicate(String str1) {
		String dupl = "";
		
		for(int i=0;i<str1.length();i++) {
			char c = str1.charAt(i);
			if(dupl.indexOf(c)== -1)
				dupl +=c;
		}
		System.out.println("Duplicates Removed: "+ dupl);
		
	}
	
	void uppercase(String str1) {
		StringBuilder modif = new StringBuilder(str1);
		for(int i =0;i<str1.length();i++) {
			if(i%2 ==0) {
				modif.setCharAt(i,Character.toUpperCase(modif.charAt(i)));
			}
		}
		System.out.println(modif);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1;
		int a;
		System.out.println("Enter the string: ");
		str1 = sc.nextLine();
		System.out.println("Enter the Option: ");
		System.out.println("1: Add String to itself");
		System.out.println("2: Replace odd with #");
		System.out.println("3: Remove Duplicate characters ");
		System.out.println("4: Change odd Characters to uppercase ");
		a = sc.nextInt();
		System.out.println(str1);
		qn_9 obj = new qn_9();
		switch (a) {
		case 1:
			obj.add(str1);
			break;
		case 2:
			obj.replace(str1);
			break;
		case 3:
			obj.removeDuplicate(str1);
			break;
		case 4:
			obj.uppercase(str1);
			break;

		default:
			break;
		}

		
		
	}
	

}

