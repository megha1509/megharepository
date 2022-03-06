package Package2;

//Day5 Assignment2 - use of this keyword by child class to call parent class methods
public class Child2 extends Parent2 {
	
	  public void method5() {
		 super.method2(56);
		 System.out.println("Child default method");
		 this.method8(4,6,7);
		 this.method6(78);
		 this.method7(67,56);
	  }
	  public void method6(int a) {
		 System.out.println("Child 1 parameterized method");
	  }
	  public void method7(int a, int b) {
		 System.out.println("Child 2 parameterized method");
	  }
	  public void method8(int a, int b, int c) {
		 System.out.println("Child 3 parameterized method");
	  }
	  
	  public static void main(String[] args) {
		 Child2 object = new Child2();
		 object.method5();	
	  }
	 
}
