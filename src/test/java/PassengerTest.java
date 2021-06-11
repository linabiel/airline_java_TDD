import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Lina", 2);
    }

    @Test
    public void canGetName() {
        assertEquals("Lina", passenger.getName());
    }

    @Test
    public void canChangeNumberOfBags() {
        assertEquals(3, passenger.setNumberOfBags(3));
    }
}
