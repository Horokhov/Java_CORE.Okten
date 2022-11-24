package sesondary;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrument> collection=new ArrayList<>();
        collection.add(new Guitar(6));
        collection.add(new Drums(5));
        collection.add(new Tuba(10));

        for (Instrument instrument : collection) {
            String name=instrument.getClass().getSimpleName();
            int parameter=instrument.getClass().getModifiers();
            System.out.println("Instrument"+" "+name+" "+"with parameter"+" "+parameter+" "+"is playing");
        }
    }
}
