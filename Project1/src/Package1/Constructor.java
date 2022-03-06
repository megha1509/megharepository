package Package1;

//Day3 Assignment - Use of this keyword in constructor to call other constructors
public class Constructor {
    
	public Constructor() { 
		this(1,2,3); 
		System.out.println("default constructor");
	}
	public Constructor(int a) {	
		this(2,3,4,5);
		System.out.println("one parameterized constructor");
	}
    public Constructor(int a, int b) {
    	this();
		System.out.println("two parameterized constructor");
	}

    public Constructor(int a, int b, int c) {
	    System.out.println("three parameterized constructor ");
    }

    public Constructor(int a, int b, int c, int d) {
    	this(6,7);
	    System.out.println("four parameterized constructor");
    }
     
    public static void main(String[] args) {
		Constructor object = new Constructor(24); //Class Object
	}
}
