# Funções e Métodos em Java - Guia Completo

## 📋 Sumário

1. [Introdução](#introdução)
2. [Estrutura Básica de Funções](#estrutura-básica-de-funções)
3. [Procedimentos vs Funções](#procedimentos-vs-funções)
4. [Passagem de Parâmetros](#passagem-de-parâmetros)
5. [Funções Recursivas](#funções-recursivas)
6. [Funções Lambda](#funções-lambda)
7. [Modificadores de Acesso](#modificadores-de-acesso)
8. [Exemplos Práticos](#exemplos-práticos)
9. [Boas Práticas](#boas-práticas)
10. [Exercícios](#exercícios)

---

## 🎯 Introdução

As **funções** (também conhecidas como **métodos** em Java) são blocos de código reutilizáveis que realizam tarefas específicas dentro de um programa. Elas são fundamentais para:

- 🔄 **Reutilização de código** - Evita duplicação
- 📦 **Modularização** - Organiza o código em partes menores
- 🧩 **Manutenibilidade** - Facilita correções e melhorias
- 🎯 **Abstração** - Oculta detalhes de implementação
- 🔧 **Testabilidade** - Permite testes isolados

> **Conceito Fundamental**: Funções permitem dividir problemas complexos em subproblemas menores e mais gerenciáveis.

---

## 🏗️ Estrutura Básica de Funções

### Sintaxe Geral

```java
modificadorAcesso tipoRetorno nomeDoMetodo(tipoParametro1 nomeParametro1, tipoParametro2 nomeParametro2) {
    // Corpo do método
    return valorRetornado; // se tipoRetorno não for void
}
```

### Componentes da Estrutura

| Componente | Descrição | Exemplos |
|------------|-----------|----------|
| **Modificador de Acesso** | Define a visibilidade do método | `public`, `private`, `protected` |
| **Tipo de Retorno** | Especifica o tipo de dado retornado | `int`, `String`, `boolean`, `void` |
| **Nome do Método** | Identificador único do método | `calcular`, `imprimir`, `validar` |
| **Parâmetros** | Dados de entrada (opcionais) | `(int x, String nome)` |
| **Corpo** | Lógica do método | Código entre `{ }` |

### Exemplo Básico

```java
public class CalculadoraBasica {
    
    // Função simples que retorna um valor
    public int somar(int a, int b) {
        return a + b;
    }
    
    // Procedimento que não retorna valor
    public void exibirResultado(int resultado) {
        System.out.println("O resultado é: " + resultado);
    }
    
    public static void main(String[] args) {
        CalculadoraBasica calc = new CalculadoraBasica();
        
        int resultado = calc.somar(10, 5);
        calc.exibirResultado(resultado);
    }
}
```

---

## ⚡ Procedimentos vs Funções

### Distinção Fundamental

A diferença entre procedimentos e funções em Java está na **presença ou ausência de valor de retorno**:

### 🔄 Funções (com retorno)

Métodos que **devolvem um valor** ao final da execução.

```java
public class ExemploFuncoes {
    
    // Função que retorna um número inteiro
    public int calcularQuadrado(int numero) {
        return numero * numero;
    }
    
    // Função que retorna uma string
    public String concatenarNomes(String nome, String sobrenome) {
        return nome + " " + sobrenome;
    }
    
    // Função que retorna um booleano
    public boolean ehPar(int numero) {
        return numero % 2 == 0;
    }
    
    // Função que retorna um array
    public int[] criarSequencia(int inicio, int fim) {
        int tamanho = fim - inicio + 1;
        int[] sequencia = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            sequencia[i] = inicio + i;
        }
        
        return sequencia;
    }
}
```

### 🎯 Procedimentos (sem retorno - void)

Métodos que **executam uma tarefa** sem devolver um valor.

```java
public class ExemploProcedimentos {
    
    // Procedimento para imprimir mensagem
    public void imprimirMensagem(String mensagem) {
        System.out.println("Mensagem: " + mensagem);
    }
    
    // Procedimento para imprimir array
    public void imprimirArray(int[] numeros) {
        System.out.print("Array: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    // Procedimento para validar e imprimir idade
    public void validarIdade(int idade) {
        if (idade >= 0 && idade <= 120) {
            System.out.println("Idade válida: " + idade + " anos");
        } else {
            System.out.println("Idade inválida!");
        }
    }
    
    // Procedimento para desenhar retângulo
    public void desenharRetangulo(int largura, int altura, char caractere) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print(caractere + " ");
            }
            System.out.println();
        }
    }
}
```

### 📊 Comparação: Funções vs Procedimentos

| Aspecto | Funções | Procedimentos |
|---------|---------|---------------|
| **Retorno** | Sempre retorna um valor | Não retorna valor (`void`) |
| **Uso** | `int resultado = funcao();` | `procedimento();` |
| **Propósito** | Calcular e retornar | Executar ação |
| **Exemplo** | `calcular()`, `obter()`, `verificar()` | `imprimir()`, `salvar()`, `enviar()` |

---

## 📨 Passagem de Parâmetros

Em Java, existem duas formas principais de passagem de parâmetros:

### 1. 🔢 Passagem por Valor (Tipos Primitivos)

Quando trabalhamos com **tipos primitivos** (`int`, `float`, `char`, `boolean`, etc.), o valor é **copiado** e passado ao método.

```java
public class PassagemPorValor {
    
    public void modificarNumero(int numero) {
        numero = numero + 100;
        System.out.println("Dentro do método: " + numero);
    }
    
    public void modificarCaractere(char letra) {
        letra = 'Z';
        System.out.println("Dentro do método: " + letra);
    }
    
    public static void main(String[] args) {
        PassagemPorValor exemplo = new PassagemPorValor();
        
        // Teste com inteiro
        int meuNumero = 10;
        System.out.println("Antes do método: " + meuNumero); // 10
        exemplo.modificarNumero(meuNumero);                   // 110
        System.out.println("Depois do método: " + meuNumero); // 10 (não mudou!)
        
        // Teste com caractere
        char minhaLetra = 'A';
        System.out.println("Antes do método: " + minhaLetra); // A
        exemplo.modificarCaractere(minhaLetra);               // Z
        System.out.println("Depois do método: " + minhaLetra); // A (não mudou!)
    }
}
```

### 2. 🔗 Passagem por Referência (Objetos)

Quando passamos **objetos**, Java passa uma **referência** ao objeto, permitindo modificações no estado original.

```java
class Pessoa {
    String nome;
    int idade;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    @Override
    public String toString() {
        return "Pessoa{nome='" + nome + "', idade=" + idade + "}";
    }
}

class ContaBancaria {
    private double saldo;
    
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
    public double getSaldo() {
        return saldo;
    }
}

public class PassagemPorReferencia {
    
    public void modificarPessoa(Pessoa pessoa) {
        pessoa.nome = "Nome Modificado";
        pessoa.idade = pessoa.idade + 10;
        System.out.println("Dentro do método: " + pessoa);
    }
    
    public void modificarArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] * 2;
        }
        System.out.println("Array dentro do método: " + Arrays.toString(numeros));
    }
    
    public void operacaoBancaria(ContaBancaria conta, double valor) {
        conta.depositar(valor);
        System.out.println("Saldo dentro do método: R$" + conta.getSaldo());
    }
    
    public static void main(String[] args) {
        PassagemPorReferencia exemplo = new PassagemPorReferencia();
        
        // Teste com objeto Pessoa
        Pessoa pessoa = new Pessoa("João", 25);
        System.out.println("Antes: " + pessoa);              // João, 25
        exemplo.modificarPessoa(pessoa);                      // Nome Modificado, 35
        System.out.println("Depois: " + pessoa);             // Nome Modificado, 35 (mudou!)
        
        // Teste com array
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Array antes: " + Arrays.toString(numeros)); // [1,2,3,4,5]
        exemplo.modificarArray(numeros);                                 // [2,4,6,8,10]
        System.out.println("Array depois: " + Arrays.toString(numeros)); // [2,4,6,8,10] (mudou!)
        
        // Teste com conta bancária
        ContaBancaria conta = new ContaBancaria(1000.0);
        System.out.println("Saldo antes: R$" + conta.getSaldo());     // R$1000.0
        exemplo.operacaoBancaria(conta, 500.0);                       // R$1500.0
        System.out.println("Saldo depois: R$" + conta.getSaldo());    // R$1500.0 (mudou!)
    }
}
```

### 🎯 Exemplo Completo: Demonstração da Passagem de Parâmetros

```java
class ExemploPassagemParametros {
    
    // Método que tenta modificar um valor primitivo
    public void modificarValorPrimitivo(int numero) {
        numero = numero + 10;
        System.out.println("Dentro do método (primitivo): " + numero);
    }
    
    // Método que modifica o estado de um objeto
    public void modificarValorObjeto(Pessoa pessoa) {
        pessoa.nome = "Maria";
        System.out.println("Dentro do método (objeto): " + pessoa.nome);
    }
    
    public static void main(String[] args) {
        ExemploPassagemParametros exemplo = new ExemploPassagemParametros();
        
        // Demonstração com tipo primitivo
        System.out.println("=== PASSAGEM POR VALOR (PRIMITIVO) ===");
        int numero = 5;
        System.out.println("Antes do método: " + numero);
        exemplo.modificarValorPrimitivo(numero);
        System.out.println("Depois do método: " + numero);
        
        System.out.println("\n=== PASSAGEM POR REFERÊNCIA (OBJETO) ===");
        // Demonstração com objeto
        Pessoa pessoa = new Pessoa("João", 30);
        System.out.println("Antes do método: " + pessoa.nome);
        exemplo.modificarValorObjeto(pessoa);
        System.out.println("Depois do método: " + pessoa.nome);
    }
}
```

---

## 🔄 Funções Recursivas

### Conceito de Recursão

A **recursão** é uma técnica onde uma função **chama a si mesma** para resolver problemas que podem ser divididos em subproblemas menores e similares.

### Elementos Essenciais da Recursão

1. **🛑 Caso Base**: Condição que para a recursão
2. **🔄 Caso Recursivo**: Função chama a si mesma com parâmetros modificados
3. **📉 Redução**: Cada chamada deve aproximar-se do caso base

### Exemplo Clássico: Fatorial

```java
public class ExemplosRecursao {
    
    // Cálculo de fatorial
    public int fatorial(int n) {
        // Caso base: 0! = 1 e 1! = 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Caso recursivo: n! = n * (n-1)!
        else {
            return n * fatorial(n - 1);
        }
    }
    
    // Sequência de Fibonacci
    public int fibonacci(int n) {
        // Casos base
        if (n <= 1) {
            return n;
        }
        // Caso recursivo: F(n) = F(n-1) + F(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    // Potenciação
    public int potencia(int base, int expoente) {
        // Caso base
        if (expoente == 0) {
            return 1;
        }
        // Caso recursivo
        return base * potencia(base, expoente - 1);
    }
    
    // Soma dos números de 1 até n
    public int somaAteN(int n) {
        // Caso base
        if (n <= 1) {
            return n;
        }
        // Caso recursivo
        return n + somaAteN(n - 1);
    }
    
    // Inverter uma string
    public String inverterString(String str) {
        // Caso base
        if (str.length() <= 1) {
            return str;
        }
        // Caso recursivo
        return str.charAt(str.length() - 1) + inverterString(str.substring(0, str.length() - 1));
    }
}
```

### 🎯 Exemplo Prático: Torres de Hanói

```java
public class TorresDeHanoi {
    
    public void resolverHanoi(int n, char origem, char destino, char auxiliar) {
        // Caso base: apenas um disco
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
            return;
        }
        
        // Passo 1: Mover n-1 discos de origem para auxiliar
        resolverHanoi(n - 1, origem, auxiliar, destino);
        
        // Passo 2: Mover o maior disco de origem para destino
        System.out.println("Mover disco " + n + " de " + origem + " para " + destino);
        
        // Passo 3: Mover n-1 discos de auxiliar para destino
        resolverHanoi(n - 1, auxiliar, destino, origem);
    }
    
    public static void main(String[] args) {
        TorresDeHanoi hanoi = new TorresDeHanoi();
        int numDiscos = 3;
        
        System.out.println("Solução das Torres de Hanói para " + numDiscos + " discos:");
        hanoi.resolverHanoi(numDiscos, 'A', 'C', 'B');
    }
}
```

### ⚠️ Cuidados com Recursão

```java
public class CuidadosRecursao {
    
    // ❌ ERRO: Recursão infinita (sem caso base adequado)
    public int recursaoInfinita(int n) {
        return n + recursaoInfinita(n - 1); // Nunca para!
    }
    
    // ✅ CORRETO: Com caso base
    public int somaCorreta(int n) {
        if (n <= 0) return 0; // Caso base
        return n + somaCorreta(n - 1);
    }
    
    // 📊 Comparação: Recursivo vs Iterativo (Fibonacci)
    
    // Versão recursiva (menos eficiente para números grandes)
    public int fibonacciRecursivo(int n) {
        if (n <= 1) return n;
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }
    
    // Versão iterativa (mais eficiente)
    public int fibonacciIterativo(int n) {
        if (n <= 1) return n;
        
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
```

---

## 🚀 Funções Lambda

As **funções lambda** foram introduzidas no Java 8 e oferecem uma maneira **concisa** de implementar interfaces funcionais.

### Conceitos Fundamentais

- **Interface Funcional**: Interface com apenas **um método abstrato**
- **Sintaxe Concisa**: Reduz verbosidade do código
- **Programação Funcional**: Facilita paradigmas funcionais em Java

### Sintaxe Básica

```java
// Sintaxe geral
(parâmetros) -> { corpo da função }

// Exemplos de sintaxe
x -> x * 2                          // Um parâmetro, sem parênteses
(x, y) -> x + y                     // Múltiplos parâmetros
() -> System.out.println("Hello")   // Sem parâmetros
x -> {                              // Múltiplas linhas
    int resultado = x * x;
    return resultado;
}
```

### Exemplos Práticos de Lambda

```java
import java.util.*;
import java.util.function.*;

public class ExemplosLambda {
    
    public static void main(String[] args) {
        
        // 1. Interface Funcional Simples
        // Definindo uma interface funcional
        interface Calculadora {
            int calcular(int a, int b);
        }
        
        // Usando lambda para implementar a interface
        Calculadora somar = (a, b) -> a + b;
        Calculadora multiplicar = (a, b) -> a * b;
        Calculadora subtrair = (a, b) -> a - b;
        
        System.out.println("Soma: " + somar.calcular(10, 5));           // 15
        System.out.println("Multiplicação: " + multiplicar.calcular(10, 5)); // 50
        System.out.println("Subtração: " + subtrair.calcular(10, 5));   // 5
        
        // 2. Interfaces Funcionais Predefinidas
        
        // Predicate<T> - testa uma condição
        Predicate<Integer> ehPar = x -> x % 2 == 0;
        Predicate<String> ehVazio = s -> s.isEmpty();
        
        System.out.println("10 é par? " + ehPar.test(10));        // true
        System.out.println("String vazia? " + ehVazio.test(""));  // true
        
        // Function<T, R> - transforma T em R
        Function<String, Integer> tamanho = s -> s.length();
        Function<Integer, String> dobrarString = n -> "O dobro é: " + (n * 2);
        
        System.out.println("Tamanho: " + tamanho.apply("Java"));  // 4
        System.out.println(dobrarString.apply(5));                // "O dobro é: 10"
        
        // Consumer<T> - consome um valor (sem retorno)
        Consumer<String> imprimir = s -> System.out.println("Mensagem: " + s);
        Consumer<Integer> imprimirQuadrado = n -> System.out.println("Quadrado: " + (n * n));
        
        imprimir.accept("Hello Lambda!");        // "Mensagem: Hello Lambda!"
        imprimirQuadrado.accept(4);             // "Quadrado: 16"
        
        // Supplier<T> - fornece um valor (sem parâmetros)
        Supplier<Double> numeroAleatorio = () -> Math.random();
        Supplier<String> saudacao = () -> "Olá, mundo!";
        
        System.out.println("Número aleatório: " + numeroAleatorio.get());
        System.out.println(saudacao.get());                      // "Olá, mundo!"
        
        // 3. Lambdas com Coleções
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Filtrar números pares
        System.out.println("Números pares:");
        numeros.stream()
               .filter(n -> n % 2 == 0)
               .forEach(n -> System.out.print(n + " ")); // 2 4 6 8 10
        
        System.out.println("\n");
        
        // Mapear para quadrados
        System.out.println("Quadrados:");
        numeros.stream()
               .map(n -> n * n)
               .forEach(n -> System.out.print(n + " ")); // 1 4 9 16 25 36 49 64 81 100
        
        System.out.println("\n");
        
        // Somar todos os números
        int soma = numeros.stream()
                         .reduce(0, (a, b) -> a + b);
        System.out.println("Soma total: " + soma);              // 55
        
        // 4. Lambdas Mais Complexas
        List<String> nomes = Arrays.asList("João", "Maria", "Pedro", "Ana", "Carlos");
        
        // Filtrar e transformar
        nomes.stream()
             .filter(nome -> nome.length() > 4)
             .map(nome -> nome.toUpperCase())
             .sorted()
             .forEach(nome -> System.out.println("Nome: " + nome));
        
        // Agrupar por tamanho
        Map<Integer, List<String>> agrupadosPorTamanho = nomes.stream()
            .collect(Collectors.groupingBy(nome -> nome.length()));
        
        agrupadosPorTamanho.forEach((tamanho, lista) -> 
            System.out.println("Tamanho " + tamanho + ": " + lista));
    }
}
```

### 🔧 Comparação: Código Tradicional vs Lambda

```java
import java.util.*;

public class ComparacaoLambda {
    
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "python", "javascript", "c++", "go");
        
        // ===== CÓDIGO TRADICIONAL =====
        
        // Filtrar palavras com mais de 4 caracteres
        List<String> palavrasLongas1 = new ArrayList<>();
        for (String palavra : palavras) {
            if (palavra.length() > 4) {
                palavrasLongas1.add(palavra.toUpperCase());
            }
        }
        
        // Ordenar
        Collections.sort(palavrasLongas1, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        
        // Imprimir
        for (String palavra : palavrasLongas1) {
            System.out.println("Tradicional: " + palavra);
        }
        
        // ===== COM LAMBDAS =====
        
        System.out.println("\n--- Com Lambdas ---");
        palavras.stream()
                .filter(palavra -> palavra.length() > 4)
                .map(palavra -> palavra.toUpperCase())
                .sorted()
                .forEach(palavra -> System.out.println("Lambda: " + palavra));
    }
}
```

---

## 🔐 Modificadores de Acesso

### Visibilidade dos Métodos

| Modificador | Visibilidade | Descrição |
|-------------|--------------|-----------|
| `public` | Toda aplicação | Acessível de qualquer lugar |
| `protected` | Pacote e subclasses | Acessível no mesmo pacote e por herança |
| `default` | Apenas pacote | Acessível apenas no mesmo pacote |
| `private` | Apenas classe | Acessível apenas dentro da própria classe |

### Exemplos de Modificadores

```java
public class ExemploModificadores {
    
    // Método público - acessível de qualquer lugar
    public void metodoPublico() {
        System.out.println("Método público - acesso total");
    }
    
    // Método protegido - acessível no pacote e por herança
    protected void metodoProtegido() {
        System.out.println("Método protegido - pacote + herança");
    }
    
    // Método padrão - acessível apenas no mesmo pacote
    void metodoDefault() {
        System.out.println("Método padrão - apenas no pacote");
    }
    
    // Método privado - acessível apenas na própria classe
    private void metodoPrivado() {
        System.out.println("Método privado - apenas nesta classe");
    }
    
    // Método público que usa métodos privados internamente
    public void executarOperacao() {
        metodoPrivado(); // Pode chamar método privado dentro da própria classe
        calcularInternamente();
    }
    
    // Método auxiliar privado
    private int calcularInternamente() {
        return 42;
    }
}
```

### Métodos Static vs Instance

```java
public class ExemploStaticInstance {
    
    private static int contadorEstatico = 0;
    private int contadorInstancia = 0;
    
    // Método estático - pertence à classe
    public static void metodoEstatico() {
        System.out.println("Método estático - não precisa de instância");
        contadorEstatico++;
        // NÃO pode acessar variáveis de instância diretamente
    }
    
    // Método de instância - pertence ao objeto
    public void metodoInstancia() {
        System.out.println("Método de instância - precisa de objeto");
        contadorInstancia++;
        contadorEstatico++; // PODE acessar variáveis estáticas
    }
    
    // Método estático que retorna o contador
    public static int getContadorEstatico() {
        return contadorEstatico;
    }
    
    // Método de instância que retorna o contador
    public int getContadorInstancia() {
        return contadorInstancia;
    }
    
    public static void main(String[] args) {
        // Chamada de método estático - sem instância
        ExemploStaticInstance.metodoEstatico();
        
        // Chamada de método de instância - precisa de objeto
        ExemploStaticInstance obj1 = new ExemploStaticInstance();
        obj1.metodoInstancia();
        
        ExemploStaticInstance obj2 = new ExemploStaticInstance();
        obj2.metodoInstancia();
        
        System.out.println("Contador estático: " + getContadorEstatico());      // 3
        System.out.println("Contador obj1: " + obj1.getContadorInstancia());    // 1
        System.out.println("Contador obj2: " + obj2.getContadorInstancia());    // 1
    }
}
```

---

## 💡 Exemplos Práticos

### Exemplo 1: Sistema de Calculadora Avançada

```java
public class CalculadoraAvancada {
    
    // Operações básicas
    public double somar(double a, double b) {
        return a + b;
    }
    
    public double subtrair(double a, double b) {
        return a - b;
    }
    
    public double multiplicar(double a, double b) {
        return a * b;
    }
    
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida!");
        }
        return a / b;
    }
    
    // Operações avançadas
    public double potencia(double base, int expoente) {
        if (expoente == 0) return 1;
        if (expoente < 0) return 1.0 / potencia(base, -expoente);
        return base * potencia(base, expoente - 1);
    }
    
    public double raizQuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Não é possível calcular raiz de número negativo!");
        }
        return Math.sqrt(numero);
    }
    
    // Função recursiva para fatorial
    public long fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fatorial não definido para números negativos!");
        }
        if (n <= 1) return 1;
        return n * fatorial(n - 1);
    }
    
    // Função para calcular média de array
    public double calcularMedia(double[] numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("Array não pode estar vazio!");
        }
        
        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        return soma / numeros.length;
    }
    
    // Método para encontrar o maior número
    public double encontrarMaior(double... numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("Deve fornecer pelo menos um número!");
        }
        
        double maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }
    
    // Método main para demonstração
    public static void main(String[] args) {
        CalculadoraAvancada calc = new CalculadoraAvancada();
        
        // Testando operações básicas
        System.out.println("=== OPERAÇÕES BÁSICAS ===");
        System.out.println("10 + 5 = " + calc.somar(10, 5));
        System.out.println("10 - 5 = " + calc.subtrair(10, 5));
        System.out.println("10 × 5 = " + calc.multiplicar(10, 5));
        System.out.println("10 ÷ 5 = " + calc.dividir(10, 5));
        
        // Testando operações avançadas
        System.out.println("\n=== OPERAÇÕES AVANÇADAS ===");
        System.out.println("2^8 = " + calc.potencia(2, 8));
        System.out.println("√16 = " + calc.raizQuadrada(16));
        System.out.println("5! = " + calc.fatorial(5));
        
        // Testando com arrays
        double[] notas = {8.5, 7.0, 9.2, 6.8, 8.9};
        System.out.println("\n=== ANÁLISE DE DADOS ===");
        System.out.printf("Média das notas: %.2f%n", calc.calcularMedia(notas));
        System.out.println("Maior nota: " + calc.encontrarMaior(notas));
        System.out.println("Maior entre 15, 23, 8, 45: " + calc.encontrarMaior(15, 23, 8, 45));
    }
}
```

### Exemplo 2: Sistema de Processamento de Texto

```java
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ProcessadorTexto {
    
    // Função para contar palavras
    public int contarPalavras(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return 0;
        }
        return texto.trim().split("\\s+").length;
    }
    
    // Função para contar caracteres (sem espaços)
    public int contarCaracteres(String texto, boolean incluirEspacos) {
        if (texto == null) return 0;
        
        if (incluirEspacos) {
            return texto.length();
        } else {
            return texto.replace(" ", "").length();
        }
    }
    
    // Função recursiva para inverter string
    public String inverterTexto(String texto) {
        if (texto == null || texto.length() <= 1) {
            return texto;
        }
        return texto.charAt(texto.length() - 1) + inverterTexto(texto.substring(0, texto.length() - 1));
    }
    
    // Função para capitalizar palavras
    public String capitalizarPalavras(String texto) {
        if (texto == null || texto.isEmpty()) {
            return texto;
        }
        
        String[] palavras = texto.split(" ");
        StringBuilder resultado = new StringBuilder();
        
        for (int i = 0; i < palavras.length; i++) {
            if (!palavras[i].isEmpty()) {
                String palavra = palavras[i].toLowerCase();
                palavra = Character.toUpperCase(palavra.charAt(0)) + palavra.substring(1);
                resultado.append(palavra);
            }
            if (i < palavras.length - 1) {
                resultado.append(" ");
            }
        }
        
        return resultado.toString();
    }
    
    // Função para encontrar palíndromos usando lambda
    public boolean ehPalindromo(String texto) {
        String limpo = texto.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        return limpo.equals(new StringBuilder(limpo).reverse().toString());
    }
    
    // Função para filtrar palavras usando lambdas
    public List<String> filtrarPalavras(List<String> palavras, Predicate<String> criterio) {
        return palavras.stream()
                      .filter(criterio)
                      .collect(Collectors.toList());
    }
    
    // Procedimento para imprimir estatísticas
    public void imprimirEstatisticas(String texto) {
        System.out.println("=== ESTATÍSTICAS DO TEXTO ===");
        System.out.println("Texto original: \"" + texto + "\"");
        System.out.println("Número de palavras: " + contarPalavras(texto));
        System.out.println("Caracteres (com espaços): " + contarCaracteres(texto, true));
        System.out.println("Caracteres (sem espaços): " + contarCaracteres(texto, false));
        System.out.println("Texto invertido: \"" + inverterTexto(texto) + "\"");
        System.out.println("Texto capitalizado: \"" + capitalizarPalavras(texto) + "\"");
        System.out.println("É palíndromo? " + ehPalindromo(texto));
        System.out.println();
    }
    
    public static void main(String[] args) {
        ProcessadorTexto processador = new ProcessadorTexto();
        
        // Testando com diferentes textos
        String[] textos = {
            "java é uma linguagem poderosa",
            "ovo",
            "A man a plan a canal Panama",
            "programação funcional"
        };
        
        for (String texto : textos) {
            processador.imprimirEstatisticas(texto);
        }
        
        // Demonstrando uso de lambdas para filtrar palavras
        List<String> vocabulario = Arrays.asList(
            "java", "python", "javascript", "c++", "go", "rust", "kotlin", "scala"
        );
        
        System.out.println("=== FILTROS COM LAMBDA ===");
        
        // Palavras com mais de 4 caracteres
        List<String> palavrasLongas = processador.filtrarPalavras(
            vocabulario, 
            palavra -> palavra.length() > 4
        );
        System.out.println("Palavras longas: " + palavrasLongas);
        
        // Palavras que começam com 'j'
        List<String> palavrasComJ = processador.filtrarPalavras(
            vocabulario,
            palavra -> palavra.toLowerCase().startsWith("j")
        );
        System.out.println("Palavras com 'j': " + palavrasComJ);
        
        // Palavras que contêm 'a'
        List<String> palavrasComA = processador.filtrarPalavras(
            vocabulario,
            palavra -> palavra.contains("a")
        );
        System.out.println("Palavras com 'a': " + palavrasComA);
    }
}
```

---

## ✅ Boas Práticas

### 1. **Nomenclatura de Métodos**

```java
// ✅ Boas práticas
public class BomExemplo {
    
    // Use verbos para métodos que fazem ação
    public void salvarArquivo(String conteudo) { }
    public void enviarEmail(String destinatario) { }
    
    // Use is/has/can para métodos que retornam boolean
    public boolean isValido() { return true; }
    public boolean hasPermissao() { return true; }
    public boolean canExecutar() { return true; }
    
    // Use get/set para acessores
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    // Use calculate/compute para cálculos
    public double calcularArea(double raio) {
        return Math.PI * raio * raio;
    }
    
    // Use find/search para buscas
    public Usuario encontrarPorId(int id) { return null; }
    public List<Produto> buscarPorCategoria(String categoria) { return null; }
}
```

### 2. **Tamanho e Responsabilidade**

```java
public class ResponsabilidadeUnica {
    
    // ✅ Método com responsabilidade única e tamanho adequado
    public boolean isEmailValido(String email) {
        return email != null && 
               email.contains("@") && 
               email.contains(".") &&
               email.length() > 5;
    }
    
    // ✅ Quebrar método grande em métodos menores
    public void processarPedido(Pedido pedido) {
        validarPedido(pedido);
        calcularTotal(pedido);
        aplicarDesconto(pedido);
        salvarPedido(pedido);
        enviarConfirmacao(pedido);
    }
    
    private void validarPedido(Pedido pedido) { /* validação */ }
    private void calcularTotal(Pedido pedido) { /* cálculo */ }
    private void aplicarDesconto(Pedido pedido) { /* desconto */ }
    private void salvarPedido(Pedido pedido) { /* persistência */ }
    private void enviarConfirmacao(Pedido pedido) { /* notificação */ }
}
```

### 3. **Tratamento de Erros**

```java
public class TratamentoErros {
    
    // ✅ Validar parâmetros de entrada
    public double calcularPorcentagem(double valor, double total) {
        if (total == 0) {
            throw new IllegalArgumentException("Total não pode ser zero");
        }
        if (valor < 0 || total < 0) {
            throw new IllegalArgumentException("Valores devem ser positivos");
        }
        return (valor / total) * 100;
    }
    
    // ✅ Documentar comportamento com JavaDoc
    /**
     * Calcula o fatorial de um número inteiro.
     * 
     * @param n o número para calcular o fatorial (deve ser >= 0)
     * @return o fatorial de n
     * @throws IllegalArgumentException se n for negativo
     */
    public long fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fatorial não definido para números negativos");
        }
        if (n <= 1) return 1;
        return n * fatorial(n - 1);
    }
}
```

### 4. **Uso Eficiente de Lambdas**

```java
import java.util.*;
import java.util.stream.Collectors;

public class BoasPraticasLambda {
    
    // ✅ Use method reference quando possível
    public void exemploMethodReference() {
        List<String> nomes = Arrays.asList("João", "Maria", "Pedro");
        
        // Ao invés de: nomes.forEach(nome -> System.out.println(nome));
        nomes.forEach(System.out::println);
        
        // Ao invés de: nomes.stream().map(nome -> nome.toUpperCase())
        nomes.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
    
    // ✅ Extraia lambdas complexas para métodos
    public List<Produto> filtrarProdutos(List<Produto> produtos) {
        return produtos.stream()
                      .filter(this::isProdutoValido)  // Method reference
                      .filter(produto -> produto.getPreco() > 100)  // Lambda simples
                      .collect(Collectors.toList());
    }
    
    private boolean isProdutoValido(Produto produto) {
        return produto != null && 
               produto.getNome() != null && 
               !produto.getNome().isEmpty() &&
               produto.getPreco() >= 0;
    }
    
    // ✅ Use Predicate para condições reutilizáveis
    private final Predicate<Integer> ehPar = n -> n % 2 == 0;
    private final Predicate<Integer> ehPositivo = n -> n > 0;
    
    public List<Integer> filtrarNumeros(List<Integer> numeros) {
        return numeros.stream()
                     .filter(ehPar.and(ehPositivo))  // Combinando predicates
                     .collect(Collectors.toList());
    }
}
```

---

## 📝 Exercícios

### Exercício 1: Sistema de Biblioteca

```java
/**
 * Implemente um sistema de biblioteca com as seguintes funcionalidades:
 */
public class SistemaBiblioteca {
    
    // TODO: Implementar método para calcular multa
    public double calcularMulta(int diasAtraso) {
        // Regra: R$ 2,00 por dia de atraso
        // Máximo de R$ 50,00
    }
    
    // TODO: Implementar método recursivo para buscar livro por código
    public Livro buscarLivroRecursivo(List<Livro> livros, String codigo, int indice) {
        // Usar recursão para buscar na lista
    }
    
    // TODO: Implementar método com lambda para filtrar livros
    public List<Livro> filtrarLivros(List<Livro> livros, Predicate<Livro> criterio) {
        // Usar streams e lambdas
    }
    
    // TODO: Implementar procedimento para imprimir relatório
    public void imprimirRelatorio(List<Emprestimo> emprestimos) {
        // Imprimir estatísticas dos empréstimos
    }
}
```

### Exercício 2: Calculadora de Expressões

```java
/**
 * Implemente uma calculadora que avalia expressões matemáticas usando recursão
 */
public class CalculadoraExpressoes {
    
    // TODO: Implementar método recursivo para avaliar expressão
    public double avaliarExpressao(String expressao) {
        // Avaliar expressões como "2 + 3 * 4 - 1"
    }
    
    // TODO: Implementar método para validar parênteses
    public boolean parentesesBalanceados(String expressao) {
        // Verificar se parênteses estão balanceados usando recursão
    }
    
    // TODO: Implementar função lambda para operações
    public double aplicarOperacao(double a, double b, BinaryOperator<Double> operacao) {
        // Usar interface funcional para operações
    }
}
```

### Exercício 3: Processador de Dados

```java
/**
 * Sistema para processar grandes volumes de dados usando programação funcional
 */
public class ProcessadorDados {
    
    // TODO: Implementar pipeline de processamento com lambdas
    public List<ResultadoProcessamento> processarDados(List<DadoBruto> dados) {
        // 1. Filtrar dados válidos
        // 2. Transformar dados
        // 3. Agrupar por categoria
        // 4. Calcular estatísticas
        // Usar apenas streams e lambdas
    }
    
    // TODO: Implementar método recursivo para árvore de dados
    public void processarArvore(NoArvore no, Function<String, String> processador) {
        // Processar todos os nós da árvore recursivamente
    }
}
```

---

## 🎯 Resumo dos Conceitos

| Conceito | Características | Quando Usar |
|----------|----------------|-------------|
| **Funções** | Retornam valor | Cálculos, transformações |
| **Procedimentos** | `void`, executam ação | Impressão, salvamento |
| **Passagem por Valor** | Cópia para primitivos | Tipos básicos |
| **Passagem por Referência** | Referência para objetos | Arrays, objetos |
| **Recursão** | Função chama a si mesma | Problemas divisíveis |
| **Lambda** | Sintaxe concisa | Programação funcional |
| **Método Static** | Pertence à classe | Utilitários, funções puras |
| **Método Instance** | Pertence ao objeto | Operações no estado |

---

## 📚 Recursos Adicionais

### **Conteúdo Complementar**
- 🎥 **Vídeo**: "Curso de Java - Recursividade - Aula 20" - Canal Rodrigo Freitas (YouTube)

### **Bibliografia**
- ASCENCIA, A. F. G.; CAMPOS, E. A. V. de. **Fundamentos da programação: algoritmos, Pascal, C/C++ e Java**. 2. ed. Pearson, 2007.
- DEITEL, H. M.; DEITEL, P. J.; CHOFFNES, D. R. **Sistemas operacionais**. 3. ed. Pearson, 2005.
- FORBELLONE, A. L. V.; EBERSPACHER, H. F. **Lógica de programação: a construção de algoritmos e estruturas de dados**. 3. ed. Pearson, 2005.
- PUGA, S.; RISSETTI, G. **Lógica de programação e estruturas de dados, com aplicações em Java**. Pearson, 2016.

### **Próximos Passos**
1. 🔄 **Pratique** implementando os exercícios propostos
2. 📚 **Estude** interfaces funcionais avançadas do Java 8+
3. 🚀 **Explore** programação funcional com Streams API
4. 💡 **Desenvolva** projetos combinando todos os conceitos

---

*Este guia fornece uma base sólida para dominar funções e métodos em Java. A combinação de conceitos tradicionais com programação funcional moderna prepara você para desenvolver código mais limpo, eficiente e manutenível.*