## Álgebra Booleana

A **Álgebra Booleana** é uma representação matemática utilizada para modelar sistemas lógicos digitais.
Trabalha com apenas dois valores possíveis:

* **0** → falso
* **1** → verdadeiro

Ela é a base dos circuitos digitais.

**Diagrama lógico:** representação gráfica de um circuito lógico, utilizando portas como AND, OR e NOT.

---

# Postulados

Postulados são **princípios fundamentais** que formam a base da Álgebra Booleana. A partir deles, todas as demais regras e propriedades são derivadas.

### 1) Postulado da Complementação

Relaciona-se com a operação de negação (porta NOT).

* Se **A = 0**, então **¬A = 1**
* Se **A = 1**, então **¬A = 0**

Também inclui:

* **A + ¬A = 1**
* **A · ¬A = 0**

---

### 2) Postulado da Identidade (Involução)

Negar duas vezes retorna ao valor original:

* **¬(¬A) = A**

---

### 3) Postulado da Adição (OR)

Define o comportamento da operação OR:

* **A + 0 = A**
* **A + 1 = 1**

#### Identidade da Adição

* **A + 0 = A**

---

### 4) Postulado da Multiplicação (AND)

Define o comportamento da operação AND:

* **A · 1 = A**
* **A · 0 = 0**

#### Identidade da Multiplicação

* **A · 1 = A**

---

### 5) Idempotência

* **A · A = A**
* **A + A = A**

---

# Propriedades

As **propriedades** são regras que descrevem como as operações lógicas se comportam.

Elas **não são fundamentais como os postulados**, mas sim **derivadas a partir deles**.

Exemplos de propriedades:

* **Comutativa**

> A ordem dos fatores não alteram o resultado

  * A + B = B + A
  * A · B = B · A

* **Associativa**
  
  * (A + B) + C = A + (B + C)
  * (A · B) · C = A · (B · C)

* **Distributiva**

> 

  * A · (B + C) = (A · B) + (A · C)
  * A + (B · C) = (A + B) · (A + C)

## Teorema de Morgan
- Conjunto de Leis
- Facilitam operações
### Primeira Lei de De Morgan: Complemento do Produto

A Primeira Lei de De Morgan aborda o complemento do produto, exemplificando com duas entradas (A e B) e suas operações, incluindo a negação do produto e a soma dos valores negados.

### Segunda Lei de De Morgan: Complemento da Soma

A Segunda Lei de De Morgan trata do complemento da soma, utilizando as mesmas entradas (A e B) e demonstrando o processo com a negação da soma e a multiplicação dos valores negados.