package week2;

public class typecasting {
	public static void main(String[] args) {
		byte b=10;

		int i=b;// will accept - automatic type promotion

		//byte c=i;// will not accept - because lower type cannot be put in higher

		byte d=(byte)i;// Type casting makes it possible to store compatible types.

		byte x=10;
		byte y=20;
		//byte m=x*y;// Error is thrown because when two bytes are used in a arthmetic 
		int sum=x*y; 
		System.out.println("the sum is......:"+sum);
	}

}
