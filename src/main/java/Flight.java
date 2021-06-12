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

    public ArrayList<CabinCrewMember> getCabinCrewMember() {
        return cabinCrewMember;
    }

    public void setCabinCrewMember(ArrayList<CabinCrewMember> cabinCrewMember) {
        this.cabinCrewMember = cabinCrewMember;
    }

    public int getPassengers() {
        return passengers.size();
    }


    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void addPassenger(Passenger passengers, Plane plane) {
        if (getAvailableSeats(plane) >= getPassengers()) {
            this.passengers.add(passengers);
        }
    }
    public int getAvailableSeats(Plane plane) {
        int planesCapacity = plane.getPlaneType().getCapacity();
            return planesCapacity - getPassengers();

    }
}
