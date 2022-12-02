package third;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        HashSet<User> users=new HashSet<>();
        users.add(new User(32,"Max","Asaoa","fjdsjo@gmail.com",35, Gender.MALE,
                Arrays.asList(new Skills("Java",11)),new Car("toyota",25,195)));
        users.add(new User(31,"Artme","Adsgfv","fkosdmo@gmail.com",11, Gender.FEMALE,
                Arrays.asList(new Skills("Java",16)),new Car("Mersedez",33,200)));
        users.add(new User(30,"Linds","Fgfgfd","fjfddsfgfd@gmail.com",3512, Gender.MALE,
                Arrays.asList(new Skills("Java",111)),new Car("toyota",25,195)));
        users.add(new User(25,"Readsf","GDSccxv","smlscjdsjo@gmail.com",35, Gender.MALE,
                Arrays.asList(new Skills("SQL",5423)),new Car("toyota",25,195)));
        users.add(new User(15,"Fikcxz","Qgffdv","qwdgfgfd@gmail.com",351, Gender.FEMALE,
                Arrays.asList(new Skills("Power",1112)), new Car("toyota",25,195)));
        users.add(new User(2,"Mfdsbf","Lsda","ckkdsmc@gmail.com",5,Gender.FEMALE,
                Arrays.asList(new Skills("Java",0)), new Car("toyota",25,195)));
        users.add(new User(1,"Iikncds","Liasnik","fjdsjo@gmail.com",35, Gender.MALE,
                Arrays.asList(new Skills("Java",1)), new Car("toyota",251,1951)));
        users.add(new User(5,"Max","Asaoa","fjdsjo@gmail.com",35, Gender.MALE,
                Arrays.asList(new Skills("Java",11)), new Car("toyota",25,195)));
        users.add(new User(66,"Max","Asaoa","fjdsjo@gmail.com",35, Gender.MALE,
                Arrays.asList(new Skills("Java",11)), new Car("toyota",25,195)));
        users.add(new User(63,"Max","Asaoa","fjdsjo@gmail.com",35, Gender.MALE,
                Arrays.asList(new Skills("Java",11)), new Car("toyota",25,195)));



        Iterator<User> iterator= users.iterator();
        while (iterator.hasNext()){
            User next=iterator.next();
            if(next.getGender()==Gender.MALE){
                iterator.remove();
            }
        }
        //System.out.println(users);

        TreeSet<User> usersTree=new TreeSet<>();
        usersTree.add(new User(32,"Max","Asaoa","fjdsjo@gmail.com",35, Gender.MALE,
                Arrays.asList(new Skills("Java",11)),new Car("toyota",25,195)));
        usersTree.add(new User(31,"Artme","Adsgfv","fkosdmo@gmail.com",11, Gender.FEMALE,
                Arrays.asList(new Skills("Java",16),new Skills("Java",16)),new Car("Mersedez",33,200)));
        usersTree.add(new User(30,"Linds","Fgfgfd","fjfddsfgfd@gmail.com",3512, Gender.MALE,
                Arrays.asList(new Skills("Java",111),new Skills("Java",16),new Skills("Java",16),new Skills("Java",16)),new Car("toyota",25,195)));
        usersTree.add(new User(25,"Readsf","GDSccxv","smlscjdsjo@gmail.com",35, Gender.MALE,
                Arrays.asList(new Skills("SQL",5423)),new Car("toyota",25,195)));
        usersTree.add(new User(15,"Fikcxz","Qgffdv","qwdgfgfd@gmail.com",351, Gender.FEMALE,
                Arrays.asList(new Skills("Power",1112)), new Car("toyota",25,195)));
        usersTree.add(new User(2,"Mfdsbf","Lsda","ckkdsmc@gmail.com",5,Gender.FEMALE,
                Arrays.asList(new Skills("Java",0)), new Car("toyota",25,195)));
        usersTree.add(new User(1,"Iikncds","Liasnik","fjdsjo@gmail.com",35, Gender.MALE,
                Arrays.asList(new Skills("Java",1)), new Car("toyota",251,1951)));
        usersTree.add(new User(5,"Max","Asaoa","fjdsjo@gmail.com",35, Gender.MALE,
                Arrays.asList(new Skills("Java",11)), new Car("toyota",25,195)));
        usersTree.add(new User(66,"Max","Asaoa","fjdsjo@gmail.com",35, Gender.MALE,
                Arrays.asList(new Skills("Java",11)), new Car("toyota",25,195)));
        usersTree.add(new User(63,"Max","Asaoa","fjdsjo@gmail.com",35, Gender.MALE,
                Arrays.asList(new Skills("Java",11)), new Car("toyota",25,195)));

        System.out.println(usersTree);
    }
}
