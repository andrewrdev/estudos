package variables;

public class Program 
{
    public static void main(String[] args) 
    {
        String  textString   = "Hello World!";
        char    valueChar    = 'B';
        byte    numberByte   = 127;
        short   numberShort  = 32111;
        int     numberInt    = 1549523245;
        long    numberLong   = 1223545895;
        float   numberFloat  = 15.35f;
        double  numberDouble = 54.55;
        boolean isDeveloper  = true; // false
        
        // Constant
        final String PROGRAMMING_LANGUAGE = "Java";

        System.out.println("String    value: "  + textString);
        System.out.println("Char      value: "  + valueChar);
        System.out.println("Byte      value: "  + numberByte);
        System.out.println("Short     value: "  + numberShort);
        System.out.println("Int       value: "  + numberInt);
        System.out.println("Long      value: "  + numberLong);
        System.out.println("Float     value: "  + numberFloat);
        System.out.println("Double    value: "  + numberDouble);
        System.out.println("Boolean   value: "  + isDeveloper);
        System.out.println("String Constant: "  + PROGRAMMING_LANGUAGE);
    }
}
