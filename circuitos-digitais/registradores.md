## O que são registradores?

Registradores são circuitos digitais que armazenam dados temporariamente. Eles são compostos por flip-flops, que são dispositivos de armazenamento de um bit. Os registradores podem ser usados para armazenar dados de entrada, resultados intermediários ou resultados finais em um circuito digital.

## Formação de registradores

Os registradores podem ser formados por uma combinação de flip-flops. Por exemplo, um registrador de 4 bits pode ser formado por 4 flip-flops, onde cada flip-flop armazena um bit de informação. Os registradores podem ser organizados em diferentes configurações, como registradores de deslocamento, registradores de carga paralela, entre outros.

- Load
- Shift
- Clear
- Enable
  Essas entrada facilitam
  Registradores em sua maioria são construidos utilizando flip-flops do tipo D, pois eles permitem a transferência de dados de forma síncrona. Os registradores podem ser usados em uma variedade de aplicações, como armazenamento de dados, contadores, e unidades de processamento em computadores.

## Transferencia sincrona de dados

- Sinc esta relacionado ao clock
- Clock em comum
- Depdende do que você utiliza -> RealTime x Assinc
- Saida X se torna a entrada do prox flip-flop
- O clock é o sinal que sincroniza a transferência de dados entre os flip-flops em um registrador. Quando o clock é acionado, os dados armazenados em um flip-flop são transferidos para o próximo flip-flop na cadeia, permitindo que os dados sejam movidos de forma síncrona através do registrador. Isso é essencial para garantir que os dados sejam transferidos de maneira ordenada e sem erros, especialmente em circuitos digitais complexos onde múltiplos registradores estão interconectados.

**Transferência Síncrona de Dados com Flip-Flops**

A transferência síncrona de dados utiliza um clock comum e pode ser realizada com flip-flops do tipo D, conectando a saída de um à entrada do outro, possibilitando a transferência de dados de forma simples.

**Exemplo de Circuito de Transferência de Dados e Funcionamento**

Um circuito de transferência de dados pode ser construído com registradores interconectados, onde a saída de um alimenta a entrada do outro. A soma do conteúdo dos registradores gera saídas que, quando um pulso de transferência é acionado, são armazenadas em um dos registradores.

## Capacidade

- **Capacidade de armazenamento**:
  A capacidade de um registrador é determinada pelo número de bits que ele pode armazenar. Por exemplo, um registrador de 4 bits pode armazenar 16 combinações diferentes de dados (de 0000 a 1111), enquanto um registrador de 8 bits pode armazenar 256 combinações (de 00000000 a 11111111). A capacidade do registrador é importante para determinar a quantidade de dados que podem ser processados ou armazenados em um circuito digital.
- **Capacidade de deslocamento**:
  Indica o tipo do movimento que podemos relizar nos dados a cada ciclo de clock. Por exemplo, um registrador de deslocamento pode mover os dados para a esquerda ou para a direita, dependendo do tipo de operação que está sendo realizada. A capacidade de deslocamento é importante para operações como multiplicação ou divisão por potências de 2, onde os bits são deslocados para realizar a operação.

## Tipos de registradores

- **Registradores de entradas e saidas seriais**:
- **Registradores de entradas paralela e saidas seriais**:
- **Registradores de entradas serial e saidas paralela**:
- **Registradores de entradas e saidas paralela**:
- **Registradores de rotação**:
