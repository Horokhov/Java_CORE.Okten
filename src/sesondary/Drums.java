package sesondary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drums implements Instrument {
    private int size;

    @Override
    public void play() {

    }
}
