import org.junit.Before;
import org.junit.BeforeClass;

import java.util.ArrayList;

public class FlightTest {

    private Flight flight;
    private Pilot pilot;
    private CabinCrewMember cabinCrewMember;
    private Passenger passenger;
    private Plane chopper;

    @Before
    public void before() {
        flight = new Flight(pilot, chopper, "FHG7659", "EDI","EDI", "14:00");
        cabinCrewMember = new CabinCrewMember("Ann", "Flight Attendant");
        passenger = new Passenger("Lina", 2);
        pilot = new Pilot("Arnold Schwarzenegger", "Captain", "J1");
        chopper = new Plane(PlaneType.CHOPPER);


    }
}
