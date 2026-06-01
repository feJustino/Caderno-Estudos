# Promises

## Definição
Promessas são objetos que representam o resultado de uma operação assíncrona, podendo ser um sucesso ou uma falha. Elas são fundamentais para lidar com operações que não ocorrem de forma imediata, permitindo uma melhor organização do código.
- Uma promessa pode estar em um dos seguintes estados:
  - Pendente (Pending): O estado inicial, onde a operação ainda não foi concluída.
  - Resolvida (Fulfilled): A operação foi concluída com sucesso, e a promessa tem um valor associado.
  - Rejeitada (Rejected): A operação falhou, e a promessa tem um motivo de rejeição associado.
## Desafios no uso de promise
- Compreensão assincronas
- Gestão de erros
- Encadeamento complexo
  - Que ponto que termina uma que ponto que começa outra
- Promessa não nativas
## Como utilizar promises
```javascript
function minhaFuncaoAssincrona() {
  return new Promise((resolve, reject) => {
    // Simulando uma operação assíncrona
    setTimeout(() => {
      const sucesso = true; // Simulando um resultado de sucesso
      if (sucesso) {
        resolve("Operação concluída com sucesso!");
      } else {
        reject("Ocorreu um erro na operação.");
      }
    }, 2000);
  });
}
```