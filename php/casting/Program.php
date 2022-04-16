<?php 

namespace casting;

class Program
{
    public static function main() : void 
    {
        $valueString    = (string) 500;
        $valueInt       = (int)    142.55;
        $valueFloat     = (float)  135;
        $valueBoolean   = (bool)   1;

        echo "String  value: {$valueString}  \n";
        var_dump($valueString);
        echo "\n";

        echo "Int     value: {$valueInt}     \n";
        var_dump($valueInt);
        echo "\n";

        echo "Float   value: {$valueFloat}   \n";
        var_dump($valueFloat);
        echo "\n";

        echo "Boolean value: {$valueBoolean} \n";
        var_dump($valueBoolean);
        echo "\n";
    }
}

Program::main();
