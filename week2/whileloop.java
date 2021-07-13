package week2;

import java.util.Scanner;

public class whileloop {
	
	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
	     System.out.println("enter the no below 20");   
	     int num = sc.nextInt();
	     while(num <= 20)
	     {
	    	 sum=sum + num;
	    	 num++;
	     }
    	// System.out.println("the sum is"+sum);

	     System.out.format(" Sum of the Numbers From the While Loop is: %d ",sum);

	}

}
