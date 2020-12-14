package access_modifier_java.practices.static_property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mada3", "mec4");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("mada6", "mec 7");
        System.out.println(Car.numberOfCars);

    }
}
