# Threads

## O que são Threads?

- Exemplos: Final de semana cozinhei, coloquei a carne depois que ficou pronta começar a cozinhar batatas, depois que as batatas ficaram prontas comecei a cozinhar o arroz, e assim por diante. Se eu tivesse que cozinhar tudo de uma vez, não conseguiria fazer nada direito. As threads são como cozinheiros em uma cozinha, cada um responsável por uma tarefa específica, trabalhando em paralelo para garantir que tudo seja feito de maneira eficiente.

- Threads são unidades de execução dentro de um processo, permitindo que múltiplas tarefas sejam realizadas simultaneamente. Elas compartilham o mesmo espaço de memória, o que facilita a comunicação entre elas, mas também requer cuidado para evitar conflitos e garantir a sincronização adequada.
  - Gerenciador de tarefas: O sistema operacional gerencia as threads, alocando tempo de CPU para cada uma delas. Ele pode usar técnicas como escalonamento para garantir que todas as threads tenham a oportunidade de executar.

## Estados de uma Thread

- Agendador de threads no Java: O Java possui um agendador de threads que gerencia a execução das threads. Ele é responsável por decidir qual thread deve ser executada em um determinado momento, com base em critérios como prioridade e tempo de execução. O agendador de threads no Java é preemptivo, o que significa que ele pode interromper uma thread em execução para dar lugar a outra thread de maior prioridade.
- Estados de uma thread:
  - Nova (new/start): A thread foi criada, mas ainda não foi iniciada.
  - Pronta (runnable): A thread está pronta para ser executada, mas ainda não foi selecionada pelo agendador.
  - Executando (running): A thread está em execução.
  - Bloqueada (blocked): A thread está esperando por um recurso ou por um evento.
  - Terminado (terminated): A thread concluiu sua execução.

# Threads em Java

- Em Java, as threads podem ser criadas de duas maneiras principais:
  - Implementando a interface `Runnable`: Você pode criar uma classe que implementa a interface `Runnable` e, em seguida, passar uma instância dessa classe para um objeto `Thread`.
  - Estendendo a classe `Thread`: Você pode criar uma classe que estende a classe `Thread` e, em seguida, criar uma instância dessa classe para iniciar a thread.
- Exemplo de criação de thread usando a interface `Runnable`:

```java
public class MinhaThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread em execução: " + Thread.currentThread().getName());
    }
}
```

- Exemplo de criação de thread estendendo a classe `Thread`:

```java
public class MinhaThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread em execução: " + Thread.currentThread().getName());
    }
}
```

- Para iniciar uma thread, você pode usar o método `start()`.

## Multithreading e Concorrência

- Multithreading é a capacidade de um programa de executar múltiplas threads simultaneamente. Isso permite que o programa realize várias tarefas ao mesmo tempo, melhorando a eficiência e a responsividade.
- Concorrência é a capacidade de um programa de lidar com múltiplas tarefas ao mesmo tempo, mesmo que elas não sejam executadas simultaneamente. Em um ambiente concorrente, as threads podem ser executadas em momentos diferentes, mas o programa é projetado para lidar com essa situação de maneira eficiente, garantindo que as tarefas sejam concluídas corretamente, mesmo que sejam executadas em momentos diferentes
- Sincronização é o processo de coordenar o acesso a recursos compartilhados entre múltiplas threads para evitar conflitos e garantir a integridade dos dados. Em Java, a sincronização pode ser alcançada usando palavras-chave como `synchronized` ou utilizando classes de sincronização, como `Lock` e `Semaphore`. A sincronização é essencial para evitar condições de corrida, onde múltiplas threads tentam acessar e modificar o mesmo recurso ao mesmo tempo, o que pode levar a resultados imprevisíveis e erros no programa.
