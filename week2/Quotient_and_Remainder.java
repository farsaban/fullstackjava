package week2;

import java.util.Scanner;

public class Quotient_and_Remainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     	
	     
	     System.out.println("enter a value");
	     int a = sc.nextInt();
	     System.out.println("enter b value");
	     int b = sc.nextInt();
	     
	     int quotent=a/b;
	     int remainder=a%b;
	     System.out.println("the quotent value is"+quotent);
	     System.out.println("the remainder value is"+remainder);
	     }

}
