<?php 

namespace conditional;

class Program 
{
    public static function main() : void 
    {
        $position  = 3;
        
        // if else ------------------------------------------------------------
        
        echo "==== IF ELSE ===============<br>";

        if ($position == 1) {

            echo "Position: 1";

        } else if ($position == 2) {

            echo "Position: 2";

        } else if ($position == 3) {

            echo "Position: 3";

        } else {

            echo "Position: invalid";

        }

        // switch -------------------------------------------------------------

        echo "<br>==== Switch ================<br>";

        switch ($position) {

            case 1:
                echo "Position: 1";
                break;
            case 2:
                echo "Position: 2";
                break;
            case 3:
                echo "Position: 3";
                break;
            default:
                echo "Position invalid";

        }
    }
}

Program::main();
