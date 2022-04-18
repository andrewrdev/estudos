namespace operators
{
    public class Program
    {
        public static void Main(string[] args)
        {
            int num = 20;
            int num2 = 30;
            string result = "";

            // Arithmetic
            Console.WriteLine("==== Arithmetic ======================\n");

            Console.WriteLine("20 + 10 = " + (20 + 10));
            Console.WriteLine("20 - 10 = " + (20 - 10));
            Console.WriteLine("20 * 10 = " + (20 * 10));
            Console.WriteLine("20 / 10 = " + (20 / 10));
            Console.WriteLine("20 % 10 = " + (20 % 10));

            // Assignment Operators
            Console.WriteLine("==== Assignment ======================\n");

            Console.WriteLine("20 += 10 = " + (num += 10));
            Console.WriteLine("20 -= 10 = " + (num -= 10));
            Console.WriteLine("20 *= 10 = " + (num *= 10));
            Console.WriteLine("20 /= 10 = " + (num /= 10));
            Console.WriteLine("20 %= 10 = " + (num %= 10));

            // Comparison Operators
            Console.WriteLine("==== Comparison ======================\n");

            Console.WriteLine("10 == 5 = " + (10 == 5));
            Console.WriteLine("10 != 5 = " + (10 != 5));
            Console.WriteLine("10 >= 5 = " + (10 >= 5));
            Console.WriteLine("10 <= 5 = " + (10 <= 5));
            Console.WriteLine("10 > 5  = " + (10 > 5));
            Console.WriteLine("10 < 5  = " + (10 < 5));

            // Logical Operators
            Console.WriteLine("==== Logical Operators ===============\n");

            Console.WriteLine("10 > 5 && 20 < 15 = " + (10 > 5 && 20 < 15));
            Console.WriteLine("10 > 5 || 20 < 15 = " + (10 > 5 || 20 < 15));

            // Increment Decrement
            Console.WriteLine("==== Increment Decrement =============\n");

            Console.WriteLine("++ = " + (num2++));
            Console.WriteLine("-- = " + (num2--));
            Console.WriteLine("++ = " + (++num2));
            Console.WriteLine("-- = " + (--num2));

            // Ternary Operator
            Console.WriteLine("==== Ternary Operator ================\n");

            result = (10 > 5) ? "Yes, true" : "No, false";

            Console.WriteLine("10 > 5 : " + result);

        }
    }
}