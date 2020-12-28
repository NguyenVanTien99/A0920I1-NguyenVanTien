package abstract_interface_java.exercise.colorable;

public class Square extends Shape implements Colorable {
    private double size;

    public Square() {
        this.size = 1.0;
    }

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double getArea() {
        return this.size * this.size;
    }

    @Override
    public void howToColor() { 
        System.out.println("Color all four sides..");
    }
}
