package third;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class skills {
    private String title;
    private String exp;
    ArrayList<String> skills1=new ArrayList<>(title,exp);
    ArrayList<String> skills=new ArrayList<String>(skills1);
}

