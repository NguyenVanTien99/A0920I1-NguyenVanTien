package _15_exception;

import java.util.ArrayList;


public class MainController {
    public static void main(String[] args) {
        Person student1 = new Student("Tri", 18, 10);
        Person student2 = new Student("Anh", 18, 10);

        Person teacher1 = new Teacher("Hung", 25, 1000);
        Person teacher2 = new Teacher("Trang", 30, 2000);


        PersonManager personManager = new PersonManager(new ArrayList<>());
        personManager.addPerson(student1);
        personManager.addPerson(student2);
        personManager.addPerson(teacher1);
        personManager.addPerson(teacher2);

        for (Person person: personManager.getPersonList()){
            System.out.println(person);
        }

        Person student_3 = new Student("Anh", 18, 5);

        personManager.updatePerson(student_3);
        System.out.println("---------------------------------");

        for (Person person: personManager.getPersonList()){
            System.out.println(person);
        }
    }
}
