package main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PC pc=new PC("mouse","16 inches","setup","drivers");
        Laptop laptop=new Laptop("alcaine","Jabko");
        Ultrabook ultrabook=new Ultrabook(30,25000);
        PC pc1=new Laptop("mouse","16 inches","setup","drivers","alcaine","Jabko");
        Workstation workstation=new Workstation(5);
       System.out.println(pc);
    }
}
