import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {


    FlightManager flightManager;
    Passenger passenger;
    Passenger passenger1;
    Plane plane;


    @Before
    public void before() {
        passenger = new Passenger("Mexican Bob", 1);
        passenger1 = new Passenger("Joe Gauge", 1);
        plane = Plane.BOEING747;
        flightManager = new FlightManager();

    }

    @Test
    public void canCheckWeightAvailablePerPassenger() {
        assertEquals(5, flightManager.getWeightAvailablePerPassenger());
    }

    @Test
    public void canCheckBaggageWeightUsed() {
        assertEquals(15, flightManager.checkHowMuchBaggageWeightUsed(passenger));
    }

    @Test
    public void canCheckBaggageWeightStillAvaiable() {
        assertEquals(35, flightManager.checkHowMuchBaggageWeightLeft(passenger));
    }
}
