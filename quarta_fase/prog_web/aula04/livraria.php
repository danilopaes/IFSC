<?php

include_once 'livro.php';
include_once 'impresso.php';
include_once 'ebook.php';

$livro1 = new Impresso("Castelo", 2010, 50, "Mauricio", 1.5, "20x20");
$livro2 = new ebook("Senhor dos Anies", 2010, 50, "J.R.R. Tolkien", 2.5, "20x20");   

$livro1->imprime();
$livro2->imprime();


