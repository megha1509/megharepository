package Package2;

/*Day4 Assignment - Is A Relationship with Class A in package 1*/

import Package1.ClassA; //import ClassA of Package1

public class ClassB {
	
	public void methodB() {
		System.out.println("I am method B of Class B");
	}
	   
	public static void main(String[] args) {
		ClassA objectA = new ClassA(); //Created Object of ClassA
		objectA.methodA(); //Calling ClassA method
		
		ClassB objectB = new ClassB(); //Created Object of ClassB
		objectB.methodB(); //Calling ClassB method
	}
}
