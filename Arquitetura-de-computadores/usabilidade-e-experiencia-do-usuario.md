# Interação Humano-Computador (IHC)

## 1. Introdução

A Interação Humano-Computador (IHC) é uma área multidisciplinar que estuda como as pessoas interagem com computadores e sistemas digitais. No nosso dia a dia, estamos constantemente cercados por interfaces - desde uma simples maçaneta até sistemas complexos como aplicativos móveis e painéis de controle.

### Exemplos do Cotidiano
- **Objetos físicos**: Torneiras, liquidificadores, calculadoras, controles remotos
- **Tecnologia**: Smartphones, computadores, caixas eletrônicos, sistemas de GPS
- **Automotivos**: Painéis de carros, sistemas de navegação

> **Conceito Central**: Quem projeta o sistema precisa pensar em quem vai utilizá-lo!

## 2. Definições Fundamentais

### Sistema Interativo
Ambiente completo onde as soluções de IHC são implementadas, incluindo:
- **Hardware**: Equipamentos físicos
- **Software**: Programas de computador
- **Ambiente**: Todo contexto que afeta ou é afetado pelo uso da tecnologia

### Protótipo vs Produto
- **Protótipo**: Aplicação em fase de testes e desenvolvimento
- **Produto**: Evolução do protótipo, já disponível ao usuário final

### Design
Projeto do sistema interativo que engloba:
- Aparência visual
- Funcionalidades
- Menus e navegação
- Facilidade de operação e aprendizado

> *"Uma maçaneta bem projetada comunica aos usuários se a porta deve ser puxada ou empurrada"* - Donald Norman

### Designer
Profissional responsável pelo desenvolvimento da interface, podendo ser:
- Especialista em programação/TI
- Profissional de Comunicação
- Especialista em Psicologia
- Combinação de áreas

### Requisitos
Necessidades dos usuários em relação ao sistema em desenvolvimento. A extração de requisitos é uma das tarefas mais desafiadoras no desenvolvimento de sistemas.

**Exemplos de contextos**:
- Caixa eletrônico para pessoas com baixa visão
- Painel de controle de reator nuclear
- Editor de textos simples

### Interação
Processo pelo qual o usuário:
1. Formula uma intenção
2. Planeja suas ações
3. Atua sobre a interface
4. Percebe e interpreta a resposta do sistema
5. Avalia se o objetivo foi alcançado

### Interface
Toda porção do sistema com a qual o usuário mantém contato físico ou perceptivo durante a interação. É o meio de comunicação entre usuário e sistema.

### Affordance
Propriedades percebidas e reais de um objeto que determinam como ele pode ser usado.

**Exemplos**:
- Cadeira → sentar e mover
- Vidro → transparência e fragilidade
- Botões → girar
- Teclas → pressionar
- Tesouras → cortar

> Quando há affordance predominante, o usuário sabe o que fazer apenas olhando, sem necessidade de instruções.

## 3. Elementos do Processo de IHC

```
[USUÁRIO] ←→ [INTERFACE] ←→ [SISTEMA]
    ↓           ↓           ↓
[Objetivos] [Interação] [Funcionalidades]
    ↓           ↓           ↓
        [CONTEXTO DE USO]
```

### Áreas Multidisciplinares Envolvidas
- Psicologia
- Ciência da Computação
- Ergonomia
- Engenharia
- Design
- Linguística
- Sociologia
- Filosofia

## 4. Usabilidade - Conceitos Essenciais

### Definição ISO 9241-11
> "Usabilidade é o grau em que um produto pode ser usado por usuários específicos para alcançar objetivos específicos com **eficácia**, **eficiência** e **satisfação** em um contexto de uso específico."

### Definição de Jakob Nielsen
Usabilidade é um conjunto de fatores que qualificam quão bem uma pessoa pode interagir com um sistema interativo segundo sua capacidade:
- **Cognitiva**
- **Perceptiva** 
- **Motora**

### Perguntas Fundamentais da Usabilidade
1. **Quem** é o usuário?
2. **O que** o usuário quer fazer?
3. **O que** o usuário necessita?
4. **Como** podemos ajudá-lo?

## 5. Aspectos da Usabilidade

### 5.1 Confiabilidade
- Ações devem funcionar conforme especificado
- Dados apresentados devem refletir corretamente as bases de dados
- Sistema deve ser confiável e preciso

**Exemplo**: GPS que orienta incorretamente abala a confiabilidade do usuário

### 5.2 Dependência do Contexto
- Usabilidade varia entre diferentes usuários
- Depende do perfil do usuário, contexto de uso e cultura local
- Experiência anterior influencia a percepção

**Exemplo**: Caixa bancário experiente vs estagiário usando o mesmo sistema

