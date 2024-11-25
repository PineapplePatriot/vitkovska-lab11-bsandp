import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ucu.edu.ua.taskone.Student;
import ucu.edu.ua.taskone.User;

class BuilderTest {

    private static final int STUDENT_AGE = 32;
    private static final int FIRST_MARK = 69;
    private static final int SECOND_MARK = 100;

    private static final int USER_AGE = 25;
    private static final double USER_WEIGHT = 60.5;
    private static final double USER_HEIGHT = 165.0;

    @Test
    void testStudentBuilder() {
        String name = "Oles";
        String gender = "m";

        Student student = Student.builder()
                .name(name)
                .age(STUDENT_AGE)
                .gender(gender)
                .mark(FIRST_MARK)
                .mark(SECOND_MARK)
                .build();

        Assertions.assertEquals(name, student.getName(), 
        "Name should match the value provided to the builder.");
        Assertions.assertEquals(STUDENT_AGE, student.getAge(), 
        "Age should match the value provided to the builder.");
        Assertions.assertTrue(student.getGrades().contains(FIRST_MARK), 
        "Grades should include the first mark.");
        Assertions.assertTrue(student.getGrades().contains(SECOND_MARK), 
        "Grades should include the second mark.");
    }

    @Test
    void testUserBuilder() {
        String name = "Alice";
        String gender = "f";

        User user = User.builder()
                .name(name)
                .age(USER_AGE)
                .gender(gender)
                .weight(USER_WEIGHT)
                .height(USER_HEIGHT)
                .build();

        Assertions.assertEquals(name, user.getName(), 
        "Name should match the value provided to the builder.");
        Assertions.assertEquals(USER_AGE, user.getAge(), 
        "Age should match the value provided to the builder.");
        Assertions.assertEquals(USER_WEIGHT, user.getWeight(), 
        "Weight should match the value provided to the builder.");
        Assertions.assertEquals(USER_HEIGHT, user.getHeight(), 
        "Height should match the value provided to the builder.");
    }
}
