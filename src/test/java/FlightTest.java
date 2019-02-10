import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

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
//        flight.addPassengerToFlight(passenger);
//        flight.addPassengerToFlight(passenger1);

    }

//    @Test
//    public void canFindPassengers(){
//        Passenger foundPassenger = flight.findPassenger("Mexican Bob");
//        assertEquals(passenger, foundPassenger);
//    }

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
    public void checkPassengerListIsEmpty() {
        assertEquals(0, flight.passengerList());
    }
    @Test
    public void hasDepTime() {
        assertEquals( new Date(), flight.getFlightTime());
    }

    @Test
    public void canCheckFlightHasRoom() {
        assertEquals(10, flight.checkFlightHasRoom());
    }

    @Test
    public void canAddPassenger() {
        flight.addPassengerToFlight(passenger);
        assertEquals(3, flight.passengerList());
    }


}
