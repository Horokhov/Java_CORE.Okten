package secondary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comix extends Book{
    private String title3;

    public Comix(String title,String title1,String title2,String title3){
        super(title,title1);
        this.title3=title3;
    }
}
