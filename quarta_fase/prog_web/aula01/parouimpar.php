<?php
//faça um algoritmo que determine se um número é par ou ímpar


function check($number){
    if($number % 2 == 0){
        echo "O numero é par"; 
    }
    else{
        echo "O numero é impar";
    }
}

$number = 40;
check($number)
?>