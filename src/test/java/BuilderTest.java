import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ucu.edu.ua.task1.Student;
import ucu.edu.ua.task1.User;

class BuilderTest {

    @Test
    void testStudentBuilder() {
        String name = "Oles";
        int age = 32;
        String gender = "m";
        int firstMark = 69;
        int secondMark = 100;

        Student student = Student.builder()
                .name(name)
                .age(age)
                .gender(gender)
                .mark(firstMark)
                .mark(secondMark)
                .build();

        assertEquals(name, student.getName(), "Name should match the value provided to the builder.");
        assertEquals(age, student.getAge(), "Age should match the value provided to the builder.");
        assertEquals(gender, student.getGender(), "Gender should match the value provided to the builder.");
        assertEquals(2, student.getGrades().size(), "There should be two grades in the grades list.");
        assertTrue(student.getGrades().contains(firstMark), "Grades should include the first mark.");
        assertTrue(student.getGrades().contains(secondMark), "Grades should include the second mark.");
    }

    @Test
    void testUserBuilder() {
        String name = "Alice";
        int age = 25;
        String gender = "f";
        double weight = 60.5;
        double height = 165.0;

        User user = User.builder()
                .name(name)
                .age(age)
                .gender(gender)
                .weight(weight)
                .height(height)
                .build();

        assertEquals(name, user.getName(), "Name should match the value provided to the builder.");
        assertEquals(age, user.getAge(), "Age should match the value provided to the builder.");
        assertEquals(gender, user.getGender(), "Gender should match the value provided to the builder.");
        assertEquals(weight, user.getWeight(), "Weight should match the value provided to the builder.");
        assertEquals(height, user.getHeight(), "Height should match the value provided to the builder.");
    }
}
