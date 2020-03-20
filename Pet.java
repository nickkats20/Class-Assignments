/**
 * The Pet class - a start of the Pet Inheritance Hierarchy
 */
public class Pet implements Moveable{
    // fields
    private String name;
    private double distanceMoved;

    // constructors
    public Pet() {
        name = "default pet";
        distanceMoved = 0;
    }

    public Pet(String n) {
        name = n;
        distanceMoved = 0;
    }
    // methods

    public String getName() {
        return name;
    }

    public String speak() {
        return "default pet sound";
    }

    public void move(double amount){
        distanceMoved += amount;
    }
}
