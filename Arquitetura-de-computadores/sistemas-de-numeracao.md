## Sistemas de numeração
### Bits & Bytes
- Bit = 0 ou 1 (Aberto ou Fechado)
- Byte = 8xBit
    - 11111111 = 255

Um bit representa um dígito binário, 0 ou 1, enquanto um byte é um conjunto de 8 bits. A linguagem de máquina é baseada em sequências de bits que representam instruções e dados. Arquivos de computador possuem tamanhos medidos em bytes e seus múltiplos (KB, MB, GB, TB).
### Grandezas de armazenamento de informação

|Espaço | Unidade de medida | Numero de caracteres|
|-------|---------------|----------------|
| 8  Bits | 1 Byte | 1|
|1024 Byte | 1 Kilobyte | 1.024|
|1024 Kilobyte | 1 Megabyte | 1.048.576|
|1024 Megabyte | 1 Gigabyte | 1.073.741.824|
|1024 Gigabyte | 1 Terabyte | 1.099511628xel¹²|

| Grandeza        | Símbolo | Valor |
|------------------|---------|-------|
| Bit              | b       | 0 ou 1|
| Byte             | B       | 8 bits|
| Kilobyte         | KB      | 1.024 Bytes |
| Megabyte         | MB      | 1.024 KB |
| Gigabyte         | GB      | 1.024 MB |
| Terabyte         | TB      | 1.024 GB |

## Definição
A quantidade de algarismos disponives num sistema de numeração designa-se de **base**

Sistemas de numeração se diferenciam pela base, que determina a quantidade de algarismos distintos. O sistema decimal (base 10) é o mais comum, mas computadores utilizam o binário (base 2). Outros sistemas incluem o octal (base 8) e o hexadecimal (base 16), que usa letras de A a F para representar valores de 10 a 15.

Decimal (base 10)
0,1,2,3,4,5,6,7,8,9
-----------
Binario (Base 2)
0,1
-------------
Octal(base 8)
0,1,2,3,4,5,6,7
------------
HexaDecimal(Base 16)
0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F
------------

### Conversões de base decimal

#### 1. Decimal -> Binário
Basta dividir sucessivamente por 2 o número decimal e guardar os quocientes que vão sendo obtidos, até que o quociente de uma das divisões seja 0.


|Valor | Resultado | Resto|
|-------|-------|------|
|25 | 12 | 1|
|12 | 6 | 0|
|6 | 3 | 0|
|3 | 1 | 1|
|1 | 0 | 1|

**Resultado Final** = 11001

#### 2. Decimal -> Octal
A conversão de decimal para octal segue o mesmo princípio da conversão para binário, mas utilizando divisões por 8. Os restos, que variam de 0 a 7, formarão o número octal correspondente.

|Valor | Resultado | Resto|
|-------|-------|------|
|217 | 27 | 1|
|27 | 3 | 3|
|3 | 0 | 3|
**Resultado Final** = 331
|Valor | Resultado | Resto|
|-------|-------|------|
|37 | 4 | 5|
|4 | 0 | 4|
**Resultado Final** = 45

#### 3. Decimal -> hexadecimal
Na conversão de decimal para hexadecimal, as divisões são feitas por 16. Os restos de 0 a 9 são representados pelos algarismos decimais, enquanto os restos de 10 a 15 são representados pelas letras A a F, respectivamente.

|Valor | Resultado | Resto|
|-------|-------|------|
|223 | 13 | 15|
|13 | 0 | 13|
**Resultado Final** = DF

|Valor | Resultado | Resto|
|-------|-------|------|
|76 | 4 | 12|
|4 | 0 | 4|
**Resultado Final** = 4C

### Conversão de base binária, octal e hexadecimal
#### 1. Conversão de Binário para Decimal
Para converter um número binário para decimal, multiplique cada dígito binário pela potência de 2 correspondente à sua posição, começando da direita para a esquerda com a potência 0. Some os resultados para obter o equivalente decimal.

|1|1|0|0|1|
|-|-|-|-|-|
|1*2⁴|1*2³|1*2²|1*2¹|1*2⁰|
|16|8|0|0|1|
**Resultado Final** = 25

#### 2. Conversão de Binário para Octal
Para converter um número binário para octal, agrupe os dígitos binários em conjuntos de 3, começando da direita para a esquerda. Converta cada grupo de 3 bits em seu equivalente octal, lembrando que cada dígito octal representa 3 dígitos binários.

<table>
<thead>
<strong> Valor para exemplo: 110101 </strong>
</thead>
<tbody>
<tr>
<td>

|1|1|0|
|-|-|-|
|1*2²|1*2¹|0*2⁰|  
|4|2|0|
**Resultado Final** = 6

