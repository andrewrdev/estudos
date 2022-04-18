<?php 

namespace operators;

class Program
{
    public static function main() : void
    {
        $num = 20;
        $num2 = 30;

        // Arithmetic
        echo "==== Arithmetic ======================<br>";

        echo "20 + 10  = " . (20 + 10)  . "<br>";
        echo "20 - 10  = " . (20 - 10)  . "<br>";
        echo "20 * 10  = " . (20 * 10)  . "<br>";
        echo "20 / 10  = " . (20 / 10)  . "<br>";
        echo "20 % 10  = " . (20 % 10)  . "<br>";
        echo "20 ** 10 = " . (20 ** 10) . "<br>";

        // Assignment Operators
        echo "==== Assignment ======================<br>";

        echo "20 += 10 = " . ($num += 10) . "<br>";
        echo "20 -= 10 = " . ($num -= 10) . "<br>";
        echo "20 *= 10 = " . ($num *= 10) . "<br>";
        echo "20 /= 10 = " . ($num /= 10) . "<br>";
        echo "20 %= 10 = " . ($num %= 10) . "<br>";

        // Comparison Operators
        echo "==== Comparison ======================<br>";

        echo "10 == 5   = "  . (10 == 5)    . "<br>";
        echo "10 === 5  = "  . (10 === '5') . "<br>";
        echo "10 != 5   = "  . (10 != 5)    . "<br>";
        echo "10 !== 5  = "  . (10 != 5)    . "<br>";
        echo "10 >= 5   = "  . (10 >= 5)    . "<br>";
        echo "10 <= 5   = "  . (10 <= 5)    . "<br>";
        echo "10 > 5    = "  . (10 > 5)     . "<br>";
        echo "10 < 5    = "  . (10 < 5)     . "<br>";

        // Logical Operators
        echo "==== Logical Operators ===============<br>";

        echo "10 > 5 && 20 < 15 = " . ( 10 > 5 && 20 < 15 ) . "<br>";
        echo "10 > 5 || 20 < 15 = " . ( 10 > 5 || 20 < 15 ) . "<br>";

        // Increment Decrement
        echo "==== Increment Decrement =============<br>";

        echo  "++ = " . ( $num2++ ) . "<br>";
        echo  "-- = " . ( $num2-- ) . "<br>";
        echo  "++ = " . ( ++$num2 ) . "<br>";        
        echo  "-- = " . ( --$num2 ) . "<br>";   
        
        // Ternary Operator
        echo "==== Ternary Operator ================<br>";

        echo (20 > 5 && 10 >= 5) ? "True" : "False";
    }
}

Program::main();