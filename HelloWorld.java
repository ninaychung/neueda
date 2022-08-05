import static java.lang.Math.*;

public class HelloWorld {
    public static void main(String[] args) {
        Car car1 = new Car();
        SportsCar car2 = new SportsCar();
        Car car3 = new SportsCar();
        car3.accelerate();

        // double rate = Account.getInterestRate();
        double result = sqrt(12) * round(12.6);

        System.out.println("Hello World");
        // System: class
        // out: property static
        // not a class because lowercase,static b/c System is a class
        // println: method non-static
        // for sys.out shortcut do sysout (sout in other languages)
        int myInt = 06; // 08 won't work b/c hexidecimal
        int myInt2 = 0b1001_0010_1000; // binary
        long myLong = 12345L;
        double d = 1.6;
        float f = 1.6f; // need the f

        byte b1 = 12; // smallest thing in java
        byte b2 = 10;
        // byte b3 = b1+b2; does not work
        // anytime you do integer division in java
        // result is an int, not a byte
        // also length of primitives is not dependent on cpus, etc
        b1 += b2; // implicit cast to byte, so it works
        System.out.println(b1); // 22
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3); // overflow, 32 which si wrong

        int i1 = 2000000000;
        int i2 = 2000000000;
        i1 += i2;
        System.out.println(i1); // overflow, --294967296
        // exercise 3
        String make = "BMW";
        String model = "530D";
        double engineSize = 3.0;
        byte gear = 2;
        System.out.println("The make is " + make);
        System.out.println("The model is " + model);
        System.out.println("The engine size is " + engineSize);
        short speed = (short) (gear * 20);
        System.out.println("The speed is " + speed);

        if (engineSize > 1.3) {
            System.out.println("Powerful car");

        } else {
            System.out.println("Weak car");
        }

        if (gear == 5) {
            System.out.println("Speed: 45 mph");
        } else if (gear == 4) {
            System.out.println("Speed: 35 mph");
        } else if (gear == 3) {
            System.out.println("Speed: 25 mph");
        } else if (gear == 2) {
            System.out.println("Speed: 15 mph");
        } else {
            System.out.println("Speed: 5 mph");
        }

        int[] years = new int[10];
        int counter = 0;
        for (int i = 1900; i < 2000; i++) {
            if (i % 4 == 0) {
                years[counter] = i;
                counter++;
            }

            if (counter == years.length) {
                break;
            }

        }

        for (int y : years) {
            System.out.println("Leap year:" + y);
        }

        switch (gear) {
            case 1:
                System.out.println("Speed: 5 mph");
                break;
            case 2:
                System.out.println("Speed: 15 mph");
                break;
            case 3:
                System.out.println("Speed: 25 mph");
                break;

            case 4:
                System.out.println("Speed: 35 mph");
                break;

            case 5:
                System.out.println("Speed: 45 mph");
                break;

        }
    }
}
