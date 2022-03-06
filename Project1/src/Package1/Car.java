package Package1;

public class Car extends Land_Vehicle{
	//Car class is child of Land_Vehicle class and grand child of Vehicle class
	public void CarBrand() {
		System.out.println("Car Brand is Maruti");
	}

	public static void main(String[] args) {
		Car object = new Car();
		object.VehiclePrice();/*calling Vehicle(GrandParent) class method showing 
                                multilevel inheritance */
		object.VehicleType(); /*calling Land_Vehicle(Parent) class method showing 
		                        single level inheritance */
		object.CarBrand();
	}
}
