package inheritance_java.exercises.triangle;

public class Triangle extends Shape {
    private String color = "red";

    public Triangle(String color) {
        this.color = color;
    }

    public Triangle(double side1, double side2, double side3, String color) {
        super(side1, side2, side3);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override

    public String toString(){
        return "a rectangle has size1: " + super.getSide1() + " size2: " + super.getSide2() + " size3: " + super.getSide3() + " color " + getColor();
    }
}
