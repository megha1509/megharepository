package Package2;

//Day5 Assignment1 - Parent1 class inherited by Child1 class
public class Parent1 {

	public Parent1() {
		this(12,4,5); 
		System.out.println("Parent default constructor");
	}
	public Parent1(int a) {
		this(23,43);
		System.out.println("Parent 1 parameterized constructor");
	}
	public Parent1(int a, int b) {
		this();
		System.out.println("Parent 2 parameterized constructor");
	}
	public Parent1(int a, int b, int c) {
		System.out.println("Parent 3 parameterized constructor");
	}

}
