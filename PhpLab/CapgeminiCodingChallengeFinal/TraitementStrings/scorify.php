<?php
//$handle = STDIN;
define('STDIN', 'stdin.txt');
$handle = fopen(STDIN, "r");
$crypt = array(
    'a' => 0, 'b' => 1, 'c' => 2, 'd' => 3, 'e' => 4, 'f' => 5,
    'g' => 6, 'h' => 7, 'i' => 8,  'j' => 9, 'k' => 10,
    'l' => 11, 'm' => 12, 'n' => 13, 'o' => 14, 'p' => 15,
    'q' => 16, 'r' => 17, 's' => 18,  't' => 19, 'u' => 20,
    'v' => 21, 'w' => 22, 'x' => 23, 'y' => 24, 'z' => 25,
);
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
            list($a, $k) = explode(' ', getLine($line));
            $n = strlen($a);
            $ar = null;
            for ($i = 0; $i < $k; $i++){
                $ar .= $a;
            }
            $result = devide($crypt, $ar);
            $result = array_search($result, $crypt);
        }
        printf("%s", $result);
        echo "<br />";
        $testCases--;
        //break;
    }//end while
    fclose($handle);
} else {
    printf("You have an error on your file");
}

function devide($crypt, $as){
    $n1 = strlen($as);
    $temp = $temp1 = null;
    if ($n1 != 2 && $n1 != 1){
        $n = (strlen($as)/2); $as = substr($as, 0, $n);
        for ($i = 0; $i < $n; $i++) {
            $temp .= ($crypt[$as[$i]] * 2);
        }
        for ($i = 0; $i < $n ; $i++) {
            $temp1 .= array_search($temp[$i], $crypt);
        }
        devide($crypt, $temp1);
    }
    if ($n1 == 2){
        for ($i = 0; $i < $n1; $i++){
            $temp += $crypt[$as[$i]];
        }
        dd($temp);
        return $temp;
    }
    if ($n1 == 1){
        dd($crypt[$as]);
        return $crypt[$as];
    }
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
