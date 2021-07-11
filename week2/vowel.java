package week2;

import java.util.Scanner;

public class vowel {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the alphabet");
    char c = sc.next().charAt(0);
    if( c=='a' || c=='e'||c=='i'||c=='o'||c=='u' )
		
		 System.out.println("The given alphabet is vowel");
	else
		System.out.println("The given alphabet is  consonant");
    
	
}	

}
