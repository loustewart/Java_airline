import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;


    @Before
    public void setUp() {
        passenger1 = new Passenger("Bob", 1);
    }

    @Test
    public void getName() {
        assertEquals("Bob", passenger1.getName());
    }

    @Test
    public void getBags() {
        assertEquals(1, passenger1.getBags());
    }
}
