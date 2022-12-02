package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users=new ArrayList<>();
        users.add(new User(15,"John"));
        users.add(new User(16,"Max"));
        users.add(new User(18,"Maria"));
        users.add(new User(19,"Alex"));
        users.add(new User(20,"Dorota"));
        users.add(new User(17,"Bershka"));
        users.add(new User(66,"Gwen"));
        users.add(new User(55,"Vasya"));
        users.add(new User(44,"Lombok"));
        users.add(new User(1,"LombokJR"));

       users.sort((o1, o2) -> o1.getAge()- o2.getAge());
       System.out.println(users);
       users.sort((o1, o2) -> o2.getAge()- o1.getAge());
       System.out.println(users);
       users.sort((o1, o2) -> o2.getName().length()- o1.getName().length());
       System.out.println(users);
       users.sort((o1, o2) -> o1.getName().length()- o2.getName().length());
       System.out.println(users);
    }
}
