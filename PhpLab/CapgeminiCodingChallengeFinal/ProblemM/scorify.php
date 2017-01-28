<?php
//$handle = STDIN;
define('STDIN', 'stdin.txt');
$handle = fopen(STDIN, "r");

if ($handle) {
    while (($line = fgets($handle)) !== false) {
        $data = getLine($line);

        //todo your login here

        printf("%s\n", $result);
    }//end while
    fclose($handle);
} else {
    printf("You have an error on your file");
}

function getLine($lineFile){
    $lines = explode('\n', $lineFile);
    return $lines[0];
}

function dd($var)
{
    echo var_dump($var);
}