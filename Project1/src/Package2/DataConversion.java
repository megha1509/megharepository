package Package2;

//Day 6 Assignment - implicit and explicit data type conversion
public class DataConversion {
	
	public float sum(int x1, int x2) {
		float sumResult = x1 + x2;
		return sumResult;	
	}
	
	public int multiply(int x3, int x4) {
		int multResult = x3 * x4;
		return multResult;	
	}
	
	public int subtract(char x5, char x6) {
	    int subResult = x5 - x6;
		return subResult;		
	}

	public static void main(String[] args) {
		DataConversion object = new DataConversion();
		
		int sum = (int)object.sum(5, 60); // Explicit conversion from float to integer
		System.out.println("Sum of two numbers : " + sum);
		
		int sub = object.subtract('g', 'b'); //Implicit conversion from char to integer
		System.out.println("Subtraction of two numbers : " + sub);
		
		int multiply = (int)object.multiply((int)6.7F,(int)6.9F); //Explicit conversion of method parameters from float to integer
		System.out.println("Multiplication of two numbers : " + multiply);				
	}
}
