<?php

class equipamento{
        
        private $nome;
        private $fabricante;
        private $custo;
        
        public function __construct($nome, $fabricante, $custo){
            $this->nome = $nome;
            $this->fabricante = $fabricante;
            $this->custo = $custo;
        }
        
        public function imprime(){
            return "Nome: " . $this->nome . "Fabricante: " . $this->fabricante . "<br>Preço: " . $this->custo . "<br>";
        }
}


?>