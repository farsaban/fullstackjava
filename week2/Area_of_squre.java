package week2;

import java.util.Scanner;

public class Area_of_squre {
	public static void main(String[] args) {
		System.out.println("Enter Side of Square:");
		Scanner sc = new Scanner(System.in);
		double side = sc.nextDouble();
		double area = side*side;
		System.out.println("Area of Square is: "+area);
	}

}
