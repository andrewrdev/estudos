package casting;

public class Program 
{
    public static void main(String[] args) 
    {
        char    valueChar    = (char)   2;
        byte    numberByte   = (byte)   512;
        short   numberShort  = (short)  50254;
        int     numberInt    = (int)    12541254874L;
        long    numberLong   = (long)   74.55F;
        float   numberFloat  = (float)  154;
        double  numberDouble = (double) 254;

        System.out.println("Char      value: "  + valueChar);
        System.out.println("Byte      value: "  + numberByte);
        System.out.println("Short     value: "  + numberShort);
        System.out.println("Int       value: "  + numberInt);
        System.out.println("Long      value: "  + numberLong);
        System.out.println("Float     value: "  + numberFloat);
        System.out.println("Double    value: "  + numberDouble);
    }
}
