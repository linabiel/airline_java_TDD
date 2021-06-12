import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Ann", "Flight Attendant");
    }

    @Test
    public void canGetName() {
        assertEquals("Ann", cabinCrewMember.getName());
    }

    @Test
    public void canGetRank() {
        assertEquals("Flight Attendant", cabinCrewMember.getRank());
    }
}
