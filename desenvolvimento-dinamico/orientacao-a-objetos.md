# Orientação a Objetos

## Conceitos

É uma forma que busca projetar o mundo real ao código;
Tem como principal objetivo: organizar e estrutura o codigo de forma mais modular, flexivel e reutilizável;

## Definição de classe e objetos

- **Classe**: É um modelo ou uma estrutura que define as características e comportamentos de um tipo específico de objeto. Ela serve como um molde para criar objetos, especificando os atributos (propriedades) e métodos (funções) que os objetos dessa classe terão. Por exemplo, uma classe "Carro" pode ter atributos como "marca", "modelo" e "ano", e métodos como "acelerar" e "frear".
- **Objeto**: É uma instância de uma classe, ou seja, é um elemento concreto criado a partir do modelo definido pela classe. Cada objeto tem seus próprios valores para os atributos definidos na classe e pode executar os métodos da classe. Por exemplo, um objeto da classe "Carro" pode ser um carro específico, como um "Toyota Corolla 2020", com seus próprios valores para marca, modelo e ano, e pode executar os métodos de acelerar e frear.

```javascript
class Carro {
  // define as propriedades do carro
  constructor(marca, modelo, ano) {
    // instancia as propriedades do carro
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
  }

  acelerar() {
    console.log(`${this.marca} ${this.modelo} está acelerando!`);
  }

  frear() {
    console.log(`${this.marca} ${this.modelo} está freando!`);
  }
}

const meuCarro = new Carro("Toyota", "Corolla", 2020);
meuCarro.acelerar(); // Output: Toyota Corolla está acelerando!
meuCarro.frear(); // Output: Toyota Corolla está freando!
```

## Herança e Encapsulamento

- **Herança**: É um princípio da orientação a objetos que permite que uma classe (chamada classe filha ou subclasse) herde atributos e métodos de outra classe (chamada classe pai ou superclasse). Isso promove a reutilização de código e a criação de hierarquias de classes. Por exemplo, uma classe "Veículo" pode ser a superclasse, e as classes "Carro" e "Moto" podem ser subclasses que herdam os atributos e métodos da classe "Veículo", além de adicionar suas próprias características específicas.
- **Encapsulamento**: É um princípio da orientação a objetos que consiste em ocultar os detalhes internos de uma classe e expor apenas uma interface pública para interagir com os objetos dessa classe. Isso ajuda a proteger os dados e a garantir que os objetos sejam usados de maneira controlada. Por exemplo, em uma classe "ContaBancária", os detalhes de como os dados são armazenados e manipulados podem ser ocultados, e apenas métodos públicos como "depositar" e "sacar" são expostos para interagir com a conta bancária.

```javascript
class Carro {
  // define as propriedades do carro
  constructor(marca, modelo, ano) {
    // instancia as propriedades do carro

    // o "_" é uma convenção para indicar que a propriedade é privada e não deve ser acessada diretamente fora da classe. Isso ajuda a proteger os dados e a garantir que os objetos sejam usados de maneira controlada, promovendo o encapsulamento.
    this._marca = marca;
    this._modelo = modelo;
    this._ano = ano;
  }

  // getters e setters para acessar e modificar as propriedades do carro
  get marca() {
    return this._marca;
  }

  get modelo() {
    return this._modelo;
  }

  get ano() {
    return this._ano;
  }

  set marca(novaMarca) {
    this._marca = novaMarca;
  }

  set modelo(novoModelo) {
    this._modelo = novoModelo;
  }

  set ano(novoAno) {
    this._ano = novoAno;
  }

  acelerar() {
    console.log(`${this.marca} ${this.modelo} está acelerando!`);
  }

  frear() {
    console.log(`${this.marca} ${this.modelo} está freando!`);
  }
}

class CarroEsportivo extends Carro {
  constructor(marca, modelo, ano, velocidadeMaxima) {
    super(marca, modelo, ano); // chama o construtor da classe pai (Carro)
    this.velocidadeMaxima = velocidadeMaxima; // adiciona um novo atributo específico para carros esportivos
  }

  mostrarVelocidadeMaxima() {
    console.log(
      `${this.marca} ${this.modelo} tem uma velocidade máxima de ${this.velocidadeMaxima} km/h!`,
    );
  }

  acelerar() {
    super.acelerar(); // chama o método acelerar da classe pai (Carro)
    console.log("Não se esqueça de respeitar os limites de velocidade!");
  }
}
```

## Abstração e Polimorfismo

- **Abstração**: É um princípio da orientação a objetos que consiste em focar nos aspectos essenciais de um objeto, ocultando os detalhes desnecessários. Isso permite que os desenvolvedores trabalhem com objetos de maneira mais simples e eficiente, sem se preocupar com a complexidade interna. Por exemplo, ao usar um carro, você não precisa saber como o motor funciona para dirigir; você apenas interage com os controles do carro, como o volante e os pedais.
- **Polimorfismo**: É um princípio da orientação a objetos que permite que objetos de diferentes classes sejam tratados como objetos da mesma classe através de uma interface comum. Isso é possível porque as classes podem implementar os mesmos métodos, mesmo que tenham implementações diferentes. Por exemplo, se você tiver uma classe "Animal" com um método "fazerSom()", e classes "Cachorro" e "Gato" que herdam de "Animal" e implementam o método "fazerSom()" de maneiras diferentes (o cachorro late e o gato mia), você pode tratar ambos os objetos como instâncias da classe "Animal" e chamar o método "fazerSom()" sem se preocupar com a classe específica do objeto.

````javascript
class Imovel {
  constructor(endereco, tamanho) {
    this.endereco = endereco;
    this.tamanho = tamanho;
  }

  descricao() {
    throw new Error("O método descricao() deve ser implementado pelas subclasses.");
  }
}

class Casa extends Imovel {
  constructor(endereco, tamanho, numQuartos) {
    super(endereco, tamanho);
    this.numQuartos = numQuartos;
  }

  descricao() {
    return `Casa localizada em ${this.endereco}, com tamanho de ${this.tamanho} metros quadrados e ${this.numQuartos} quartos.`;
  }
}

class Apartamento extends Imovel {
  constructor(endereco, tamanho, andar) {
    super(endereco, tamanho);
    this.andar = andar;
  }

  descricao() {
    return `Apartamento localizado em ${this.endereco}, com tamanho de ${this.tamanho} metros quadrados e localizado no andar ${this.andar}.`;
  }
}

```
````
