package Package2;

//Day 6 Assignment - child class to show Method Overriding in dynamic polymorphism
public class Student extends School {
	public void Name() {
		System.out.println("Student name is Megha");
	}
	
	public static void main(String[] args) {
		School obj = new School();
		Student obj1 = new Student();
		obj1.Name();		
	}
}
