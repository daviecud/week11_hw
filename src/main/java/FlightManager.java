import java.util.ArrayList;

public class FlightManager {


    Plane plane;
    Flight flight;
    ArrayList<Passenger> passenger;

    public FlightManager() {
        this.flight = new Flight();
        plane = Plane.BOEING747;
        this.passenger = new ArrayList<Passenger>();
    }

    public int getWeightAvailablePerBag() {
        return plane.getWeightAvailableForBaggage() / plane.getPlaneCapacity();
    }

//    public int getBaggageWeightStillAvailable() {
//        int baggageSpaceUsed = flight.checkFlightHasRoom() * this.getWeightAvailablePerBag();
//        int baggageSpaceAvailable = ;
//    }

}
