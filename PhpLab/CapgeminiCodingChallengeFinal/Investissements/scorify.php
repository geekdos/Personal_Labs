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
            $data = getLine($line);
            list($a, $b, $c) = explode(' ', $data);
            $temp1 = $temp2 = $temp3 = 0;
            $n = getLine(fgets($handle));
            if ($a <= 50 && $a >= 0 && $b <= 50 && $b >= 0 && $c <= 50 && $c >= 0) {
                if ($n >= 0 && $n <= 1000000000) {
                    for ($i = 1; $i <= $n; $i++) {
                        $a = $b + $c;
                        $b = $a + $c;
                        $c = $b + $a;
                    }
                    $result = ($a + $b + $c) % 1000000007;
                }
            }
        }
        printf("%s", $result);
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
