public class Pilot extends FlightCrew {

    private String licenceNumber;

    public Pilot(String name, String rank, String licenceNumber) {
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }
}
