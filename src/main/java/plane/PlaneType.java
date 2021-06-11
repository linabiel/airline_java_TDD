package plane;

public enum PlaneType {

    BOEING747(150, 80000),
    BOEING800(250, 75000);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }
}
