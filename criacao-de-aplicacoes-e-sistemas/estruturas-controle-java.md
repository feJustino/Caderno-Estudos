# Estruturas de Controle em Java - Guia Completo

## 📋 Sumário

1. [Introdução](#introdução)
2. [Estruturas Condicionais](#estruturas-condicionais)
3. [Estruturas de Seleção](#estruturas-de-seleção)
4. [Estruturas de Repetição](#estruturas-de-repetição)
5. [Controle de Fluxo em Loops](#controle-de-fluxo-em-loops)
6. [Manipulação de Vetores](#manipulação-de-vetores)
7. [Manipulação de Matrizes](#manipulação-de-matrizes)
8. [Exemplos Práticos](#exemplos-práticos)
9. [Exercícios](#exercícios)
10. [Boas Práticas](#boas-práticas)

---

## 🎯 Introdução

As **instruções em Java** são comandos ou blocos de código que controlam o fluxo de execução de um programa, permitindo que ele tome decisões, repita ações e manipule dados de forma estruturada e eficiente.

Este módulo explora as principais estruturas de controle de fluxo em Java, fundamentais para o desenvolvimento de programas eficientes e dinâmicos:

- 🔀 **Estruturas condicionais** - Tomada de decisões
- 🔄 **Estruturas de seleção** - Múltiplas opções
- 🔁 **Laços de repetição** - Automação de tarefas
- 🎯 **Manipulação de vetores e matrizes** - Estruturas de dados

> **Conceito Central**: As estruturas de controle permitem que programas respondam dinamicamente a diferentes situações e processem grandes volumes de dados de forma eficiente.

---

## 🔀 Estruturas Condicionais

As estruturas condicionais permitem a execução de blocos de código diferentes com base em determinadas condições, essenciais para controlar o fluxo do programa.

### 1. Estrutura IF

Avalia uma condição e executa o bloco de código caso a condição seja **verdadeira**.

```java
int idade = 18;
if (idade >= 18) {
    System.out.println("Você é maior de idade.");
}
```

**Sintaxe:**
```java
if (condição) {
    // código a ser executado se a condição for verdadeira
}
```

### 2. Estrutura IF-ELSE

Executa um bloco de código se a condição for verdadeira, caso contrário, executa outro bloco.

```java
int idade = 16;
if (idade >= 18) {
    System.out.println("Você é maior de idade.");
} else {
    System.out.println("Você é menor de idade.");
}
```

**Sintaxe:**
```java
if (condição) {
    // código se verdadeiro
} else {
    // código se falso
}
```

### 3. Estrutura IF-ELSE IF-ELSE

Permite testar múltiplas condições em sequência, com um bloco executado para cada condição atendida.

```java
int nota = 85;
if (nota >= 90) {
    System.out.println("Excelente!");
} else if (nota >= 70) {
    System.out.println("Bom trabalho!");
} else if (nota >= 60) {
    System.out.println("Aprovado!");
} else {
    System.out.println("Precisa melhorar.");
}
```

**Sintaxe:**
```java
if (condição1) {
    // código para condição1
} else if (condição2) {
    // código para condição2
} else if (condição3) {
    // código para condição3
} else {
    // código padrão
}
```

### 📊 Tabela de Comparação - Estruturas Condicionais

| Estrutura | Quando Usar | Vantagens | Exemplo de Uso |
|-----------|-------------|-----------|----------------|
| `if` | Condição simples | Código limpo | Verificar se usuário é maior de idade |
| `if-else` | Duas alternativas | Clara divisão lógica | Verificar par ou ímpar |
| `if-else if-else` | Múltiplas condições | Flexibilidade máxima | Sistema de notas/classificações |

---

## 🔄 Estruturas de Seleção

### Switch Statement

A estrutura `switch` permite selecionar um bloco de código com base no valor de uma variável, oferecendo uma sintaxe mais limpa que múltiplos `if-else` para valores específicos.

**Vantagens do Switch:**
- ✅ Código mais limpo e organizado
- ✅ Melhor performance para múltiplas condições
- ✅ Fácil manutenção e leitura
- ✅ Menos propenso a erros de lógica

```java
public class ExemploSwitch {
    public static void main(String[] args) {
        int diaDaSemana = 3;
        String nomeDia;

        switch (diaDaSemana) {
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda-feira";
                break;
            case 3:
                nomeDia = "Terça-feira";
                break;
            case 4:
                nomeDia = "Quarta-feira";
                break;
            case 5:
                nomeDia = "Quinta-feira";
                break;
            case 6:
                nomeDia = "Sexta-feira";
                break;
            case 7:
                nomeDia = "Sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }
        
        System.out.println("Hoje é: " + nomeDia);
    }
}
```

### Switch Melhorado (Java 12+)

```java
// Versão moderna do switch (Java 12+)
String resultado = switch (diaDaSemana) {
    case 1 -> "Domingo";
    case 2 -> "Segunda-feira";
    case 3 -> "Terça-feira";
    case 4 -> "Quarta-feira";
    case 5 -> "Quinta-feira";
    case 6 -> "Sexta-feira";
    case 7 -> "Sábado";
    default -> "Dia inválido";
};
```

**Características importantes:**
- 🔹 **`break`**: Evita o "fall-through" (execução de casos subsequentes)
- 🔹 **`default`**: Caso padrão quando nenhum `case` corresponde
- 🔹 **Tipos suportados**: `int`, `char`, `String`, `enum`

---

## 🔁 Estruturas de Repetição

As estruturas de repetição executam blocos de código repetidamente enquanto uma condição for verdadeira.

### 1. Loop FOR

Executa um bloco de código um número **específico** de vezes. Ideal quando o número de iterações é conhecido.

```java
public class ExemploFor {
    public static void main(String[] args) {
        // Imprime números de 1 a 5
        System.out.println("Exemplo FOR:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteração: " + i);
        }
    }
}
```

**Estrutura do FOR:**
```java
for (inicialização; condição; incremento/decremento) {
    // código a ser repetido
}
```

**Componentes:**
- 🔸 **Inicialização**: Executada uma vez no início
- 🔸 **Condição**: Verificada antes de cada iteração
- 🔸 **Incremento**: Executado após cada iteração

### 2. Loop WHILE

Executa o bloco enquanto uma condição for verdadeira. Mais flexível em relação ao número de repetições.

```java
public class ExemploWhile {
    public static void main(String[] args) {
        System.out.println("Exemplo WHILE:");
        int contador = 1;
        
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++; // Importante: atualizar a variável de controle
        }
    }
}
```

**Características:**
- 🔸 Condição verificada **antes** da execução
- 🔸 Pode não executar nenhuma vez se condição for falsa
- 🔸 Ideal para situações onde não sabemos quantas iterações serão necessárias

### 3. Loop DO-WHILE

Similar ao `while`, mas **garante** que o bloco seja executado pelo menos uma vez.

```java
public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Exemplo DO-WHILE:");
        int numero = 1;
        
        do {
            System.out.println("Número: " + numero);
            numero++;
        } while (numero <= 5);
    }
}
```

**Características:**
- 🔸 Condição verificada **após** a execução
- 🔸 **Sempre executa pelo menos uma vez**
- 🔸 Útil para menus e validações de entrada

### 📊 Comparação dos Loops

| Loop | Quando Usar | Verificação da Condição | Execução Mínima |
|------|-------------|------------------------|-----------------|
| `for` | Número conhecido de iterações | Antes | 0 vezes |
| `while` | Número desconhecido, pode não executar | Antes | 0 vezes |
| `do-while` | Deve executar pelo menos uma vez | Depois | 1 vez |

---

## 🎯 Controle de Fluxo em Loops

### 1. Instrução BREAK

Encerra **imediatamente** o loop, independentemente da condição.

```java
public class ExemploBreak {
    public static void main(String[] args) {
        System.out.println("Exemplo BREAK:");
        
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Interrompendo no número " + i);
                break; // Sai do loop quando i = 5
            }
            System.out.println("Iteração: " + i);
        }
        
        System.out.println("Loop finalizado.");
    }
}
```

**Saída:**
```
Iteração: 1
Iteração: 2
Iteração: 3
Iteração: 4
Interrompendo no número 5
Loop finalizado.
```

### 2. Instrução CONTINUE

**Pula** a iteração atual e continua com a próxima, ignorando o código restante.

```java
public class ExemploContinue {
    public static void main(String[] args) {
        System.out.println("Exemplo CONTINUE (apenas números ímpares):");
        
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Pula números pares
            }
            System.out.println("Número ímpar: " + i);
        }
    }
}
```

**Saída:**
```
Número ímpar: 1
Número ímpar: 3
Número ímpar: 5
Número ímpar: 7
Número ímpar: 9
```

### 🔄 Loops Aninhados com Break e Continue

```java
public class LoopsAninhados {
    public static void main(String[] args) {
        System.out.println("Loops aninhados com controle de fluxo:");
        
        outerLoop: // Label para o loop externo
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nLoop externo - i = " + i);
            
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    continue; // Pula quando j = 3
                }
                if (i == 2 && j == 4) {
                    break outerLoop; // Sai do loop externo
                }
                System.out.print(j + " ");
            }
        }
    }
}
```

---

## 📋 Manipulação de Vetores

Vetores (arrays) são estruturas que armazenam **coleções de elementos do mesmo tipo**. A manipulação é feita através de loops que percorrem todos os elementos.

### Declaração e Inicialização

```java
// Diferentes formas de declarar e inicializar vetores
int[] numeros1 = {1, 2, 3, 4, 5}; // Inicialização direta
int[] numeros2 = new int[5]; // Vetor de 5 elementos (valores padrão: 0)
int[] numeros3 = new int[]{10, 20, 30, 40, 50}; // Inicialização com new

// Strings
String[] nomes = {"João", "Maria", "Pedro", "Ana"};
```

### Percorrendo Vetores - Loop FOR Tradicional

```java
public class ManipulacaoVetores {
    public static void main(String[] args) {
        int[] numeros = {10, 25, 30, 45, 50};
        
        System.out.println("Percorrendo com FOR tradicional:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }
        
        // Modificando elementos
        System.out.println("\nModificando elementos:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] * 2; // Duplica cada valor
            System.out.println("Nova posição " + i + ": " + numeros[i]);
        }
    }
}
```

### Percorrendo Vetores - Enhanced FOR (For-Each)

```java
public class ForEachExemplo {
    public static void main(String[] args) {
        String[] frutas = {"Maçã", "Banana", "Laranja", "Uva", "Manga"};
        
        System.out.println("Percorrendo com FOR-EACH:");
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }
        
        // Calculando soma com for-each
        int[] valores = {5, 10, 15, 20, 25};
        int soma = 0;
        
        for (int valor : valores) {
            soma += valor;
        }
        
        System.out.println("Soma total: " + soma);
        System.out.println("Média: " + (soma / valores.length));
    }
}
```

### Operações Comuns com Vetores

```java
public class OperacoesVetores {
    public static void main(String[] args) {
        int[] numeros = {3, 7, 1, 9, 4, 6, 2, 8, 5};
        
        // Encontrar maior e menor valor
        int maior = numeros[0];
        int menor = numeros[0];
        
        for (int num : numeros) {
            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }
        
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        
        // Buscar elemento
        int procurado = 9;
        boolean encontrado = false;
        int posicao = -1;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == procurado) {
                encontrado = true;
                posicao = i;
                break;
            }
        }
        
        if (encontrado) {
            System.out.println("Número " + procurado + " encontrado na posição " + posicao);
        } else {
            System.out.println("Número " + procurado + " não encontrado");
        }
    }
}
```

---

## 🎲 Manipulação de Matrizes

Matrizes são **arrays multidimensionais** que organizam dados em linhas e colunas, permitindo estruturas mais complexas.

### Declaração e Inicialização

```java
public class ExemploMatrizes {
    public static void main(String[] args) {
        // Diferentes formas de declarar matrizes
        
        // Inicialização direta
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Declaração com dimensões
        int[][] matriz2 = new int[3][4]; // 3 linhas, 4 colunas
        
        // Preenchendo a matriz
        int valor = 1;
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = valor++;
            }
        }
        
        // Exibindo a matriz
        System.out.println("Matriz 3x4:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println(); // Nova linha
        }
    }
}
```

### Operações com Matrizes

```java
public class OperacoesMatrizes {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        
        // Acessar elemento específico
        System.out.println("Elemento [1][2]: " + matriz[1][2]); // Resultado: 7
        
        // Somar todos os elementos
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        System.out.println("Soma total: " + soma);
        
        // Encontrar maior elemento de cada linha
        for (int i = 0; i < matriz.length; i++) {
            int maiorLinha = matriz[i][0];
            for (int j = 1; j < matriz[i].length; j++) {
                if (matriz[i][j] > maiorLinha) {
                    maiorLinha = matriz[i][j];
                }
            }
            System.out.println("Maior elemento da linha " + i + ": " + maiorLinha);
        }
        
        // Transpor matriz (trocar linhas por colunas)
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int[][] transposta = new int[colunas][linhas];
        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
        
        System.out.println("\nMatriz transposta:");
        for (int i = 0; i < transposta.length; i++) {
            for (int j = 0; j < transposta[i].length; j++) {
                System.out.print(transposta[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
```

---

## 💡 Exemplos Práticos

### Exemplo 1: Sistema de Classificação de Notas

```java
import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos alunos? ");
        int numeroAlunos = scanner.nextInt();
        
        String[] nomes = new String[numeroAlunos];
        double[] notas = new double[numeroAlunos];
        
        // Entrada de dados
        for (int i = 0; i < numeroAlunos; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.next();
            
            System.out.print("Nota do aluno " + nomes[i] + ": ");
            notas[i] = scanner.nextDouble();
        }
        
        // Processamento e classificação
        System.out.println("\n=== RELATÓRIO DE NOTAS ===");
        double somaNotas = 0;
        
        for (int i = 0; i < numeroAlunos; i++) {
            String classificacao;
            
            if (notas[i] >= 9.0) {
                classificacao = "Excelente";
            } else if (notas[i] >= 7.0) {
                classificacao = "Bom";
            } else if (notas[i] >= 6.0) {
                classificacao = "Regular";
            } else {
                classificacao = "Insuficiente";
            }
            
            System.out.printf("%-15s | Nota: %.1f | %s%n", 
                            nomes[i], notas[i], classificacao);
            somaNotas += notas[i];
        }
        
        double media = somaNotas / numeroAlunos;
        System.out.printf("\nMédia da turma: %.2f%n", media);
        
        scanner.close();
    }
}
```

### Exemplo 2: Calculadora com Menu

```java
import java.util.Scanner;

public class CalculadoraMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            // Exibir menu
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            
            if (opcao == 5) {
                continuar = false;
                System.out.println("Calculadora encerrada!");
                continue;
            }
            
            if (opcao < 1 || opcao > 5) {
                System.out.println("Opção inválida!");
                continue;
            }
            
            // Entrada de números
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();
            
            double resultado = 0;
            String operacao = "";
            
            // Processamento baseado na opção
            switch (opcao) {
                case 1:
                    resultado = num1 + num2;
                    operacao = "soma";
                    break;
                case 2:
                    resultado = num1 - num2;
                    operacao = "subtração";
                    break;
                case 3:
                    resultado = num1 * num2;
                    operacao = "multiplicação";
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        operacao = "divisão";
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                        continue;
                    }
                    break;
            }
            
            System.out.printf("Resultado da %s: %.2f%n", operacao, resultado);
        }
        
        scanner.close();
    }
}
```

### Exemplo 3: Jogo da Adivinhação

```java
import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 e 100
        int tentativas = 0;
        int maxTentativas = 7;
        boolean acertou = false;
        
        System.out.println("=== JOGO DA ADIVINHAÇÃO ===");
        System.out.println("Tente adivinhar o número entre 1 e 100!");
        System.out.println("Você tem " + maxTentativas + " tentativas.");
        
        while (tentativas < maxTentativas && !acertou) {
            System.out.print("\nTentativa " + (tentativas + 1) + ": ");
            int palpite = scanner.nextInt();
            tentativas++;
            
            if (palpite == numeroSecreto) {
                acertou = true;
                System.out.println("🎉 Parabéns! Você acertou em " + tentativas + " tentativas!");
            } else if (palpite < numeroSecreto) {
                System.out.println("⬆️ Muito baixo! Tente um número maior.");
            } else {
                System.out.println("⬇️ Muito alto! Tente um número menor.");
            }
            
            if (!acertou && tentativas < maxTentativas) {
                System.out.println("Tentativas restantes: " + (maxTentativas - tentativas));
            }
        }
        
        if (!acertou) {
            System.out.println("😢 Suas tentativas acabaram! O número era: " + numeroSecreto);
        }
        
        scanner.close();
    }
}
```

---

## 📝 Exercícios

### Exercício 1: Análise de Array

**Problema**: Criar um programa que analise um array de números inteiros e forneça estatísticas.

```java
public class AnaliseArray {
    public static void main(String[] args) {
        int[] numeros = {12, 7, 23, 8, 15, 31, 4, 19, 26, 11};
        
        // TODO: Implementar as seguintes funcionalidades:
        // 1. Encontrar o maior e menor número
        // 2. Calcular a média
        // 3. Contar quantos números são pares e ímpares
        // 4. Encontrar a posição do maior número
        // 5. Verificar se existe algum número duplicado
    }
}
```

### Exercício 2: Matriz de Multiplicação

**Problema**: Criar uma matriz 10x10 com a tabuada de multiplicação.

```java
public class MatrizMultiplicacao {
    public static void main(String[] args) {
        // TODO: Criar uma matriz 10x10 onde cada posição [i][j] 
        // contenha o resultado de (i+1) * (j+1)
        // Exibir a matriz formatada
    }
}
```

### Exercício 3: Sistema de Votação

**Problema**: Simular um sistema de votação com múltiplos candidatos.

```java
import java.util.Scanner;

public class SistemaVotacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] candidatos = {"Candidato A", "Candidato B", "Candidato C"};
        int[] votos = new int[candidatos.length];
        
        // TODO: Implementar:
        // 1. Menu de votação
        // 2. Contabilizar votos
        // 3. Exibir resultado final
        // 4. Determinar o vencedor
        // 5. Calcular percentuais
    }
}
```

---

## ✅ Boas Práticas

### 1. **Nomenclatura Clara**

```java
// ❌ Evitar
for (int i = 0; i < a.length; i++) {
    if (a[i] > b) {
        c++;
    }
}

// ✅ Recomendado
for (int indice = 0; indice < idades.length; indice++) {
    if (idades[indice] > idadeMinima) {
        contadorMaiores++;
    }
}
```

### 2. **Validação de Entrada**

```java
Scanner scanner = new Scanner(System.in);

// ✅ Sempre validar entrada do usuário
int idade;
do {
    System.out.print("Digite sua idade (0-120): ");
    idade = scanner.nextInt();
    
    if (idade < 0 || idade > 120) {
        System.out.println("Idade inválida! Tente novamente.");
    }
} while (idade < 0 || idade > 120);
```

### 3. **Evitar Loops Infinitos**

```java
// ✅ Sempre garantir que a condição do loop possa se tornar falsa
int contador = 0;
while (contador < 10) {
    System.out.println(contador);
    contador++; // Importante: incrementar o contador!
}
```

### 4. **Usar Enhanced For Quando Possível**

```java
int[] numeros = {1, 2, 3, 4, 5};

// ✅ Mais limpo e menos propenso a erros
for (int numero : numeros) {
    System.out.println(numero);
}

// Ao invés de:
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

### 5. **Comentários Significativos**

```java
// ✅ Comentários que explicam o "porquê", não o "como"
for (int i = 0; i < vendas.length; i++) {
    // Aplica desconto progressivo: quanto maior o valor, maior o desconto
    if (vendas[i] > 1000) {
        vendas[i] *= 0.9; // 10% de desconto
    } else if (vendas[i] > 500) {
        vendas[i] *= 0.95; // 5% de desconto
    }
}
```

### 6. **Tratamento de Casos Especiais**

```java
public static double calcularMedia(int[] numeros) {
    // ✅ Verificar casos especiais
    if (numeros == null || numeros.length == 0) {
        throw new IllegalArgumentException("Array não pode ser nulo ou vazio");
    }
    
    int soma = 0;
    for (int numero : numeros) {
        soma += numero;
    }
    
    return (double) soma / numeros.length;
}
```

---

## 🎯 Resumo dos Conceitos

| Conceito | Descrição | Quando Usar |
|----------|-----------|-------------|
| **if-else** | Decisões binárias | Duas alternativas claras |
| **if-else if** | Múltiplas condições | Várias possibilidades mutuamente exclusivas |
| **switch** | Seleção por valor | Múltiplos valores específicos de uma variável |
| **for** | Loop com contador | Número conhecido de iterações |
| **while** | Loop condicional | Condição pode ser falsa desde o início |
| **do-while** | Loop com execução garantida | Deve executar pelo menos uma vez |
| **break** | Sair de loop | Interromper loop prematuramente |
| **continue** | Pular iteração | Ignorar resto da iteração atual |
| **Arrays** | Coleção indexada | Armazenar múltiplos valores do mesmo tipo |
| **Matrizes** | Arrays multidimensionais | Dados em formato tabular |

---

## 📚 Referências e Recursos Adicionais

### **Conteúdo Complementar**
- 🎥 **Vídeo**: "Lógica de programação 09 - Estruturas condicionais" - Canal Cataline (YouTube)

### **Bibliografia**
- ASCENCIA, A. F. G.; CAMPOS, E. A. V. de. **Fundamentos da programação: algoritmos, Pascal, C/C++ e Java**. 2. ed. Pearson, 2007.
- DEITEL, H. M.; DEITEL, P. J.; CHOFFNES, D. R. **Sistemas operacionais**. 3. ed. Pearson, 2005.
- FORBELLONE, A. L. V.; EBERSPACHER, H. F. **Lógica de programação: a construção de algoritmos e estruturas de dados**. 3. ed. Pearson, 2005.
- GUEDES, S. (Org.). **Lógica de programação algorítmica**. Pearson, 2014.
- PUGA, S.; RISSETTI, G. **Lógica de programação e estruturas de dados, com aplicações em Java**. Pearson, 2016.

### **Próximos Passos**
1. 📖 Pratique com os exercícios propostos
2. 🔄 Crie variações dos exemplos apresentados
3. 🚀 Explore conceitos avançados como recursão e algoritmos de ordenação
4. 💡 Desenvolva projetos próprios aplicando os conceitos aprendidos

---

*Este guia fornece uma base sólida para dominar as estruturas de controle em Java. A prática constante e a experimentação com diferentes cenários consolidarão seu aprendizado e prepararão você para desafios mais avançados na programação.*