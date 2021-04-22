# Trabalho de Programação	

## Sobre ArrayList e LinkedList

Essas duas classes são implementações da _interface List_, que define as estruturas de dados do tipo lista.

### Implementação

A classe _ArrayList_ faz o uso de um vetor de dados interno. Já a classe _LinkedList_ implementa uma lista duplamente encadeada, na qual os dados são armazenados em nós.

### Comportamento

Quando o _ArrayList_ chega ao limite do seu tamanho, mas ainda elementos a serem inseridos no array, o _ArrayList_ faz uma cópia do vetor interno com tamanho 50% maior do que o vetor original. Esse não é o caso da _LinkedList_, onde, devido à sua natureza encadeada, os elementos simplesmente vão sendo adicionados ao final da lista.

### Problemas de Performance

## Crivo de Eratóstenes

O Crivo de Eratóstenes é um algorítmo para encontrar números primos até um valor limite. Em outras palavras, dado um número _N_, deve-se encontrar todos o números primos entre 2 e _N_. Para isso, o algorítmo é executado da forma a seguir:

1. Crie uma lista de inteiros consecutivos de 2 até _N_;
2. Torne _p_ igual a 2, o menor número primo;
3. Encontre todos os múltiplos de _p_ entre _p_ e _N_, e marque-os. O _p_ em si não deve ser marcado;
4. Encontre o próximo número maior que _p_ que não esteja marcado. Se não houver tal número, pare. Senão, torne _p_ igual a esse número e repita a partir do passo 3.

Quando o algorítmo termina, todos os números não marcados são os primos até _N_. Se implementado com as classes _ArrayList_ e _LinkedList_, o algorítmo tem os seguintes tempos de execução:

Valor Máximo | Tempo para _ArrayList_ | Tempo para _LinkedList_
-------------|------------------------|------------------------
10.000 | 39 ms | 42 ms
100.000 | 502 ms | 479 ms
1.000.000 | 67.586 ms | 158.627 ms

## Soluções dos problemas

Os códigos-fonte estão em `src/`, e as classes em `bin/`.

* Crivo de Eratóstenes: [`ArrayCrivo.java`](src/ArrayCrivo.java)(Versão com _ArrayList_), [`LinkedCrivo.java`](src/LinkedCrivo.java)(Versão com _LinkedList_)
* Melhor Divisor: [`MelhorDivisor.java`](src/MelhorDivisor.java)
* Fatores Primos de Leonardo: -
* Múltiplo Especial: [`MultiploEspecial.java`](src/MultiploEspecial.java)
* Fibonacci: [`Fibona.java`](src/Fibona.java)
* Duro de Matar: [`Jarros.java`](src/Jarros.java)