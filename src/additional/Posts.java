package additional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Posts {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;
}
@Data
@AllArgsConstructor
@NoArgsConstructor
class Post {
    private List<Posts> post=new ArrayList<>();
}
