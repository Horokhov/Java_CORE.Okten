package main;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Workstation extends Laptop{
    private int station_id;

    public Workstation(String hardware, String monitor_size, String setup, String drivers,String battery,String guarantee,int station_id) {
        super(hardware, monitor_size, setup, drivers, battery, guarantee);
        this.station_id=station_id;

    }
}


