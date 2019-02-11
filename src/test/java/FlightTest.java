import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void setUp() {
        flight = new Flight("BOEING747", 224, "RAK", "GLA", "10:00");
        plane = new Plane (PlaneType.BOEING747, 10, 200, 20);
        passenger1 = passenger1 = new Passenger("Bob", 1);
        passenger2 = new Passenger("Betty", 1);

    }


    @Test
    public void getPlane() {
        assertEquals("BOEING747", flight.getPlane());
    }

    @Test
    public void getFlightNumber() {
        assertEquals(224, flight.getFlightNumber());
    }

    @Test
    public void getDestination() {
        assertEquals("RAK", flight.getDestination());
    }

    @Test
    public void getDepartureAirport() {
        assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void getDepartureTime() {
        assertEquals("10:00", flight.getDepartureTime());
    }


    @Test
    public void passengersStartsEmpty() {
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void canAddPassenger() {
        flight.addPassenger(passenger1);
        assertEquals(1, flight.passengerCount());
    }


//    return the number of available seats
//    book a passenger (if there are remaining seats)
}
