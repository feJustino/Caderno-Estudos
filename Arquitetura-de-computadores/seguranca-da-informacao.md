# CONCEITOS BÁSICOS DE SEGURANÇA DA INFORMAÇÃO

## Índice

1. [Definição de Segurança da Informação](#definição-de-segurança-da-informação)
2. [Três Objetivos Principais da Segurança da Informação](#três-objetivos-principais-da-segurança-da-informação)
   - [1. Confidencialidade](#1-confidencialidade)
   - [2. Integridade](#2-integridade)
   - [3. Disponibilidade](#3-disponibilidade)
3. [Conceitos Fundamentais](#conceitos-fundamentais)
   - [Definições Detalhadas](#definições-detalhadas)
   - [Conceitos Adicionais](#conceitos-adicionais)
4. [Os Desafios da Segurança da Informação](#os-desafios-da-segurança-da-informação)
5. [Modelo para Segurança de Computadores](#modelo-para-segurança-de-computadores)
   - [Ativos do Sistema de Computador](#ativos-do-sistema-de-computador)
   - [Vulnerabilidades do Sistema](#vulnerabilidades-do-sistema)
6. [Ameaças, Ataques e Ativos](#ameaças-ataques-e-ativos)
   - [Tipos de Ataques](#tipos-de-ataques)
   - [Contramedidas](#contramedidas)
7. [Tipos de Ameaças e Ataques](#tipos-de-ameaças-e-ataques)
   - [1. Divulgação Não Autorizada](#1-divulgação-não-autorizada-ameaça-à-confidencialidade)
   - [2. Engano](#2-engano-ameaça-à-integridade)
   - [3. Interrupção](#3-interrupção-ameaça-à-disponibilidade)
   - [4. Usurpação](#4-usurpação-ameaça-à-integridade-do-sistema)
8. [Ameaças por Categoria de Ativo](#ameaças-por-categoria-de-ativo)
   - [Hardware](#hardware)
   - [Software](#software)
   - [Dados](#dados)
   - [Linhas e Redes de Comunicação](#linhas-e-redes-de-comunicação)
9. [Requisitos Funcionais de Segurança](#requisitos-funcionais-de-segurança)
   - [1. Controle de Acesso](#1-controle-de-acesso)
   - [2. Conscientização e Treinamento](#2-conscientização-e-treinamento)
   - [3. Auditoria e Responsabilidade](#3-auditoria-e-responsabilidade)
   - [4. Certificação, Acreditação e Avaliações de Segurança](#4-certificação-acreditação-e-avaliações-de-segurança)
   - [5. Gerenciamento de Configuração](#5-gerenciamento-de-configuração)
   - [6. Planejamento de Contingência](#6-planejamento-de-contingência)
   - [7. Identificação e Autenticação](#7-identificação-e-autenticação)
   - [8. Resposta a Incidentes](#8-resposta-a-incidentes)
   - [9. Manutenção](#9-manutenção)
   - [10. Proteção de Mídia](#10-proteção-de-mídia)
   - [11. Proteção Física e Ambiental](#11-proteção-física-e-ambiental)
   - [12. Planejamento de Segurança](#12-planejamento-de-segurança)
   - [13. Segurança do Pessoal](#13-segurança-do-pessoal)
   - [14. Avaliação de Riscos](#14-avaliação-de-riscos)
   - [15. Aquisição de Sistemas e Serviços](#15-aquisição-de-sistemas-e-serviços)
   - [16. Proteção do Sistema e das Comunicações](#16-proteção-do-sistema-e-das-comunicações)
   - [17. Integridade do Sistema e da Informação](#17-integridade-do-sistema-e-da-informação)
10. [Metodologias de Segurança da Informação](#metodologias-de-segurança-da-informação)
    - [Princípios de Projeto de Segurança](#princípios-de-projeto-de-segurança)
11. [Superfícies de Ataque](#superfícies-de-ataque)
    - [Definição](#definição)
    - [Exemplos](#exemplos)
    - [Categorias](#categorias)
12. [Estratégia de Segurança da Informação](#estratégia-de-segurança-da-informação)
    - [Política de Segurança](#política-de-segurança)
    - [Implementação de Segurança](#implementação-de-segurança)
13. [Criptografia](#criptografia)
    - [Confidencialidade com Criptografia Simétrica](#confidencialidade-com-criptografia-simétrica)
    - [Algoritmos de Criptografia de Bloco](#algoritmos-de-criptografia-de-bloco)
14. [Autenticação de Mensagens e Funções Hash](#autenticação-de-mensagens-e-funções-hash)
    - [Autenticação de Mensagens](#autenticação-de-mensagens)
    - [Métodos de Autenticação](#métodos-de-autenticação)
15. [Criptografia de Chave Pública](#criptografia-de-chave-pública)
    - [Estrutura](#estrutura)
    - [Aplicações dos Criptossistemas de Chave Pública](#aplicações-dos-criptossistemas-de-chave-pública)
16. [Lei Geral de Proteção de Dados – LGPD](#lei-geral-de-proteção-de-dados--lgpd)
    - [Abrangência da Lei](#abrangência-da-lei)
    - [Atores Envolvidos](#atores-envolvidos)
    - [Fundamentos da LGPD](#fundamentos-da-lgpd)
    - [Itens Abordados pela LGPD](#itens-abordados-pela-lgpd)
    - [Direitos do Titular (Art. 18)](#direitos-do-titular-art-18)
    - [Consentimento aos Dados](#consentimento-aos-dados)
    - [Penalidades por Descumprimento (Art. 52)](#penalidades-por-descumprimento-art-52)
    - [Aplicação Global](#aplicação-global)
17. [Referência Bibliográfica](#referência-bibliográfica)

---

## Definição de Segurança da Informação

**Segurança da Informação:** A proteção conferida a um sistema de informação automatizado para atingir os objetivos aplicáveis de preservação da integridade, disponibilidade e confidencialidade dos recursos do sistema de informação (inclui hardware, software, firmware, informações/dados e telecomunicações).

*Fonte: Manual de Segurança de Computadores do NIST [NIST 95]*

## Três Objetivos Principais da Segurança da Informação

### 1. Confidencialidade

Este termo abrange dois conceitos relacionados:

- **Confidencialidade dos dados:** Garante que informações privadas ou confidenciais não sejam disponibilizadas ou divulgadas a pessoas não autorizadas.
- **Privacidade:** Garante que os indivíduos controlem ou influenciem quais informações relacionadas a eles podem ser coletadas e armazenadas e por quem e para quem essas informações podem ser divulgadas.

### 2. Integridade

Este termo abrange dois conceitos relacionados:

- **Integridade dos dados:** Garante que as informações e os programas sejam alterados apenas de maneira especificada e autorizada.
- **Integridade do sistema:** Garante que um sistema desempenhe sua função pretendida de maneira intacta, livre de manipulação não autorizada deliberada ou inadvertente do sistema.

### 3. Disponibilidade

Garante que os sistemas funcionem prontamente e o serviço não seja negado a usuários autorizados.

## Conceitos Fundamentais

### Definições Detalhadas

- **Confidencialidade:** Preservar as restrições autorizadas de acesso e divulgação de informações, incluindo meios para proteger a privacidade pessoal e informações proprietárias. Uma perda de confidencialidade é a divulgação não autorizada de informações.

- **Integridade:** Proteção contra modificação ou destruição imprópria de informações, incluindo a garantia de não repúdio e autenticidade das informações. Uma perda de integridade é a modificação ou destruição não autorizada de informações.

- **Disponibilidade:** Garantir o acesso e o uso oportuno e confiável da informação. Uma perda de disponibilidade é a interrupção do acesso ou uso da informação ou de um sistema de informação.

### Conceitos Adicionais

- **Autenticidade:** A propriedade de ser genuíno e poder ser verificado e confiável; confiança na validade de uma transmissão, uma mensagem ou mensagem originador. Isso significa verificar se os usuários são quem dizem ser e se cada entrada que chega ao sistema veio de uma fonte confiável.

- **Responsabilidade:** O objetivo de segurança que gera o requisito para que as ações de uma entidade sejam rastreadas exclusivamente para essa entidade. Isso oferece suporte ao não repúdio, dissuasão, isolamento de falhas, detecção e prevenção de intrusão e recuperação pós-ação e ação legal.

## Os Desafios da Segurança da Informação

A segurança do computador é fascinante e complexa pelos seguintes motivos:

1. **Complexidade aparente vs. real:** Os requisitos parecem simples, mas os mecanismos podem ser bastante complexos.

2. **Análise de ataques:** Deve-se sempre considerar possíveis ataques aos recursos de segurança.

3. **Procedimentos contraintuitivos:** Os procedimentos são muitas vezes complexos e não óbvios.

4. **Posicionamento estratégico:** É necessário decidir onde usar os mecanismos de segurança.

5. **Complexidade de implementação:** Os mecanismos envolvem mais do que algoritmos específicos.

6. **Batalha de inteligência:** É uma luta constante entre invasores e defensores.

7. **Percepção de benefício:** Há tendência de não valorizar a segurança até ocorrer uma falha.

8. **Monitoramento constante:** A segurança requer monitoramento regular.

9. **Integração no projeto:** Frequentemente é uma reflexão tardia em vez de parte integral do processo.

10. **Usabilidade vs. Segurança:** Muitos veem a segurança como impedimento à eficiência.

## Modelo para Segurança de Computadores

### Ativos do Sistema de Computador

- **Hardware:** Sistemas de computador e outros dispositivos de processamento, armazenamento e comunicação de dados
- **Software:** Sistema operacional, utilitários do sistema e aplicativos
- **Dados:** Arquivos, bancos de dados e dados relacionados à segurança
- **Instalações e redes de comunicação:** Links de comunicação, pontes, roteadores, etc.

### Vulnerabilidades do Sistema

1. **Corrupção:** O sistema faz a coisa errada ou dá respostas erradas
2. **Vazamento:** Acesso não autorizado a informações
3. **Indisponibilidade:** O sistema torna-se impossível ou impraticável de usar

## Ameaças, Ataques e Ativos

### Tipos de Ataques

#### Por Atividade
- **Ataque ativo:** Tentativa de alterar recursos do sistema ou afetar sua operação
- **Ataque passivo:** Tentativa de aprender ou usar informações sem afetar os recursos

#### Por Origem
- **Ataque interno:** Iniciado por entidade dentro do perímetro de segurança
- **Ataque externo:** Iniciado de fora do perímetro por pessoa não autorizada

### Contramedidas

Qualquer meio utilizado para lidar com um ataque de segurança. Podem:
- Prevenir ataques
- Detectar ataques
- Facilitar recuperação dos efeitos do ataque

## Tipos de Ameaças e Ataques

### 1. Divulgação Não Autorizada (Ameaça à Confidencialidade)

- **Exposição:** Liberação deliberada ou acidental de informações confidenciais
- **Interceptação:** Ataque comum em comunicações (LANs, Internet)
- **Inferência:** Análise de tráfego e consultas repetidas para deduzir informações
- **Intrusão:** Acesso não autorizado superando proteções de controle

### 2. Engano (Ameaça à Integridade)

- **Máscara:** Usuário não autorizado se fazendo passar por autorizado
- **Falsificação:** Alteração ou substituição de dados válidos
- **Repúdio:** Negação de envio ou recebimento de dados

### 3. Interrupção (Ameaça à Disponibilidade)

- **Incapacitação:** Desabilitação do sistema ou serviços
- **Corrupção:** Sistema funciona de maneira não intencional
- **Obstrução:** Interferência nas comunicações ou sobrecarga do sistema

### 4. Usurpação (Ameaça à Integridade do Sistema)

- **Apropriação indevida:** Roubo de serviço (ex: ataques DDoS)
- **Uso indevido:** Uso não autorizado através de lógica maliciosa ou acesso não autorizado

## Ameaças por Categoria de Ativo

### Hardware
- **Principal ameaça:** Disponibilidade
- **Vulnerabilidades:** Danos acidentais/deliberados, roubo
- **Medidas:** Segurança física e administrativa

### Software
- **Principal ameaça:** Disponibilidade e integridade
- **Vulnerabilidades:** Exclusão, alteração, vírus, pirataria
- **Medidas:** Gerenciamento de configuração, backups

### Dados
- **Ameaças:** Disponibilidade, confidencialidade e integridade
- **Preocupações:** Destruição, acesso não autorizado, modificação

### Linhas e Redes de Comunicação
- **Ataques passivos:** Espionagem, monitoramento
- **Ataques ativos:** Repetição, mascaramento, modificação, negação de serviço

## Requisitos Funcionais de Segurança

### 1. Controle de Acesso
Limitar o acesso ao sistema de informação a usuários autorizados, processos que agem em nome de usuários autorizados ou dispositivos (incluindo outros sistemas de informação) e aos tipos de transações e funções que os usuários autorizados têm permissão para exercer.


### 2. Conscientização e Treinamento
Assegurar que os gestores e usuários dos sistemas de informação organizacionais estejam cientes dos riscos de segurança associados às suas atividades e das leis, regulamentos e políticas aplicáveis relacionadas à segurança dos sistemas de informação organizacionais.


### 3. Auditoria e Responsabilidade
Criar, proteger e reter registros de auditoria do sistema de informação na medida necessária para permitir o monitoramento, análise, investigação e comunicação de atividades ilegais, não autorizadas ou inadequadas do sistema de informação.


### 4. Certificação, Acreditação e Avaliações de Segurança
Avaliar periodicamente os controles de segurança nos sistemas de informação organizacionais para determinar se os controles são eficazes em sua aplicação e desenvolver planos de ação para corrigir deficiências.



### 5. Gerenciamento de Configuração
Estabelecer e manter configurações básicas e inventários de sistemas de informações organizacionais (incluindo hardware, software, firmware e documentação) ao longo dos respectivos ciclos de vida de desenvolvimento do sistema.


### 6. Planejamento de Contingência
Estabelecer, manter e implementar planos de resposta a emergências, operações de backup e recuperação pós-desastre para sistemas de informação organizacionais para garantir a disponibilidade de recursos de informação críticos.


### 7. Identificação e Autenticação
Identificar usuários do sistema de informação, processos que agem em nome de usuários ou dispositivos e autenticar (ou verificar) as identidades desses usuários, processos ou dispositivos, como pré-requisito para permitir o acesso aos sistemas.


### 8. Resposta a Incidentes
Estabelecer uma capacidade operacional de tratamento de incidentes para sistemas de informações organizacionais que inclua atividades adequadas de preparação, detecção, análise, contenção, recuperação e resposta ao usuário.



### 9. Manutenção
Realizar manutenções periódicas e pontuais nos sistemas de informação organizacionais e fornecer controles eficazes sobre as ferramentas, técnicas, mecanismos e pessoal usado para realizar a manutenção do sistema.

### 10. Proteção de Mídia
Proteger a mídia do sistema de informação, tanto em papel quanto digital; limitar o acesso às informações na mídia do sistema de informação a usuários autorizados; e higienizar ou destruir a mídia antes do descarte ou liberação para reutilização.


### 11. Proteção Física e Ambiental
Limitar o acesso físico aos sistemas de informação, equipamentos e respectivos ambientes operacionais a pessoas autorizadas; proteger a planta física e a infraestrutura de suporte aos sistemas de informação.

### 12. Planejamento de Segurança
Desenvolver, documentar, atualizar periodicamente e implementar planos de segurança para sistemas de informação organizacionais que descrevam os controles de segurança em vigor ou planejados para os sistemas e as regras de comportamento.


### 13. Segurança do Pessoal
Garantir que os indivíduos que ocupem cargos de responsabilidade nas organizações sejam confiáveis e atendam aos critérios de segurança estabelecidos para esses cargos; garantir que as informações organizacionais sejam protegidas durante e após as ações de pessoal.


### 14. Avaliação de Riscos
Avaliar periodicamente o risco para as operações organizacionais, ativos organizacionais e indivíduos, resultantes da operação de sistemas de informações organizacionais e do processamento, armazenamento ou transmissão de informações organizacionais.

### 15. Aquisição de Sistemas e Serviços
Alocar recursos suficientes para proteger adequadamente os sistemas de informação organizacional; empregar processos de ciclo de vida de desenvolvimento de sistemas que incorporem considerações de segurança da informação.



### 16. Proteção do Sistema e das Comunicações
Monitorar, controlar e proteger as comunicações organizacionais nos limites externos e internos dos sistemas de informação; empregar projetos arquitetônicos e técnicas de desenvolvimento que promovam a segurança da informação efetiva.


### 17. Integridade do Sistema e da Informação
Identificar, reportar e corrigir informações e falhas do sistema de informação em tempo hábil; fornecer proteção contra códigos maliciosos em locais apropriados nos sistemas de informações organizacionais.


## Metodologias de Segurança da Informação

### Princípios de Projeto de Segurança

1. **Economia de mecanismo:** Design simples e pequeno
2. **Padrão à prova de falhas:** Decisões baseadas em permissão, não exclusão
3. **Mediação completa:** Verificação de cada acesso
4. **Design aberto:** Mecanismos abertos ao escrutínio público
5. **Separação de privilégio:** Múltiplos atributos necessários para acesso
6. **Privilégio mínimo:** Menor conjunto de privilégios necessários
7. **Mecanismo menos comum:** Minimizar funções compartilhadas
8. **Aceitabilidade psicológica:** Mecanismos não devem interferir no trabalho
9. **Isolamento:** Separação de sistemas e processos
10. **Encapsulamento:** Proteção baseada em funcionalidade orientada a objetos
11. **Modularidade:** Funções separadas e arquitetura modular
12. **Camadas:** Múltiplas abordagens de proteção sobrepostas

## Superfícies de Ataque

### Definição
Uma superfície de ataque consiste nas vulnerabilidades alcançáveis e exploráveis em um sistema.

### Exemplos
- Portas abertas em servidores Web
- Serviços internos ao firewall
- Código de processamento de dados
- Interfaces, SQL e formulários Web
- Funcionários vulneráveis à engenharia social

### Categorias

1. **Superfície de ataque de rede:** Vulnerabilidades em redes corporativas, WANs ou Internet
2. **Superfície de ataque de software:** Vulnerabilidades no código de aplicação
3. **Superfície de ataque humano:** Vulnerabilidades relacionadas a pessoas

## Estratégia de Segurança da Informação

Uma estratégia abrangente envolve três aspectos:

1. **Especificação/Política:** O que o esquema deve fazer?
2. **Implementação/Mecanismos:** Como faz?
3. **Correção/Garantia:** Isso realmente funciona?

### Política de Segurança
Uma **Política de Segurança da Informação** é um documento formal que estabelece as diretrizes, regras, padrões e procedimentos que uma organização deve seguir para proteger seus ativos de informação. É o alicerce de qualquer programa de segurança eficaz.
#### Fatores a Considerar
- Valor dos ativos protegidos
- Vulnerabilidades do sistema
- Ameaças potenciais e probabilidade de ataques

### Implementação de Segurança

Quatro cursos de ação complementares:

1. **Prevenção:** Impedir que ataques sejam bem-sucedidos
2. **Detecção:** Identificar ataques em andamento
3. **Resposta:** Interromper ataques detectados
4. **Recuperação:** Restaurar sistemas após comprometimento

## Criptografia

### Confidencialidade com Criptografia Simétrica

#### Componentes do Esquema Simétrico

1. **Texto simples:** Mensagem original
2. **Algoritmo de criptografia:** Realiza substituições e transformações
3. **Chave secreta:** Determina as transformações específicas
4. **Texto cifrado:** Mensagem codificada
5. **Algoritmo de descriptografia:** Processo inverso da criptografia

#### Requisitos para Uso Seguro

1. **Algoritmo forte:** Resistente à criptoanálise
2. **Distribuição segura de chaves:** Chaves devem ser mantidas em segredo

#### Tipos de Ataque

1. **Criptoanálise:** Exploração das características do algoritmo
2. **Força bruta:** Tentativa de todas as chaves possíveis

### Algoritmos de Criptografia de Bloco

#### Data Encryption Standard (DES)
- **Tamanho do bloco:** 64 bits
- **Tamanho da chave:** 56 bits
- **Status:** Obsoleto devido ao tamanho pequeno da chave

#### DES Triplo (3DES)
- **Método:** Repetição do DES três vezes
- **Tamanhos de chave:** 112 ou 168 bits
- **Status:** Extensão da vida útil do DES

#### Advanced Encryption Standard (AES)
- **Tamanho do bloco:** 128 bits
- **Tamanhos de chave:** 128, 192 e 256 bits
- **Status:** Substituto moderno do DES/3DES

## Autenticação de Mensagens e Funções Hash

### Autenticação de Mensagens

**Objetivo:** Verificar se mensagens são autênticas (genuínas e de fonte confiável)

#### Aspectos Importantes
- Verificação de integridade do conteúdo
- Autenticação da fonte
- Verificação de pontualidade
- Controle de sequência

### Métodos de Autenticação

#### Usando Criptografia Simétrica
- Apenas remetente e destinatário compartilham chave
- Inclusão de código de detecção de erro
- Numeração sequencial de mensagens
- Carimbos de data/hora

#### Sem Criptografia da Mensagem
- Geração de etiqueta de autenticação
- Anexação à mensagem para transmissão
- Mensagem permanece legível
- Possibilidade de combinação com criptografia

## Criptografia de Chave Pública

### Estrutura

**Característica principal:** Uso de duas chaves separadas (assimétrica)

#### Componentes

1. **Texto simples:** Mensagem legível de entrada
2. **Algoritmo de criptografia:** Transformações matemáticas
3. **Par de chaves:** Uma pública, uma privada
4. **Texto cifrado:** Mensagem codificada
5. **Algoritmo de descriptografia:** Recuperação do texto original

### Aplicações dos Criptossistemas de Chave Pública

1. **Assinatura digital:** Autenticação e não-repúdio
2. **Distribuição de chaves simétricas:** Troca segura de chaves
3. **Criptografia de dados:** Confidencialidade direta

---

## Lei Geral de Proteção de Dados – LGPD

### LEI Nº 13.709, DE 14 DE AGOSTO DE 2018

A Lei Geral de Proteção de Dados Pessoais (LGPD) protege os direitos fundamentais de liberdade e privacidade e a livre formação da personalidade de cada indivíduo.

### Abrangência da Lei

#### Vale para:
- Dados relacionados à pessoa (brasileira ou não) que esteja no Brasil no momento da coleta
- Dados tratados dentro do território nacional, independentemente do meio, país-sede do operador ou localização dos dados
- Dados usados para fornecimento de bens ou serviços

#### Não se aplica para fins exclusivamente:
- Jornalísticos e artísticos
- De segurança pública
- De defesa nacional
- De segurança do Estado
- De investigação e repressão de infrações penais
- Particulares (apenas para pessoa física/jurídica com fins econômicos)
- Dados de fora do Brasil sem transferência internacional

### Atores Envolvidos

- **Titular de dados:** Pessoa a quem se referem os dados pessoais
- **Controlador:** Entidade que toma decisões sobre o uso dos dados pessoais
- **Operador:** Entidade que processa dados conforme ordens do controlador
- **Encarregado (DPO):** Coordena ações de adequação e atua como canal de comunicação

### Fundamentos da LGPD

1. Respeito à privacidade
2. Autodeterminação informativa
3. Liberdade de expressão, informação, comunicação e opinião
4. Desenvolvimento econômico e tecnológico e inovação
5. Livre iniciativa, livre concorrência e defesa do consumidor
6. Direitos humanos, livre desenvolvimento da personalidade, dignidade e cidadania

### Itens Abordados pela LGPD

#### Dados Pessoais
Informação que permite identificação do titular, sozinha ou em conjunto com outros dados.

**Exemplos:** nome, apelido, endereço, e-mail, IP, números de cartões, cookies

#### Dados Sensíveis
Informações com características reveladoras sobre uma pessoa.

**Exemplos:** religião, etnia, sexo, posicionamento político, biometria, dados bancários

#### Tratamento de Dados
Utilização dos dados do usuário - deve ser transparente e consentida.

#### Titular dos Dados
Qualquer pessoa física que tenha fornecido dados pessoais.

### Direitos do Titular (Art. 18)

O titular pode solicitar a qualquer momento:

1. Confirmação da existência de tratamento
2. Acesso aos seus dados
3. Correção de dados incompletos, inexatos ou desatualizados
4. Anonimização, bloqueio ou eliminação de dados em desconformidade
5. Portabilidade dos dados
6. Eliminação dos dados pessoais
7. Informações sobre compartilhamento com terceiros
8. Informações sobre consequências da negativa de consentimento
9. Revogação do consentimento
10. Revisão de decisões automatizadas

### Consentimento aos Dados

**Privacy by Design:** Privacidade incorporada à arquitetura dos sistemas desde o projeto.

### Penalidades por Descumprimento (Art. 52)

1. **Advertência** com prazo para correções
2. **Multa simples** até 2% do faturamento, limitada a R$ 50 milhões por infração
3. **Multa diária** observado o limite total
4. **Publicização da infração**
5. **Bloqueio dos dados** até regularização
6. **Eliminação dos dados** relacionados à infração

### Aplicação Global

Empresas do exterior que tenham contato com brasileiros também devem se adequar à LGPD, independentemente de legislação específica em seus países de origem.

---

## Referência Bibliográfica

TANENBAUM, Andrew S. Redes de Computadores. Trad. 4. ed. Rio de Janeiro: Campus, 2003.