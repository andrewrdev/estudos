package operators;

public class Program {
    public static void main(String[] args) 
    {
        int num = 20;
        int num2 = 30;

        // Arithmetic
        System.out.println("==== Arithmetic ======================\n");

        System.out.println("20 + 10 = " + (20 + 10) );
        System.out.println("20 - 10 = " + (20 - 10) );
        System.out.println("20 * 10 = " + (20 * 10) );
        System.out.println("20 / 10 = " + (20 / 10) );
        System.out.println("20 % 10 = " + (20 % 10) );

        // Assignment Operators
        System.out.println("==== Assignment ======================\n");

        System.out.println("20 += 10 = " + (num += 10) );
        System.out.println("20 -= 10 = " + (num -= 10) );
        System.out.println("20 *= 10 = " + (num *= 10) );
        System.out.println("20 /= 10 = " + (num /= 10) );
        System.out.println("20 %= 10 = " + (num %= 10) );

        // Comparison Operators
        System.out.println("==== Comparison ======================\n");

        System.out.println("10 == 5 = " + (10 == 5));
        System.out.println("10 != 5 = " + (10 != 5));
        System.out.println("10 >= 5 = " + (10 >= 5));
        System.out.println("10 <= 5 = " + (10 <= 5));
        System.out.println("10 > 5  = " + (10 > 5));
        System.out.println("10 < 5  = " + (10 < 5));

        // Logical Operators
        System.out.println("==== Logical Operators ===============\n");

        System.out.println("10 > 5 && 20 < 15 = " + ( 10 > 5 && 20 < 15 ) );
        System.out.println("10 > 5 || 20 < 15 = " + ( 10 > 5 || 20 < 15 ) );

        // Increment Decrement
        System.out.println("==== Increment Decrement =============\n");

        System.out.println( "++ = " + (num2++) );
        System.out.println( "-- = " + (num2--) );
        System.out.println( "++ = " + (++num2) );        
        System.out.println( "-- = " + (--num2) );        
    }
}