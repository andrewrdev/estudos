package oop.overloading;

public class RockBand {
    public String name;
    public String genre;
    public int year;

    public void init(String name)
    {
        this.name = name;
    }

    public void init(String name, String genre)
    {
        this.genre = genre;
        this.name = name;
    }

    public void init(String name, String genre, int year) 
    {
        this.name = name;
        this.genre = genre;
        this.year = year;
    }
}