### 5.3 Visibilidade do Sistema
- Manter usuário informado sobre o que acontece
- Feedback correto com mensagens curtas e diretas
- Evitar interações exageradas ou informações repetidas

### 5.4 Correspondência com o Mundo Real
- Utilizar vocabulário familiar ao usuário
- Evitar termos técnicos desnecessários
- Usar metáforas conhecidas

### 5.5 Consistência e Padrões
- Tarefas similares executadas de forma similar
- Manter padrões visuais e funcionais
- Evitar inconsistências que confundem o usuário

### 5.6 Prevenção e Diagnóstico de Erros
- Linguagem educada e simples para informar erros
- Prevenir erros antes que ocorram
- Fornecer orientações claras para correção

### 5.7 Organização e Clareza
- Informação em excesso pode confundir
- Design limpo e organizado
- Priorizar informações relevantes

## 6. Princípios para Boas Interfaces

### I. Princípio da Familiaridade com o Usuário
- Usuários não devem se adaptar à interface
- Interface deve se adaptar ao usuário
- Utilizar termos familiares nas mensagens
- Ocultar complexidade técnica do usuário final

**Exemplo**: Metáfora da lixeira no Windows

### II. Princípio da Consistência
- Comandos e menus com formato similar entre sistemas
- Parâmetros fornecidos da mesma maneira
- Conhecimento adquirido em uma parte vale para outras

**Exemplo**: Menus similares no pacote Office (Word, PowerPoint, etc.)

### III. Princípio do Mínimo de Surpresa
- Usuários constroem modelo mental do sistema
- Sistema deve se comportar de forma previsível
- Mesma ação deve gerar efeitos similares em contextos diferentes

**Exemplo**: Botão de lupa não deve mudar função entre versões

### IV. Princípio da Facilidade de Recuperação
- Minimizar erros dos usuários
- Permitir recuperação de erros cometidos
- Função "desfazer" deve estar sempre disponível
- Não perder trabalho realizado

### V. Princípio da Orientação do Usuário
- Sistema de ajuda em diferentes níveis
- Recursos de assistência sem exageros
- Evitar impressão de sistema muito difícil
- Não assumir conhecimento prévio do usuário

### VI. Princípio da Diversidade de Usuários
- Considerar usuários ocasionais e frequentes
- Atender técnicos e não técnicos
- Usuários lentos e velozes
- Diferentes necessidades de orientação

## 7. Heurísticas de Nielsen

### 1. Visibilidade do Status do Sistema
Manter usuários informados sobre o que está acontecendo através de feedback apropriado em tempo hábil.

### 2. Correspondência entre Sistema e Mundo Real
Usar linguagem dos usuários com palavras, frases e conceitos familiares, evitando jargões técnicos.

### 3. Controle e Liberdade do Usuário
Fornecer "saída de emergência" claramente marcada para funções escolhidas por engano.

### 4. Consistência e Padrões
Seguir convenções da plataforma; usuários não devem questionar se ações diferentes significam a mesma coisa.

### 5. Prevenção de Erros
Design cuidadoso que previne problemas é melhor que boas mensagens de erro.

### 6. Reconhecimento vs Recordação
Tornar objetos, ações e opções visíveis; minimizar carga de memória do usuário.

### 7. Flexibilidade e Eficiência de Uso
Prover aceleradores para usuários experientes; permitir personalização de ações frequentes.

### 8. Design Estético e Minimalista
Evitar informações irrelevantes; cada informação extra compete com as relevantes.

### 9. Ajudar Usuários a Reconhecer e Recuperar de Erros
Mensagens de erro em linguagem simples, indicando problema e sugerindo solução.

### 10. Ajuda e Documentação
Informações fáceis de buscar, focadas na tarefa, com passos concretos e concisos.

## 8. Ferramentas Recomendadas

### Templates e Prototipagem
- **Canva.com**: Milhares de modelos para produção gráfica e conceituação de interfaces
- **Figma.com**: Criação de protótipos funcionais para celulares e desktops

### Recursos de Estudo
- **Nielsen Norman Group**: www.nngroup.com - Site de Jakob Nielsen com discussões avançadas sobre usabilidade

## Referências

- BARBOSA, S.D.J. **Interação humano-computador**. Rio de Janeiro: Elsevier, 2010.
- PREECE, J., Rogers, Sharp, H., Benyon, D., Holland, S., Carey, T. **Design de interação: além da interação humano-computador**. Porto Alegre: Bookman, 2013.
- NIELSEN, Jakob. **Usability Engineering**. Academic Press, 1993.
- ISO 9241-11. **Ergonomic requirements for office work with visual display terminals (VDTs) - Part 11: Guidance on usability**. 1998.