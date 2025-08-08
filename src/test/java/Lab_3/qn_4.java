package Lab_3;

import java.util.Arrays;
import java.util.Scanner;
public class qn_4 {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of products: ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        String[] products = new String[n];
	    
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter product name " + (i + 1) + ": ");
	            products[i] = sc.nextLine();
	        }
	        Arrays.sort(products);
	        System.out.println("\nSorted product names:");
	        for (String product : products) {
	            System.out.println(product);
	        }

	    }
	}
