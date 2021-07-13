package week2;

import java.util.Scanner;

public class Is_prime {
	public static void main(String[] args) {
		int temp;
		boolean isprime=true;
		Scanner sc = new Scanner(System.in);
	     System.out.println("enter the number");
	     int num = sc.nextInt();
	     sc.close();
	     for(int i=2;i<=num/2;i++) 
	     {
	    	 temp=num%i;
	    	 if(temp==0)
	    	 {
	    		 isprime=false;
	    		 break;
	    	 }
	     }
	    	 if(isprime)
	    		 
	    		 System.out.println("the entered number is a prime number");
	    	 else
	    		 System.out.println("the entered number is not a prime number");

	    	 
	     }

}
