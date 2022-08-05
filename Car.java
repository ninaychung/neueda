import java.util.Objects;

public class Car extends Vehicle implements Comparable {
    // properties
    // protected String make; // protected: car can see it, and subclasses of Car
    // (including sportscar)
    // caviat with protect: any class in the saame package/folder can also see it
    // four options of visibility:
    // private: in the class
    // public : everywhere
    // default (nothing) : everything in package
    // protected : everything in package and subclasses as well
    // C# they have five (protected and protected internal)
    private String model;
    private int speed;
    private String make;

    // constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // default no argument constructor
    public Car() {

    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public void accelerate() {
        speed++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Car car = (Car) o;
        return Objects.equals(make, car.make) && Objects.equals(model, car.model);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    // if two objects are the same, they should return the same hashcode
    // else should return diff hashcodes
    // Object class starting from Java 7
    public int hashCode() {
        return Objects.hash(make, model);

    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return speed;
        // return make.compareTo((Car)o.make);
    }

}
