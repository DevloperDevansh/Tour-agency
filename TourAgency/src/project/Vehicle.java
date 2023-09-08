package project;

public class Vehicle {

	
	private String plate;
    private String destination;
    protected Customer[][] seats;
    
    
	public Vehicle(String plate, String destination,int rows,int coloumn) {
		super();
		this.plate = plate;
		this.destination = destination;
		seats = new Customer[rows][coloumn];
	}
	
	
	protected boolean isSeatAvailable(int rows,int coloumn) {
		return seats[rows][coloumn] == null;
		
	}
	
	
	protected boolean checkPreconditions(Customer c, int row, int col) {
		
	     return true;
   }
	
   
   //reserver seat logic
   public String reserveSeats(Customer c) {
	
	   //loop for 
	   for(int i=0;i<seats.length;i++) {
		   for(int j=0;j<seats[i].length;j++) {
			 if(isSeatAvailable(i, j) && checkPreconditions(c, i, j)) {
				 seats[i][j] = c;
				 return i +"-"+j;
			 }
		   }
	   }
	   return "";  //no seats availble
   }
   
   public String[][] listSeats(){
	   String [][]seatslist = new String[seats.length][seats[0].length];
	   
	   for(int i=0;i<seats.length;i++) {
		   for(int j=0;j<seats[i].length;j++) {
			   if(seats[i][j]!=null) {
				   seatslist[i][j] = seats[i][j].getName();
			   }else {
				   seatslist[i][j] = "Empty";
			   }
		   }
		   
	   }
	   return seatslist;   
	   
   }

   public String getPlate() {
	return plate;
   }

   public void setPlate(String plate) {
	this.plate = plate;
   }

    public String getDestination() {
	  return destination;
    }

   public void setDestination(String destination) {
	 this.destination = destination;
   }
   
}
