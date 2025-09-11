# Introdução ao Java

## 1. Definição
Java é uma **linguagem de programação de propósito geral**, **orientada a objetos** e **multiplataforma**, lançada em 1995 pela **Sun Microsystems** (atualmente Oracle Corporation). 

Sua principal característica é o princípio **“write once, run anywhere”** (escreva uma vez, execute em qualquer lugar), que permite que um programa compilado em Java rode em qualquer dispositivo que possua a **Java Virtual Machine (JVM)** instalada.

Java é amplamente utilizada em:
- Aplicações **web**
- Aplicações **móveis** (Android)
- Aplicações **desktop**
- **Sistemas corporativos** e distribuídos

---

## 2. A JVM (Java Virtual Machine)
A **Java Virtual Machine** é a base da portabilidade do Java. Ela atua como uma camada de abstração entre o código compilado (bytecode) e o sistema operacional.

### Funções principais da JVM:
- **Execução de bytecode** → interpreta e executa o código compilado em Java.
- **Verificação de bytecode** → garante segurança e integridade antes da execução.
- **Gerenciamento de memória** → aloca, gerencia e libera memória de forma automática (garbage collector).
- **Abstração da plataforma** → permite que o mesmo programa rode em sistemas diferentes.
- **Carregamento dinâmico de classes** → carrega classes apenas quando necessário.

💡 Graças à JVM, programas Java funcionam de maneira consistente em **Windows, Linux, macOS** e outros sistemas.

---

## 3. Fundamentos do Java
### Paradigma
Java segue o paradigma **orientado a objetos (OOP)**, permitindo programas **modulares, reutilizáveis e organizados**.

### Conceitos básicos:
- **Classes e Objetos** → modelam entidades do mundo real.
- **Sintaxe semelhante ao C/C++** → facilita a aprendizagem.
- **Estruturas de controle** → condicionais (`if`, `switch`) e repetição (`for`, `while`).
- **Tratamento de exceções** → garante robustez contra erros.

### Bibliotecas Padrão (Java Standard Library)
Java oferece um conjunto amplo de pacotes e classes:
- **java.lang** → classes fundamentais (String, Math, System, Object).
- **java.util** → coleções e utilitários (ArrayList, HashMap, Date).
- **java.io** → entrada e saída de dados (arquivos, streams).
- **java.nio** → operações avançadas de I/O com buffers.

---

## 4. Ambiente de Desenvolvimento
Para programar em Java, é necessário:
1. **Instalar o JDK (Java Development Kit)** → contém compilador (`javac`), bibliotecas e ferramentas.
   - Download: [site oficial da Oracle](https://www.oracle.com/java/technologies/downloads/)
2. **Escolher uma IDE** (Ambiente de Desenvolvimento Integrado):
   - **Eclipse**
   - **NetBeans**
   - **IntelliJ IDEA Community** (recomendado)

A IDE oferece recursos como editor inteligente, compilador integrado, debugger e ferramentas de automação.

---

## 5. Primeiro Programa em Java
Um programa Java básico consiste em uma **classe pública** com o método `main`, ponto de entrada da aplicação.

Exemplo:
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

📌 **Explicação:**
- `public class HelloWorld` → define a classe principal.
- `public static void main(String[] args)` → método que inicia o programa.
- `System.out.println()` → imprime no console.

Saída no console:
```
Hello, World!
```

---

## 6. Aplicações e Comunidade
Java é utilizado em:
- **Back-end web** (Spring, Jakarta EE)
- **Android** (base do desenvolvimento nativo)
- **Big Data** (Hadoop, Spark)
- **Sistemas corporativos** (ERP, bancos, telecom)

A comunidade Java é **ativa e global**, oferecendo suporte em fóruns, grupos de estudo e vasta documentação.

---

## 7. Atividade Prática
### Título: Entendendo a linguagem Java
**Objetivo:** Criar e executar seu primeiro programa em Java.

**Passos:**
1. Instale o **JDK 17** e uma **IDE** (ex.: IntelliJ IDEA Community).
2. Crie um projeto Java.
3. Crie o arquivo `HelloWorld.java` e copie o código de exemplo.
4. Compile e execute.
5. Verifique a saída no console.

### Questionário
1. O que é a JVM e qual sua importância? 
    - Resposta: Uma máquina virtual que executa bytecode Java, garantindo a portabilidade e a segurança.
2. O que acontece quando um código Java é compilado e executado?
    - Resposta: O código-fonte é compilado em bytecode pelo javac, que é então interpretado pela JVM.
3. Qual é a função do método `main` em um programa Java?  
    - Resposta: É o ponto de entrada de um programa Java, onde a execução começa.
4. Qual é a saída do programa `HelloWorld`?
    - Resposta: “Hello, World!”

---

## 8. Conteúdo Bônus 🎥
📌 **Vídeo recomendado:** [Como sair do ZERO em JAVA em 1h - Rocketseat (@kipperdev)](https://www.youtube.com/watch?v=apLWdv0cV2g)

Esse vídeo traz uma introdução prática e rápida para quem deseja dar os primeiros passos em Java.

---

## 9. Referências Bibliográficas
- ASCENCIA, A. F. G.; CAMPOS, E. A. V. *Fundamentos da programação: algoritmos, Pascal, C/C++ e Java*. 2. ed. Pearson, 2007.
- DEITEL, H. M.; DEITEL, P. J.; CHOFFNES, D. R. *Sistemas operacionais*. 3. ed. Pearson, 2005.
- FORBELLONE, A. L. V.; EBERSPACHER, H. F. *Lógica de programação: a construção de algoritmos e estruturas de dados*. 3. ed. Pearson, 2005.
- GUEDES, S. (Org.). *Lógica de programação algorítmica*. Pearson, 2014.
- LEE, V.; SCHNEIDER, H.; SCHELL, R. *Aplicações móveis: arquitetura, projetos e desenvolvimento*. Pearson, 2005.
- MELO, A. C. V. de; SILVA, F. S. C. da. *Princípios de linguagens de programação*. Blucher, 2014.
- MENEZES, A. M. de. *Os paradigmas de aprendizagem de algoritmo computacional*. Blucher, 2015.
- PUGA, S.; RISSETTI, G. *Lógica de programação e estruturas de dados, com aplicações em Java*. Pearson, 2016.
