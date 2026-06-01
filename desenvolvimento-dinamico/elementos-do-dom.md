# Elementos do DOM

## Conceito de DOM

- DOM (Document Object Model) é uma representação em árvore de um documento HTML ou XML, onde cada elemento do documento é representado como um objeto. O DOM permite que os desenvolvedores acessem e manipulem os elementos do documento de forma dinâmica, utilizando linguagens de programação como JavaScript.

## Como encontrar elementos no DOM

- **getElementById**: Retorna o elemento com o ID especificado.
- **getElementsByClassName**: Retorna uma coleção de elementos com a classe especificada.
- **getElementsByTagName**: Retorna uma coleção de elementos com a tag especificada.
- **querySelector**: Retorna o primeiro elemento que corresponde ao seletor CSS

## Criação e manipulação de elementos no DOM

**Criar**

- **createElement**: Cria um novo elemento HTML.
- **createTextNode**: Cria um novo nó de texto.
- **appendChild**: Adiciona um nó como filho de um elemento.
- **insertBefore**: Insere um nó antes de um nó filho especificado.
- **removeChild**: Remove um nó filho de um elemento.
- **replaceChild**: Substitui um nó filho por outro nó.

**Manipular**

- **innerHTML**: Permite acessar ou modificar o conteúdo HTML de um elemento.
- **textContent**: Permite acessar ou modificar o conteúdo de texto de um elemento.
- **setAttribute**: Define um atributo para um elemento.
