package Utility;

import Utility.CapitalString;

public class person {
    String name;
    String city;

    public person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void display() {
        CapitalString cs = new CapitalString();
        System.out.println("Name: " + cs.capitalizeFirstLetter(name));
        System.out.println("City: " + city);
    }

    public static void main(String[] args) {
        person p = new person("john", "mumbai");
        p.display();
    }
}




