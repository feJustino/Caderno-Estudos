# 🧭 Levantamento de Requisitos

O **Levantamento de Requisitos** é uma das etapas mais importantes do desenvolvimento de software.  
Nela, são identificadas e documentadas as **necessidades, expectativas e restrições** dos usuários e do negócio.  
A partir dessa fase, todas as demais decisões do projeto são fundamentadas.

Desenvolver sistemas é uma tarefa interessante e desafiadora, que exige **responsabilidade, comunicação e compreensão profunda do negócio**.  
Os requisitos levantados devem ser **completos, consistentes e sem ambiguidades** — o que demanda o uso de **métodos adequados** e **boas relações interpessoais**.

---

## 🎯 Conceito e Objetivos

O levantamento de requisitos tem como objetivo compreender:
- **O que o sistema deve fazer;**
- **Como ele deve se comportar;**
- **Quais restrições ou condições devem ser atendidas.**

Uma análise bem conduzida:
- Reduz retrabalho e custos;
- Melhora a comunicação entre equipe e stakeholders;
- Garante que o sistema realmente atenda às expectativas do usuário.

---

## 🧱 Tipos de Requisitos

Segundo **Sommerville (2018)**, os requisitos podem ser classificados em dois grandes grupos:  
**Requisitos de Usuário** e **Requisitos de Sistema**.

### 🔹 Requisitos de Usuário
Descrevem, em **linguagem natural e diagramas**, os **serviços esperados** e as **restrições de operação** do sistema.  
São voltados à visão do usuário final.

📘 *Exemplo:*  
“O sistema deve permitir que o cliente realize reservas de hospedagem online.”

---

### 🔹 Requisitos de Sistema
Definem, de forma detalhada, as **funções, serviços e restrições operacionais** do sistema.  
Dividem-se em:

#### 🟢 Requisitos Funcionais
- Representam **o que o sistema deve fazer**;  
- Correspondem aos **procedimentos que realizam o negócio**, independentemente da tecnologia usada.

📘 *Exemplo:*
- RF01 - Cadastrar cliente  
- RF02 - Registrar venda  
- RF03 - Emitir nota fiscal  
- RF04 - Cadastrar produto

#### 🔵 Requisitos Não Funcionais
- Definem **como o sistema deve operar**, especificando **restrições e qualidades**.  
- Envolvem desempenho, segurança, usabilidade, confiabilidade, portabilidade etc.

📘 *Exemplo:*
- RNF01 – O sistema deve ser desenvolvido em arquitetura WEB.  
- RNF02 – A cor de fundo das telas deve ser verde.  
- RNF03 – Deve seguir o padrão metodológico da empresa.  
- RNF04 – As informações devem ser mantidas em sigilo.

Os requisitos não funcionais se dividem em:
- **Produto:** características técnicas do software (ex: arquitetura, cor, linguagem).  
- **Organizacional:** políticas e padrões internos.  
- **Externos:** fatores legais ou de mercado que impactam o sistema.

> ⚠️ **Atenção:** Requisitos não funcionais costumam ser negligenciados, o que pode comprometer o desempenho, a usabilidade e a segurança do sistema.

---

## 🏨 Estudo de Caso — *Hotel Descomplica*

O **Hotel Descomplica** atua nas regiões do Rio de Janeiro e São Paulo, com foco em **conforto e praticidade**.  
Deseja um **sistema web** que:
- Mantenha a **identidade visual verde**;  
- Garanta **segurança via controle de acesso**;  
- Ofereça **facilidade e agilidade** no atendimento.

### 👥 Usuários Identificados
- **Clientes**
- **Recepcionista**
- **Gerência**

### ⚙️ Atividades (Requisitos Funcionais)

#### **Clientes**
- Cadastrar-se no sistema;  
- Reservar período de estadia;  
- Utilizar serviços durante a hospedagem.

#### **Recepcionista**
- Registrar entrada do hóspede;  
- Cadastrar hóspedes não registrados;  
- Emitir cartão de acesso;  
- Fechar estadia;  
- Receber pagamento;  
- Emitir nota fiscal.

