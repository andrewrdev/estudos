package exceptions;

public class Test01 {

    public static int number1 = 50;
    public static int number2 = 0;

    public static void test() {

        try {
            if (number2 == 0) {
                throw new Exception("number2 with value 0 is not valid");
            }

            System.out.println(Test01.number1 / Test01.number2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
