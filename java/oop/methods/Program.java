package oop.methods;

public class Program {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        PrintCalculator printCalculator = new PrintCalculator();

        calculator.number1 = 50;
        calculator.number2 = 25;

        System.out.println(calculator.sum());
        System.out.println(calculator.SumTwoNumbers(100, 25));
        System.out.println(calculator.sumVarArgs(5, 10, 15, 20));

        printCalculator.print(calculator);
    }
}
