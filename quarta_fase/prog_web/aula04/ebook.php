<?php

class ebook extends Livro{

    private $tamanhoArquivo;

    public function __construct($titulo, $ano, $valor, $autor, $tamanhoArquivo){
        parent::__construct($titulo, $ano, $valor, $autor);
        $this->tamanhoArquivo = $tamanhoArquivo;
    }

    public function imprime(){
        parent::imprime();
        echo PHP_EOL."tamanhoArquivo:".$this->tamanhoArquivo;
    }

}