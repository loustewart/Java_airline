import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;
    Passenger passenger;
    Flight flight;

    @Before
    public void setUp() {
        plane = new Plane (PlaneType.BOEING747, 10, 200, 20);
        passenger = new Passenger("Bob", 1);
        flight = new Flight("BOEING747", 224, "RAK", "GLA", "10:00");
    }


    @Test
    public void getPlaneType() {
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void getCapacity() {
        assertEquals(10, plane.getCapacity());
    }

    @Test
    public void getTotalWeight() {
        assertEquals(200, plane.getTotalWeight());
    }

    @Test
    public void getBagWeight() {
        assertEquals(20, plane.getBagWeight());
    }




}
