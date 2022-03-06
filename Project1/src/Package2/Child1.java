package Package2;

//Day5 Assignment1 - use of this keyword by child class to call parent class constructors
public class Child1 extends Parent1{
	public Child1() {
		super(23);
		System.out.println("Child default constructor");
	}
	public Child1(int a) {
		this(10,6,7);
		System.out.println("Child 1 parameterized constructor");
	}
	public Child1(int a, int b) {
		this(255);
		System.out.println("Child 2 parameterized constructor");
	}
	public Child1(int a, int b, int c) {
		this();
		System.out.println("Child 3 parameterized constructor");
	}

	public static void main(String[] args) {
		Child1 object = new Child1(3,4);
	}
}
