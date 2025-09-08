# Mineração de Dados (Data Mining)

## 1. Introdução

Vivemos numa era em que constantemente geramos grandes volumes de dados: transações de compras, interações em redes sociais, cliques em sites, mensagens e muito mais. Esses dados brutos, por si só, pouco dizem até serem organizados e analisados. A mineração de dados (data mining) é o conjunto de técnicas e processos usados para extrair padrões, tendências e conhecimentos úteis a partir desses dados.

> Objetivo deste documento: explicar conceitos fundamentais, técnicas, fluxo de trabalho, aplicações práticas e critérios para seleção de ferramentas de data mining.

---

## 2. Dados vs Informação vs Conhecimento

* **Dados**: fatos brutos que representam eventos (ex.: registros de vendas, logs).
* **Informação**: dados processados e organizados de forma a terem significado (ex.: total de vendas por produto).
* **Conhecimento**: conclusões acionáveis derivadas da informação (ex.: recomendar promoção para produto X em fins de semana).

A mineração de dados atua na transformação *dados → informação → conhecimento*.

---

## 3. Big Data e Business Intelligence (BI)

* **Big Data** refere-se a conjuntos de dados grandes, variados e de alta velocidade (as "3 Vs": Volume, Variedade, Velocidade) que exigem novas arquiteturas e técnicas para armazenamento e processamento.
* **BI (Business Intelligence)**: conjunto de processos, tecnologias e práticas para coletar, integrar e apresentar informações que apoiam a tomada de decisão.

A mineração de dados é uma das técnicas utilizadas dentro de projetos de BI para transformar dados em insights.

---

## 4. Por que minerar dados?

* Explicar fenômenos (por que as vendas caíram?).
* Confirmar hipóteses (famílias de duas rendas compram mais planos?).
* Explorar padrões desconhecidos (descobrir segmentos de alto risco de crédito).
* Automatizar decisões (score de crédito, detecção de fraude).

---

## 5. Fluxo de trabalho (CRISP‑DM — simplificado)

1. **Entendimento do negócio**: definir objetivos e métricas.
2. **Entendimento dos dados**: coleta, inventário e análise exploratória.
3. **Preparação dos dados**: limpeza, tratamento de valores faltantes, transformação e engenharia de atributos.
4. **Modelagem**: aplicar algoritmos (classificação, associação, clustering, regressão, redes neurais, árvores, etc.).
5. **Avaliação**: medir desempenho e validar resultados com métricas adequadas.
6. **Implantação**: usar os modelos em produção (dashboards, automações, campanhas).

> Observação: é muito provável que o modelo inicial não atenda objetivos; são necessárias iterações entre preparação, modelagem e avaliação.

---

## 6. Técnicas e métodos comuns

### 6.1 Visualização

Ferramenta essencial para descobrir padrões, outliers e relações entre variáveis.

### 6.2 Métodos Estatísticos

Testes de hipótese, correlações, regressões e análise exploratória.

### 6.3 Dedução e Indução

* **Dedução**: aplicar regras gerais a casos específicos.
* **Indução**: inferir regras gerais a partir de exemplos (muito usado em data mining).

### 6.4 Árvores de Decisão

Modelos interpretabíveis que dividem dados por atributos para classificar ou prever.

### 6.5 Redes Neurais

Modelos poderosos para tarefas complexas (imagens, texto, séries temporais) — menos interpretáveis sem técnicas adicionais.

### 6.6 Métodos de Associação (Análise de Cesta de Compras)

Descobrem regras como “se A e B são comprados juntos”. Produzem regras de associação médias para ações de merchandising e promoções.

### 6.7 Algoritmos Genéticos

Usados em otimização e seleção de modelos/hiperparâmetros em espaços grandes.

---

## 7. Regras de Associação — conceitos importantes

* **Support (suporte)**: frequência relativa de um conjunto de itens no universo de transações (ex.: P(A ∧ B)).
* **Confidence (confiança)**: probabilidade condicional P(B | A) — dado que A ocorre, qual a chance de B.
* **Lift**: razão entre a confiança e a probabilidade de B; indica se A e B ocorrem juntos mais que por acaso.

> Exemplo prático (descrição): ao analisar vendas do Wal‑Mart verificou‑se associação entre **fraldas** e **cerveja** às sextas-feiras — insight usado para reorganizar exposição e promoções.

---

## 8. Indução de Regras (Exemplo simples)

Regra tipo: `SE (Renda > 60000) E (Débito < 10%) ENTÃO Risco = "bom"`.

