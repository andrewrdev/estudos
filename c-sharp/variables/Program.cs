namespace variables
{
    public class Program
    {
        public static void Main(string[] args)
        {
            string  textString   = "I am software developer!";
            char    valueChar    = 'A';
            byte    numberByte   = 255;
            sbyte   numberSbyte  = 127;
            short   numberShort  = 32000;
            ushort  numberUshort = 52511;
            int     numberInt    = 50;
            uint    numberUint   = 14545;
            long    numberLong   = 1202542121126569856;
            ulong   numberUlong  = 1212151545454545;
            float   numberFloat  = 51.5f;
            double  numberDouble = 42.9;
            bool    isDeveloper  = true; // false

            Console.WriteLine("String value: " + textString);
            Console.WriteLine("Char   value: " + valueChar);
            Console.WriteLine("Byte   value: " + numberByte);
            Console.WriteLine("Sbyte  value: " + numberSbyte);
            Console.WriteLine("Short  value: " + numberShort);
            Console.WriteLine("Ushort value: " + numberUshort);
            Console.WriteLine("Int    value: " + numberInt);
            Console.WriteLine("Uint   value: " + numberUint);
            Console.WriteLine("Long   value: " + numberLong);
            Console.WriteLine("Ulong  value: " + numberUlong);
            Console.WriteLine("Float  value: " + numberFloat);
            Console.WriteLine("Double value: " + numberDouble);
            Console.WriteLine("Bool   value: " + isDeveloper);
        }
    }
}