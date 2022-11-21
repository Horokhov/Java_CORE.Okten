package third;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Car {
    private String model;
    private int year;
    private int power;

    public Car(String model,int year,int power){
        this.model=model;
        this.year=year;
        this.power=power;
    }
}
