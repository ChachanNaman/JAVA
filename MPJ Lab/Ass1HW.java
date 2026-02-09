import java.util.Scanner;

class elecScooter{
    private String rideID;
    private double distanceTravelled;
    private double batteryUsed;
    private double rideDuration;

    //constructor 
    public elecScooter(String rideID, double distanceTravelled, double batteryUsed, double rideDuration) {
        this.rideID = rideID;
        this.distanceTravelled = distanceTravelled;
        this.batteryUsed = batteryUsed;
        this.rideDuration = rideDuration;
    }

    //efficiency
    public double calculateEfficiency() {

        return distanceTravelled / batteryUsed;
    }

    //display 
    public void displayRideDetails() {
        System.out.println("Ride ID: " + rideID);
        System.out.println("Distance Travelled: " + distanceTravelled + " km");
        System.out.println("Battery Used: " + batteryUsed + " %");
        System.out.println("Ride Duration: " + rideDuration + " minutes");
        System.out.println("Efficiency: " + calculateEfficiency());
    }

}

public class Ass1HW {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Ride ID: ");
        String rideID = sc.nextLine();

        System.out.print("Enter Distance Travelled (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter Battery Used (%)    : ");
        double battery = sc.nextDouble();

        System.out.print("Enter Ride Duration (minutes): ");
        double duration = sc.nextDouble();

        elecScooter ride = new elecScooter(rideID, distance, battery, duration);

        ride.displayRideDetails();
        
        sc.close();
    }

}
