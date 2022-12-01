package main;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int age;
    private String name;

    public int compareTo(User o2) {
        return 0;
    }
}
