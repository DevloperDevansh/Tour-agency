package project;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
    	
       Customer[] customers = {
            new Customer(1, "Ayush", "Devansh", true, "Male"),
            new Customer(2, "Arvind", "Avi", false, "Male"),
            new Customer(3, "Komal", "komii", true, "Female"),
            new Customer(4, "shudhkar", "shuddu", true, "Male")
        };
        
    	
        Car car = new Car("UP42Car", "City A");
        Bus bus = new Bus("UP45Bus", "City B");
        Plane plane = new Plane("UP47Plane", "City C");
        
        
        for (Customer customer : customers) {
            String carSeat = car.reserveSeats(customer);
            String busSeat = bus.reserveSeats(customer);
            String planeSeat = plane.reserveSeats(customer);
            
            
            System.out.println(customer.getSureName()+ " reserved in car: " + carSeat);
            System.out.println(customer.getSureName()+ " reserved in bus: " + busSeat);
            System.out.println(customer.getSureName() + " reserved in plane: " + planeSeat);
            System.out.println();
            
        }

        
        System.out.println("Car Seats:");
        printSeats(car.listSeats());

        System.out.println("Bus Seats:");
        printSeats(bus.listSeats());

        System.out.println("Plane Seats:");
        printSeats(plane.listSeats());
        
        
    }

    private static void printSeats(String[][] seatList) {
        for (String[] row : seatList) {
            System.out.println(Arrays.toString(row));
        }
    }
}
