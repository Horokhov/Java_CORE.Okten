package sesondary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tuba implements Instrument {
    private int diameter;

    @Override
    public void play() {

    }
}
