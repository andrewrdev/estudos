package exceptions;

public class Program {
    public static void main(String[] args) {
        int[] numbers = { 10, 20 };

        try {
            System.out.println(numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        Test01.test();
    }
}
