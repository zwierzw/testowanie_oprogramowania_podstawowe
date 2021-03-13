package testing;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class ClassroomTest {
    @Test
    void shouldSetTeacher() {
        // Given
        Classroom classroom = new Classroom();
        Teacher teacher = new Teacher("A", "B", 190, "history");

        //When
        classroom.setTeacher(teacher);

        //Then

        Teacher classroomTeacher = classroom.getTeacher();
        assertThat(classroomTeacher).isEqualTo(teacher);
    }

    @Test
    void shouldNotAddTeacherWhoIsTooShort() {
        //Given
        Classroom classroom = new Classroom();
        classroom.setHeight(200);
        Teacher teacher = new Teacher("A", "B", 210, "basketball");

        //When
        classroom.setTeacher(teacher);

        //Then
        assertThat(classroom.getTeacher()).isNull();
    }

    @Test
    void shouldAddNewStudent(){
        //Given
        Classroom classroom = new Classroom();
        Student student = new Student("A", "B", LocalDate.of(1994, 9,5));

        //When
        classroom.addStudent(student);

        //Then
        List<Student> result = classroom.getStudentList();
        Assertions.assertThat(result)
                .containsExactly(student);
    }
}