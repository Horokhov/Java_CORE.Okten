package secondary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Journal extends Book{
    private String title2;

    public Journal (String title,String title1,String title2){
        super(title, title1);
        this.title2=title2;
    }
}
