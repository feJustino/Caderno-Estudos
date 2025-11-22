# Diagrama de Caso de Uso - Processo de Construção

## Introdução

O uso do **Diagrama de Caso de Uso** no desenvolvimento de sistemas é essencial para minimizar erros e produzir resultados eficientes que atendam às expectativas dos usuários/stakeholders.

A UML (Unified Modeling Language) propõe que o diagrama de caso de uso seja atualizado frequentemente à medida que o projeto avança no desenvolvimento. Desta forma, a cada etapa do processo de desenvolvimento o diagrama incorpora novas funcionalidades e interações, tornando o projeto do software mais:
- **Reutilizável**
- Com **componentes menores** (coesão)
- Mais **ágil** na construção
- Com **maior qualidade** geral

## As 4 Etapas da Construção

Esta proposta apresenta 4 etapas na construção de um Diagrama de Caso de Uso:

1. **Exploração**
2. **Construção**
3. **Refinamento**
4. **Evolução**

---

## 1. Exploração

**Disciplina:** Engenharia de Software - Levantamento de Requisitos

Busca dos requisitos conceituais junto aos usuários/stakeholders, com utilização de técnicas de elicitação de requisitos adequadas ao contexto.

### Atividades:
- Identificação dos Requisitos Funcionais
- Identificação dos Atores
- Construção da Tabela de requisitos

### Caso Prático: Colégio Aprendiz

**Contexto:** O Colégio Primário Aprendiz deseja implantar um sistema para controlar suas atividades principais.

**Procedimentos identificados:**
- Cadastrar séries e turmas
- Realizar matrícula de alunos
- Registrar professores
- Emitir pauta de chamada
- Emitir carnês
- Emitir boletim completo (alunos)
- Emitir boletim resumido (professores)

---

## 2. Construção

**Disciplina:** Engenharia de Software - Análise

A partir da tabela de requisitos, verifica-se se a interação é com ator ou com outro caso de uso.

### Atividades:
- Identifica a interação quando o ator ou caso de uso inicia o processo
- Analisa a lista de requisitos
- Identifica se a interação acontece com ator ou caso de uso
- Identifica se caso de uso é **incluído** (`<include>`) ou **estendido** (`<extend>`)

### Tipos de Interação:
- **`<include>`**: Interação acontece sempre
- **`<extend>`**: Interação acontece condicionalmente

---

## 3. Refinamento

**Disciplina:** Engenharia de Software - Análise

Visa incorporar aspectos técnicos e promover a **reutilização**, crucial na metodologia orientada a objetos.

### Situações para Refinamento:

#### 1. Interseção de Procedimentos
Casos de uso que realizam as mesmas ações.

**Exemplo:** "Emitir Boletim Resumido" e "Emitir Boletim Completo" compartilham a obtenção de informações de alunos, disciplinas e notas.

**Solução:** Criar novo caso de uso para a parte comum com interação `<include>`.

#### 2. Reutilização de Procedimentos
Casos de uso que utilizam o mesmo procedimento.

**Exemplo:** "Cadastrar Séries e Turmas" e "Registrar Professor" ambos necessitam pesquisar turmas cadastradas.

**Solução:** Criar caso de uso "Pesquisar turmas" com interação `<include>`.

---

## 4. Evolução

**Disciplina:** Engenharia de Software - Análise

Busca casos de uso que não estão **coesos** (realizam muitas atividades), dificultando desenvolvimento, testes e manutenção.

### Estratégias:

#### 1. Subdivisão de Casos de Uso
**Exemplo:** "Realizar Matrícula" pode ser subdividido em:
- "Cadastrar Aluno" (`<extend>`)
- "Inscrever em Série/Turma"

#### 2. Criação de Coordenadores
**Exemplo:** Casos de uso da Secretaria podem ter um coordenador "Gerir Atividades Acadêmicas" que orquestra:
- "Cadastrar Séries e Turmas"
- "Emitir Pauta"
- "Registrar Professor"

### Benefícios:
- Componentes menores
- Maior coesão
- Facilidade de desenvolvimento, teste e manutenção

---

## Material Complementar

### Atividade Extra
**Vídeo Recomendado:** "Curso de UML - O que são Diagramas de Casos de Uso" - Bóson Treinamentos (disponível no YouTube)

### Referências Bibliográficas
- MEDEIROS, E. *Desenvolvendo software com UML 2.0 definitivo*. São Paulo: Pearson Education do Brasil, 2006.
- SOMMERVILLE, I. *Engenharia de software*. 10.ed. São Paulo: Pearson Education do Brasil, 2018.
Responda isso

Claro! Vou organizar o conteúdo sobre **Diagrama de Caso de Uso** em anotações estruturadas e didáticas, conforme o exemplo anterior.

____

# 📘 Diagrama de Caso de Uso – Aplicação Prática

