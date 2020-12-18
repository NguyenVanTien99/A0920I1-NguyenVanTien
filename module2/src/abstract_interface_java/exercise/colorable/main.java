package abstract_interface_java.exercise.colorable;

public class main {
    public static void main(String[] args) {
        Shape square1 = new Square(5.0);
        Shape square2 = new Square(10.0);


        Shape[] arr = {square1, square2};

        for (Shape ele : arr) {
            if(ele instanceof Colorable ){
                Square square = (Square) ele;
                System.out.println(square.getArea());
                square.howToColor();
            }
        }


    }
}
