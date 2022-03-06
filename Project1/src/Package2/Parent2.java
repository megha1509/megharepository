package Package2;

//Day5 Assignment2 - Parent2 class inherited by Child2 class
public class Parent2 {
	
  public void method1() {
	 System.out.println("Parent default method");
  }
  public void method2(int a) {
	 this.method4(3,54,6);
	 this.method1();
	 this.method3(4,5);
	 System.out.println("Parent 1 parameterized method");
  }
  public void method3(int a, int b) {
	 System.out.println("Parent 2 parameterized method");
  }
  public void method4(int a, int b, int c) {
	 System.out.println("Parent 3 parameterized method");
	 
  }
 
}
