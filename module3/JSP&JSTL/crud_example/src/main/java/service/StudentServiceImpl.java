package service;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements StudentService{

    private static Map<String, Student> studentMap;

    public StudentServiceImpl() {
        if(studentMap != null){
            return;
        }


        studentMap = new HashMap<>();
        studentMap.put("1", new Student("1","Tien1",10,"DaNang1"));
        studentMap.put("2", new Student("2","Tien2",11,"DaNang2"));
        studentMap.put("3", new Student("3","Tien3",12,"DaNang3"));
        studentMap.put("4", new Student("4","Tien4",13,"DaNang4"));
    }



    @Override
    public Student getStudentById(String id) {
        return studentMap.get(id);
    }

    @Override
    public List<Student> getAll() {
        return new ArrayList<>(studentMap.values());
    }

    @Override
    public void saveStudent(Student student) {
        studentMap.put(student.getId(), student);

    }

    @Override
    public void updateStudent(Student student) {

        if(studentMap.get(student.getId()) != null){
            studentMap.put(student.getId(), student);
        }

    }

    @Override
    public void deleteStudent(String id) {
        if(studentMap.get(id) != null){
            studentMap.remove(id);
        }

    }
}
