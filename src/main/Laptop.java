package main;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laptop extends PC {
    private String battery;
    private String guarantee;

    public Laptop(String hardware, String monitor_size, String setup, String drivers,String battery,String guarantee) {
        super(hardware, monitor_size, setup, drivers);
        this.battery=battery;
        this.guarantee=guarantee;
    }

}


