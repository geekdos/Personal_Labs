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
        $data = getLine($line);
        if ($testCases != 0) {
            $lenth = strlen($data);
            $test = preg_match("#[A-Z]#", $data)
                + preg_match("#[a-z]#", $data)
                + preg_match("#[0-9]#", $data)
                + preg_match("#[\\-\\_\\@\\.]#", $data)
                + preg_match("#[^a-zA-Z0-9]#", $data);
            if($test == 5 && $lenth >= 8){
                $resp = 'YES';
            }else{
                $resp = 'NO';
            }

            $result = $resp;
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
