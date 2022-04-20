<?php 

namespace arrays;

class Program
{
    public static function main() : void 
    {
        // arrays -------------------------------------------------------------

        $numbers = array(5, 10, 15, 20, 25);

        for ($i = 0; $i < count($numbers); $i++) {
            echo "Number: " . $numbers[$i] . "<br>";
        }

        // Associative Arrays
        $rockBands = [
            "Hard Rock"    => "AC/DC", 
            "Heavy Metal"  => "Iron Maiden", 
            "Thrash Metal" => "Metallica"
        ];

        foreach ($rockBands as $key => $value) {
            echo "{$key}: " . $value . "<br>";
        }

        // Multidimensional Arrays --------------------------------------------

        $days = [];

        $days[0][0] = 2;
        $days[0][1] = 4;
        $days[0][2] = 6;

        $days[1][0] = 8;
        $days[1][1] = 10;
        $days[1][2] = 12;

        for ($i = 0; $i < count($days); $i++) {

            for ($j = 0; $j < count($days[$i]); $j++) {
                echo $days[$i][$j] . "<br>";
            }

        }

        $years = array(
            array(2000),
            array(2005),
            array(2010),
            array(2015),
            array(2020)
        );

        foreach ($years as $key => $value) {

            foreach ($value as $year ) {
                echo $year . "<br>";
            }

        }

    }
}

Program::main();
