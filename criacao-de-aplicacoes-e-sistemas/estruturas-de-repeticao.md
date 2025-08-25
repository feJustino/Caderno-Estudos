# Laços

```mermaid
---
title: Tiṕos de estrutura de repetição 
---
graph TD
subgraph SE
A[Um algoritmo pode necessitar repetir parte do código]
B[Mecanismo de repetição são recursos importantes e muito utilizados em algoritmo]
C[Cada execução de uma parte do código em um laço trata-se de uma interação]
D[Assim uma dada parte do código pode ser executada quantas vezes forem necessárias]

A==>B==>C==>D
end
subgraph ENQUANTO
E[A estrutura de repetição **ENQUANTO** permite repetir um trecho de código enquanto uma determinada condição for verdadeira.]
F[Em geral, um estrutra **ENQUANTO** fornece um código mais simples e fácil de ser entendi do que a estrutura **PARA**]
G[**Não se conhece a priori o número de repetições** que serão executadas no corpo do laço]

E==>F==>G
end


```

## Para 
> Estrutura Para consiste em empregar uma variavel, geralmente um contador para controlar as repetições a serem executadas.

```mermaid
graph TD
A[inicialização do contador]
B{para 1 até 10}
C["*instruções* <br> incremento contador"]
D(Fim)
A==>B==Sim==>C==>B
B==Nãoo==>D

```

## ENQUANTO

```mermaid
graph TD
B{Enquanto i<=10}
C["*instruções*"]
D(Fim)
B==Sim==>C==>B
B==Nãoo==>D

```

## REPITA...ATÉ
> A estrutura "repita até" é similar ao "enquanto", mas executa o bloco de código pelo menos uma vez antes de verificar a condição. A avalição da condição ocorre no final da estrutura.

```mermaid
graph TD
C["*instruções*"]
B{Repita até i>=10}
D(Fim)
C==Sim==>B==>C
B==Not==>D

```

1*1=1*2=2*3=6*4=24