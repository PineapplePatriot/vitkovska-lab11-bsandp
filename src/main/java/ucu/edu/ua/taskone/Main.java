package ucu.edu.ua.taskone;

public class Main {
    public static final int AGE = 32;
    public static final int FIRST_MARK = 69;
    public static final int SECOND_MARK = 100;
    public static void main(String[] args) {
        User user = Student.builder()
                        .name("Oles")
                        .age(AGE)
                        .gender("m")
                        .mark(FIRST_MARK)
                        .mark(SECOND_MARK)
                        .build();
        System.out.println(user);
    }
}