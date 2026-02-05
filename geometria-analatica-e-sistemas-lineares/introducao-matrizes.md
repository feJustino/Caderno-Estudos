# Introdução a Matrizes

## 1. Introdução: Geometria Analítica e Sistemas Lineares

A **Geometria Analítica** e os **Sistemas Lineares** fazem parte das ciências exatas e têm como principal objetivo descrever, de forma matemática, fenômenos do mundo real.

* A **Geometria Analítica** busca representar formas geométricas por meio de equações e funções, tornando as aplicações mais exatas e precisas.
* Os **Sistemas Lineares**, estudados na Álgebra Linear, organizam e resolvem problemas que envolvem grande quantidade de variáveis.

### Exemplo motivador

Considere o lançamento de um objeto para cima. Em um modelo simples, o movimento depende apenas do tempo. No entanto, ao incluir variáveis como força inicial, resistência do ar, gravidade e outras condições, o problema se torna mais complexo. Para lidar com múltiplas variáveis simultaneamente, utilizamos técnicas da Álgebra Linear e dos Sistemas Lineares.

Esses conceitos são amplamente aplicados em áreas como:

* Análise de grandes volumes de dados
* Inteligência Artificial
* Robótica
* Modelagem e simulação de sistemas

Dentro desse contexto, surge o estudo das **matrizes**, que são a base para a representação e resolução de sistemas lineares.

---

## 2. Conceito de Matrizes

As **matrizes** são formas organizadas de representação de dados, geralmente dispostas em formato de tabela, facilitando a visualização e a interpretação das informações.

Uma matriz pode ser representada por:

* Parênteses ( )
* Colchetes [ ]
* Barras duplas ║ ║

Exemplo de matriz 2×2:

[
A = \begin{bmatrix}
2 & 5 \
7 & 8
\end{bmatrix}
]

### Ordem de uma matriz

A **ordem** de uma matriz é dada por:

[
\text{ordem} = i \times j
]

Onde:

* *i* = número de linhas
* *j* = número de colunas

Exemplo: uma matriz 2×2 possui 2 linhas e 2 colunas.

---

## 3. Elementos de uma Matriz

Cada elemento de uma matriz é identificado pela sua posição:

[
a_{i,j}
]

Onde:

* *i* indica a linha
* *j* indica a coluna

Exemplo de matriz genérica 2×2:

[
A = \begin{bmatrix}
a_{1,1} & a_{1,2} \
a_{2,1} & a_{2,2}
\end{bmatrix}
]

Interpretação dos elementos:

* (a_{1,1}): 1ª linha, 1ª coluna
* (a_{1,2}): 1ª linha, 2ª coluna
* (a_{2,1}): 2ª linha, 1ª coluna
* (a_{2,2}): 2ª linha, 2ª coluna

---

## 4. Construção de Matrizes

Para construir uma matriz, utilizamos uma **lei de formação**, geralmente expressa por uma fórmula que depende da linha (*i*) e da coluna (*j*).

### Exemplo

Construir uma matriz (A) de ordem 2×2 tal que:

[
A_{i,j} = 2i + j
]

**Passo 1 – Matriz posicional:**

[
A = \begin{bmatrix}
a_{1,1} & a_{1,2} \
a_{2,1} & a_{2,2}
\end{bmatrix}
]

**Passo 2 – Aplicar a lei:**

* (a_{1,1} = 2(1) + 1 = 3)
* (a_{1,2} = 2(1) + 2 = 4)
* (a_{2,1} = 2(2) + 1 = 5)
* (a_{2,2} = 2(2) + 2 = 6)

**Matriz resultante:**

[
A = \begin{bmatrix}
3 & 4 \
5 & 6
\end{bmatrix}
]

---

## 5. Tipos de Matrizes

### 5.1 Matriz Identidade

A **matriz identidade** é uma matriz quadrada em que:

* Os elementos da diagonal principal são iguais a 1
* Os demais elementos são iguais a 0

É representada por (I).

Exemplos:

[
I_{2} = \begin{bmatrix}
1 & 0 \
0 & 1
\end{bmatrix}
]

[
I_{3} = \begin{bmatrix}
1 & 0 & 0 \
0 & 1 & 0 \
0 & 0 & 1
\end{bmatrix}
]

---

### 5.2 Matriz Oposta

A **matriz oposta** de uma matriz (A) é obtida trocando o sinal de todos os seus elementos.

Exemplo:

[
A = \begin{bmatrix}
3 & -1 \
5 & 2
\end{bmatrix}
]

[
-A = \begin{bmatrix}
-3 & 1 \
-5 & -2
\end{bmatrix}
]

---

### 5.3 Matriz Transposta

A **matriz transposta** de uma matriz (A), indicada por (A^t), é obtida trocando linhas por colunas.

Exemplo:

[
A = \begin{bmatrix}
2 & 5 \
3 & 7
\end{bmatrix}
]

[
A^t = \begin{bmatrix}
2 & 3 \
5 & 7
\end{bmatrix}
]

---

### 5.4 Igualdade de Matrizes

Duas matrizes são **iguais** quando:

* Possuem a mesma ordem
* Todos os elementos correspondentes são iguais

Exemplo:

[
A = \begin{bmatrix}
2 & d \
c & 7
\end{bmatrix}, \quad
B = \begin{bmatrix}
a & 3 \
5 & b
\end{bmatrix}
]

Para (A = B):

* (a = 2)
* (b = 7)
* (c = 5)
* (d = 3)

---

## 6. Classificação das Matrizes

### Matrizes Especiais

* **Matriz Quadrada**: número de linhas igual ao número de colunas (ordem (n \times n))
* **Matriz Nula**: todos os elementos iguais a zero
* **Matriz Coluna**: possui apenas uma coluna
* **Matriz Linha**: possui apenas uma linha

---

## 7. Traço da Matriz

O **traço** de uma matriz quadrada é a soma dos elementos da diagonal principal.

Representação simbólica:

[
tr(A)
]

### Exemplos

Para uma matriz genérica 2×2:

[
A = \begin{bmatrix}
a_{1,1} & a_{1,2} \
a_{2,1} & a_{2,2}
\end{bmatrix}
]

[
tr(A) = a_{1,1} + a_{2,2}
]

Exemplo numérico:

[
B = \begin{bmatrix}
1 & 6 & 5 \
-7 & 7 & 2 \
0 & 5 & 2
\end{bmatrix}
]

[
tr(B) = 1 + 7 + 2 = 10
]

---

## 8. Atividade Extra

**Atividade:** Filme – *Pierre de Fermat*

**Link:** [https://www.youtube.com/watch?v=39vQgSKuQg8](https://www.youtube.com/watch?v=39vQgSKuQg8)

---

## 9. Referências Bibliográficas

* AYRES JR., Frank. *Matrizes – Coleção Schaum*. McGraw-Hill, 1981.
* BOLDRINI, José Luiz et al. *Álgebra Linear*. 3ª ed. Harbra, 1986.
* CROWE, Michael J. *A History of Vector Analysis*. Dover, 1985.
* FREITAS FILHO, P. J. *Introdução à Modelagem e Simulação de Sistemas com Aplicações em Arena*. Editora Visual Books Ltda, 2008.
