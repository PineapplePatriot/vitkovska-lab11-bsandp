package ucu.edu.ua.taskone;

import java.util.List;

import lombok.Getter;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder @ToString(callSuper = true) @Getter
public class Student extends User {
    @Singular ("mark")
    private List<Integer> grades;
}