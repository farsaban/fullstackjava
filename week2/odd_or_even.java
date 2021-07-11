package week2;

import java.util.Scanner;

public class odd_or_even {
	public static void main(String[] args) {
		System.out.println("enter the number......:");
		Scanner sc = new Scanner(System.in);
	     int num = sc.nextInt();
	     if(num % 2  ==0)
			System.out.println("enter the number is even");
			
			else
				System.out.println("enter the number is  odd");
	      
	}

}
