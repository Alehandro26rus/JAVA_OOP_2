import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClass;
import Model.Domain.Student;
import View.ViewClass;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args){
        Student student_01 = new Student("Петя", 23);
        Student student_02 = new Student("Даня", 28);
        Student student_03 = new Student("Даша", 18);
        Student student_04 = new Student("Маша", 22);
        Student student_05 = new Student("Анна", 18);
        Student student_06 = new Student("Рома", 22);
        Student student_07 = new Student("Никита", 24);
        Student student_08 = new Student("Дима", 28);
        Student student_09 = new Student("Женя", 28);
        Student student_10 = new Student("Паша", 22);
        Student student_11 = new Student("Яна", 22);
        Student student_12 = new Student("Евгения", 22);

        //Создадим новый список студентов
        List<Student> list_01 = new ArrayList<>();

        list_01.add(student_01);
        list_01.add(student_02);
        list_01.add(student_03);
        list_01.add(student_04);
        list_01.add(student_05);
        list_01.add(student_06);
        list_01.add(student_07);
        list_01.add(student_08);
        list_01.add(student_09);
        list_01.add(student_10);
        list_01.add(student_11);
        list_01.add(student_12);


        iGetModel model = new ModelClass(list_01);
        iGetView view = new ViewClass();

        ControllerClass controller = new ControllerClass(model, view);
        //controller.update("Run");
        controller.run();

    }
}
