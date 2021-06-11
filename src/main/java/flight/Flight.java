package flight;

import plane.Passenger;
import plane.Plane;
import plane.flightCrew.CabinCrewMember;
import plane.flightCrew.Pilot;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private CabinCrewMember cabinCrewMember;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, CabinCrewMember cabinCrewMember, ArrayList<Passenger> passengers, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilot = pilot;
        this.cabinCrewMember = cabinCrewMember;
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }
}
