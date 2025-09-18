# Fundamentos de Bancos de Dados

Os bancos de dados são parte fundamental do mundo moderno. Sempre que você faz um saque em um caixa eletrônico, compra algo em uma loja online, reserva um quarto de hotel ou acessa suas redes sociais, existe um banco de dados funcionando por trás dessas operações. Eles permitem que informações sejam armazenadas, organizadas e acessadas de forma rápida, segura e eficiente.

Este estudo organiza os principais conceitos de bancos de dados em uma linguagem simples, mas sem perder profundidade.

---

## Dados vs Informação

* **Dados**: são fatos brutos, números ou símbolos que, por si só, podem não ter muito significado.

  * Exemplo: `2021`, `35`, `Maria`.

* **Informação**: surge quando os dados são organizados e interpretados em um contexto.

  * Exemplo: “Maria tem 35 anos e iniciou sua graduação em 2021.”

Um agricultor pode armazenar apenas números de sacas colhidas por ano (dados quantitativos), mas ao registrar também fatores como cheias, clima e variações de plantio, ele transforma esses dados em **informações qualitativas**. Assim, ele pode tomar decisões mais inteligentes, como planejar culturas em períodos de menor risco de enchentes.

---

## Entidades, Atributos, Valores e Relacionamentos

Esses são os blocos fundamentais da modelagem de dados, especialmente no **modelo relacional**.

### Entidades

Uma entidade é algo do mundo real que você deseja representar no banco. Pode ser:

* **Objeto concreto**: Cliente, Produto, Carro.
* **Evento ou relação**: Matrícula, Venda, Casamento.

No **SQL**, cada entidade vira uma **tabela**, e cada linha da tabela representa uma **instância** da entidade.

* **Entidades como objetos**: objetos do mundo real tratados como unidades únicas. Exemplo: em um restaurante, não faz sentido registrar cada grão de arroz; usamos apenas o prato servido como entidade.
* **Entidades como relacionamentos**: relações também podem ser entidades, quando contêm informações próprias. Exemplo: a entidade **Venda** conecta **Cliente** e **Produto**, mas também possui atributos como data e valor.

---

### Atributos

* Os atributos são as **características das entidades**.
* No SQL, viram **colunas da tabela**.
* Exemplos:

  * Entidade **Aluno** → atributos: nome, matrícula, idade.
  * Entidade **Produto** → atributos: código, descrição, preço.

A famosa frase de Leibniz se aplica aqui: *uma entidade é a soma de seus atributos*.

---

### Valores

* Cada **atributo** assume um **valor** em cada instância.
* Exemplo:

  * Aluno: (nome = “Maria”, idade = 20).

Esses valores vêm de **tipos de dados** ou **domínios**:

* **Tipo de dado**: conjunto de valores pré-definidos pelo SGBD (ex.: `INT`, `VARCHAR`, `DATE`). Já possuem operadores nativos, como soma ou comparação.
* **Domínio**: subconjunto mais específico de um tipo de dado, definido pelo projetista.

  * Exemplo:

    * Tipo de dado: `INT`
    * Domínio: idades entre 0 e 120.
    * Outro domínio: CPF (baseado em `VARCHAR(11)`, mas com regra de validação).

---

### Relacionamentos

Relacionamentos conectam entidades e podem ter atributos próprios.

* **1:1 (um para um)**: Um funcionário ↔ sua ficha.
* **1\:N (um para muitos)**: Um cliente ↔ vários pedidos.
* **N\:M (muitos para muitos)**: Alunos ↔ Disciplinas (um aluno cursa várias disciplinas, e uma disciplina pode ter vários alunos).

Em 1976, **Peter Chen** introduziu a modelagem **Entidade-Relacionamento (ER)**, representando entidades em retângulos, relacionamentos em losangos e atributos em elipses. Essa técnica é usada até hoje como padrão para projeto de bancos de dados.

---

## Modelo Relacional

O **modelo relacional**, proposto por Edgar F. Codd, organiza os dados em **tabelas (relações)**, compostas por **linhas (tuplas)** e **colunas (atributos)**.

