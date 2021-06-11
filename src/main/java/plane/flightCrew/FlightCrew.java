package plane.flightCrew;

public abstract class FlightCrew {

    private String name;
    private String rank;

    public FlightCrew(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }
}
