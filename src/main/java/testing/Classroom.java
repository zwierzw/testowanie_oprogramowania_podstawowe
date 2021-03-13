package testing;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private int height = 200;
    private Teacher teacher;
    private List<Student> students = new ArrayList<>();

    public void setTeacher (Teacher teacher){
        if (teacher.getHeight() <height) {
            return;
        }
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getStudentList() {
        return students;
    }
}
