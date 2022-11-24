package main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> collection=new ArrayList<>();
        collection.add(new Book("Edgar","Poem"));
        collection.add(new Book("Ethan","Ludwig"));
        collection.add(new Magazine("Lethal","Tempo"));
        collection.add(new Magazine("Guide","Anxious"));
        System.out.println(collection);
    }
}
