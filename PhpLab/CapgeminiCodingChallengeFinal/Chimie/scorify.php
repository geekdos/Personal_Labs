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
        $testCases *= 2;
        if ($testCases != 0) {
            list($l, $n) = explode(' ', getLine($line));
            list($nr, $li) = explode(' ', getLine(fgets($handle)));

            dd($l); //volum
            dd($n); //nbrecep
            dd($nr); //
            dd($li);
        }
        //printf("%s", $result);
        echo "<br />";
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
