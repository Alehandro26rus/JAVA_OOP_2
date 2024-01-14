import domain.Student;
import domain.StudentGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentApp {
    public static void main(String[] args) {
        Student student_01 = new Student("Петя", 23);
        Student student_02 = new Student("Даня", 28);
        Student student_03 = new Student("Даша", 18);
        Student student_04 = new Student("Маша", 22);
        Student student_05 = new Student("Анна", 18);
        Student student_06 = new Student("Рома", 22);

        List<Student> list = new ArrayList<>();

        list.add(student_01);
        list.add(student_02);
        list.add(student_03);
        list.add(student_04);
        list.add(student_05);
        list.add(student_06);

        StudentGroup group = new StudentGroup(list, 1);
        for (Student student : group) {
            System.out.println(student);
        }
        for (int i = 0; i < 40; i++) {
            System.out.print("_");
        }
        System.out.println();
        Collections.sort(group.getList());

        for (Student student : group) {
            System.out.println(student);
        }

    }
}