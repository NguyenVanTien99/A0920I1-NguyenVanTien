package inheritance_java.exercises.class_circle_and_cylinder;

public class Cylinder extends Circle {
    private double height = 4.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return super.getArea() * height;
    }
    @Override
    public String toString(){
        return "a cylinder with Volume = " + getVolume() + " which is a subclass of " + super.toString();
    }
}
