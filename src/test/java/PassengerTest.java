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
    public void canGetNumbeOfBags() {
        assertEquals(2, passenger.getNumberOfBags());
    }

    @Test
    public void canChangeNumberOfBags() {
        passenger.setNumberOfBags(3);
        assertEquals(3, passenger.getNumberOfBags());
    }


}