## 1. Introdução aos Modelos no Desenvolvimento de Software

- **Modelos** são essenciais para:
  - Minimizar erros
  - Padronizar a comunicação
  - Facilitar o entendimento entre usuários e desenvolvedores
  - Dar suporte à validação e construção do sistema

- **Público envolvido:**
  - Profissionais de TI
  - Usuários e *stakeholders*

> Quanto maior a participação do usuário, maior o comprometimento e a qualidade do sistema.

---

## 2. O que é um Diagrama de Caso de Uso?

- Representa **funcionalidades** do sistema sob a perspectiva do usuário
- Mostra a **interação** entre **atores** e **casos de uso**
- **Não mostra** sequência ou fluxo de tarefas (isso é com o diagrama de atividades ou sequência)

---

## 3. Elementos do Diagrama de Caso de Uso

| Elemento | Símbolo | Descrição |
|----------|---------|-----------|
| **Ator** | 🧍 | Representa um papel externo que interage com o sistema |
| **Caso de Uso** | ○ | Funcionalidade ou serviço oferecido pelo sistema |
| **Associação** | ─── | Liga ator a caso de uso |
| **Incluir (`<<include>>`)** | ---→ | Indica que um caso de uso **sempre** executa outro |
| **Estender (`<<extend>>`)** | ---→ | Indica que um caso de uso **pode** executar outro, sob condição |

---

## 4. Estudo de Caso: Consultório Dentário

### 📌 Contexto:
Sistema Web para agendamento, atendimento e controle financeiro.

### ✅ Atores Identificados:
- Paciente
- Secretária
- Dentista

### ✅ Casos de Uso Identificados:

| Caso de Uso | Ator(es) | Relacionamentos |
|--------------|----------|------------------|
| Marcar Consulta | Paciente, Secretária | Estende “Manter Paciente” |
| Remarcar Consulta | Paciente, Secretária | - |
| Desmarcar Consulta | Paciente, Secretária | - |
| Manter Paciente | Secretária | - |
| Manter Procedimentos | Secretária | - |
| Receber Pagamento | Secretária | Inclui “Calcular Valor” |
| Calcular Valor dos Serviços | (interno) | Incluído por “Receber Pagamento” |
| Atender Paciente | Dentista | - |
| Consultar Histórico | Dentista | Estende “Atender Paciente” |
| Registrar Consulta | Dentista | Incluído por “Atender Paciente” |
| Consultar Valores Faturados | Dentista | - |
| Consultar Estatísticas | Dentista | - |
| Avaliar Consultório | Paciente | - |

---

## 5. Relacionamentos entre Casos de Uso

### 🔹 Incluir (`<<include>>`)
- Sempre ocorre
- Exemplo: “Receber Pagamento” **inclui** “Calcular Valor”

### 🔹 Estender (`<<extend>>`)
- Ocorre sob condição
- Exemplo: “Marcar Consulta” **pode estender** “Manter Paciente” (se paciente não cadastrado)

---

## 6. Etapas de Modelagem

### a) Exploração
- Identificar atores e casos de uso a partir do “mini mundo”

### b) Construção
- Definir interações entre atores e casos de uso
- Aplicar `<<include>>` e `<<extend>>` conforme a lógica de negócio

### c) Refinamento
- Identificar generalizações
- Exemplo: **Secretária** e **Paciente** podem herdar de um ator geral “Agendador”

### d) Evolução
- Garantir **coesão** (cada caso de uso tem um único objetivo)
- Dividir casos de uso muito complexos
- Exemplo: “Manter Paciente” pode ser dividido em:
  - Cadastrar Paciente
  - Alterar Paciente
  - Excluir Paciente

---

## 7. Dicas Importantes

- Use a **simbologia correta** da UML
- Casos de uso **não mostram sequência**
- Interações são por **execução**, não por compartilhamento de dados
- O processo é **iterativo**: refine e evolua continuamente

---

## 🧩 Exemplo Visual Simplificado

```
Paciente → (Marcar Consulta) ──┐
                              ├─⟶ [Manter Paciente] (extend)
Secretária → (Remarcar Consulta) ──┘
Dentista → (Atender Paciente) ──⟶ [Registrar Consulta] (include)
```

---

## 📚 Atividade Extra

**Leitura Recomendada:**  
“Engenharia de Software” – Prof. Arturo Hernández Domínguez  
Disponível em PDF (2º resultado no Google)

---

## 📖 Referência Bibliográfica

- MEDEIROS, E. **Desenvolvendo software com UML 2.0 definitivo**. Pearson, 2006.
- SOMMERVILLE, I. **Engenharia de software**. 10.ed. Pearson, 2018.

---

Se precisar de um diagrama visual ou de mais detalhes sobre relacionamentos, é só pedir!