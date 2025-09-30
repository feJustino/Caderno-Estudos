# Teoria da Computação

## Limites da Computação

Computadores resolvem uma série de problemas e tarefas, mas há problemas e tarefas que eles não conseguem realizar.

Em Teoria da Computação, estudamos, entre outros temas, os limites da Computação, procurando identificar se um problema pode ser resolvido por uma máquina e a que preço, não só em termos de tempo de processamento, mas também em número de operações computacionais.

Problemas que têm solução computacional equivalente a funções matemáticas exponenciais costumam ser muito complicados ou mesmo irrealizáveis.

Funções exponenciais crescem muito rápido. Veja o que aconteceria se fôssemos preencher um tabuleiro de xadrez seguindo a ideia de que, a cada casa, teríamos o dobro de elementos da casa anterior:

Cada casa contém \(2^n\) elementos. Se fôssemos representar grãos de areia, não demoraria para, ao término de preencher o tabuleiro, termos mais grãos de areia do que a quantidade total que existe no planeta Terra! Assim, soluções exponenciais para certos problemas são muito difíceis de serem tratadas, mesmo por um computador.

### O problema do Caixeiro Viajante: um clássico da Computação

Um vendedor precisa visitar um certo número de cidades e retornar para casa ao fim do dia. Para elevar seus ganhos, precisa percorrer o itinerário mais curto entre essas cidades. Sabe-se qual a distância entre cada uma das cidades.

Exemplo: Percorrer as cidades A, B, C, D e depois retornar à cidade de origem A.

A velocidade para se encontrar o menor percurso entre um conjunto de cidades depende do computador usado e do número de cidades!

- Para 3 cidades existem \(3!\) combinações possíveis, isto é, 6 combinações para serem testadas.
- Para 10 cidades existem \(10!\) combinações, mais de 3 milhões de combinações!

---

## Crescimento Assintótico

Problemas semelhantes ao do Caixeiro Viajante são de extrema importância para a indústria. Considere, por exemplo, as várias etapas envolvidas na montagem de um motor, que devem ser efetuadas em uma certa ordem - esse é conhecido como o **Problema do Sequenciamento de Tarefas**.

O crescimento da função é exponencial e extremamente trabalhoso, mesmo para um computador. Daí a importância da análise de complexidade de algoritmos: estudar meios para se conhecer melhor os problemas e os limites de suas soluções.

Na análise de algoritmos, não interessa a velocidade do computador, mas sim o número de passos computacionais envolvidos.

Soluções computacionais (algoritmos) que operam em velocidade logarítmica, linear ou polinomial são incomparavelmente menos custosas computacionalmente do que algoritmos que operam de forma exponencial. Veja a tabela abaixo, em que \(N\) representa o número de elementos de entrada envolvidos e o processamento de cada instrução é um bilionésimo de segundo:

| \(N\) | Logarítmico \(\log N\) | Linear \(N\) | Quadrático \(N^2\) | Exponencial \(2^N\) |
|--------|--------------------------|-------------|--------------------|-------------------|
| 10     | 0.00000001              | 0.00000001  | 0.0000001          | 0.001            |
| 20     | 0.00000002              | 0.00000002  | 0.0000004          | 1.0              |
| 30     | 0.00000003              | 0.00000003  | 0.0000009          | 1000.0           |

Graficamente, repare que, a partir de um certo tamanho \(N\) de entrada, a função exponencial cresce muito mais rápido.

---

## Buscas e Ordenações

Se você pensar bem, quase tudo que fazemos em termos de computação é a busca de elementos em uma lista ou a ordenação de elementos em uma lista!

### Busca sequencial ou linear

A busca sequencial ou linear é muito importante em estudos comparativos de análise de algoritmos. Dada uma lista de elementos, procura-se saber se um determinado elemento está na lista ou não.

Percebe-se que a busca sequencial é um algoritmo pouco eficiente para encontrar um item em uma lista grande de elementos. No pior caso, todos os elementos devem ser visitados apenas para se descobrir que o elemento não estava na lista!

### Busca binária

Neste caso, a lista está previamente ordenada. O método faz sucessivas divisões na lista, comparando com o valor maior da primeira lista e descartando metade da lista até encontrar o elemento que está procurando.

#### Comparando busca sequencial com busca binária

