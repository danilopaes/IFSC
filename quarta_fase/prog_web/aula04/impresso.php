<?php

class impresso extends Livro{

    private $peso;
    private $dimensoes;

    public function __construct($titulo, $ano, $valor, $autor, $peso, $dimensoes){
        parent::__construct($titulo, $ano, $valor, $autor);
        $this->peso = $peso;
        $this->dimensoes = $dimensoes;
    }

    public function imprime(){
        parent::imprime();
        echo PHP_EOL."peso:".$this->peso;
        echo PHP_EOL."dimensoes:".$this->dimensoes;
    }

}