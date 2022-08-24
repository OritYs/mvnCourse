package classesExamples;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class StudentsTest {

    @Test
    public void testIsSkyboxWorker(){
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("test", "test", "test.test@blabla.com"));

        for (Student student : students) {
            assertTrue(student.getEmail().contains("blabla"));
        }
    }
}
