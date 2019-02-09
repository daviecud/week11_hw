import java.util.ArrayList;

public class Flight {


    ArrayList<Passenger> passenger;
    Plane plane;
    String flightNumber = "BA-444";
    String destAirport = "VAC";
    String depAirport = "GLA";
    String depTime = "21:00";

    public Flight() {
        this.passenger = new ArrayList<Passenger>();
        plane = Plane.BOEING747;

    }


//    public ArrayList<Passenger> getPassenger() {
//        return passenger;
//    }




    public String getFlightNumber() {
        return flightNumber;
    }


    public String getDestAirport() {
        return destAirport;
    }

    public String getDepAirport() {
        return depAirport;
    }

    public String getDepTime() {
        return depTime;
    }

    public int checkFlightHasRoom() {

        return plane.getPlaneCapacity() - this.passengerList();
    }

    public Passenger findPassenger(String name) {
        Passenger foundPassenger = null;
        for (Passenger passenger : this.passenger) {
            if (passenger.getPassengersName() == name) {
                foundPassenger = passenger;
            }
        }
        return foundPassenger;
    }

    public int passengerList() {
        Passenger passenger = null;
        return this.passenger.size();
    }

    public void addPassengerToFlight(Passenger passenger) {
        if (this.passengerList() < this.checkFlightHasRoom());
            this.passenger.add(passenger);
    }

//    public void checkPassengerOntoFlight(String name, ArrayList<Passenger> passengers) {
//        Passenger passenger = findPassenger(name);
//        if (passenger != null && passenger )
//    }




}