Indução de regras consiste em gerar conjuntos de regras que classificam os registros com níveis de certeza (confidence) e cobertura (support). É comum aplicar poda e validação cruzada para evitar regras enganosas.

---

## 9. Modelagem Analítica — Técnicas de Apoio à Decisão

### 9.1 Análise de Sensibilidade

Testar como variações numa variável (ex.: investimento em propaganda) afetam outras (vendas) — importante para entender elasticidades.

### 9.2 Análise de Otimização

Encontrar valores ótimos para variáveis sob restrições (ex.: maximizar vendas dados orçamento e mix de mídia).

Ambas as técnicas combinam modelos preditivos com métodos matemáticos (prog. linear, heurísticas) para suportar decisões.

---

## 10. Exemplo de Caso: Inadimplência (contas a receber)

Cenário: base de associados com pagamentos mensais. O objetivo é identificar perfil de quem paga com atraso.

* **Atributos comuns**: salário, débito mensal (outras dívidas), histórico de pagamentos, idade, cidade.
* **Processo**: coleta dos dados do banco → limpeza → engenharia de atributos (ex.: razão débito/salário) → modelagem (classificação) → avaliação (AUC, recall, precision) → ação (campanhas de cobrança dirigidas).

> Observação: muitas iterações e ajustes são esperados até obter um modelo confiável.

---

## 11. Métricas e Validação

* **Classificação**: acurácia, precisão, recall, F1‑score, AUC‑ROC.
* **Regressão**: MAE, MSE, RMSE.
* **Regras de Associação**: suporte, confiança, lift.

Validação cruzada e divisão treino/teste são fundamentais para avaliar generalização.

---

## 12. Desafios e Limitações

* Qualidade dos dados: dados incompletos, inconsistentes e enviesados reduzem a utilidade dos modelos.
* Interpretação: alguns algoritmos (p.ex. redes neurais) são caixas‑pretas.
* Expectativas irreais: softwares não “descobrem” conhecimento sozinhos — o fator humano (analista) é preponderante.
* Escalabilidade: ferramentas precisam suportar volume e velocidade dos dados.
* Ética e privacidade: risco de vazamento de dados pessoais e decisões automatizadas com vieses.

---

## 13. Seleção de Ferramentas — Checklist prático

1. Quais algoritmos suporta?
2. Que saídas gera (relatórios, regras, modelos exportáveis)?
3. Formato de entrada exigido (CSV, banco, streaming)?
4. Como adquire os dados (conectores, API, ETL)?
5. Interface (gráfica, linha de comando)? Nível de experiência exigido?
6. Suporta dados contínuos/discretos? Qual limite de carga?
7. Processamento paralelo/distribuído disponível?
8. Facilidade de integração com pipelines existentes (API, SDK)?
9. Histórico de uso por organizações e custo/benefício?
10. Suporta aprendizado incremental ou online?

> Dica: faça um teste com um subconjunto real de dados antes de decidir.

---

## 14. Boas Práticas

* Sempre começar com perguntas de negócio bem definidas.
* Investir em limpeza e engenharia de atributos; é onde se ganha mais desempenho.
* Iterar: experimente técnicas e parâmetros diferentes em subconjuntos.
* Documentar suposições, passos e validações.
* Monitorar modelos em produção (deriva de dados) e re-treiná‑los quando necessário.
* Considerar privacidade desde o design (minimização de dados, anonimização quando possível).

---

## 15. Aplicações Comuns (resumo)

* Lucratividade e otimização de preço
* Retenção e segmentação de clientes
* Propensão e scoring
* Otimização de canais e marketing dirigido
* Gerenciamento de risco e prevenção de fraudes
* Análise de cesta de compras e previsão de demanda

---

## 16. Referências

* BROOKSHEAR, J.G. *Ciência da Computação: uma visão abrangente*. Porto Alegre: Bookman, 2013.
* NOSENGO, N. *A extinção dos tecnossauros: histórias de tecnologias que não emplacaram*. Campinas: Editora da Unicamp, 2008.

---

## 17. Próximos passos sugeridos para estudo

* Praticar com um dataset real (ex.: dados públicos de vendas, UCI Machine Learning Repository).
* Implementar uma pipeline simples: ETL → visualização → regras de associação → classificação.
* Estudar ferramentas populares: Python (pandas, scikit‑learn, mlxtend), R, Weka, RapidMiner, plataformas de cloud (AWS Glue/EMR, Google BigQuery + ML).
* Revisar conceitos de ética e privacidade em ciência de dados.
