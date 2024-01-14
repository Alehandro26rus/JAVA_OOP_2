package domain;

import domain.GroupeIterator;
import domain.StudentGroup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
    private int steamId;
    private List<StudentGroup> listGroup;

    // Конструктор класса, принимает идентификатор потока
    public StudentSteam(int steamId) {
        this.steamId = steamId;
        this.listGroup = new ArrayList<>();
    }

    // Метод добавления группы в поток
    public void addStudentGroup(StudentGroup group) {
        listGroup.add(group);
    }

    // Методы установки/вывода полей класса
    public int getSteamId() {
        return steamId;
    }

    public void setSteamId(int steamId) {
        this.steamId = steamId;
    }

    public List<StudentGroup> getListGroup() {
        return listGroup;
    }

    public void setListGroup(List<StudentGroup> listGroup) {
        this.listGroup = listGroup;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupeIterator(listGroup);
    }

    // Переопределение метода toString для вывода информации о потоке студентов
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Поток студентов. Номер потока=").append(steamId).append("\n");
        for (StudentGroup group : listGroup) {
            result.append(group.toString());
        }
        return result.toString();
    }
}