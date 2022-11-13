package main;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User_beta {
    private int id;
    private String name;
    private ArrayList<String> skills=new ArrayList<>();
}
