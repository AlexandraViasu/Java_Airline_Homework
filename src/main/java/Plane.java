public enum Plane {
    BOEING747(100, 6000),
    BOEING746(120, 8000);

    private final int capacity;
    private final int totalWeight;

    Plane(int capacity, int totalWeight) {
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
