**Consultório Dentário (autoria própria, 2022).**


O consultório dentário do Dr. José Santos deseja informatizar seus procedimentos para melhorar o atendimento aos clientes e possuir maior controle, desenvolvendo um sistema Web que possa flexibilizar o agendamento das consultas e acompanhamento do fluxo financeiro.

O Dr. José apresenta os procedimentos de funcionamento do consultório:

O agendamento das consultas pode ser realizado pelo paciente ou pela secretária. Caso o paciente não tenha seus dados registrados é importante que seja realizado o cadastro de suas informações pessoais.

O agendamento poderá ser remarcado ou cancelado, também pelo paciente ou secretária.

A secretária é responsável por cadastrar os procedimentos que são oferecidos em tratamento dos pacientes, com a descrição e custo do serviço.

O dentista no atendimento ao paciente pode consultar o histórico de procedimentos já realizados nele e, ao final, registrar o que foi necessário efetuar na consulta, o que ocasiona atualização de efetivação na agenda.

Ao sair da consulta, o paciente se dirige até a recepção onde realizará o pagamento, a partir do valor calculado pela secretária. Após receber o pagamento ela registra e libera o paciente.

Além disso, o paciente poderá realizar uma avaliação do consultório, o que irá agregar muito valor na aplicação de melhorias do negócio.

Ao final do mês o dentista verifica os valores faturados e retira estatística de procedimentos realizados. Para essas visualizações o dentista solicita acesso pelo celular.


**Atividades Identificadas:**
- Agendar consulta
- Cadastrar paciente
- Remarcar consulta
- Cancelar consulta
- Cadastrar procedimento
- Atender paciente
- Consultar histórico do paciente
- Registrar procedimento realizado
- Realizar pagamento
- Calcular valor a pagar
- Receber Pagamento
- Registrar pagamento
- Realizar avaliação
- Verificar valores faturados
- Retirar estatísticas de procedimentos

**Tabela de Identificação:**
| Responsável                 | Atividade                     | Sequeência | Elementos de Fluxo |
|-----------------------------|-------------------------------|------------|--------------------|
| Paciente/Secretária         | Agendar consulta              |2           |Condicional com 3 e 4  |
|                             | Remarcar consulta             |3           |Condicional com 2 e 4  |
|                             | Cancelar consulta             |4           |Condicional com 2 e 3  |
|                             | Cadastrar paciente            |5           |Condicional (se necessário)|
|                             |                               |            |            |
| Secretária                  | Cadastrar procedimento        |1           | Inicio do modelo e tempo para paciente agendar|
|                             | Calcular valor a pagar        |9           | sequencial|
|                             | Receber pagamento             |11          | sequencial|
|                             | Registrar pagamento           |12          | sequencial|
|                             |                               |            |
| Dentista                    | Atender paciente              |6           | sequencial|
|                             | Consultar histórico do paciente|7          | condicional (se necessário)|
|                             | Registrar procedimento realizado|8         | sequencial|
|                             | Verificar valores faturados   |14          | final do mês
|                             | Retirar estatísticas de procedimentos|15   | paralelo ao 14|
|                             |                               |            | 
|Paciente                     | Realizar avaliação            |13          | condicional (não obrigatório)|
|                             | Realizar Pagamento            |10          | sequencial|
|                             |                               |            |
__________________________________________________________________
Comparativo entre Diagrama de Caso de Uso e Modelagem de Processo (BPMN)
----------------------------------------------------------------
O diagrama de caso de uso e o BPMN são ferramentas úteis para entender um negócio. O diagrama de caso de uso oferece uma visão sistêmica, enquanto o BPMN detalha o processo de negócio, incluindo todas as atividades e suas interações.

Em um consultório dentário, o diagrama de caso de uso mostra a interação entre registrar pagamento e calcular o valor do serviço. Já o BPMN detalha a sequência, primeiro calculando o valor e depois registrando o pagamento.

Recomenda-se usar o modelo de processo durante o levantamento de dados para ter uma visão geral do negócio. Posteriormente, o diagrama de caso de uso pode ser usado para detalhar as partes que serão implementadas com apoio da tecnologia.