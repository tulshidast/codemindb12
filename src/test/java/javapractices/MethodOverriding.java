package javapractices;

public class MethodOverriding {

	public static void main(String[] args) {
		Vehicle_1 vehicle_1 = new TwoWheelerVehicle_1();
		vehicle_1.changeGear();
	}
}

class Vehicle_1 {

	String manufacturer;
	String color;

	public void changeGear() {
		System.out.println("4 Wheeler gear changing machnism");
	}

	public void breakingSystem() {
	}

}

class TwoWheelerVehicle_1 extends Vehicle_1 {

	public void changeGear() {
		System.out.println("2 Wheeler gear changing machnism");
	}
}
