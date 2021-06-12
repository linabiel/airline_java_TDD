import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Arnold Schwarzenegger", "Captain", "J1");
    }

    @Test
    public void canGetName() {
        assertEquals("Arnold Schwarzenegger", pilot.getName());
    }

    @Test
    public void canChangeRank() {
        pilot.setRank("First Officer");
        assertEquals("First Officer", pilot.getRank());
    }

    @Test
    public void getLicenceNumber() {
        assertEquals("J1", pilot.getLicenceNumber());
    }
}
