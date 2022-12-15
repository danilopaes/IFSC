<?php

abstract class Livro{
    protected $titulo;
    protected $ano;
    protected $valor;
    protected $autor;

    public function __construct($titulo, $ano, $valor, $autor){
        $this->titulo = $titulo;
        $this->ano = $ano;
        $this->valor = $valor;
        $this->autor = $autor;
    }

    public function imprime(){
        echo PHP_EOL."Titulo:".$this->titulo;
        echo PHP_EOL."Ano:".$this->ano;
        echo PHP_EOL."Autor:".$this->autor;
    }

}