- Se a lista não está ordenada, a busca binária não se aplica.
- A busca sequencial é muito ineficiente para conjuntos grandes de valores.

Costuma-se dizer que a busca sequencial tem complexidade \(N\) e que a busca binária tem complexidade \(\log N\), fazendo muito menos comparações a partir de um certo \(N\) de entrada. O gráfico da busca binária cresce mais devagar, fazendo deste método mais eficiente do que a busca sequencial.

---

## Máquinas de Turing

É um dispositivo imaginário que formou a estrutura para fundamentar a ciência da computação moderna.

Em 1936, foi formalizado o termo algoritmo: um conjunto finito de instruções simples e precisas, que são descritas com um número finito de símbolos. “Qualquer processo aceito por nós homens como um algoritmo é precisamente o que uma máquina de Turing pode fazer” (Alonzo Church, matemático).

### Exemplo de Máquina de Turing

As duas primeiras instruções (linhas 1 e 2) descrevem o que acontecerá no estado \(s_0\). Há duas possibilidades: na primeira, a máquina faz a leitura de um dígito ‘1’, movimentará a cabeça para a direita e permanecerá no estado \(s_0\). Na segunda, se for lido um dígito ‘0’, a máquina deixará o estado \(s_0\), entrará no estado \(s_1\) e escreverá o dígito ‘1’ nessa transição.

Linhas 3 e 4 mostram o que acontecerá no estado \(s_1\), ou seja, se for lido o dígito ‘1’, a máquina movimentará a cabeça para a esquerda e permanecerá no estado \(s_1\). Se for lido o dígito ‘0’, a cabeça será movimentada para a direita e a máquina passará para o estado \(s_2\).

Como não há instruções definidas pelo algoritmo no estado \(s_2\), a máquina para a sua execução (condição de parada) ao atingir este estado.

A máquina de Turing Universal incorpora o princípio essencial do computador: uma máquina simples que poderá executar qualquer tarefa bem definida, desde que especificada com um programa apropriado.

---

## Autômatos Finitos

### Portas automáticas e elevadores

Um estado pode representar em qual estado o elevador está e as entradas podem ser os sinais recebidos dos botões. Tal computador precisaria de poucos bits para guardar essa informação.

Dispositivos desse tipo requerem que se utilize a metodologia e a terminologia de autômatos finitos. Modelos para computadores quando existe pouca disponibilidade de memória. Esses computadores estão no coração de vários dispositivos eletromecânicos (forno de micro-ondas, máquinas de lavar, portas automáticas, elevadores).

### Definições formais

#### Alfabeto

Qualquer conjunto finito não vazio constituído por caracteres.

Exemplo:

- \(\Sigma_1 = \{0, 1\}\)
- \(\Sigma_2 = \{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p\}\)

#### Cadeia sobre um alfabeto

Sequência finita de símbolos de um alfabeto.

Exemplo:

- \(010011\) é uma cadeia sobre \(\Sigma_1\).
- \(abracadabra\) é uma cadeia sobre \(\Sigma_2\).

### Um autômato de 3 estados

Diagrama de estado \(M_1\). O autômato tem 3 estados, \(q_1, q_2, q_3\). O estado inicial \(q_1\) é indicado pela seta apontando para ele a partir do nada. O estado de aceitação \(q_2\) é aquele com círculo duplo. As setas saindo de um estado para o outro são chamadas de transições.

Quando o autômato recebe uma cadeia de entrada tal como \(1101\), ele processa essa cadeia e produz uma saída. A saída será aceita se estiver no estado de aceitação ou rejeitada, caso contrário.

Exemplo:

- Entrada: \(1101\) → **ACEITA!**
- Entrada: \(0011110\) → **NÃO ACEITA!**

Essa máquina aceita \(1, 01, 11, 0101010101\), entre infinitas outras. Na verdade, ela aceita qualquer cadeia que termine com o símbolo \(1\), pois ela vai para o estado de aceitação sempre que lê o símbolo \(1\). Aceita também cadeias que terminem com um número par de \(0\)'s, seguindo o último \(1\).

---

## Referência Bibliográfica

BROOKSHEAR, J.G. Ciência da Computação: uma visão abrangente. Porto Alegre: Bookman, 2013.

CORMEN, Thomas H. Algoritmos. Rio de Janeiro, Gen LTC, s/a.