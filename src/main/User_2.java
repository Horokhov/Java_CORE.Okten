package main;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User_2 {
    private int id;
    private int postId;
    private String name;
    private String email;
    private String body;
}
