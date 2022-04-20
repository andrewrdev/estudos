package oop.inheritance;

public class Test02 extends Test01
{
    public String lastName;

    public Test02()
    {
        super();
    }

    @Override
    public void goodBye()
    {
        super.goodBye();
        System.out.println("Goodbye!");
    }

    /**
     *
     */
    @Override
    public void hello()
    {
        System.out.println("Hello World!");
    }
}
