package inheritance_java.exercises.point_moveablepoint;

public class main {
    public static void main(String[] args) {
        Point point = new Point(1.0f, 2.0f);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint(3f,4f, 5f,5f);
        System.out.println(movablePoint);

        movablePoint.move();
        System.out.println(movablePoint);
    }
}
