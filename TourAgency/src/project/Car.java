package project;

public class Car extends Vehicle{

	public Car(String plate, String destination) {
		super(plate, destination, 2, 2);
		// TODO Auto-generated constructor stub
	}
	
	protected boolean isLicensed(Customer c,int rows,int coloumn) {
		return c.isLicensed();
		
	}
	
}
