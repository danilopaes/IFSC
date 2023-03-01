<?php
//Calcule o valor de uma dívida inicial de R$100,00 após 12 meses com juros de 1,50% ao mês

$valor = 100;
$juros = 1.5;
$meses = 12;
$total = $valor;
for($i=1;$i<=$meses;$i++){
    $total = $total + ($total * $juros / 100);
}
echo "O valor da dívida é R$: ".round($total,2);

?>