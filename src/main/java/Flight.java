import java.util.ArrayList;
import java.util.Date;

public class Flight {


    ArrayList<Passenger> passenger;
    Plane plane;
    String flightNumber = "BA-444";
    String destAirport = "VAC";
    String depAirport = "GLA";
    Date flightTime = new Date();

//    String depTime = "21:00";

    public Flight() {
        this.passenger = new ArrayList<Passenger>();
        plane = Plane.BOEING747;

    }

    public String getFlightNumber() {
        return flightNumber;
    }


    public String getDestAirport() {
        return destAirport;
    }

    public String getDepAirport() {
        return depAirport;
    }

    public Date getFlightTime(){
        System.out.println("Your flight departs at: " + flightTime);
        System.out.println("You better hurray UP!!!!");
        return flightTime;

    }
//    public String getDepTime() {
//        return depTime;
//    }

    public int checkFlightHasRoom() {
        return plane.getPlaneCapacity() - this.passengerList();
    }

//    public Passenger findPassenger(String name) {
//        Passenger foundPassenger = null;
//        for (Passenger passenger : this.passenger) {
//            if (passenger.getPassengersName() == name) {
//                foundPassenger = passenger;
//            }
//        }
//        return foundPassenger;
//    }

    public int passengerList() {
        Passenger passengerTotal = null;
        return this.passenger.size();
    }

    public int addPassengerToFlight(Passenger passenger) {
        if (this.passengerList() < this.checkFlightHasRoom());
            this.passenger.add(passenger);
            this.passenger.add(passenger);
            this.passenger.add(passenger);
        return this.passenger.size();
    }

    public int checkHowMuchBaggageWeightUsed(Passenger passenger) {
        int passengersBaggage = this.addPassengerToFlight(passenger);
        int baggage = passengersBaggage * plane.getWeightAvailablePerBag();
        return baggage;
    }

}


