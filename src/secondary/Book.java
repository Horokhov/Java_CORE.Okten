package secondary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book extends Papirus{
    private String title1;

    public Book(String title,String title1){
        super(title);
        this.title1=title1;
    }
}
