import java.util.ArrayList;

public class Flight {

    private ArrayList<CabinCrewMember> cabinCrewMember;
    private ArrayList<Passenger> passengers;
    private Pilot pilot;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.cabinCrewMember = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.pilot = pilot;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

}
