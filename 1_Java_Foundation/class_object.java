
// We'll make class bluepring here!

class Car {
    String brand;
    int speed;
    String name;
    String color;

    void drive() {
        System.out.println("Driving at speed: " + speed);
    }
}

public class class_object {

    public static void main(String[] args) {

        // We'll make the actuall object here!
        Car C1 = new Car();

        C1.brand = "BMW";
        C1.speed = 200;
        C1.name = "BMW X5";
        C1.color = "Black";
        C1.drive();

        System.out.println("Brand: " + C1.brand);

    }

}







