# Requisitos de Sistemas

## 1. Fatores do Desenvolvimento de Software

O desenvolvimento de software é um **processo complexo**, que envolve diferentes áreas, papéis e responsabilidades. O sucesso de um projeto depende de fatores como **comunicação eficaz**, **levantamento correto de requisitos**, **entendimento do negócio** e **colaboração entre usuários e analistas**.

### 1.1 Processo de Desenvolvimento

As etapas fundamentais de um projeto de software são:

* **Especificação:** definição clara das necessidades do cliente e das funcionalidades esperadas.
* **Desenvolvimento:** construção do sistema conforme o projeto e os requisitos definidos.
* **Validação:** verificação de que o software atende às necessidades e expectativas do cliente.
* **Manutenção:** correção de falhas, melhorias e adaptações após a implantação.

### 1.2 Equipe de Desenvolvimento

O processo envolve profissionais de **negócio** e **tecnologia**, sob orientação do **contratante (cliente)**.

* O contratante designa um profissional para acompanhar o projeto e orientar a equipe.
* Todos os níveis organizacionais devem participar, pois cada colaborador traz uma **visão única** do negócio.

**Papéis principais:**

* **Stakeholders:** pessoas ou grupos com interesse direto ou indireto no sistema (usuários, gerentes, donos da empresa, áreas financeira e jurídica etc.).
* **Usuários:** executam as ações operacionais e interagem diretamente com o sistema.
* **Analistas de Sistemas / Engenheiros de Software:** responsáveis por compreender o negócio, levantar os requisitos e projetar a solução tecnológica.

---

## 2. Relações no Processo de Desenvolvimento

### 2.1 Relação Usuário × Analista

Essa relação é essencial para o sucesso do projeto.
O usuário deve ser **receptivo** em fornecer informações claras sobre os processos de negócio.
O analista deve ser **habilidoso na comunicação**, sabendo **ouvir, interpretar e questionar**.

**Dificuldades comuns:**

* Usuários com dificuldade em expressar suas necessidades.
* Participação limitada ou resistência a novas propostas.
* Analistas focados em soluções imediatas sem entender o contexto.
* Uso de linguagem técnica que dificulta a comunicação.
* Documentação extensa e pouco compreensível.

**Boas práticas:**

* Estabelecer uma relação de confiança.
* Traduzir linguagem técnica em termos acessíveis.
* Manter a documentação concisa, atualizada e compreensível.
* Lembrar que analistas e usuários têm **pontos de vista diferentes** sobre o problema.

---

### 2.2 Riscos no Desenvolvimento

O analista deve estar atento aos fatores que podem comprometer o andamento do projeto:

| Tipo de Risco                    | Descrição                                                            |
| -------------------------------- | -------------------------------------------------------------------- |
| **Dinâmica da empresa**          | Estratégias mudam com o tempo, alterando necessidades e prioridades. |
| **Turnover**                     | Mudança de membros da equipe exige readaptação e reintegração.       |
| **Troca de usuários**            | Novos usuários podem ter visões diferentes sobre o sistema.          |
| **Foco excessivo em tecnologia** | A tecnologia deve servir ao negócio, e não o contrário.              |

---

### 2.3 Relação Analista × Negócio

O analista deve compreender profundamente o **contexto empresarial** e o **domínio da aplicação**.
Isso inclui entender:

* A aplicação atual e suas limitações.
* Os dados que suportam as operações da empresa.
* As regras, normas e leis que regem o negócio.

⚠️ **Atenção:** experiências anteriores ajudam, mas cada cliente tem seu próprio modo de trabalhar.
Evite reproduzir práticas antigas sem analisar o novo contexto.

---

## 3. Importância da Comunicação

A **comunicação eficaz** é um dos pilares do desenvolvimento de software e da engenharia de requisitos.
Ela garante entendimento mútuo entre analistas, stakeholders e usuários, reduzindo ambiguidades e retrabalho.

**Boas práticas de comunicação:**

* Estabelecer relacionamento amigável e participativo.
* Envolver os usuários ativamente em todas as etapas.
* Validar informações constantemente.
* Evitar suposições e esclarecer dúvidas.
* Utilizar métodos e ferramentas adequadas (entrevistas, questionários, workshops, brainstorming, análise de documentos, etc.).

> “A comunicação clara e consistente é o elo que conecta as necessidades do usuário às soluções tecnológicas.”

---

## 4. Requisitos — O que São?

Os **requisitos** representam as **necessidades e expectativas do usuário** em relação ao sistema.
Eles descrevem **o que o software deve fazer** e as **restrições** sob as quais deve operar.

> **Sommerville (2018):**
> “Os requisitos de um sistema são as descrições dos serviços que o sistema deve prestar e as restrições a sua operação.”

### Tipos de Requisitos

* **Funcionais:** definem as funcionalidades que o sistema deve executar.
  *Exemplo:* Cadastrar cliente, emitir nota fiscal, processar pagamento.
* **Não funcionais:** impõem restrições sobre desempenho, segurança, compatibilidade, usabilidade etc.

---

## 5. Como Identificar Requisitos

A identificação de requisitos é um **processo iterativo e investigativo**, que exige comunicação constante com os stakeholders e análise do negócio.

**Etapas principais:**

1. **Entender o domínio do problema:** estudar o contexto, regras de negócio e processos envolvidos.
2. **Analisar o sistema atual:** identificar pontos fortes, falhas e oportunidades de melhoria.
3. **Observar as ações do negócio:** mapear as atividades realizadas pelos usuários.
4. **Entrevistar stakeholders e usuários:** coletar informações diretas sobre expectativas e dificuldades.
5. **Definir o escopo:** delimitar claramente o que faz ou não parte do sistema a ser desenvolvido.

**Observação:**
Os nomes dos requisitos geralmente contêm **verbos no infinitivo**, representando ações de negócio (ex.: *Cadastrar Produto, Emitir Relatório, Registrar Venda*).

---

## 6. Requisitos × Stakeholders

Ao analisar o mini mundo de um sistema, é essencial identificar **quem realiza cada ação**.
Cada requisito está associado a um ou mais **stakeholders responsáveis**.

### Exemplo: Livraria Descomplica

**Requisitos do negócio:**

* Manter livros
* Realizar pedidos
* Atender pedidos
* Realizar entrega
* Enviar fatura
* Informar venda de livros

**Fora do escopo:**
Atividades realizadas pela editora e processos financeiros complexos.

---

## 7. Atividade de Aplicação — Mini Mundo: Processo Eleitoral

**Atores:**

* **Mesário**
* **Eleitor**

**Requisitos do Mesário:**

* Validar o título de eleitor
* Habilitar o voto eletrônico
* Finalizar o sistema
* Gerar os resultados da urna (em tela e papel)

**Requisitos do Eleitor:**

* Informar número do candidato
* Anular ou confirmar o voto

A totalização das urnas é um **processo separado**, não diretamente ligado ao eleitor ou mesário.

---

## 8. Conclusão

O levantamento de requisitos é um processo **colaborativo, iterativo e comunicativo**.
Envolve compreender o negócio, ouvir os stakeholders e transformar suas necessidades em soluções técnicas viáveis.
Uma boa engenharia de requisitos evita retrabalhos, reduz custos e assegura que o software entregue gere **valor real à organização**.

---

## Referência Bibliográfica

SOMMERVILLE, I. *Engenharia de Software*. 10ª ed. São Paulo: Pearson Education do Brasil, 2018.