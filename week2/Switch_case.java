package week2;

import java.util.Scanner;

public class Switch_case {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the channel no");
	     int val = sc.nextInt();	
	     switch (val) {
	     case 1:
	    	 System.out.println("sports ");
	     break;
	     
	     case 2:
	    	 System.out.println(" news");
	     break;
	     
	     default:{
	    	 System.out.println("entertainment");
	     
	     }
	     
	}
	}

}
