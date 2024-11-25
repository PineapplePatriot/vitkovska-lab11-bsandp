package ucu.edu.ua.tasktwo;

import lombok.Getter;
import lombok.Setter;
import lombok.Data;
import lombok.Builder;

@Data @Builder
@Getter @Setter
public class Client {
    private static int counter;

    private final int id = counter++;
    private String name;
    private int age;
    private String sex;
    private String mail;

    public Client(String somename, 
                    int someage,
                    String somesex,
                    String somemail) {
        this.name = somename;
        this.age = someage;
        this.sex = somesex;
        this.mail = somemail;
    }
}
