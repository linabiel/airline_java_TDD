import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane boeing;
    private Plane chopper;
    private Plane twoSeater;
    private Passenger passenger;
    private Pilot pilot;

    @Before
    public void before() {
        boeing = new Plane(PlaneType.BOEING747);
        chopper = new Plane(PlaneType.CHOPPER);
        twoSeater = new Plane(PlaneType.LANCAIR235);
        passenger = new Passenger("Lina", 1);
        pilot = new Pilot("Arnold Schwarzenegger", "Captain", "J1");
    }

    @Test
    public void canGetType() {
        boeing.getPlaneType();
        assertEquals(PlaneType.BOEING747, boeing.getPlaneType());
    }

    @Test
    public void canGetCapacity() {
        int capacity = twoSeater.getPlaneType().getCapacity();
        assertEquals(2, capacity);
    }
}