#### **Gerência**
- Cadastrar serviços;  
- Cadastrar quartos;  
- Analisar frequência de hóspedes;  
- Consultar faturamento mensal.

### 🧩 Classificação dos Requisitos do Caso

| Tipo | Requisitos |
|------|-------------|
| **Funcionais (RF)** | Cadastrar hóspedes; Reservar período; Utilizar serviços; Registrar entrada; Emitir cartão de acesso; Fechar estadia; Receber pagamento; Emitir nota fiscal; Cadastrar serviços; Cadastrar quartos; Analisar frequência; Consultar faturamento. |
| **Não Funcionais (RNF)** | Arquitetura WEB (Produto); Identidade visual verde (Organizacional); Controle de acesso ao sistema (Confiabilidade). |

---

## 🧮 Fontes e Técnicas de Coleta

O processo de elicitação é **iterativo e colaborativo**, envolvendo a comunicação constante com os **stakeholders** (usuários, gerentes, clientes etc.).

### 🔍 Fontes de Informação
- **Fontes humanas:** usuários diretos e indiretos;  
- **Ambiente de operação:** locais onde o sistema será usado;  
- **Análise de mercado:** tendências e práticas atuais;  
- **Produtos concorrentes:** análise de soluções similares;  
- **Conhecimento do domínio:** experiência prévia e regras do negócio.

### 🧰 Técnicas de Elicitação
- **Entrevistas** — conversas diretas com stakeholders;  
- **Questionários** — coleta estruturada de dados em larga escala;  
- **Observação** — acompanhamento das atividades reais;  
- **Análise documental** — estudo de manuais, relatórios e processos;  
- **Prototipagem** — criação de modelos para validação com o usuário.

Durante a coleta, deve-se identificar:
- **Quem realiza** a ação;  
- **O que realiza**;  
- **Qual é o estímulo** da ação;  
- **Qual o resultado esperado**.

---

## 🧾 Documentação e Validação

A **Especificação de Requisitos de Software (ERS)** é o documento que formaliza os requisitos levantados.  
Ela serve como base para o:
- Desenvolvimento do sistema;  
- Planejamento de testes;  
- Comunicação entre equipe e stakeholders.

Uma boa especificação:
- Reduz ambiguidades;  
- Melhora a rastreabilidade;  
- Garante alinhamento entre todas as partes envolvidas.

---

## 💡 Boas Práticas e Desafios

### Desafios Comuns
- Diferenças de visão entre stakeholders;  
- Mudanças frequentes nos requisitos;  
- Falhas de comunicação;  
- Dificuldade de priorização.

### Boas Práticas
- Manter **diálogo constante** entre equipe e usuários;  
- **Validar** requisitos com frequência;  
- Priorizar requisitos críticos;  
- Garantir **documentação clara e atualizada**.

---

## 📺 Atividade Extra

🎥 Para se aprofundar no tema, assista ao vídeo:  
**“O que é Levantamento de Requisitos — Tópicos de Engenharia de Software”**  
📚 Canal: *Bóson Treinamentos* (YouTube)

---

## 📚 Referência Bibliográfica

SOMMERVILLE, I. *Engenharia de Software.* 10. ed. São Paulo: Pearson Education do Brasil, 2018.

---

## 🧠 Resumo Final

| Etapa | Objetivo | Resultado Esperado |
|-------|-----------|--------------------|
| **Elicitação** | Identificar necessidades e expectativas | Lista de requisitos bruta |
| **Análise e Classificação** | Organizar e validar requisitos | Funcionais e não funcionais definidos |
| **Documentação** | Formalizar e detalhar requisitos | ERS (Especificação de Requisitos) |
| **Validação** | Garantir alinhamento com usuários | Requisitos aprovados pelos stakeholders |

> 💬 **Conclusão:**  
> O levantamento de requisitos é o ponto de partida para o sucesso de qualquer sistema.  
> Envolve técnica, análise e empatia — compreender o usuário é o primeiro passo para construir um software de qualidade.

