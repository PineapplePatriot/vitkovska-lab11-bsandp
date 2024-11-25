package ucu.edu.ua.taskone;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder @ToString @Getter
public class User {
    private String name;
    private int age;
    private double weight;
    private double height;
    private String gender;
}