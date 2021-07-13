package week2;

import java.util.Scanner;

public class Nested_switchcase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     System.out.println("enter the tech ");
	       int tech = sc.nextInt();
		 System.out.println("enter the course ");
		   int course = sc.nextInt();
		   
		   switch(tech) {
		   
		   case 1:
		    	 System.out.println("python");
		     break;
		   case 2:
			   switch(course) {
			   
			   case 1:
			    	 System.out.println("J2EE");
			         break;
			   case 2:
		    	     System.out.println("Advance JAVA");
		             break;
		     
		   }
			   
			   
		   }
	       
	}
}
