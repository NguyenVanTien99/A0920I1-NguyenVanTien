package access_modifier_java.exercises.access_modifier;

public class TestCircle {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.getRadius();
        System.out.println(circle.getArea());
    }

}