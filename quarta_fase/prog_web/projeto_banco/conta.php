<?php

class Conta{
    private  $numero;
    private  $saldo;

    public function __construct($numero){
        echo "Cria Conta... ".PHP_EOL;
        $this -> numero = $numero;
        $this -> saldo = 0;
    }

    public function sacar (float $valor){
        if($valor > $this -> saldo){
            echo "Saldo insuficiente".PHP_EOL;
        }else{
            $this -> saldo = $valor;
        }
    }

    public function depositar (float $valor){
        $this -> saldo += $valor;
    }

    /**
     * Get the value of numero
     */ 
    public function getNumero()
    {
        return $this->numero;
    }

    /**
     * Set the value of numero
     *
     * @return  self
     */ 
    public function setNumero($numero)
    {
        $this->numero = $numero;

        return $this;
    }

    /**
     * Get the value of saldo
     */ 
    public function getSaldo()
    {
        return $this->saldo;
    }

    /**
     * Set the value of saldo
     *
     * @return  self
     */ 
    public function setSaldo($saldo)
    {
        $this->saldo = $saldo;

        return $this;
    }
}