package project;

public class Bus extends Vehicle{
    
	public Bus(String plate, String destination) {
		super(plate, destination, 4, 2);
		// TODO Auto-generated constructor stub
	}
	
	
	protected boolean checkPreconditions(Customer c, int row, int col) {
		//left customer
		if(col>0) {
		   Customer lcustomer = seats[row][col-1];
		   
		   if(lcustomer!=null && !lcustomer.getGender().equals(c.getGender())) {
			   return false;
		   }
		   
		}
		
		//RightCustomer
		if(col<seats[row].length-1) {
			 Customer Rcustomer = seats[row][col+1];
			 if(Rcustomer!=null && !Rcustomer.getGender().equals(c.getGender())) {
				 return false;
			 }
		}		
		
	    return true;
    }
	
	
	

}
