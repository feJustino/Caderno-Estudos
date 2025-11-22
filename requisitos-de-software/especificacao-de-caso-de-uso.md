# Especificação de Caso de Uso

## 1. Conceito Fundamental
- **Diagrama de Caso de Uso**: Representação visual das funcionalidades (O "QUÊ") na UML
- **Especificação de Caso de Uso**: Detalhamento dos procedimentos (O "COMO")
- **Objetivo**: Garantir compreensão correta dos requisitos pela equipe de desenvolvimento
- **Importância**: Comunicar requisitos de forma clara entre stakeholders e desenvolvedores

## 2. Tipos de Descrição

### Descrição Não Expandida
- **Finalidade**: Visão geral concisa para documentação inicial
- **Estrutura**:
  - Cabeçalho
  - Descrição do procedimento (visão geral)
- **Indicação**: Casos de uso simples ou comunicação com stakeholders não técnicos

### Descrição Expandida
- **Finalidade**: Detalhamento completo para fase de desenvolvimento
- **Estrutura**:
  - Cabeçalho
  - Fluxo Normal
  - Fluxo Alternativo
- **Indicação**: Casos complexos, equipe distribuída ou implementação

## 3. Estrutura Comum - Cabeçalho

| Componente | Descrição | Exemplo |
|------------|-----------|---------|
| **Nome** | Identificação em sincronia com o diagrama | Vender Produto |
| **Descrição Sucinta** | Objetivo principal do caso de uso | Realizar venda ao cliente conforme escolha |
| **Pré-Condições** | Condições necessárias antes da execução | Produto cadastrado, sistema operacional |
| **Pós-Condições** | Estado do sistema após execução | Estoque atualizado, venda registrada |

*Observação: Pré e pós-condições podem ser omitidas quando não aplicáveis*

## 4. Descrição Expandida - Fluxo Normal

### Características Principais:
- Sequência principal SEM exceções
- Identificação de entradas, processamento e saídas
- Último passo sempre do sistema
- Procedimentos de maior frequência

### Regras de Escrita Essenciais:
- ✅ Passos numerados sequencialmente (1.0, 2.0, 3.0...)
- ✅ Cada passo realizado pelo ator ou sistema
- ✅ Sentenças curtas, objetivas e claras
- ✅ Padronização de verbos e adjetivos
- ✅ Comentários permitidos (//* ou ***)
- ❌ Sem repetições ou condições
- ❌ Sem tratamento de erros
- ❌ Um passo por linha

### Relacionamentos entre Casos de Uso:
- **`<include>`**: "Sistema `<include>` 'Nome do caso de uso'" - Inclusão obrigatória
- **`<extend>`**: "Sistema `<extend>` 'Nome do caso de uso'" - Extensão condicional

*Exemplo Prático - Vender Produto:*
```plaintext
1.0 Sistema apresenta a tela
2.0 Sistema apresenta lista de clientes
3.0 Sistema apresenta lista de produtos
     //* considerar somente produtos com quantidade > 0
4.0 Ator escolhe cliente
5.0 Ator escolhe produto
6.0 Ator informa quantidade
7.0 Ator confirma venda
8.0 Sistema registra venda
9.0 Sistema atualiza estoque
10.0 Sistema <include> "Emitir Nota Fiscal"
11.0 Sistema encerra caso de uso
```

## 5. Descrição Expandida - Fluxo Alternativo

### Propósito:
- Tratamento de exceções e condições alternativas
- Situações que fogem do fluxo principal
- Validações e comportamentos excepcionais

### Estrutura Padrão:
```
x.0 [Passo do fluxo normal que terá exceção]
    x.1 [Evento ocorrido que provocou a exceção]
        x.1.1 [Passos para tratamento da exceção]
        x.1.2 [Ações corretivas ou retorno]
```

*Exemplo Prático - Cliente Não Cadastrado:*
```plaintext
4.0 Ator escolhe cliente
    4.1 Cliente não cadastrado
        4.1.1 Ator clica em [Cadastrar Novo Cliente]
        4.1.2 Sistema <extend> "Cadastrar Cliente"
        4.1.3 Retornar ao passo 5.0
```

## 6. Exemplo Completo - "Atender Paciente"

### Cabeçalho:
- **Nome**: Atender Paciente
- **Descrição Sucinta**: Dentista atende o paciente, realiza e registra os procedimentos da consulta
- **Pré-Condição**: Procedimentos da clínica cadastrados, consulta agendada
- **Pós-Condição**: Consulta realizada e procedimentos do paciente cadastrados

### Fluxo Normal:
```plaintext
1.0 Sistema apresenta Tela de Atendimento
2.0 Sistema apresenta lista de consultas agendadas
3.0 Ator escolhe consulta
4.0 Ator clica [CONFIRMA]
5.0 Sistema <include> "Registrar Consulta"
6.0 Sistema encerra Caso de Uso
```

### Fluxo Alternativo:
```plaintext
4.0 Ator clica [CANCELA]
    4.1 Ator deseja consultar histórico de procedimentos do paciente
        4.1.1 Ator clica [HISTÓRICO]
        4.1.2 Sistema <extend> "Consultar Histórico de Procedimentos"
    4.2 Ator desiste de registrar consulta
        4.2.1 Ator clica [CANCELAR]
        4.2.2 Sistema encerra caso de uso
```

## 7. Preocupações na Especificação

### Objetivos da Documentação:
- ✅ Usuário aferir o atendimento do requisito
- ✅ Avaliar as restrições do sistema
- ✅ Dar segurança ao projeto com entendimento completo do programador
- ✅ Documentação de referência para o projeto

### Benefícios da Especificação Detalhada:
- **Para Desenvolvedores**: Entendimento preciso da implementação
- **Para Testadores**: Base para criação de casos de teste
- **Para Usuários**: Confirmação de atendimento dos requisitos
- **Para o Projeto**: Redução de ambiguidades e retrabalho

## 8. Atividade Extra

### Aprofundamento Recomendado:
- Pesquisar o documento **"Artefato: Caso de Uso"** do **Centro de Informática da UFPE**
- Disponível através de busca no Google
- Complementa o entendimento sobre Diagrama e Especificação de Caso de Uso

## 9. Referências Bibliográficas

- **MEDEIROS, E.** *Desenvolvendo software com UML 2.0 definitivo*. São Paulo: Pearson Education do Brasil, 2006.
- **SOMMERVILLE, I.** *Engenharia de software*. 10.ed. São Paulo: Pearson Education do Brasil, 2018.
