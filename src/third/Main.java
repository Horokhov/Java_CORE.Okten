package third;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new User(1,
                "vasya",
                "pupkin",
                "asd@asd.com",
                31,
                Gender.MALE,
                Arrays.asList(new Skills("title",1),new Skills("title",1)),
                new Car("toyota",2001,250));
    }
}
