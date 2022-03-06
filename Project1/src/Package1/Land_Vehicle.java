package Package1;

public class Land_Vehicle extends Vehicle {
	//Land_Vehicle class is child of Vehicle class 
	public void VehicleType() {
		System.out.println("Vehicle Type is Land Vehicle");
	}

	public static void main(String[] args) {
		Land_Vehicle object = new Land_Vehicle();
		object.VehiclePrice(); /*calling Vehicle(Parent) class method showing 
                                 single level inheritance */
		object.VehicleType(); 
	}
}
