import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Pilot pilot;
    private CabinCrewMember cabinCrewMember;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Plane boeing;
    private Plane chopper;
    private Plane twoSeater;

    @Before
    public void before() {
        flight = new Flight(pilot, chopper, "FHG7659", "EDI","EDI", "14:00");
        cabinCrewMember = new CabinCrewMember("Ann", "Flight Attendant");
        passenger1 = new Passenger("Tango", 2);
        passenger2 = new Passenger("Cash", 1);
        passenger3 = new Passenger("Bon Jovi", 3);
        pilot = new Pilot("Arnold Schwarzenegger", "Captain", "J1");
        chopper = new Plane(PlaneType.CHOPPER);
        twoSeater = new Plane(PlaneType.LANCAIR235);
        boeing = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetFlightNumber() {
        assertEquals("FHG7659", flight.getFlightNumber());
    }

    @Test
    public void canAddPassengers() {
        flight.addPassenger(passenger1, boeing);
        flight.addPassenger(passenger2, boeing);
        assertEquals(2, flight.getPassengers());
    }

    @Test
    public void canGetNumberOfBookedSeats() {
        flight.addPassenger(passenger1, chopper);
        flight.addPassenger(passenger2, chopper);
        int bookedSeats = flight.getPassengers();
        assertEquals(2, bookedSeats);
    }

    @Test
    public void canReturnNumberOfAvailableSeats() {
        flight.addPassenger(passenger1, chopper);
        flight.addPassenger(passenger2, chopper);
        int availableSeats = flight.getAvailableSeats(chopper);
        assertEquals(8, availableSeats);
    }

    @Test
    public void cantBookPassengerIfNoRemainingSeatsLeft() {
        flight.addPassenger(passenger1, twoSeater);
        flight.addPassenger(passenger2, twoSeater);
        flight.addPassenger(passenger3, twoSeater);
        flight.setPlane(twoSeater);
        assertEquals(2, flight.getPassengers());
    }
}
