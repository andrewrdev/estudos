package oop.modifiers;

public class Game 
{
    public String name;
    private String developer;
    private int year;

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setDeveloper(String developer)
    {
        this.developer = developer;
    }

    public String getDeveloper()
    {
        return this.developer;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getYear()
    {
        return this.year;
    }
}
