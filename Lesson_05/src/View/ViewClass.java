package View;

import Controller.Interfaces.iGetView;
import Model.Domain.Student;

import java.util.List;

public class ViewClass implements iGetView {
    public void printAllStudents(List<Student> students){
        System.out.println("-------------------------------");
        for (Student s: students){
            System.out.println(s);
        }
        System.out.println("_______________________________");
    }
}
