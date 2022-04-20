package oop.methods;

public class Calculator 
{
    public int number1;
    public int number2;

    public int sum()
    {
        return 5 + 5;
    }

    public int SumTwoNumbers(int n1, int n2)
    {
        return n1 + n2;
    }

    public int sumVarArgs(int... numbers)
    {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
}
