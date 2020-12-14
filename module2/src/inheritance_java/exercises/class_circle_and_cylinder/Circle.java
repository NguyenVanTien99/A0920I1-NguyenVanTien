package inheritance_java.exercises.class_circle_and_cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1;
        color = "yellow";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.pow(radius,2) * Math.PI;
    }

    public double getPerimiter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return "a circle with radius: " + getRadius() + " color " + getColor() + " and area is: " + getArea();
    }
}
