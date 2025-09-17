# Operadores em Java
## Operadores de atribuição
Os operadores de atribuição são usados para atribuir valores a variáveis. O operador de atribuição mais comum é o sinal de igual (=). Além disso, existem operadores de atribuição compostos, que combinam uma operação aritmética com a atribuição. Aqui estão alguns exemplos:

```java
int a = 5; // Atribuição simples
a += 3;   // Equivalente a a = a + 3
a -= 2;   // Equivalente a a = a - 2
a *= 4;   // Equivalente a a = a * 4
a /= 2;   // Equivalente a a = a / 2
```

É importante notar que os operadores de atribuição compostos também podem ser usados com outros tipos de dados, como strings e booleanos.
Aprimora performance e legibilidade do código.
## Operadores aritméticos
Os operadores aritméticos são usados para realizar operações matemáticas. Os principais operadores aritméticos em Java são:

- Adição (+)
- Subtração (-)
- Multiplicação (*)
- Divisão (/)
- Exponencial (**) -> Como se fosse Math.pow(base, expoente)
- Módulo (%) -> Retorna o resto da divisão
- Incremento (++)
- Decremento (--)

Aqui estão alguns exemplos de uso:

```java
int a = 10;
int b = 5;

int soma = a + b;       // 15
int subtracao = a - b;  // 5
int multiplicacao = a * b; // 50
int divisao = a / b;    // 2
int exponencial = a ** b; // 100000 (10^5) Na verdade em Java usa Math.pow(10, 5)
int modulo = a % b;     // 0
int incremento = ++a;  // 11
int decremento = --b;  // 4
```

## Tabela Verdade
A tabela verdade é uma ferramenta utilizada na lógica para determinar o valor de uma expressão booleana com base nos valores de suas variáveis. Em Java, os operadores lógicos (como AND, OR e NOT) são usados para construir expressões booleanas. Aqui está a tabela verdade para os operadores lógicos mais comuns:

| A     | B     | A AND B | A OR B | NOT A |
|-------|-------|---------|--------|-------|
| true  | true  | true    | true   | false |
| true  | false | false   | true   | false |
| false | true  | false   | true   | true  |
| false | false | false   | false  | true  |

É uma ferramenta útil para entender como diferentes combinações de valores booleanos afetam o resultado de uma expressão lógica.


## Operadores Lógicos

Os operadores lógicos em Java são usados para combinar expressões booleanas, são fundamentais na construção de expressões condicionais e controle de fluxo. Os principais operadores lógicos são:

- AND (&&)
- OR (||)
- NOT (!)

Aqui estão alguns exemplos de uso:

```java
boolean a = true;
boolean b = false;

boolean resultadoAnd = a && b; // false
boolean resultadoOr = a || b;  // true
boolean resultadoNot = !a;     // false
```

## Operador Ternário
O operador ternário é uma forma concisa de expressar uma condição if-else. Ele é representado pelo símbolo `? :`. 
Parecido com JavaScript, Python e outras linguagens.
Aqui está a sintaxe básica:

```java
variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;
```

Aqui está um exemplo de uso:

```java
int a = 10;
int b = 5;

int maior = (a > b) ? a : b; // maior receberá o valor de a