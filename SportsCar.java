public class SportsCar extends Car {
    // String spoilerType; // default visiblity is package (not public, string, etc)

    private String spoilerType;
    private int speed;

    public SportsCar() {
        super("Mini", "S"); // now this is default

        // super();
        // every constructor have that in it implicitly, call to supercall,
        // this is the default, but default constructor is not in the car unless we add
        // it in
    }

    public SportsCar(String make, String model, String spoilerType) {
        super(make, model);
        this.spoilerType = spoilerType;
    }

    public String getSpoilerType() {
        return spoilerType;
    }

    public void setSpoilerType(String spoilerType) {
        this.spoilerType = spoilerType;
    }

    // made no difference because it was doing that already
    // but better for documentation
    @Override
    public void accelerate() {
        super.accelerate();
        speed++;
    }
}
