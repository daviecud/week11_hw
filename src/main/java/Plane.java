import java.util.ArrayList;

public enum Plane {

    BOEING747(10, 100);

    private final int capacity; //capacity of passengers
    private final int weight; //total weight plane can carry

    Plane(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getPlaneCapacity() {
        return this.capacity;
    }

    public int getPlaneWeight() {
        return this.weight;
    }

    public int getWeightAvailableForBaggage() {
        return this.weight / this.capacity;
    }

    public int getWeightAvailablePerBag() {
        return getWeightAvailableForBaggage() / getPlaneCapacity();
    }


}
