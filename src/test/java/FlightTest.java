import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger;
    Passenger passenger1;
    Plane plane;


    @Before
    public void before(){
        passenger = new Passenger("Mexican Bob", 1);
        passenger1 = new Passenger("Joe Gauge", 1);
        plane = Plane.BOEING747;
        flight = new Flight();
        flight.addPassengerToFlight(passenger);
        flight.addPassengerToFlight(passenger1);

    }

    @Test
    public void canFindPassengers(){
        Passenger foundPassenger = flight.findPassenger("Mexican Bob");
        assertEquals(passenger, foundPassenger);
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("BA-444", flight.getFlightNumber());
    }

    @Test
    public void hasDestAirport() {
        assertEquals("VAC", flight.getDestAirport());
    }

    @Test
    public void hasDeptAirport() {
        assertEquals("GLA", flight.getDepAirport());
    }

    @Test
    public void hasDepTime() {
        assertEquals("21:00", flight.getDepTime());
    }

    @Test
    public void canCheckFlightHasRoom() {
        assertEquals(8, flight.checkFlightHasRoom());
    }

    @Test
    public void canAddPassenger() {
        flight.addPassengerToFlight(passenger);
        assertEquals(3, flight.passengerList());
    }

}
