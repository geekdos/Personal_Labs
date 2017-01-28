<?php
//$handle = STDIN;
define('STDIN', 'stdin.txt');
$handle = fopen(STDIN, "r");

function getTestCases($handle): int
{
    $testCases = (int)trim(fgets($handle), '\n');
    return $testCases;
}

$testCases = getTestCases($handle);

if ($handle && $testCases >= 1 && $testCases <= 10) {
    while (($line = fgets($handle)) !== false) {
        if ($testCases != 0) {
            $n = getLine($line);
            dd($n);
            for ($i = 0; $i < $n * 2; $i++) {
                $cordonate = getLine(fgets($handle));
                dd($cordonate);
                list($x, $y) = explode(' ', $cordonate);
                dd($x);
                dd($y);
            }
        }
        //$distance = sqrt(pow(($x1 - $x2), 2) + pow(($y1 - $y2), 2));
        //printf("%s", $result);
        //echo "<br />";
        $testCases--;
        break;
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
