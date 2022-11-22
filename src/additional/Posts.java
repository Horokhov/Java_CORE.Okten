package additional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Posts {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;

    public Posts(int postId, int id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }
}
@Data
@AllArgsConstructor
@NoArgsConstructor
class Post {
    private ArrayList<Posts> post=new ArrayList<>();
}
