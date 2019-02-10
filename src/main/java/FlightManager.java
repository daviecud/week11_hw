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

    public int getWeightAvailablePerPassenger() {
        return plane.getWeightAvailablePerBag();
    }
    public int checkHowMuchBaggageWeightUsed(Passenger passenger) {
        int passengersBaggage = flight.addPassengerToFlight(passenger);
        int baggage = passengersBaggage * plane.getWeightAvailablePerBag();
        return baggage;
    }

    public int checkHowMuchBaggageWeightLeft(Passenger passenger) {
        int passengersBaggageLeft = plane.getWeightAvailableForBaggage() - this.checkHowMuchBaggageWeightUsed(passenger);
        return passengersBaggageLeft;

    }

}
