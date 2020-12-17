package inheritance_java.exercises.point2d_point3d;

public class main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3.4f,2.3f);
        System.out.println(point2D);

        Point3D point3D = new Point3D(3.5f,4.6f,6.7f);
        System.out.println(point3D);

        for (int i = 0 ; i < point3D.getXYZ().length ; i++ ){
            System.out.println(point3D.getXYZ()[i]);
        }

    }
}
