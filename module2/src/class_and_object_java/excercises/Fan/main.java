package class_and_object_java.excercises.Fan;

public class main {
    public static void main(String[] args) {
        int Fast = Fan.getFAST();
        int Medimu = Fan.getMEDIUM();
        Fan Fan1 = new Fan(Fast,10,"yellow", true );
        Fan Fan2 = new Fan(Medimu,5,"blue", false);

        System.out.println(Fan1.toString());
        System.out.println(Fan2.toString());

    }
}
