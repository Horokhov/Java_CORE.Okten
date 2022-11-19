package main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Company_agregation company=new Company_agregation("Romaguera-Crona","Multi-layered client-server neural-net","harness real-time e-markets");
        Address_composition address=new Address_composition("Kulas Light","Apt. 556","Gwenborough","92998-3874","-37.3159","81.1496");
        User user=new User(1,"Leanne Graham","Bret","Sincere@april.biz",address,"1-770-736-8031 x56442","hildegard.org",company);
        System.out.println(user);
    }
}
