package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component("university")

public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("Lena Chumakova",2, 7.6);
        Student st2 = new Student("Ivan Sidorov",3, 4.3);
        Student st3 = new Student("Petr Petrovich",1, 8.9);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }
    public List<Student> getStudents(){
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
