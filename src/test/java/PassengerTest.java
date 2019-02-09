
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Passenger passenger2;

    @Before
    public void before() {
        passenger = new Passenger ("Mexican Bob", 1);
        passenger2 = new Passenger ("Joe Guage", 1);
    }

    @Test
    public void canGetPassengersName() {
        assertEquals("Mexican Bob", passenger.getPassengersName());

    }

    @Test
    public void canGetNumberOfBags() {
        assertEquals(1, passenger.getNUmberOfBags());
    }

}


