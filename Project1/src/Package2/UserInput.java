package Package2;

import java.util.Scanner;

//Day7 Assignment - to take input from user using Scanner class methods
public class UserInput {
	
	public float sum(float x1, float x2) { // Sum Method creation
	  float y1 = x1 + x2;
	  System.out.println("Sum of two numbers = " + y1);
	  return y1;
	}
	
	public float sub(float x3, float x4) { // Subtraction Method creation 
	  float y2 = x3 - x4;
	  System.out.println("Subtraction of two numbers = " + y2);
	  return y2;
    }
	
	public float multiply(float x5, float x6) { // Multiplication Method creation 
	  float y3 = x5 * x6;
	  System.out.println("Multiplication of two numbers = " + y3);
	  return y3;
	}

	public float division(float x7, float x8) { // Division Method creation
	  float y4 = x7/x8;
	  System.out.println("Division of two numbers = " + y4);
	  return y4;
	}	
	
	public static void main(String[] args) {
		
		Scanner object = new Scanner(System.in); // Scanner class object creation
		UserInput inputObject = new UserInput(); 
		System.out.print("Enter value of x1 : ");
		float x1 = object.nextFloat(); // To take float input from user using Scanner class method
		System.out.print("Enter value of x2 : ");
		float x2 = object.nextFloat(); 
		float sum1 = inputObject.sum(x1, x2); // calling sum method
		System.out.print("Enter value of x3 : ");
		float x3 = object.nextFloat(); 
		float sub = inputObject.sub(sum1, x3);  // calling sub method
		System.out.print("Enter value of x4 : ");
		float x4 = object.nextFloat();
		float sum2 = inputObject.sum(sub, x4); // calling sum method
		System.out.print("Enter value of x5 : ");
		float x5 = object.nextFloat();
		float mult = inputObject.multiply(sum2, x5); // calling multiply method
		System.out.print("Enter value of x6 : ");
		float x6 = object.nextFloat();
		float divide = inputObject.division(mult, x6); // calling division method
		System.out.print("** Final Result ** : " + divide );
		
	}
}
