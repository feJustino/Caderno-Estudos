# Elementos de armazenamento
Elementos de armazenamento são cruciais em circuitos digitais para armazenar informações sobre o estado do sistema. O diagrama de estado é uma ferramenta valiosa para representar visualmente as diferentes transições e saídas de um circuito sequencial.
## Circuitos Combinacionais e Sequenciais
Os circuitos digitais podem ser classificados em duas categorias principais: **circuitos combinacionais** e **circuitos sequenciais**.
- Circuitos combinacionais: A saída depende apenas das entradas atuais. Exemplos incluem portas lógicas, multiplexadores e decodificadores.
- Circuitos sequenciais: A saída depende das entradas atuais e do estado anterior do circuito. Esses circuitos possuem memória e são capazes de armazenar informações. Exemplos incluem flip-flops, registradores e contadores.

> Estado -> Conjunto de variaveis; Informação do passado; comportamento futuro;
## Flip-Flops e Latches
- **Latches**: São dispositivos de armazenamento que mantêm seu estado enquanto uma condição de controle é verdadeira. São sensiveis ao nível dos sinais de entrada. Existem dois tipos principais de latches: SR (Set-Reset) e D (Data).
- **Flip-Flops**: São dispositivos de armazenamento que mudam seu estado apenas em resposta a um sinal de clock. São sensiveis á borda do sinais de entrada de controle. Os tipos mais comuns de flip-flops são o D flip-flop e o JK flip-flop.

## Latchs RS
- A entrada periodica é **alimenta** o estado atual e a saída do estado atual é a alimentação do circuito combinacional que por sua vez sua saída é a realimentação do dispositivo de memória
- Dispositivo que trata exatamente dessa questão de carregamento
- Duas categorias
  - Ativo Alto
  - Ativo Baixo


| S | R | Q(t) | Q(t+1) |Observação|
|---|---|------|--------|-----------|
| 0 | 0 | Q(t) | Q(t)   | Mantém o estado atual |
| 0 | 1 | Q(t) | 0      | Reseta o estado para 0 |
| 1 | 0 | Q(t) | 1      | Seta o estado para 1 |
| 1 | 1 | Q(t) | Indefinido | Estado inválido |

## Latchs D com enable
- Enable -> habilita o funcionamento
- Parecido ao Latch SR ativo-alto
- A entrada S é substuida por D
- A entrada R é substituido por D negado
- Com enbable inativo a saída se mantem constante
- Com enable ativo, a saída Q tera o mesmo valor da entrada D
- O enable não pode ficar ativo por muito tempo, se não o circuito entra em looping tornando a saida instavel
- Enable deve ser um pulso curto, ou seja, um pulso de clock (instante de tempo)

## Flip-Flops
 
- São dispositivos de memorias que armazenam valores em instantes bem definidos.
- Clock -> sinal de controle que sincroniza as mudanças de estado do flip-flop
- Para analisar utilizamos uma notação Q = estado atual e Q* = estado futuro
- Q* depende apenas do estado atual
- 4 tipos de flip-flops: D, JK, T e SR
- O flip-flop D (data) é o mais simples, onde a saída Q segue a entrada D
- O flip-flop T (toggle) alterna seu estado a cada pulso de clock quando a entrada T está ativa
- O flip-flop SR (set-reset) tem entradas de controle para setar ou resetar o estado, mas é menos comum devido à possibilidade de estados indefinidos
- O flip-flop JK é uma versão aprimorada do SR, onde as entradas J e K controlam o estado de forma mais flexível, evitando estados indefinidos

## Clear e Preset

- Clear (CLR) e Preset (PR) são sinais de controle adicionais usados para forçar o estado do flip-flop a um valor específico, independentemente do clock ou das entradas normais.
- Levam o valor do estado atual a dois niveis respectivamente de forma independenete do clock
- Clear leva a 0
- Preset leva a 1
- Geralmente essas portas não são muito utilizadas na lógica de funcionamento, fazem parte mas não são essenciais para o funcionamento do circuito, são mais utilizadas para teste e depuração 