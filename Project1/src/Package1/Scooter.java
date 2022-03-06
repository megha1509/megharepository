package Package1;

//Day4 Assignment3 - to show hierarchical inheritance
public class Scooter extends Land_Vehicle{
	//Scooter class is child of Land_Vehicle and have single level inheritance
	//Sccooter and Car class both are child of Land_Vehicle, thus have hierarchical inheritance relationship
	public void ScooterBrand() {
		
		System.out.println("Scooter Brand is Honda");
	}
	
    public static void main(String[] args) {
		Scooter object = new Scooter();
		object.VehicleType();
		object.ScooterBrand();
		
	}
}
