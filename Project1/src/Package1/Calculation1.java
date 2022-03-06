package Package1;

//Day2 Assignment1 - to create different methods for performing mathematical operations
public class Calculation1 {
 
	public int sum(int a, int b) { // Parameterized non void method
		int c; //local variable
		c = a + b;
		return c;
	}
	public int sub(int x, int y) { // Parameterized non void method
		int z; //local variable
		z = x - y;
		System.out.println("**Subtraction** result is: " + z);
		return z;
	}
	public int multiply(int a1, int b1) { // Parameterized non void method
		int c1; //local variable
		c1 = a1 * b1;
		System.out.println("**Mutiplication** result is: " + c1);
		return c1;
	}
	public void division(int x1, int y1) { // Parameterized void method
		int z1; //local variable
		z1 = x1/y1;
		System.out.println("**Final** result is: " + z1);
	}
	
	public static void main(String[] args) { // main method
		Calculation1 result = new Calculation1(); //class object creation
		
		int sumResult1 = result.sum(10,2);  // calling sum method
		System.out.println("**First** sum result is: " + sumResult1);
		int sumResult2 = result.sum(sumResult1,2); //calling sum method again
		System.out.println("**Second** sum result is: " + sumResult2);

		int subResult = result.sub(sumResult2,2); //calling sub method
		int multResult = result.multiply(subResult,2); //calling multiply method
		result.division(multResult,2); //calling division method		
	}
	
}
