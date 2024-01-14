package domain;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private List<Student> list;
    private int id;

    public StudentGroup(List<Student> list, int id) {
        this.list = list;
        this.id = id;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Группа студентов {" +
                "list=" + list +
                ", id=" + id +
                '}' + "\n";
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(list);
    }
}
