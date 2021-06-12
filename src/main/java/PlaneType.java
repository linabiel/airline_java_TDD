public enum PlaneType {

    BOEING747(750, 80000),
    CHOPPER(10, 75000),
    LANCAIR235(2, 75000);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
