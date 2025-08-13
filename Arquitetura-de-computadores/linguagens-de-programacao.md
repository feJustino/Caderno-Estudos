## Introdução às Linguagens de Programação

Linguagens de programação são ferramentas que **transformam ideias em soluções computacionais**, traduzindo lógica humana em algoritmos executáveis por máquinas. A escolha da linguagem ideal depende de:

- Natureza do problema
- Público-alvo (dispositivos móveis, servidores, IoT)
- Recursos disponíveis (hardware, bibliotecas)
- Contexto de implantação

---

## Linguagens de Programação Populares e seus Usos

| Linguagem   | Área de Destaque          | Casos de Uso Típicos         | Framework Exemplo |
|-------------|---------------------------|------------------------------|------------------|
| Python      | Análise de dados, IA      | ML, automação, scripts       | TensorFlow       |
| C           | Sistemas de alto desempenho | SOs, drivers, embarcados     | -                |
| Java        | Sistemas corporativos     | Android, aplicações empresariais | Spring         |
| JavaScript  | Desenvolvimento web       | Frontend, aplicações dinâmicas | React           |
| C#          | Aplicações Windows        | Jogos (Unity), desktop apps   | .NET             |
| SQL         | Gestão de bancos de dados | Consultas, relatórios         | -                |

> **Nota**: Java é frequentemente usado em sistemas corporativos e Android, não em sistemas embarcados (onde C/C++ são predominantes).
----
## Classificação de Linguagens de Programação
Linguagens de programação são classificadas em baixo e alto nível. Baixo nível se refere à linguagem de máquina, enquanto alto nível se aproxima da linguagem humana.

# Mapa Mental: Classificação Linguagem de Programação
- **Paradigma**
    - Imperativo
        - Procedural
        - Orientação a objetos
    - Declarativo 
        - Funcional
        - Programação lógica

- **Estrutura de tipos**
    - Fracamente tipada
    - Fortemente tipada
    - Dinamicamente tipada
    - Estaticamente tipada

- **Grau de abstração**
    - Baixo Nível
    - Médio Nível
    - Alto Nível

- **Geração**

    - Primeira
    - Segunda 
    - Terceira
    - Quarta
    - Quinta


---
## Paradigmas de Programação

### 🛠 Paradigma Imperativo (COMO fazer)
**Características**:  
- Sequência de comandos que alteram estado
- Foco em "como" a tarefa é realizada
- Uso de variáveis mutáveis

#### Procedural (Estruturado)
Primeiro paradigma de programação baseado  no modelo clássico de von Neumann;
- Atribuições, sequências de comandos, laços  de repetição e comandos condicionais fazem  parte deste paradigma;
- Abstração procedural é sua principal  característica.

```c
#include <stdio.h>

// Função para somar dois números
int soma(int a, int b) {
    return a + b;
}

int main() {
    int resultado = soma(5, 3);
    printf("Resultado: %d", resultado);
    return 0;
}
```

#### Orientado a Objetos (OO)
Um programa é constituído de vários objetos  que trocam mensagens entre si.
- Objetos de dados são ativos e não passivos  como no paradigma imperativo;
- Definição de classes de objetos, herança e  passagem de mensagens  caracterizam este paradigma.
```java
public class Calculadora {
    // Atributos
    private int resultado;
    
    // Método
    public void soma(int a, int b) {
        this.resultado = a + b;
    }
    
    public int getResultado() {
        return this.resultado;
    }
}
```

### 📊 Paradigma Declarativo (O QUE fazer)
**Características**:  
- Descrição do resultado desejado
- Foco em "o que" deve ser resolvido
- Menor preocupação com fluxo de controle

#### Funcional
O problema é modelado por um conjunto de funções matemáticas, cada uma com um espaço de entrada e um resultado, usada tradicionalmente em IA.

- As funções interagem entre si, utilizando a  composição funcional.
- Ex: LISP, Haskell, ML, JavaScript.
```javascript
// Função pura (sem efeitos colaterais)
const soma = (a, b) => a + b;

// Composição de funções
[1, 2, 3].map(x => x * 2).filter(x => x > 3);
```

#### Lógico (Prolog)
Declarativo – descreve o problema e o que se deseja fazer e não como fazer (programação imperativa e OO).

- Conhecida como baseada em regras.
- Ex. Prolog

```prolog
% Fatos
pai(joao, maria).
pai(joao, pedro).

% Regra
irmao(X, Y) :- pai(Z, X), pai(Z, Y), X \= Y.
```

---

## Comparativo: Tipagem de Linguagens

| Característica | Fortemente Tipada | Fracamente Tipada | Estaticamente Tipada | Dinamicamente Tipada |
|----------------|-------------------|-------------------|----------------------|----------------------|
| **Definição**  | Conversões explícitas | Conversões implícitas | Verificação em compilação | Verificação em execução |
| **Exemplos**   | Java, Haskell     | JavaScript, PHP   | C++, Go             | Python, Ruby        |
| **Vantagens**  | Segurança         | Flexibilidade     | Performance         | Agilidade           |
| **Desvantagens**| Rigidez          | Erros em runtime  | Verbosidade         | Erros em runtime    |

---

## Gerações de Linguagens

| Geração | Exemplos         | Características               | Nível de Abstração |
|---------|------------------|-------------------------------|-------------------|
| 1ª      | Linguagem máquina| Binário                       | Baixíssimo        |
| 2ª      | Assembly         | Mnemônicos                    | Baixo             |
| 3ª      | C, Pascal, Java  | Independente de hardware      | Alto              |
| 4ª      | SQL, MATLAB      | Específicas para domínios     | Muito Alto        |
| 5ª      | Prolog, LISP     | Baseadas em restrições/lógica | Abstrato          |

---
Referência Bibliográfica

BROOKSHEAR, J.G. Ciência da Computação: uma visão abrangente. Porto Alegre: Bookman, 2013.

FORBELLONE, A.L.V. & EBERSPACHER, H. F.  Lógica de Programação –  A Construção de Algoritmos e Estruturas de Dados. 3ª. Edição. São Paulo, SP: Prentice Hall, 2005.

SEBESTA, R. W. Conceitos de linguagens de programação [recurso eletrônico] /

Robert W. Sebesta; tradução técnica: Eduardo Kessler Piveta. – 9. ed. – Dados eletrônicos. – Porto Alegre : Bookman, 2011.

