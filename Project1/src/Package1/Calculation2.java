package Package1;

//Day2 Assignment2 - to create different methods for performing mathematical operations
public class Calculation2 {
 
	public int multiply(int a, int b) { // Parameterized non void method
		int c; //local variable
		c = a * b;
		return c;
	}
	public int sub(int x, int y) { // Parameterized non void method
		int z; //local variable
		z = x - y;
		System.out.println("**Subtraction** result is: " + z);
		return z;
	}
	public int sum(int a1, int b1) { // Parameterized non void method
		int c1; //local variable
		c1 = a1 + b1;
		System.out.println("**Sum** result is: " + c1);
		return c1;
	}
	public void division(int x1, int y1) { // Parameterized void method
		int z1; //local variable
		z1 = x1/y1;
		System.out.println("**Final** result is: " + z1);
	}
	
	public static void main(String[] args) { // main method
		Calculation2 result = new Calculation2(); //class object creation
		
		int multResult1 = result.multiply(10,2);  // calling multiply method
		System.out.println("**First** mutiplication result is: " + multResult1);
		
		int subResult = result.sub(multResult1,2); //calling sub method
		
		int multResult2 = result.multiply(subResult,2); //calling multiply method again
		System.out.println("**Second** multiplication result is: " + multResult2);

		int sumResult = result.sum(multResult2,2); //calling sum method
		result.division(sumResult,2); //calling division method		
	}
	
}
