<?php

namespace variables;

class Program
{
    const PROGRAMMING_LANGUAGE = 'PHP';

    public static function main() : void
    {
        $textString     = "Hello World!";
        $numberInt      = 255;
        $numberFloat    = 142.54;
        $valueBoolean   = true; // false
        $valueNull      = null;

        echo "String    value: {$textString}   \n";
        echo "Int       value: {$numberInt}    \n";
        echo "Float     value: {$numberFloat}  \n";
        echo "Boolean   value: {$valueBoolean} \n";
        echo "Null      value: {$valueNull}    \n";
        echo "String Constant: " . self::PROGRAMMING_LANGUAGE . "\n";
    }
}

Program::main();