</td>
<td>

|1|0|1|
|-|-|-|
|1*2²|0*2¹|1*2⁰|  
|4|0|1|
**Resultado Final** = 5

</td>
</tr>
</tbody>
<tr>
<td>
<strong> Valor Final: 65 </strong> 
</td>
</tr>
</table>

<table>
<thead>
<strong> Valor para exemplo: 11111 </strong>
</thead>
<tbody>
<tr>
<td>

|vazio|1|1|
|-|-|-|
|0*2²|1*2¹|1*2⁰|  
|0|2|1|
**Resultado Final** = 3

</td>
<td>

|1|1|1|
|-|-|-|
|1*2²|1*2¹|1*2⁰|  
|4|2|1|
**Resultado Final** = 7

</td>
</tr>
</tbody>
<tr>
<td>
<strong> Valor Final: 37 </strong> 
</td>
</tr>
</table>

#### 3. Conversão de Binário para Hexadecimal
Para converter um número binário para hexadecimal, agrupe os dígitos binários em conjuntos de 4, começando da direita para a esquerda. Converta cada grupo de 4 bits em seu equivalente hexadecimal, lembrando que cada dígito hexadecimal representa 4 dígitos binários. Utilize letras de A a F para representar os valores de 10 a 15.



<table>
<thead>
<strong> Valor para exemplo: 01011011 </strong>
</thead>
<tbody>
<tr>
<td>

|0|1|0|1|
|-|-|-|-|
|0*2³|1*2²|0*2¹|1*2⁰|  
|0|4|0|1|
**Resultado Final** = 5

</td>
<td>

|1|0|1|1|
|-|-|-|-|
|1*2³|0*2²|1*2¹|1*2⁰|  
|8|0|2|1|
**Resultado Final** = 11 = B

</td>
</tr>
</tbody>
<tr>
<td>
<strong> Valor Final: 5B </strong> 
</td>
</tr>
</table>

<table>
<thead>
<strong> Valor para exemplo: 011011 </strong>
</thead>
<tbody>
<tr>
<td>

|vazio|vazio|1|1|
|-|-|-|-|
|0*2³|0*2²|1*2¹|1*2⁰|  
|0|0|2|1|
**Resultado Final** = 3

</td>
<td>

|1|1|0|1|
|-|-|-|-|
|1*2³|1*2²|0*2¹|1*2⁰|  
|8|4|0|1|
**Resultado Final** = 13 = D

</td>
</tr>
</tbody>
<tr>
<td>
<strong> Valor Final: 3D </strong> 
</td>
</tr>
</table>


#### 4. Conversão de Octal para Decimal
Obtida através da soma dos dígitos do número octal multiplicados pela base 8 elevada à posição colunar do dígito, começando em 0 da direita para a esquerda. Observe os exemplos para os números 331 (base 8) e 45 (base 8).


<table>
<thead>
<strong> Valor para exemplo: 331 </strong>
</thead>
<tbody>
<tr>
<td>

|3|1|1|
|-|-|-|
|1*8²|0*8¹|1*8⁰|  
|192|24|1|
**Resultado Final** = 217

</td>
</table>

#### 5. Conversão de Octal para Binário

Decompõem-se o numero octal diretamente em binários de 3 dígitos. Os zeros mais à esquerda do resultado binário podem ser omitidos

#### 6. Conversão de octal para hexadecimal

Transforma-se primeiro o octal em binário e em seguida o binário em hexadecimal

#### 7. Conversão hexadecimal para octal

Transforma-se primeiro o hexadecimal em binário e em seguida o binário em octal
#### 8. Conversão hexadecimal para decimal

Realizada através da soma dos dígitos hexadecimais multiplicados pela base 16 elevada à posição colunar contando da direita para a esquerda, começando em 0, de forma semelhante à conversão de binários em decimais


### Tabela ASCII

A tabela ASCII (American Standard Code for Information Interchange) é um padrão de codificação que atribui números a caracteres, permitindo a representação de texto em computadores e dispositivos eletrônicos. Ela inclui letras, números, sinais de pontuação e caracteres de controle, utilizando códigos de 0 a 127. Essa tabela é fundamental para a comunicação entre sistemas e a manipulação de texto em programação

Referência Bibliográfica

BROOKSHEAR, J.G. C  iência da Computação: uma visão abrangente. Porto Alegre: Bookman, 2013.

FORBELLONE, A.L.V. & EBERSPACHER, H. F.  Lógica de Programação –  A Construção de Algoritmos e Estruturas de Dados. 3ª. Edição. São Paulo, SP: Prentice Hall, 2005.