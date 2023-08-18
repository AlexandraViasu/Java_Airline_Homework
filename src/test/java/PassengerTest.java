import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class PassengerTest {

    Passenger passenger;
    @Before
    public void before() {
        passenger = new Passenger("Alex", 1);

    }

    @Test
    public void hasName() {
        assertEquals("Alex", passenger.getName());
    }

    @Test
    public void canGetNumberOfBags () {
        assertEquals(1, passenger.getNumberOfBags());
    }


}