# Mecanismos de Busca em Programação - Guia Completo

## 📋 Sumário

1. [Introdução](#introdução)
2. [Importância da Busca](#importância-da-busca)
3. [Algoritmos de Busca Fundamentais](#algoritmos-de-busca-fundamentais)
4. [Estruturas de Dados e Busca](#estruturas-de-dados-e-busca)
5. [Registros e Uniões em Java](#registros-e-uniões-em-java)
6. [Aplicações Práticas](#aplicações-práticas)
7. [Otimização e Performance](#otimização-e-performance)
8. [Exemplos de Implementação](#exemplos-de-implementação)
9. [Exercícios Práticos](#exercícios-práticos)
10. [Boas Práticas](#boas-práticas)

---

## 🎯 Introdução

A **busca** é um dos conceitos mais fundamentais em programação e sistemas computacionais, envolvendo a localização de itens específicos dentro de conjuntos de dados. Esta operação é essencial para:

- 🔍 **Localizar valores** em listas e arrays
- 📝 **Procurar palavras** em textos e documentos
- 🗄️ **Encontrar registros** em bancos de dados
- 🌐 **Recuperar informações** em sistemas distribuídos

> **Conceito Central**: Algoritmos de busca eficientes são a base para sistemas responsivos e experiências de usuário satisfatórias.

---

## 🌟 Importância da Busca

### 1. 🔧 Resolução de Problemas Comuns

A habilidade de encontrar informações específicas de maneira eficiente é fundamental na programação, especialmente quando lidamos com grandes volumes de dados.

#### **Tipos de Pesquisa:**

| Tipo | Descrição | Exemplos de Uso |
|------|-----------|----------------|
| **Pesquisa de Dados** | Localização rápida de informações específicas | Sistemas de CRM, inventários |
| **Pesquisa em Texto** | Identificação de palavras-chave ou padrões | Editores de texto, motores de busca |
| **Busca em Arquivos** | Localização em sistemas de arquivos | Logs de sistema, configurações |

### 2. ⚡ Eficiência em Algoritmos

A eficiência algorítmica é crítica para sistemas modernos que precisam processar grandes volumes de dados rapidamente.

#### **Aspectos Fundamentais:**

- **🚀 Algoritmos Otimizados**: Métodos avançados que reduzem tempo de execução
- **📉 Redução de Complexidade**: Estratégias para simplificar e acelerar operações
- **🎯 Performance**: Garantia de resultados rápidos sem comprometer precisão

### 3. 🏗️ Fundamentos de Estruturas de Dados

A escolha adequada de estruturas de dados impacta diretamente na eficiência das operações de busca.

#### **Estruturas Principais:**

```
📊 Estruturas de Dados para Busca
├── 🌳 Árvores
│   ├── Árvores Binárias de Busca
│   ├── Árvores AVL
│   └── Árvores B
├── 📈 Grafos
│   ├── Busca em Largura (BFS)
│   └── Busca em Profundidade (DFS)
└── 🔗 Hash Tables
    ├── Hashing Linear
    └── Hashing com Encadeamento
```

### 4. 👥 Interação com Usuários e UX

A experiência do usuário depende diretamente da eficácia dos mecanismos de busca implementados.

#### **Componentes de UX:**

- **🔎 Motores de Busca**: Ferramentas para lidar com grandes volumes
- **🔧 Filtros e Facetas**: Refinamento de resultados
- **⚡ Resposta Rápida**: Busca em tempo real
- **🎯 Relevância**: Resultados precisos e úteis

### 5. 🛠️ Desenvolvimento e Manutenção

Mecanismos de busca facilitam o desenvolvimento e manutenção de sistemas complexos.

#### **Práticas Essenciais:**

- **🔄 Refatoração de Código**: Melhorar legibilidade e manutenibilidade
- **🐛 Depuração e Diagnóstico**: Localizar e corrigir erros
- **📊 Navegação de Código**: Encontrar componentes específicos
- **🔍 Análise de Performance**: Identificar gargalos

### 6. 🔐 Segurança e Criptografia

Algoritmos de busca são fundamentais em aplicações de segurança.

#### **Aplicações de Segurança:**

| Área | Aplicação | Técnica |
|------|-----------|---------|
| **Força Bruta** | Detecção de tentativas de invasão | Monitoramento de padrões |
| **Vulnerabilidades** | Identificação de falhas de segurança | Análise de código estático |
| **Criptoanálise** | Quebra de cifras | Busca em espaço de chaves |

---

## 🔍 Algoritmos de Busca Fundamentais

### 1. 📊 Busca Sequencial (Linear)

A busca sequencial é o algoritmo mais simples, percorrendo elementos um por um até encontrar o valor desejado.

#### **Características:**

- ✅ **Simplicidade**: Fácil implementação e compreensão
- ✅ **Universalidade**: Funciona em qualquer estrutura de dados
- ✅ **Flexibilidade**: Não requer dados ordenados
- ❌ **Ineficiência**: O(n) para grandes conjuntos

#### **Implementação em Java:**

```java
public class BuscaSequencial {
    
    /**
     * Realiza busca sequencial em um array de inteiros
     * @param array Array onde buscar
     * @param valor Valor a ser procurado
     * @return Índice do elemento encontrado ou -1 se não encontrado
     */
    public static int buscaSequencial(int[] array, int valor) {
        // Percorre cada elemento do array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i; // Retorna o índice se encontrou
            }
        }
        return -1; // Retorna -1 se não encontrou
    }
    
    /**
     * Busca sequencial com contador de comparações
     */
    public static ResultadoBusca buscaSequencialComContador(int[] array, int valor) {
        int comparacoes = 0;
        
        for (int i = 0; i < array.length; i++) {
            comparacoes++;
            if (array[i] == valor) {
                return new ResultadoBusca(i, comparacoes, true);
            }
        }
        return new ResultadoBusca(-1, comparacoes, false);
    }
    
    /**
     * Busca sequencial em lista de strings (case-insensitive)
     */
    public static int buscaTexto(String[] textos, String busca) {
        String buscaLower = busca.toLowerCase();
        
        for (int i = 0; i < textos.length; i++) {
            if (textos[i].toLowerCase().contains(buscaLower)) {
                return i;
            }
        }
        return -1;
    }
}

// Classe auxiliar para resultados detalhados
class ResultadoBusca {
    public final int indice;
    public final int comparacoes;
    public final boolean encontrado;
    
    public ResultadoBusca(int indice, int comparacoes, boolean encontrado) {
        this.indice = indice;
        this.comparacoes = comparacoes;
        this.encontrado = encontrado;
    }
    
    @Override
    public String toString() {
        return String.format("Resultado: índice=%d, comparações=%d, encontrado=%s", 
                           indice, comparacoes, encontrado);
    }
}
```

### 2. 🎯 Busca Binária

A busca binária é um algoritmo eficiente que funciona apenas em arrays ordenados, dividindo o espaço de busca pela metade a cada iteração.

#### **Características:**

- ✅ **Alta Eficiência**: O(log n) - muito rápida para grandes conjuntos
- ✅ **Previsibilidade**: Número máximo de comparações conhecido
- ✅ **Escalabilidade**: Performance excelente com crescimento dos dados
- ❌ **Pré-requisito**: Requer dados ordenados

#### **Como Funciona:**

```
Exemplo: Buscar 15 no array [4, 8, 15, 16, 23, 42]

Passo 1: meio = (0 + 5) / 2 = 2, array[2] = 15
         15 == 15? SIM! Encontrado na posição 2

Total de comparações: 1
```

#### **Implementação em Java:**

```java
public class BuscaBinaria {
    
    /**
     * Busca binária iterativa
     * @param array Array ordenado para buscar
     * @param valor Valor a ser procurado
     * @return Índice do elemento ou -1 se não encontrado
     */
    public static int buscaBinaria(int[] array, int valor) {
        int esquerda = 0;
        int direita = array.length - 1;
        
        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2; // Evita overflow
            
            if (array[meio] == valor) {
                return meio; // Encontrou o valor
            }
            
            if (array[meio] > valor) {
                direita = meio - 1; // Busca na metade esquerda
            } else {
                esquerda = meio + 1; // Busca na metade direita
            }
        }
        
        return -1; // Não encontrou
    }
    
    /**
     * Busca binária recursiva
     */
    public static int buscaBinariaRecursiva(int[] array, int valor, int esquerda, int direita) {
        // Caso base: não encontrou
        if (esquerda > direita) {
            return -1;
        }
        
        int meio = esquerda + (direita - esquerda) / 2;
        
        // Encontrou o valor
        if (array[meio] == valor) {
            return meio;
        }
        
        // Recursão para a metade apropriada
        if (array[meio] > valor) {
            return buscaBinariaRecursiva(array, valor, esquerda, meio - 1);
        } else {
            return buscaBinariaRecursiva(array, valor, meio + 1, direita);
        }
    }
    
    /**
     * Busca binária com detalhes da execução
     */
    public static ResultadoBuscaDetalhado buscaBinariaDetalhada(int[] array, int valor) {
        int esquerda = 0;
        int direita = array.length - 1;
        int comparacoes = 0;
        List<String> passos = new ArrayList<>();
        
        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;
            comparacoes++;
            
            String passo = String.format("Comparação %d: array[%d] = %d vs %d", 
                                       comparacoes, meio, array[meio], valor);
            passos.add(passo);
            
            if (array[meio] == valor) {
                return new ResultadoBuscaDetalhado(meio, comparacoes, passos, true);
            }
            
            if (array[meio] > valor) {
                direita = meio - 1;
                passos.add("Buscando na metade esquerda");
            } else {
                esquerda = meio + 1;
                passos.add("Buscando na metade direita");
            }
        }
        
        return new ResultadoBuscaDetalhado(-1, comparacoes, passos, false);
    }
    
    /**
     * Encontra a primeira ocorrência em array com duplicatas
     */
    public static int buscaPrimeiraOcorrencia(int[] array, int valor) {
        int resultado = buscaBinaria(array, valor);
        
        if (resultado == -1) return -1;
        
        // Move para a esquerda para encontrar a primeira ocorrência
        while (resultado > 0 && array[resultado - 1] == valor) {
            resultado--;
        }
        
        return resultado;
    }
    
    /**
     * Encontra a última ocorrência em array com duplicatas
     */
    public static int buscaUltimaOcorrencia(int[] array, int valor) {
        int resultado = buscaBinaria(array, valor);
        
        if (resultado == -1) return -1;
        
        // Move para a direita para encontrar a última ocorrência
        while (resultado < array.length - 1 && array[resultado + 1] == valor) {
            resultado++;
        }
        
        return resultado;
    }
}

class ResultadoBuscaDetalhado {
    public final int indice;
    public final int comparacoes;
    public final List<String> passos;
    public final boolean encontrado;
    
    public ResultadoBuscaDetalhado(int indice, int comparacoes, List<String> passos, boolean encontrado) {
        this.indice = indice;
        this.comparacoes = comparacoes;
        this.passos = new ArrayList<>(passos);
        this.encontrado = encontrado;
    }
    
    public void imprimirDetalhes() {
        System.out.println("=== DETALHES DA BUSCA BINÁRIA ===");
        for (String passo : passos) {
            System.out.println(passo);
        }
        System.out.println("Resultado final: " + (encontrado ? "Encontrado na posição " + indice : "Não encontrado"));
        System.out.println("Total de comparações: " + comparacoes);
    }
}
```

### 📊 Comparação dos Algoritmos

| Aspecto | Busca Sequencial | Busca Binária |
|---------|------------------|---------------|
| **Complexidade** | O(n) | O(log n) |
| **Pré-requisito** | Nenhum | Array ordenado |
| **Melhor caso** | O(1) - primeiro elemento | O(1) - elemento central |
| **Pior caso** | O(n) - último elemento | O(log n) |
| **Uso de memória** | O(1) | O(1) iterativa, O(log n) recursiva |
| **Implementação** | Muito simples | Moderadamente complexa |

### 📈 Análise de Performance

```java
public class AnalisePerformance {
    
    public static void compararAlgoritmos() {
        int[] tamanhos = {100, 1000, 10000, 100000, 1000000};
        
        System.out.println("Comparação de Performance: Busca Sequencial vs Binária");
        System.out.println("Tamanho\tSequencial (ms)\tBinária (ms)\tVantagem");
        
        for (int tamanho : tamanhos) {
            int[] array = gerarArrayOrdenado(tamanho);
            int valorBusca = array[tamanho - 1]; // Pior caso para sequencial
            
            // Teste busca sequencial
            long inicio = System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                BuscaSequencial.buscaSequencial(array, valorBusca);
            }
            long tempoSequencial = (System.nanoTime() - inicio) / 1000000;
            
            // Teste busca binária
            inicio = System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                BuscaBinaria.buscaBinaria(array, valorBusca);
            }
            long tempoBinario = (System.nanoTime() - inicio) / 1000000;
            
            double vantagem = (double) tempoSequencial / tempoBinario;
            
            System.out.printf("%d\t%d\t\t%d\t\t%.1fx%n", 
                            tamanho, tempoSequencial, tempoBinario, vantagem);
        }
    }
    
    private static int[] gerarArrayOrdenado(int tamanho) {
        int[] array = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            array[i] = i * 2; // Array ordenado com números pares
        }
        return array;
    }
}
```

---

## 🗄️ Estruturas de Dados e Busca

### 1. 🌳 Árvores Binárias de Busca

As árvores binárias de busca organizam dados de forma hierárquica, permitindo buscas eficientes.

```java
public class ArvoreBinariaBusca {
    
    private No raiz;
    
    class No {
        int valor;
        No esquerda, direita;
        
        No(int valor) {
            this.valor = valor;
        }
    }
    
    /**
     * Insere um valor na árvore
     */
    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }
    
    private No inserirRecursivo(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }
        
        if (valor < no.valor) {
            no.esquerda = inserirRecursivo(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserirRecursivo(no.direita, valor);
        }
        
        return no;
    }
    
    /**
     * Busca um valor na árvore
     */
    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }
    
    private boolean buscarRecursivo(No no, int valor) {
        if (no == null) {
            return false;
        }
        
        if (valor == no.valor) {
            return true;
        }
        
        return valor < no.valor 
            ? buscarRecursivo(no.esquerda, valor)
            : buscarRecursivo(no.direita, valor);
    }
    
    /**
     * Busca com caminho (para debug)
     */
    public String buscarComCaminho(int valor) {
        List<String> caminho = new ArrayList<>();
        boolean encontrado = buscarComCaminhoRecursivo(raiz, valor, caminho);
        
        return "Valor " + valor + (encontrado ? " encontrado" : " não encontrado") + 
               ". Caminho: " + String.join(" -> ", caminho);
    }
    
    private boolean buscarComCaminhoRecursivo(No no, int valor, List<String> caminho) {
        if (no == null) {
            caminho.add("null");
            return false;
        }
        
        caminho.add(String.valueOf(no.valor));
        
        if (valor == no.valor) {
            return true;
        }
        
        return valor < no.valor 
            ? buscarComCaminhoRecursivo(no.esquerda, valor, caminho)
            : buscarComCaminhoRecursivo(no.direita, valor, caminho);
    }
}
```

### 2. #️⃣ Hash Tables

Hash tables oferecem busca em tempo O(1) no caso médio.

```java
public class TabelaHash<K, V> {
    
    private static final int TAMANHO_INICIAL = 16;
    private static final double FATOR_CARGA_MAXIMO = 0.75;
    
    private No<K, V>[] tabela;
    private int tamanho;
    private int capacidade;
    
    class No<K, V> {
        K chave;
        V valor;
        No<K, V> proximo;
        
        No(K chave, V valor) {
            this.chave = chave;
            this.valor = valor;
        }
    }
    
    @SuppressWarnings("unchecked")
    public TabelaHash() {
        this.capacidade = TAMANHO_INICIAL;
        this.tabela = new No[capacidade];
        this.tamanho = 0;
    }
    
    /**
     * Função hash simples
     */
    private int hash(K chave) {
        return Math.abs(chave.hashCode() % capacidade);
    }
    
    /**
     * Insere ou atualiza um valor
     */
    public void put(K chave, V valor) {
        if ((double) tamanho / capacidade > FATOR_CARGA_MAXIMO) {
            redimensionar();
        }
        
        int indice = hash(chave);
        No<K, V> no = tabela[indice];
        
        // Busca pela chave existente
        while (no != null) {
            if (no.chave.equals(chave)) {
                no.valor = valor; // Atualiza valor existente
                return;
            }
            no = no.proximo;
        }
        
        // Adiciona novo nó no início da lista
        No<K, V> novoNo = new No<>(chave, valor);
        novoNo.proximo = tabela[indice];
        tabela[indice] = novoNo;
        tamanho++;
    }
    
    /**
     * Busca um valor pela chave
     */
    public V get(K chave) {
        int indice = hash(chave);
        No<K, V> no = tabela[indice];
        
        while (no != null) {
            if (no.chave.equals(chave)) {
                return no.valor;
            }
            no = no.proximo;
        }
        
        return null; // Não encontrado
    }
    
    /**
     * Verifica se uma chave existe
     */
    public boolean contemChave(K chave) {
        return get(chave) != null;
    }
    
    /**
     * Remove um elemento
     */
    public V remover(K chave) {
        int indice = hash(chave);
        No<K, V> no = tabela[indice];
        No<K, V> anterior = null;
        
        while (no != null) {
            if (no.chave.equals(chave)) {
                if (anterior == null) {
                    tabela[indice] = no.proximo;
                } else {
                    anterior.proximo = no.proximo;
                }
                tamanho--;
                return no.valor;
            }
            anterior = no;
            no = no.proximo;
        }
        
        return null;
    }
    
    @SuppressWarnings("unchecked")
    private void redimensionar() {
        No<K, V>[] tabelaAntiga = tabela;
        capacidade *= 2;
        tamanho = 0;
        tabela = new No[capacidade];
        
        // Reinsere todos os elementos
        for (No<K, V> no : tabelaAntiga) {
            while (no != null) {
                put(no.chave, no.valor);
                no = no.proximo;
            }
        }
    }
    
    /**
     * Estatísticas da tabela hash
     */
    public void imprimirEstatisticas() {
        System.out.println("=== ESTATÍSTICAS DA TABELA HASH ===");
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Fator de carga: " + String.format("%.2f", (double) tamanho / capacidade));
        
        int[] distribuicao = new int[capacidade];
        int colisoes = 0;
        
        for (int i = 0; i < capacidade; i++) {
            No<K, V> no = tabela[i];
            int contador = 0;
            
            while (no != null) {
                contador++;
                no = no.proximo;
            }
            
            distribuicao[i] = contador;
            if (contador > 1) {
                colisoes += contador - 1;
            }
        }
        
        System.out.println("Total de colisões: " + colisoes);
        System.out.println("Maior cadeia: " + Arrays.stream(distribuicao).max().orElse(0));
    }
}
```

---

## 🏗️ Registros e Uniões em Java

### 1. 📝 Registros (Records)

Java 14+ introduziu records como uma forma concisa de criar classes de dados imutáveis.

```java
// Record moderno (Java 14+)
public record Pessoa(String nome, int idade, String email) {
    
    // Validação no construtor compacto
    public Pessoa {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        if (idade < 0 || idade > 150) {
            throw new IllegalArgumentException("Idade deve estar entre 0 e 150");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
    }
    
    // Métodos adicionais
    public boolean isMaiorDeIdade() {
        return idade >= 18;
    }
    
    public String getDominio() {
        return email.substring(email.indexOf("@") + 1);
    }
}

// Simulação de registro em versões antigas do Java
public class PessoaTradicional {
    private final String nome;
    private final int idade;
    private final String email;
    
    public PessoaTradicional(String nome, int idade, String email) {
        this.nome = Objects.requireNonNull(nome, "Nome não pode ser null");
        this.idade = idade;
        this.email = Objects.requireNonNull(email, "Email não pode ser null");
    }
    
    // Getters
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getEmail() { return email; }
    
    // equals, hashCode e toString
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PessoaTradicional pessoa = (PessoaTradicional) obj;
        return idade == pessoa.idade &&
               Objects.equals(nome, pessoa.nome) &&
               Objects.equals(email, pessoa.email);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, email);
    }
    
    @Override
    public String toString() {
        return String.format("PessoaTradicional{nome='%s', idade=%d, email='%s'}", 
                           nome, idade, email);
    }
}
```

### 2. 🔄 Simulação de Uniões

Java não suporta uniões nativas, mas podemos simular usando diferentes abordagens.

```java
// Abordagem 1: Classe com múltiplos tipos (Union-like)
public class ValorMultiplo {
    private final Object valor;
    private final TipoValor tipo;
    
    public enum TipoValor {
        INTEIRO, TEXTO, DECIMAL, BOOLEANO
    }
    
    private ValorMultiplo(Object valor, TipoValor tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }
    
    // Factory methods
    public static ValorMultiplo deInteiro(int valor) {
        return new ValorMultiplo(valor, TipoValor.INTEIRO);
    }
    
    public static ValorMultiplo deTexto(String valor) {
        return new ValorMultiplo(valor, TipoValor.TEXTO);
    }
    
    public static ValorMultiplo deDecimal(double valor) {
        return new ValorMultiplo(valor, TipoValor.DECIMAL);
    }
    
    public static ValorMultiplo deBooleano(boolean valor) {
        return new ValorMultiplo(valor, TipoValor.BOOLEANO);
    }
    
    // Getters seguros
    public int comoInteiro() {
        if (tipo != TipoValor.INTEIRO) {
            throw new IllegalStateException("Valor não é um inteiro");
        }
        return (Integer) valor;
    }
    
    public String comoTexto() {
        if (tipo != TipoValor.TEXTO) {
            throw new IllegalStateException("Valor não é um texto");
        }
        return (String) valor;
    }
    
    public double comoDecimal() {
        if (tipo != TipoValor.DECIMAL) {
            throw new IllegalStateException("Valor não é um decimal");
        }
        return (Double) valor;
    }
    
    public boolean comoBooleano() {
        if (tipo != TipoValor.BOOLEANO) {
            throw new IllegalStateException("Valor não é um booleano");
        }
        return (Boolean) valor;
    }
    
    public TipoValor getTipo() {
        return tipo;
    }
    
    // Pattern matching manual
    public <T> T processar(
            Function<Integer, T> processarInteiro,
            Function<String, T> processarTexto,
            Function<Double, T> processarDecimal,
            Function<Boolean, T> processarBooleano) {
        
        switch (tipo) {
            case INTEIRO:
                return processarInteiro.apply((Integer) valor);
            case TEXTO:
                return processarTexto.apply((String) valor);
            case DECIMAL:
                return processarDecimal.apply((Double) valor);
            case BOOLEANO:
                return processarBooleano.apply((Boolean) valor);
            default:
                throw new IllegalStateException("Tipo desconhecido: " + tipo);
        }
    }
    
    @Override
    public String toString() {
        return String.format("ValorMultiplo{valor=%s, tipo=%s}", valor, tipo);
    }
}

// Abordagem 2: Hierarquia de classes (Sealed Classes em Java 17+)
public abstract sealed class Resultado 
    permits Resultado.Sucesso, Resultado.Erro {
    
    public static final class Sucesso extends Resultado {
        private final Object valor;
        
        public Sucesso(Object valor) {
            this.valor = valor;
        }
        
        public Object getValor() {
            return valor;
        }
        
        @Override
        public String toString() {
            return "Sucesso{valor=" + valor + "}";
        }
    }
    
    public static final class Erro extends Resultado {
        private final String mensagem;
        private final Exception causa;
        
        public Erro(String mensagem) {
            this(mensagem, null);
        }
        
        public Erro(String mensagem, Exception causa) {
            this.mensagem = mensagem;
            this.causa = causa;
        }
        
        public String getMensagem() {
            return mensagem;
        }
        
        public Exception getCausa() {
            return causa;
        }
        
        @Override
        public String toString() {
            return "Erro{mensagem='" + mensagem + "', causa=" + causa + "}";
        }
    }
    
    // Método de conveniência para pattern matching
    public <T> T match(Function<Sucesso, T> onSucesso, Function<Erro, T> onErro) {
        if (this instanceof Sucesso) {
            return onSucesso.apply((Sucesso) this);
        } else if (this instanceof Erro) {
            return onErro.apply((Erro) this);
        } else {
            throw new IllegalStateException("Tipo de resultado desconhecido");
        }
    }
}
```

---

## 💡 Aplicações Práticas

### Sistema de Busca de Produtos

```java
public class SistemaBuscaProdutos {
    
    private List<Produto> produtos;
    private TabelaHash<String, Produto> indicePorCodigo;
    private Map<String, List<Produto>> indicePorCategoria;
    
    public record Produto(
        String codigo,
        String nome,
        String categoria,
        double preco,
        int estoque,
        List<String> tags
    ) {
        // Validação
        public Produto {
            Objects.requireNonNull(codigo, "Código não pode ser null");
            Objects.requireNonNull(nome, "Nome não pode ser null");
            if (preco < 0) throw new IllegalArgumentException("Preço não pode ser negativo");
        }
        
        public boolean contemTag(String tag) {
            return tags.stream().anyMatch(t -> t.equalsIgnoreCase(tag));
        }
    }
    
    public SistemaBuscaProdutos() {
        this.produtos = new ArrayList<>();
        this.indicePorCodigo = new TabelaHash<>();
        this.indicePorCategoria = new HashMap<>();
    }
    
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        indicePorCodigo.put(produto.codigo(), produto);
        
        // Indexação por categoria
        indicePorCategoria
            .computeIfAbsent(produto.categoria().toLowerCase(), k -> new ArrayList<>())
            .add(produto);
    }
    
    // Busca por código (O(1))
    public Produto buscarPorCodigo(String codigo) {
        return indicePorCodigo.get(codigo);
    }
    
    // Busca por categoria (O(1) para acesso ao índice)
    public List<Produto> buscarPorCategoria(String categoria) {
        return indicePorCategoria.getOrDefault(categoria.toLowerCase(), new ArrayList<>());
    }
    
    // Busca por nome (O(n))
    public List<Produto> buscarPorNome(String termo) {
        String termoLower = termo.toLowerCase();
        return produtos.stream()
                      .filter(p -> p.nome().toLowerCase().contains(termoLower))
                      .collect(Collectors.toList());
    }
    
    // Busca por faixa de preço
    public List<Produto> buscarPorFaixaPreco(double precoMin, double precoMax) {
        return produtos.stream()
                      .filter(p -> p.preco() >= precoMin && p.preco() <= precoMax)
                      .sorted(Comparator.comparing(Produto::preco))
                      .collect(Collectors.toList());
    }
    
    // Busca por múltiplos critérios
    public List<Produto> buscarAvancada(CriteriosBusca criterios) {
        return produtos.stream()
                      .filter(criterios::corresponde)
                      .collect(Collectors.toList());
    }
    
    public static class CriteriosBusca {
        private String termo;
        private String categoria;
        private Double precoMin;
        private Double precoMax;
        private Integer estoqueMin;
        private List<String> tags;
        
        // Builder pattern
        public static CriteriosBusca builder() {
            return new CriteriosBusca();
        }
        
        public CriteriosBusca termo(String termo) {
            this.termo = termo;
            return this;
        }
        
        public CriteriosBusca categoria(String categoria) {
            this.categoria = categoria;
            return this;
        }
        
        public CriteriosBusca precoEntre(double min, double max) {
            this.precoMin = min;
            this.precoMax = max;
            return this;
        }
        
        public CriteriosBusca estoqueMinimo(int minimo) {
            this.estoqueMin = minimo;
            return this;
        }
        
        public CriteriosBusca comTags(String... tags) {
            this.tags = Arrays.asList(tags);
            return this;
        }
        
        public boolean corresponde(Produto produto) {
            if (termo != null && !produto.nome().toLowerCase().contains(termo.toLowerCase())) {
                return false;
            }
            
            if (categoria != null && !produto.categoria().equalsIgnoreCase(categoria)) {
                return false;
            }
            
            if (precoMin != null && produto.preco() < precoMin) {
                return false;
            }
            
            if (precoMax != null && produto.preco() > precoMax) {
                return false;
            }
            
            if (estoqueMin != null && produto.estoque() < estoqueMin) {
                return false;
            }
            
            if (tags != null && !tags.stream().anyMatch(produto::contemTag)) {
                return false;
            }
            
            return true;
        }
    }
}
```

---

## ⚡ Otimização e Performance

### Técnicas Avançadas de Otimização

```java
public class OtimizacoesBusca {
    
    /**
     * Busca com cache para resultados frequentes
     */
    public static class BuscaComCache<T> {
        private final Function<String, List<T>> funcaoBusca;
        private final Map<String, List<T>> cache;
        private final int tamanhoMaximo;
        
        public BuscaComCache(Function<String, List<T>> funcaoBusca, int tamanhoMaximo) {
            this.funcaoBusca = funcaoBusca;
            this.tamanhoMaximo = tamanhoMaximo;
            this.cache = new LinkedHashMap<String, List<T>>(tamanhoMaximo + 1, 0.75f, true) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<String, List<T>> eldest) {
                    return size() > tamanhoMaximo;
                }
            };
        }
        
        public List<T> buscar(String termo) {
            return cache.computeIfAbsent(termo, funcaoBusca);
        }
        
        public void limparCache() {
            cache.clear();
        }
        
        public double getTaxaAcerto() {
            // Implementar contador de hits/misses para calcular
            return 0.0; // Placeholder
        }
    }
    
    /**
     * Busca paralela para grandes datasets
     */
    public static class BuscaParalela {
        
        public static <T> List<T> buscarParalelo(
                List<T> dados, 
                Predicate<T> criterio, 
                int numeroThreads) {
            
            if (dados.size() < 1000) {
                // Para listas pequenas, busca sequencial é mais eficiente
                return dados.stream()
                           .filter(criterio)
                           .collect(Collectors.toList());
            }
            
            int tamanhoChunk = dados.size() / numeroThreads;
            List<CompletableFuture<List<T>>> tarefas = new ArrayList<>();
            
            for (int i = 0; i < numeroThreads; i++) {
                int inicio = i * tamanhoChunk;
                int fim = (i == numeroThreads - 1) ? dados.size() : (i + 1) * tamanhoChunk;
                
                CompletableFuture<List<T>> tarefa = CompletableFuture.supplyAsync(() -> 
                    dados.subList(inicio, fim)
                         .stream()
                         .filter(criterio)
                         .collect(Collectors.toList())
                );
                
                tarefas.add(tarefa);
            }
            
            // Combina resultados
            return tarefas.stream()
                         .map(CompletableFuture::join)
                         .flatMap(List::stream)
                         .collect(Collectors.toList());
        }
    }
    
    /**
     * Índice invertido para busca textual eficiente
     */
    public static class IndiceInvertido {
        private final Map<String, Set<Integer>> indice;
        private final List<String> documentos;
        
        public IndiceInvertido() {
            this.indice = new HashMap<>();
            this.documentos = new ArrayList<>();
        }
        
        public void adicionarDocumento(String documento) {
            int id = documentos.size();
            documentos.add(documento);
            
            // Tokenização simples
            String[] palavras = documento.toLowerCase()
                                       .replaceAll("[^a-zA-Z0-9\\s]", "")
                                       .split("\\s+");
            
            for (String palavra : palavras) {
                if (!palavra.isEmpty()) {
                    indice.computeIfAbsent(palavra, k -> new HashSet<>()).add(id);
                }
            }
        }
        
        public List<String> buscar(String termo) {
            String termoLimpo = termo.toLowerCase().trim();
            Set<Integer> ids = indice.getOrDefault(termoLimpo, Collections.emptySet());
            
            return ids.stream()
                     .map(documentos::get)
                     .collect(Collectors.toList());
        }
        
        public List<String> buscarFrase(String frase) {
            String[] palavras = frase.toLowerCase().split("\\s+");
            
            if (palavras.length == 0) return Collections.emptyList();
            if (palavras.length == 1) return buscar(palavras[0]);
            
            // Intersecção dos conjuntos de IDs
            Set<Integer> resultado = new HashSet<>(indice.getOrDefault(palavras[0], Collections.emptySet()));
            
            for (int i = 1; i < palavras.length; i++) {
                Set<Integer> ids = indice.getOrDefault(palavras[i], Collections.emptySet());
                resultado.retainAll(ids);
            }
            
            return resultado.stream()
                           .map(documentos::get)
                           .filter(doc -> doc.toLowerCase().contains(frase.toLowerCase()))
                           .collect(Collectors.toList());
        }
    }
}
```

---

## 📝 Exercícios Práticos

### Exercício 1: Sistema de Busca de Biblioteca

```java
/**
 * Implemente um sistema de busca para uma biblioteca digital
 */
public class BibliotecaDigital {
    
    public record Livro(
        String isbn,
        String titulo,
        String autor,
        String categoria,
        int anoPublicacao,
        List<String> palavrasChave
    ) {}
    
    // TODO: Implementar busca por ISBN (deve ser O(1))
    public Livro buscarPorISBN(String isbn) {
        // Usar hash table para busca eficiente
        return null;
    }
    
    // TODO: Implementar busca por título (pode usar busca binária se ordenado)
    public List<Livro> buscarPorTitulo(String titulo) {
        // Considerar busca parcial e case-insensitive
        return null;
    }
    
    // TODO: Implementar busca por múltiplos critérios
    public List<Livro> buscarAvancada(String autor, String categoria, int anoMinimo, int anoMaximo) {
        // Combinar múltiplos índices para otimizar
        return null;
    }
    
    // TODO: Implementar busca por palavras-chave com ranking
    public List<Livro> buscarPorPalavrasChave(String... palavras) {
        // Ordenar por relevância (quantidade de palavras-chave encontradas)
        return null;
    }
}
```

### Exercício 2: Otimização de Algoritmos

```java
/**
 * Compare e otimize diferentes implementações de busca
 */
public class DesafioBusca {
    
    // TODO: Implementar busca ternária (alternativa à busca binária)
    public static int buscaTernaria(int[] array, int valor) {
        // Divide o array em 3 partes ao invés de 2
        return -1;
    }
    
    // TODO: Implementar busca exponencial
    public static int buscaExponencial(int[] array, int valor) {
        // Encontra o intervalo onde o elemento pode estar, depois usa busca binária
        return -1;
    }
    
    // TODO: Implementar busca interpolada
    public static int buscaInterpolada(int[] array, int valor) {
        // Estima a posição baseada na distribuição dos dados
        return -1;
    }
    
    // TODO: Criar benchmark comparando todos os algoritmos
    public static void compararAlgoritmos(int[] array, int[] valoresBusca) {
        // Medir tempo de execução de cada algoritmo
        // Contar número de comparações
        // Analisar casos onde cada um é melhor
    }
}
```

---

## ✅ Boas Práticas

### 1. **Escolha do Algoritmo Adequado**

```java
public class EscolhaAlgoritmo {
    
    /**
     * Guia para escolha do algoritmo de busca
     */
    public static <T> List<T> buscarOtimizada(
            List<T> dados, 
            Predicate<T> criterio, 
            boolean dadosOrdenados,
            Function<T, Comparable> chaveOrdenacao) {
        
        // Para listas pequenas, busca sequencial é eficiente
        if (dados.size() < 50) {
            return dados.stream()
                       .filter(criterio)
                       .collect(Collectors.toList());
        }
        
        // Para listas grandes ordenadas, considerar busca binária
        if (dadosOrdenados && chaveOrdenacao != null) {
            // Implementar busca binária customizada
            return buscarBinariaCustomizada(dados, criterio, chaveOrdenacao);
        }
        
        // Para listas grandes não ordenadas, considerar paralelização
        if (dados.size() > 10000) {
            return dados.parallelStream()
                       .filter(criterio)
                       .collect(Collectors.toList());
        }
        
        // Caso padrão: busca sequencial
        return dados.stream()
                   .filter(criterio)
                   .collect(Collectors.toList());
    }
    
    private static <T> List<T> buscarBinariaCustomizada(
            List<T> dados, 
            Predicate<T> criterio, 
            Function<T, Comparable> chave) {
        // Implementação específica para dados ordenados
        return new ArrayList<>(); // Placeholder
    }
}
```

### 2. **Tratamento de Casos Especiais**

```java
public class TratamentoCasos {
    
    /**
     * Busca robusta com tratamento de edge cases
     */
    public static <T> Optional<T> buscarSegura(
            List<T> lista, 
            Predicate<T> criterio) {
        
        // Validação de entrada
        if (lista == null || criterio == null) {
            throw new IllegalArgumentException("Lista e critério não podem ser null");
        }
        
        if (lista.isEmpty()) {
            return Optional.empty();
        }
        
        try {
            return lista.stream()
                       .filter(Objects::nonNull) // Filtra elementos null
                       .filter(criterio)
                       .findFirst();
        } catch (Exception e) {
            // Log do erro
            System.err.println("Erro durante busca: " + e.getMessage());
            return Optional.empty();
        }
    }
    
    /**
     * Busca com timeout para evitar operações muito longas
     */
    public static <T> CompletableFuture<List<T>> buscarComTimeout(
            List<T> dados, 
            Predicate<T> criterio, 
            Duration timeout) {
        
        return CompletableFuture
            .supplyAsync(() -> dados.stream()
                                  .filter(criterio)
                                  .collect(Collectors.toList()))
            .orTimeout(timeout.toMillis(), TimeUnit.MILLISECONDS)
            .exceptionally(throwable -> {
                System.err.println("Busca cancelada por timeout: " + throwable.getMessage());
                return Collections.emptyList();
            });
    }
}
```

### 3. **Métricas e Monitoramento**

```java
public class MetricasBusca {
    
    public static class EstatisticasBusca {
        private long totalBuscas = 0;
        private long tempoTotalMs = 0;
        private long buscasComSucesso = 0;
        private final Map<String, Long> contagemPorTipo = new ConcurrentHashMap<>();
        
        public void registrarBusca(String tipo, long tempoMs, boolean sucesso) {
            totalBuscas++;
            tempoTotalMs += tempoMs;
            contagemPorTipo.merge(tipo, 1L, Long::sum);
            
            if (sucesso) {
                buscasComSucesso++;
            }
        }
        
        public void imprimirRelatorio() {
            System.out.println("=== RELATÓRIO DE BUSCAS ===");
            System.out.println("Total de buscas: " + totalBuscas);
            System.out.println("Taxa de sucesso: " + 
                String.format("%.2f%%", (double) buscasComSucesso / totalBuscas * 100));
            System.out.println("Tempo médio: " + 
                String.format("%.2f ms", (double) tempoTotalMs / totalBuscas));
            
            System.out.println("\nDistribuição por tipo:");
            contagemPorTipo.forEach((tipo, count) -> 
                System.out.println("  " + tipo + ": " + count + " buscas"));
        }
    }
    
    /**
     * Wrapper que adiciona métricas a qualquer função de busca
     */
    public static <T> Function<String, List<T>> comMetricas(
            Function<String, List<T>> funcaoBusca,
            EstatisticasBusca estatisticas,
            String tipoOperacao) {
        
        return termo -> {
            long inicio = System.currentTimeMillis();
            
            try {
                List<T> resultado = funcaoBusca.apply(termo);
                long tempo = System.currentTimeMillis() - inicio;
                
                estatisticas.registrarBusca(tipoOperacao, tempo, !resultado.isEmpty());
                return resultado;
                
            } catch (Exception e) {
                long tempo = System.currentTimeMillis() - inicio;
                estatisticas.registrarBusca(tipoOperacao, tempo, false);
                throw e;
            }
        };
    }
}
```

---

## 📚 Recursos Adicionais

### **Conteúdo Complementar**
- 🎥 **Vídeo**: "Pesquisa Binária em Vetores Parte 1 - Funcionamento" - Canal Bóson Treinamentos (YouTube)

### **Bibliografia**
- ASCENCIA, A. F. G.; CAMPOS, E. A. V. de. **Fundamentos da programação: algoritmos, Pascal, C/C++ e Java**. 2. ed. Pearson, 2007.
- DEITEL, H. M.; DEITEL, P. J.; CHOFFNES, D. R. **Sistemas operacionais**. 3. ed. Pearson, 2005.
- FORBELLONE, A. L. V.; EBERSPACHER, H. F. **Lógica de programação: a construção de algoritmos e estruturas de dados**. 3. ed. Pearson, 2005.
- PUGA, S.; RISSETTI, G. **Lógica de programação e estruturas de dados, com aplicações em Java**. Pearson, 2016.

### **Próximos Passos**
1. 🔄 **Implemente** os exercícios práticos propostos
2. 📊 **Analise** a performance dos diferentes algoritmos
3. 🚀 **Explore** estruturas de dados avançadas (B-trees, Tries)
4. 💡 **Desenvolva** sistemas de busca para projetos reais

---

## 🎯 Resumo Executivo

| Algoritmo | Complexidade | Pré-requisitos | Melhor Para |
|-----------|-------------|----------------|-------------|
| **Busca Sequencial** | O(n) | Nenhum | Listas pequenas, dados não ordenados |
| **Busca Binária** | O(log n) | Dados ordenados | Listas grandes ordenadas |
| **Hash Table** | O(1) médio | Função hash boa | Busca por chave única |
| **Árvore Binária** | O(log n) médio | Balanceamento | Dados dinâmicos ordenados |
| **Índice Invertido** | O(1) + O(k) | Pré-processamento | Busca textual |

---

*Este guia fornece uma base sólida para compreender e implementar mecanismos de busca eficientes em Java. A escolha do algoritmo adequado depende das características dos dados e dos requisitos de performance da aplicação.*