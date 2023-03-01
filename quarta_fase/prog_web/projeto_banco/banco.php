<?php

include 'conta.php';

$conta1 = new Conta(1111);
$conta2 = new Conta(2222);

$conta1 -> setSaldo(100);
$conta2 -> setSaldo(10);

echo $conta1 ->  getSaldo().PHP_EOL;
echo $conta2 ->  getSaldo().PHP_EOL;


$conta1 -> sacar(50);
echo $conta1 ->  getSaldo().PHP_EOL;

$conta2 -> depositar(40);
echo $conta2 ->  getSaldo().PHP_EOL;


?>