package Package2;

//Day 6 Assignment - Method Overloading (Static polymorphism)
public class Employee {

	public void empData(int a, int b) {
		System.out.println("Employee age is : " + a);
		System.out.println("Employee experience in years : " + b);
	}
	
    public void empData(int a, int b, float c ) {
    	System.out.println("Employee age is : " + a);
		System.out.println("Employee experience in years : " + b);
		System.out.println("Employee salary in lakhs : " + c);
    }

    public static void main(String[] args) {
		Employee object = new Employee();
		object.empData(34, 7);
		object.empData(30, 5, 5.5f);
	}
}
