public class Car {
    // properties
    protected String make; // protected: car can see it, and subclasses of Car (including sportscar)
    // caviat with protect: any class in the saame package/folder can also see it
    // four options of visibility:
    // private: in the class
    // public : everywhere
    // default (nothing) : everything in package
    // protected : everything in package and subclasses as well
    // C# they have five (protected and protected internal)
    private String model;
    private int speed;

    // constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // default no argument constructor
    public Car() {

    }

    public void accelerate() {
        speed++;
    }

}
