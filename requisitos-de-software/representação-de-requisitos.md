# Representação de Requisitos
Serve para facilitar a comunicação entre stakeholders e equipe de desenvolvimento, além de servir como fonte de consulta durante o ciclo de vida do software.

## 1. Modelos de representação
### 1.1 UML (Unified Modeling Language)
- Linguagem padrão para modelagem de sistemas orientados a objetos
- Representar requisitos do sistema em estudo
- Ser independente da linguagem de programação

**Vantagens:**
- Facilita a comunicação entre stakeholders e equipe de desenvolvimento
- Documentação para uso no desenvolvimento e manutenção do sistema
- Facil alterabilidade
- Integração entre as ferramentas
- Apresentação visão geral do sistema

**Tipos de diagramas UML para representação de requisitos:**
- Diagramas de Classes
- Diagramas de Estados
- Diagramas de Sequência
- Diagramas de caso de uso

### 1.2 Diagramas de Caso de Uso
#### Simbologia
- Elipse: Caso de uso
    - O Nome do caso de uso deve ser um verbo no infinitivo
    - O Nome do caso de uso deve ser auto explicativo
- Ator: Representa um papel desempenhado por um usuário ou outro sistema que interage com o sistema
    - Pode ser uma pessoa, um grupo de pessoas, um sistema externo ou uma organização
- Interação entre ator e caso de uso: Representa a comunicação entre o ator e o caso de uso
    - Indicada por uma linha sólida
    - Indica que o ator inicia ou participa do caso de uso
- Interação entre casos de uso: Representa a relação entre dois casos de uso
    - Pode ser uma relação de inclusão, extensão ou generalização
    - Indicada por uma linha sólida com uma seta
    - `<include>`: Indica que um caso de uso inclui o comportamento de outro caso de uso
    - `<extend>`: Indica que um caso de uso pode estender o comportamento de outro caso de uso
- Generalização de ator: Representa uma relação de herança entre dois atores
    - Indicada por uma linha sólida com uma seta aberta
    - O ator filho herda o comportamento e as responsabilidades do ator pai
- Generalização de caso de uso: Representa uma relação de herança entre dois casos de uso
    - Indicada por uma linha sólida com uma seta aberta
    - O caso de uso filho herda o comportamento e as responsabilidades do caso de uso pai