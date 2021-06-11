package plane;

public class Passenger {

    private String name;
    private int numberOfBags;

    public Passenger(String name, int numberOfBags) {
        this.name = name;
        this.numberOfBags = numberOfBags;
    }

    public String getName() {
        return name;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void addBag(int numberOfBags) {
        this.numberOfBags += numberOfBags;
    }
}
