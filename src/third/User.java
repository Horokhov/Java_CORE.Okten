package third;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private List<Skills> skills=new ArrayList<>();
    private Car car;

    public User(int id, String name, String surname, String email, int age, Gender gender, List<Skills> skills, Car car) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.car = car;
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Skills {
    private String title;
    private int exp;
}
