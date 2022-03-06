package Package1;

//Day1 Assignment - to show declaration of variables and creation of methods in class
public class Student {

	int age;
	int roll_no;
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) 
	{
		Student megha = new Student();

		megha.display1();
		megha.display2();
		megha.age = 30;
		megha.roll_no = 100;
		
		System.out.println("Age = " + megha.age);
		System.out.println("Roll No. = " + megha.roll_no);
		
	}
}