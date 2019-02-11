public class Plane {

    private PlaneType planeType;
    private int capacity;
    private int totalWeight;
    private int bagWeight;


    public Plane (PlaneType planeType, int capacity, int totalWeight, int bagWeight) {
        this.planeType = planeType;
        this.capacity = capacity;
        this.totalWeight = totalWeight;
        this.bagWeight = bagWeight;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public int getBagWeight() {
        return bagWeight;
    }

}
