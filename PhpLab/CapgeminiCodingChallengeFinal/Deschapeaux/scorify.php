<?php
//$handle = STDIN;
define('STDIN', 'stdin.txt');
$handle = fopen(STDIN, "r");

function getTestCases($handle) : int
{
    $testCases = (int)trim(fgets($handle), '\n');
    return $testCases;
}

$testCases = getTestCases($handle);

if ($handle && $testCases >= 1 && $testCases <= 10) {
    while (($line = fgets($handle)) !== false) {
        if ($testCases != 0) {
            $n = getLine($line);
            $data = getLine(fgets($handle));
            $list = explode(' ', $data);
            for ($i = 0; $i < $n; $i++){
                for ($j = 0; $j < $n - 1 ;$j++){
                    dd($list[$i]);
                    dd($list[$j]);
                }
            }
        }
        //printf("%s", $result);
        echo "<br />";
        $testCases--;
    }//end while
    fclose($handle);
} else {
    printf("You have an error on your file");
}

function getLine($lineFile)
{
    $lines = explode('\n', $lineFile);
    return $lines[0];
}

function dd($var)
{
    echo var_dump($var);
}
