package main;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ultrabook extends Laptop{
    private int Apple_id;
    private int price;

    public Ultrabook(String hardware, String monitor_size, String setup, String drivers,String battery,String guarantee,int Apple_id,int price) {
            super(hardware, monitor_size, setup, drivers, battery, guarantee);
            this.Apple_id=Apple_id;
            this.price=price;
    }
}
