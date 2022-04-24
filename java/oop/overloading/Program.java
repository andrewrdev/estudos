package oop.overloading;

public class Program {
    public static void main(String[] args) {
        RockBand band = new RockBand();
        RockBand band2 = new RockBand();

        band.init("Led Zeppelin", "Hard Rock", 1970);
        band2.init("AC/DC");

        System.out.println(band.name);
        System.out.println(band.genre);
        System.out.println(band.year);

        System.out.println(band2.name);
    }
}
