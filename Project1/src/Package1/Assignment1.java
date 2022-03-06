package Package1;


public class Assignment1 {
	//using this keyword for method calling
    public void method1() {
    	System.out.println("I am method one");
    	this.method2(); //calling method2
    	this.method3(); //calling method3
    	this.method4(); //calling method4
    }
    public void method2() {
    	System.out.println("I am method two");

    }
    public void method3() {
    	System.out.println("I am method three");

    }
    public void method4() {
    	System.out.println("I am method four");

    }
    public static void main(String[] args) {
		Assignment1 object = new Assignment1();
		object.method1();				
	}
}
