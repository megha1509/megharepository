package Package1;

//Day3 Assignment - Use of this keyword in constructor to call other constructors
public class Constructor1 {
    
	public Constructor1() { 
		this(32,65,21);
		System.out.println("default constructor");
	}
	public Constructor1(int a) {	
		this();
		System.out.println("one parameterized constructor");
	}
    public Constructor1(int a, int b) {
    	this(45);
		System.out.println("two parameterized constructor");
	}

    public Constructor1(int a, int b, int c) {
	    System.out.println("three parameterized constructor ");
    }

    public Constructor1(int a, int b, int c, int d) {
    	this(6,7);
	    System.out.println("four parameterized constructor");
    }
    
    public Constructor1(int a, int b, int c, int d, int e) {
    	this(4,67,89,43);
	    System.out.println("five parameterized constructor");
    }
     
    public static void main(String[] args) {
		Constructor1 object = new Constructor1(24,54,56,78,32); //Class Object creation using 5 parameters constructor 
	}
}

