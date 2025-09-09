# Vetores (Arrays)

## 1. Introdução

Em desenvolvimento de software, é comum lidarmos com a necessidade de armazenar e manipular múltiplos dados de forma eficiente.
Os **vetores** (também chamados de **arrays**) são uma solução fundamental para esse desafio.

🔎 **Definição:**
Um vetor é uma **estrutura homogênea unidimensional** que armazena vários valores **do mesmo tipo** em uma única variável.
Cada valor é acessado por meio de um **índice**, que funciona como a posição do elemento dentro do vetor.

---

## 2. Exemplo Intuitivo

Imagine uma gaveta com várias divisórias.

* A gaveta é o vetor.
* Cada divisória é um **índice**.
* Dentro de cada divisória guardamos um valor do mesmo tipo (números, nomes, notas etc.).

---

## 3. Vantagens do Uso de Vetores

* Elimina a necessidade de criar várias variáveis individuais.
* Facilita a **organização de dados**.
* Permite **percorrer elementos automaticamente** com laços de repetição.
* É base para estruturas mais avançadas: **matrizes, listas, filas e pilhas**.

---

## 4. Declaração de Vetores

Para criar um vetor em algoritmos, usamos a seguinte sintaxe:

```algoritmo
VARIÁVEL: vetor [VALOR_INICIAL .. VALOR_FINAL] de TIPO
```

📌 **Exemplos:**

```algoritmo
notas: vetor [1..5] de real
nomes: vetor [1..50] de caracter
```

* O vetor `notas` armazena 5 números decimais.
* O vetor `nomes` armazena os nomes de 50 alunos.

---

## 5. Estruturas de Repetição com Vetores

Para manipular vetores, geralmente utilizamos laços de repetição.

📌 **Sintaxe do laço PARA:**

```algoritmo
PARA <variável> DE <início> ATE <fim> [PASSO <incremento>] FACA
   <comandos>
FIMPARA
```

---

## 6. Exemplos em Pseudocódigo

### a) Lendo nomes de alunos:

```algoritmo
nomes: vetor [1..5] de caracter

PARA contador DE 1 ATE 5 FACA
   ESCREVA("Digite o nome do aluno ", contador, ": ")
   LEIA(nomes[contador])
FIMPARA
```

### b) Lendo notas e calculando a média:

```algoritmo
notas: vetor [1..5] de real
soma: real
media: real

soma <- 0

PARA i DE 1 ATE 5 FACA
   ESCREVA("Digite a nota do aluno ", i, ": ")
   LEIA(notas[i])
   soma <- soma + notas[i]
FIMPARA

media <- soma / 5
ESCREVA("A média da turma é: ", media)
```

---

## 7. Atividade Prática – Média da Turma

**Título da Prática:** Média das Notas da Turma

**Objetivo:**
Praticar lógica de programação e manipulação de vetores.

**Tarefa:**
Elabore um algoritmo que:

1. Solicite ao usuário os **nomes e notas de 10 alunos**.
2. Armazene os dados em dois vetores (`nomes` e `notas`).
3. Calcule a **média da turma**.
4. Exiba na tela: índice, nome, nota e resultado da média.

---

## 8. Conteúdo Extra

🎬 **Filme recomendado:** *Jobs (2013)* – dirigido por Joshua Michael Stern.

* Mostra como Steve Jobs e Steve Wozniak iniciaram a revolução da computação pessoal com o Apple I.
* Disponível na Amazon Prime Video.

---

## 9. Referências Bibliográficas

* GUEDES, S. (Org.). *Lógica de programação algorítmica*. Pearson, 2014.
* MANZANO, J. A. N. G.; OLIVEIRA, J. F. *Estudo Dirigido de Algoritmos*. 15. ed. São Paulo: Érica, 2012.
* PUGA, S.; RISSETTI, G. *Lógica de programação e estruturas de dados, com aplicações em Java*. Pearson, 2016.
* RIBEIRO, J. A. *Introdução à programação e aos algoritmos*. 1. ed. Rio de Janeiro: LTC, 2019.
