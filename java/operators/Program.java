package operators;

public class Program {
    public static void main(String[] args) {
        byte num = 20;
        byte num2 = 30;
        String result = "";

        // Arithmetic ---------------------------------------------------------

        System.out.println("==== Arithmetic ======================\n");

        System.out.println("20 + 10 = " + (20 + 10));
        System.out.println("20 - 10 = " + (20 - 10));
        System.out.println("20 * 10 = " + (20 * 10));
        System.out.println("20 / 10 = " + (20 / 10));
        System.out.println("20 % 10 = " + (20 % 10));

        // Assignment Operators -----------------------------------------------

        System.out.println("==== Assignment ======================\n");

        System.out.println("20 += 10 = " + (num += 10));
        System.out.println("20 -= 10 = " + (num -= 10));
        System.out.println("20 *= 10 = " + (num *= 10));
        System.out.println("20 /= 10 = " + (num /= 10));
        System.out.println("20 %= 10 = " + (num %= 10));

        // Comparison Operators -----------------------------------------------

        System.out.println("==== Comparison ======================\n");

        System.out.println("10 == 5 = " + (10 == 5));
        System.out.println("10 != 5 = " + (10 != 5));
        System.out.println("10 >= 5 = " + (10 >= 5));
        System.out.println("10 <= 5 = " + (10 <= 5));
        System.out.println("10 > 5  = " + (10 > 5));
        System.out.println("10 < 5  = " + (10 < 5));

        // Logical Operators --------------------------------------------------

        System.out.println("==== Logical Operators ===============\n");

        System.out.println("10 > 5 && 20 < 15 = " + (10 > 5 && 20 < 15));
        System.out.println("10 > 5 || 20 < 15 = " + (10 > 5 || 20 < 15));

        // Increment Decrement ------------------------------------------------

        System.out.println("==== Increment Decrement =============\n");

        System.out.println("++ = " + (num2++));
        System.out.println("-- = " + (num2--));
        System.out.println("++ = " + (++num2));
        System.out.println("-- = " + (--num2));

        // Ternary Operator ---------------------------------------------------

        System.out.println("==== Ternary Operator ================\n");

        result = (10 > 5) ? "Yes, true" : "No, false";

        System.out.println("10 > 5 : " + result);
    }
}