# Trabalho de Programação

Os códigos-fonte estão em `src/`, e as classes em `bin/`.

## Soluções dos problemas

* Crivo de Eratóstenes: [`ArrayCrivo.java`](src/ArrayCrivo.java)(Versão com _ArrayList_), [`LinkedCrivo.java`](src/LinkedCrivo.java)(Versão com _LinkedList_)
* Melhor Divisor: [`MelhorDivisor.java`](src/MelhorDivisor.java)
* Fatores Primos de Leonardo: -
* Múltiplo Especial: [`MultiploEspecial.java`](src/MultiploEspecial.java)
* Fibonacci: [`Fibona.java`](src/Fibona.java)
* Duro de Matar: [`Jarros.java`](src/Jarros.java)

## Sobre ArrayList e LinkedList

Essas duas classes são implementações da _interface List_, que define as estruturas de dados do tipo lista.

### Implementação

A classe _ArrayList_ faz o uso de um vetor de dados interno. Já a classe _LinkedList_ ...

### Comportamento

### Problemas de Performance

## Crivo de Eratóstenes

O Crivo de Eratóstenes é um algorítmo para encontrar números primos até um valor limite. Quando implementado com as classes _ArrayList_ e _LinkedList_, o algorítmo tem os seguintes tempos de execução:

Valor Máximo | Tempo para _ArrayList_ | Tempo para _LinkedList_
-------------|------------------------|------------------------
10.000 | 39 ms | 42 ms
100.000 | 502 ms | 479 ms
1.000.000 | 67.586 ms | 158.627 ms