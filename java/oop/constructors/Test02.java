package oop.constructors;

public class Test02 {
    public String name;
    public int age;

    public Test02() {

    }

    public Test02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