* **Tabela**: representa uma entidade ou relacionamento.
* **Tupla (linha)**: representa um registro individual.
* **Coluna (atributo)**: representa uma propriedade da entidade.
* **Esquema da relação**: nome da tabela + conjunto de atributos.
* **Cardinalidade**: número de linhas em uma tabela.
* **Grau**: número de colunas em uma tabela.
* **Instância de relação**: conjunto de tuplas existentes em determinado momento.
* **Chave primária**: atributo que identifica unicamente uma tupla.
* **Chave estrangeira**: atributo que conecta uma tabela a outra.

---

## Restrições de Integridade

Para manter os dados **corretos e consistentes**, aplicam-se restrições:

1. **De domínio**: cada atributo deve assumir apenas valores válidos de seu domínio.

   * Exemplo: idade não pode ser negativa.

2. **De chave**: garante que cada tupla seja única na tabela.

   * Exemplo: duas pessoas não podem ter o mesmo número de CPF.

3. **De integridade referencial**: uma chave estrangeira deve sempre se referir a uma chave primária existente.

   * Exemplo: um pedido não pode referenciar um cliente que não existe.

---

## Operações no Modelo Relacional

Principais operações que manipulam dados em SQL:

* **INSERT**: insere novas tuplas.
* **DELETE**: remove tuplas.
* **UPDATE**: modifica valores existentes.
* **SELECT**: consulta dados.

Todas essas operações devem respeitar as **restrições de integridade** para evitar inconsistências.

---

## Práticas de Modelagem Relacional

* Representar os dados como relações (tabelas).
* Nomear colunas de forma única e significativa.
* Cada célula deve conter apenas um valor (valores atômicos).
* Evitar redundância (linhas duplicadas).
* Garantir que todos os atributos pertençam a domínios bem definidos.

---

## Vantagens do Modelo Relacional

* **Simplicidade**: estrutura em tabelas é intuitiva.
* **Independência de dados**: alterações na estrutura não exigem mudanças nas aplicações.
* **Capacidade de consulta**: SQL permite consultas complexas de forma simples.
* **Escalabilidade**: lida bem com grandes volumes de dados.
* **Segurança**: controle de acesso e integridade.

## Desvantagens

* Pode ser **complexo** em cenários de muitos relacionamentos.
* Alguns sistemas impõem **limites de tamanho** para campos.
* Consultas muito complexas podem ter **baixo desempenho**.

---

## Banco de Dados Orientados a Objetos (BDOO)

Para superar limitações do modelo relacional, surgiram os bancos orientados a objetos, que unem conceitos de **POO (Programação Orientada a Objetos)** e bancos de dados.

* Os dados são armazenados como **objetos** com atributos e métodos.
* Suportam **herança, encapsulamento e polimorfismo**.
* São úteis para aplicações avançadas, como CAD, multimídia e simulações.

Exemplos de SGBDOO: **ObjectStore, Versant, Caché, GEMSTONE**.

---

## SQL vs NoSQL

* **SQL**: bancos relacionais, estruturados em tabelas (MySQL, PostgreSQL, Oracle).
* **NoSQL**: bancos não relacionais, mais flexíveis, que usam documentos, grafos ou chave-valor (MongoDB, Cassandra, Redis).

A escolha depende das necessidades do projeto:

* SQL → ideal para consistência e estrutura rígida.
* NoSQL → ideal para escalabilidade e dados sem estrutura fixa.

---

## ACID vs BASE

* **ACID** (Atomicidade, Consistência, Isolamento, Durabilidade): garante transações confiáveis em bancos relacionais.
* **BASE** (Basicamente Disponível, Estado Soft, Eventualmente Consistente): prioriza disponibilidade e escalabilidade, típico de bancos NoSQL.

---

## Conclusão

O estudo de bancos de dados envolve compreender desde conceitos básicos de **dados e informação**, passando por **entidades, atributos, valores e relacionamentos**, até os diferentes **modelos de dados** (relacional, orientado a objetos, NoSQL).

Dominar esses fundamentos é essencial para quem está começando em Ciência da Computação, pois quase todas as aplicações modernas dependem de bancos de dados robustos, consistentes e bem projetados.
_________
> Referência Bibliográfica: ELMASRI, Ramez. Sistemas de banco de dados. São Paulo: Pearson Addison Wesley, 2015.