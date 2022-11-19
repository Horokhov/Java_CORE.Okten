package main;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address_composition {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;

    public Address_composition(String street,String suite,String city,String zipcode,String lat,String longt){
            this.street=street;
            this.suite=suite;
            this.city=city;
            this.zipcode=zipcode;
            this.geo= new Geo(lat,longt);}
}
