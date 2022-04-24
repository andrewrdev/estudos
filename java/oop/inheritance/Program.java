package oop.inheritance;

public class Program {
    public static void main(String[] args) {
        Test02 test02 = new Test02();

        test02.name = "John";
        test02.lastName = "Lennon";
        test02.age = 32;
        test02.hello();
        test02.goodBye();
    }
}
