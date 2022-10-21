package sharad;
public class Vehicle {
	void print() {
		System.out.println("vehicle");
	}
	String getVehiclename() {

		return "nexon";
	}
	int getVehicleprice() {
		return 1500000;
	}
	String getCustomername() {
		return"xyz";
	}
	
	public static void main(String[] args) {
		Vehicle s= new Vehicle();
		String Vehiclename=s.getVehiclename();
		System.out.println(Vehiclename);
		int Vehicleprice=s.getVehicleprice();
		System.out.println(Vehicleprice);
		String Customername=s.getCustomername();
		System.out.println(Customername);
	}
}

