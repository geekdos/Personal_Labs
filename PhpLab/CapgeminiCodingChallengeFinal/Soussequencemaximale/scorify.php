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
            $init_n = getLine($line);
            $elements = explode(' ', getLine(fgets($handle)));
            $freq = array_count_values($elements);

            if (count($freq) <= 2){
                $result = count(array_unique($elements));
            }else{
                $result = 0;
                foreach ($freq as $v){
                    $result += $v;
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
