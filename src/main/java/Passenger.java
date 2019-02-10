import java.util.ArrayList;

public class Passenger extends ArrayList<Passenger> {

    private String name;
    private int bags;

    public Passenger(String name, int bags){
        this.name = name;
        this.bags = bags;
    }

    public String getPassengersName() {
        return name;
    }

    public int getNUmberOfBags() {
        return bags;
    }
}
