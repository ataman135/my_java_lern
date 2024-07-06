package org.example;

public class Main {
    public static void main(String[] args) {
        Human vova = new Human("Vladimir", "male", 17, 80.2, 1.73);
        Human anton = new Human("Anton", "male", 15, 85.7, 1.82);
        Human vika = new Human();
        vika.setGenger("female");
        System.out.println(vova.canEqual(anton));
        System.out.println(anton.getGenger().equals(vova.getGenger()));
        System.out.println(vova.toString());
        System.out.println(vika.getGenger());
    }
}
