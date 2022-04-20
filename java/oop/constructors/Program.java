package oop.constructors;

public class Program 
{
    public static void main(String[] args) 
    {
        Test01 test01 = new Test01();
        Test02 test02 = new Test02("Peter", 23);

        System.out.println(test01.name);
        System.out.println(test01.age);

        test02.print();
    }
}
