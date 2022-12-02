package second;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Martin");
        words.add("Bob");
        words.add("Arnold");
        words.add("Bir");
        words.add("Dirk");
        words.add("Max");
        words.add("Artem");
        words.add("Obama");
        words.add("Osas");
        words.add("Moses");
        words.add("Gira");

        words.sort((o1, o2) ->o1.compareTo(o2));
        System.out.println(words);
    }
}
