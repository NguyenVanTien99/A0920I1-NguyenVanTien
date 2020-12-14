package access_modifier_java.practices.static_method;

public class Student {
    private int rollno;
    private String name;
    private static String college = "Codegym";

    Student(int r, String n){
        rollno = r;
        name = n;
    }

    static void change(){
        college = "ued";
    }

    void display(){
        System.out.println(rollno+ " " + name + " " + college);
    }
}
