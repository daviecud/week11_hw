import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;


    @Before
    public void before() {
        plane = Plane.BOEING747;


    }

    @Test
    public void canGetPlaneCapacity(){
        assertEquals (10, plane.getPlaneCapacity());
    }

    @Test
    public void canGetPlaneWeight() {
        assertEquals(100, plane.getPlaneWeight());
    }

    @Test
    public void canGetWeightForBags() {
        assertEquals(10, plane.getWeightAvailableForBaggage());
    }

    @Test
    public void canGetWeightAvailablePerBag() {
        assertEquals(1, plane.getWeightAvailablePerBag());
    }
}
