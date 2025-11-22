# Especificação de Caso de Uso – Não Expandida

## Introdução

A especificação de caso de uso é uma etapa fundamental na engenharia de requisitos, permitindo descrever de forma clara e organizada as interações entre os atores e o sistema. A **descrição não expandida** é utilizada para casos de uso mais simples, com poucas regras de negócio e fluxos alternativos, apresentando uma visão resumida do procedimento principal.

## Estrutura da Descrição Não Expandida

A descrição não expandida segue uma estrutura padronizada, composta por:

- **Cabeçalho**:
  - **Nome**: Identificação clara e objetiva do caso de uso.
  - **Descrição Sucinta**: Resumo do objetivo do caso de uso.
  - **Pré-condição**: Condições necessárias para a execução do caso de uso.
  - **Pós-condição**: Estado do sistema após a execução do caso de uso.
- **Descrição do Procedimento**: Narrativa textual descrevendo o fluxo principal de interação, incluindo regras relevantes.

## Exemplo Prático: "Consultar Valores Faturados"

**Nome**: Consultar Valores Faturados  
**Descrição Sucinta**: Permite ao usuário visualizar os valores faturados em um período específico.  
**Pré-condição**: Pagamentos realizados e registrados no sistema.  
**Pós-condição**: Não se aplica.  
**Descrição do Procedimento**:  
O usuário informa o período desejado para consulta. O sistema recupera os valores faturados dentro do intervalo informado e os exibe em ordem crescente de data.

## Influência na Modelagem do Sistema

A elaboração da descrição de caso de uso pode levar a ajustes no diagrama de casos de uso, visando melhorar a coesão e a reutilização. Entre as situações comuns estão:

- **Criação de novo caso de uso**: Identificação de procedimentos repetitivos que podem ser extraídos para um caso de uso separado.
- **Unificação de casos de uso**: Casos similares podem ser consolidados em um único caso de uso.
- **Eliminação de caso de uso**: Remoção de casos desnecessários que representam ações já cobertas por outros casos.

## Outras Formas de Representação

Além da descrição narrativa, os casos de uso podem ser representados em formato tabular, que organiza as informações de forma estruturada, mantendo os mesmos elementos: nome, descrição, pré e pós-condições, e procedimento.

## Conclusão

A documentação de casos de uso, mesmo na forma não expandida, é essencial para o entendimento claro dos requisitos e para a validação com os stakeholders. Ela serve como base para o desenvolvimento, testes e evolução do sistema, garantindo que todas as funcionalidades estejam alinhadas com as necessidades do usuário.

---

**Referência para aprofundamento**:  
MEDEIROS, E. *Desenvolvendo software com UML 2.0 definitivo*. São Paulo: Pearson Education do Brasil, 2006.
SOMMERVILLE, I. Engenharia de software. 10.ed. São Paulo: Pearson Education do Brasil: 2018.