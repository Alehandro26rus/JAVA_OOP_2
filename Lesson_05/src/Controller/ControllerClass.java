package Controller;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;
import Model.ModelClass;
import View.ViewClass;

import java.util.ArrayList;
import java.util.List;

public class ControllerClass {
    private iGetModel model;
    private iGetView view;
    private List<Student> studBuffer = new ArrayList<>();

    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Метод тестирования данных
     * @param stud список студентов
     * @return если размер списка больше 0 то возвращаем true, иначе возвращаем false
     */
    private boolean testData(List<Student> stud){
        if(stud.size() > 0) return true;
        else return false;
    }
    public void update(String Request){

        //MVP
        studBuffer = model.getStudents();
        if(testData(studBuffer)) view.printAllStudents(studBuffer);
        else System.out.println("Список студентов пуст");

        //MVC
        //view.printAllStudents(model.getStudents());
    }
}
