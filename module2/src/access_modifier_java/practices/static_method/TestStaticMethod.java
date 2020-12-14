package access_modifier_java.practices.static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111, "Tien");
        Student s2 = new Student(222, "Tienn");
        Student s3 = new Student(333, "Tiennn");

        s1.display();
        s2.display();
        s3.display();

    }



}
