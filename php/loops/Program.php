<?php 

namespace loops;

class Program 
{
    public static function main() : void 
    {
        $number = 0;
        $beatles = ["John", "Paul", "George", "Ringo"];

        // while --------------------------------------------------------------

        echo "==== while ==========<br>";

        while ($number <= 10) {
            if ($number == 5) {
                break;
            }
            
            echo "Number: " . $number . "<br>";
            $number++;
        }

        // do while -----------------------------------------------------------

        echo "==== do while =======<br>";
        $number = 15;

        do {
            echo "Number: " . $number . "<br>";
            $number++;
        } while ($number <= 10);

        // for ----------------------------------------------------------------
        
        echo "==== for ============<br>";

        for ($i = 0; $i <= 10; $i++) {
            if ($i == 5) {
                continue;
            }

            echo "Number: " . $i . "<br>";
        }

        // foreach ------------------------------------------------------------

        echo "==== foreach ========<br>";

        foreach ($beatles as $beatle) {
            echo "Beatle: " . $beatle . "<br>";
        }
    }
}

Program::main();
