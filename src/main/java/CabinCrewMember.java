public class CabinCrewMember extends FlightCrew {

    public CabinCrewMember(String name, String rank) {
        super(name, rank);
    }

    public String relayMessage() {
        return "Ladies and gentlemen, please faster your seatbelts";
    }
}
