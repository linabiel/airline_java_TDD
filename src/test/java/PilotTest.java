import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("John", "Captain");
    }

    @Test
    public void canGetName() {
        assertEquals("John", pilot.getName());
    }

    @Test
    public void canChangeRank() {
        pilot.setRank("First Officer");
        assertEquals("First Officer", pilot.getRank());
    }
}
