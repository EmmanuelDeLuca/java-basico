# Java - Exercícios de Condições

Este repositório contém soluções para exercícios de condições em Java. Abaixo estão detalhes sobre cada exercício.

## Exercício 01
**Descrição:**
Fazer um programa para ler um número inteiro e dizer se este número é negativo ou não.

| Entradas | Saída |
| --- | --- |
| -10 | NEGATIVO |
| 8 | NAO NEGATIVO |
| 0 | NAO NEGATIVO |



## Exercício 02
**Descrição:**
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

| Entrada | Saída |
| --- | --- |
| 12 | PAR |
| -27 | IMPAR |
| 0 | PAR |



## Exercício 03
**Descrição:**
Leia 2 valores inteiros (A e B). O programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.

| Entradas | Saída |
| --- | --- |
| 6 <br> 24 | Sao Multiplos |
| 6 <br> 25 | Nao sao Multiplos |
| 24 <br> 6 | Sao Multiplos |


## Exercício 04
**Descrição:**
Leia a hora inicial e a hora final de um jogo. Calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

| Entradas | Saída |
| --- | --- |
| 16 2 | O JOGO DUROU 10 HORA(S) |
| 0 0 | O JOGO DUROU 24 HORA(S) |
| 2 16 | O JOGO DUROU 14 HORA(S) |



## Exercício 05
**Descrição:**
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

| Código | Especificação      | Preço   |
| ------ | ------------------ | ------- |
| 1      | Cachorro Quente    | R$ 4.00  |
| 2      | X-Salada           | R$ 4.50  |
| 3      | X-Bacon            | R$ 5.00  |
| 4      | Torrada Simples    | R$ 2.00  |
| 5      | Refrigerante       | R$ 1.50  |


| Entradas | Saída |
| --- | --- |
| 3 2 | Total: R$ 10.00 |
| 2 3 | Total: R$ 13.50 |


## Exercício 06
**Descrição:**
O programa deve ler um valor qualquer e apresentar uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

| Entradas | Saída |
| --- | --- |
| 25.01 | Intervalo (25,50] |
| 25.00 | Intervalo [0,25] |
| 100.00 | Intervalo (75,100] |
| -25.02 | Fora de intervalo |



## Exercício 07
**Descrição:**
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. Determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).

Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

| Entradas | Saída |
| --- | --- |
| 4.5 -2.2 | Q4 |
| 0.1 0.1 | Q1 |
| 0.0 0.0 | Origem |


## Exercício 08
**Descrição:**
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

| Renda                             | Imposto de Renda |
| --------------------------------- | ---------------- |
| De R$ 0.00 a R$ 2000.00           | Isento           |
| De R$ 2000.01 a R$ 3000.00        | 8%               |
| De R$ 3000.01 a R$ 4500.00        | 18%              |
| Acima de R$ 4500.00               | 28%              |


Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda.

No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.

| Entradas | Saída |
| --- | --- |
| 3002.00 | R$ 80.36 |
| 1701.12 | Isento |
| 4520.00 | R$ 355.60 |


