# Matrizes em Programação — Guia Didático

## 1. Conceito Fundamental
Uma **matriz** é uma estrutura de dados **homogênea e multidimensional**, ou seja, composta por elementos do mesmo tipo organizados em **linhas** e **colunas**. 

➡️ Podemos pensar em uma matriz como uma **tabela** ou uma **planilha**:
- Cada **linha** representa um conjunto de elementos relacionados.
- Cada **coluna** representa uma característica ou valor associado.

📌 Diferença para vetores:
- **Vetor** → possui apenas **1 dimensão** (lista de valores).
- **Matriz** → possui **2 ou mais dimensões** (tabela, cubo, tensor, etc.).

Exemplo de matriz 3x2 (3 linhas, 2 colunas):
```
[ 7   8 ]
[ 3   4 ]
[ 9   1 ]
```

## 2. Notação
- Geralmente representada como **M × N**:
  - **M** = número de linhas
  - **N** = número de colunas

Exemplo: matriz **4 × 5** → 4 linhas e 5 colunas.

Em álgebra linear, escrevemos:
- `A ∈ R^(m×n)` → A é uma matriz com `m` linhas e `n` colunas, contendo números reais.

## 3. Declaração em Algoritmos (VisualG)
No **VisualG**, a declaração de matrizes utiliza a palavra-chave **vetor**, mesmo quando há mais de uma dimensão.

Exemplo:
```pseudocode
notas: vetor [1..50, 1..4] de inteiro
```

➡️ Essa declaração cria uma matriz chamada `notas` com:
- 50 linhas (alunos)
- 4 colunas (disciplinas)

### Estrutura de repetição para percorrer a matriz
Para manipular os elementos, usamos **laços aninhados**:

```pseudocode
PARA i DE 1 ATE 50 FACA
    ESCREVA("Aluno número ", i)
    PARA j DE 1 ATE 4 FACA
        ESCREVA("Digite a nota ", j)
        LEIA(notas[i, j])
    FIMPARA
FIMPARA
```

## 4. Indexação
- Um elemento é acessado por **dois índices**: linha e coluna.
- Exemplo: `A[2, 3]` → elemento da **2ª linha** e **3ª coluna**.
- Algumas linguagens começam a indexação em **0** (Python, C, Java), outras em **1** (VisualG, MATLAB).

## 5. Operações Comuns
- **Soma** de matrizes → elemento a elemento.
- **Multiplicação escalar** → cada valor multiplicado por uma constante.
- **Produto matricial** → combinação de linhas e colunas (requer compatibilidade de dimensões).
- **Transposição** → troca linhas por colunas.
- **Agregações** → soma total, média por linha ou coluna.

## 6. Matrizes em Python (NumPy)
Em Python, utilizamos o **NumPy**:

```python
import numpy as np

# Criação de uma matriz 2x3
A = np.array([[1, 2, 3],
              [4, 5, 6]])

# Acesso a elemento
print(A[0, 2])  # Saída: 3

# Operações
B = A.T              # Transposta (3x2)
C = A + 10           # Soma escalar
D = A.dot(np.array([[1],[0],[1]]))  # Produto matricial
```

## 7. Aplicações
- **Armazenar dados tabulares** (ex.: notas de alunos).
- **Processamento de imagens** (matriz de pixels).
- **Simulações científicas** (malhas numéricas).
- **Aprendizado de máquina** (tensores de dados).

## 8. Atividade Prática
### Problema: Soma de matriz
Crie um algoritmo em pseudocódigo que:
1. Declare uma matriz `A` de **5×5**.
2. Some **10** a cada elemento da matriz.
3. Mostre o resultado na tela.

Exemplo de solução (pseudocódigo):
```pseudocode
A: vetor [1..5, 1..5] de inteiro

PARA i DE 1 ATE 5 FACA
    PARA j DE 1 ATE 5 FACA
        LEIA(A[i, j])
        A[i, j] <- A[i, j] + 10
    FIMPARA
FIMPARA

PARA i DE 1 ATE 5 FACA
    PARA j DE 1 ATE 5 FACA
        ESCREVA(A[i, j], " ")
    FIMPARA
    ESCREVAL("")
FIMPARA
```

---

## 9. Conteúdo Bônus 🎬
Para relaxar após os estudos, assista ao filme **Matrix** (1999). Ele traz uma metáfora interessante entre realidade e simulação digital.

---

## 10. Referências
- GUEDES, S. *Lógica de programação algorítmica*. Pearson, 2014.
- MANZANO, J. A. N. G.; OLIVEIRA, J. F. *Estudo Dirigido de Algoritmos*. 15. ed. São Paulo: Érica, 2012.
- PUGA, S.; RISSETTI, G. *Lógica de programação e estruturas de dados, com aplicações em Java*. Pearson, 2016.
- RIBEIRO, J. A. *Introdução à programação e aos algoritmos*. LTC, 2019.
