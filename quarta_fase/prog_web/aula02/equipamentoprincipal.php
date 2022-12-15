<?php
include "equipamento.php";

$equipamento1 = new Equipamento("trator", "FabricTrator", 15000);
$equipamento2 = new Equipamento("Furradeira", "BlackDecker", 500);

echo $equipamento1->imprime();
echo $equipamento2->imprime();

?>