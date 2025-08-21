# Variáveis, Constantes e Operadores

## Introdução

No universo da programação, entender o conceito de **variáveis** e **constantes** é essencial.  
Podemos imaginar a memória do computador como um grande armário cheio de gavetas:  

- Cada gaveta recebe um **nome** e pode guardar uma informação (um número, uma palavra, uma frase etc.).  
- Essas gavetas são chamadas de **variáveis**.  
- As **constantes**, por outro lado, são gavetas cujo valor nunca muda durante a execução do programa.  

Com esses elementos, conseguimos armazenar informações, realizar operações e criar algoritmos que fazem sentido no mundo real.

---

## Variáveis

Uma **variável** é um espaço de memória identificado por um nome, capaz de armazenar um valor que pode ser alterado durante a execução de um programa.

- **Nome** → identificador único da variável  
- **Tipo** → define os valores que podem ser armazenados (inteiro, real, texto etc.)  
- **Conteúdo** → o valor atual que está guardado  

📌 Exemplo:  

```text
idade = 25
nome = "Débora"
````

### Boas práticas na declaração

* O nome deve começar com uma **letra** (minúscula por convenção).
* Não pode conter **espaços em branco**.
* Não pode ser uma **palavra reservada** da linguagem (ex: `Escreva` no Visualg).
* Deve representar claramente o valor que armazena.

✅ Variáveis válidas: `idade`, `a1`, `nota_01`, `telefone`, `nota3prova1`
❌ Variáveis inválidas: `1dia`, `salário do empregado`, `nota-1`, `ddd/telefone`, `3prova1`

---

## Constantes

Uma **constante** é um valor fixo, que não muda durante a execução do programa.
Exemplo clássico: o valor de **PI (π)**.

📌 Exemplo no cálculo da área de um círculo:

```
A = π * r²
```

Mesmo com diferentes raios, o valor de π nunca será alterado.

---

## Operadores

Os **operadores** permitem realizar cálculos e comparações. São divididos em três grupos:

### 1. Operadores Aritméticos

* **Unários**:

  * `+` (manutenção de sinal) → indica positivo
  * `-` (inversão de sinal) → indica negativo

* **Binários**:

  * `+` (adição)
  * `-` (subtração)
  * `*` (multiplicação)
  * `/` (divisão)
  * `%` (resto da divisão)
  * `^` (exponenciação)
  * `DIV` (divisão inteira, em algumas linguagens/pseudocódigos)

### 2. Operadores Relacionais

Usados para comparar valores. O resultado é sempre **verdadeiro** ou **falso**.

* `>` (maior que)
* `<` (menor que)
* `>=` (maior ou igual)
* `<=` (menor ou igual)
* `=` (igual)
* `<>` (diferente)

### 3. Operadores Lógicos

Usados para combinar condições lógicas.

* `E` (AND)
* `OU` (OR)
* `NÃO` (NOT)

---

## Exemplo Prático (Visualg)

Podemos usar o **Visualg** para colocar em prática os conceitos de variáveis, constantes e operadores.
Exemplo simples: cálculo da **soma** e da **média** de três números.

```pseudocode
algoritmo "Soma_e_Media"
var
   n1, n2, n3: real
   soma, media: real
inicio
   escreva("Digite o primeiro número: ")
   leia(n1)
   escreva("Digite o segundo número: ")
   leia(n2)
   escreva("Digite o terceiro número: ")
   leia(n3)

   soma <- n1 + n2 + n3
   media <- soma / 3

   escreval("A soma é: ", soma)
   escreval("A média é: ", media)
fimalgoritmo
```

---

## Atividade Prática

📌 Desenvolva um algoritmo em pseudocódigo no **Visualg**:

* Leia 5 números
* Calcule a soma
* Calcule a média
* Exiba na tela o resultado

Essa prática serve para autoavaliação e fixação dos conceitos.

---

## Conteúdo Bônus

🎬 Filme: **AI – Artificial Intelligence** (Steven Spielberg).
Conta a história de David, o primeiro menino-robô programado para amar, e aborda questões profundas sobre humanidade, tecnologia e inteligência artificial.

---

## Referências Bibliográficas

* GUEDES, S. *Lógica de programação algorítmica*. Pearson: 2014.
* MANZANO, J. A. N. G.; OLIVEIRA, J. F. *Estudo Dirigido de Algoritmos*. 15. ed. São Paulo: Érica, 2012.
* PUGA, S.; RISSETTI, G. *Lógica de programação e estruturas de dados, com aplicações em Java*. Pearson: 2016.
* RIBEIRO, J. A. *Introdução à programação e aos algoritmos*. 1. ed. Rio de Janeiro: LTC, 2019.
