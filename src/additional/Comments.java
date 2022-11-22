package additional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Comments {
    private int userId;
    private int id;
    private String title;
    private String body;

    private String comment;

    public Comments(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor

class Comment {
    private ArrayList<Comments> post=new ArrayList<>();
}


