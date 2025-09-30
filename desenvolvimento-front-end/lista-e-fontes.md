## Fonte

### Conceito

Imagine que você tem um pedaço de papel com uma frase escrita nele. 
Agora, você quer mudar a aparência dessa frase, talvez tornando-a mais bonita, legível, ou atraente. 
Essa mudança na aparência do texto é o que chamamos de "estilo de fontes".

No HTML e CSS, os estilos de fontes são usados para alterar a aparência dos textos. 
Isso inclui mudar o tipo de letra, o tamanho, a cor, o espaçamento entre as letras, entre outras características. 
Usar diferentes estilos de fontes ajuda a dar personalidade ao texto e pode influenciar a forma como a informação é percebida pelo leitor.
```css
/* Fonte padrão */
.default-font {
    /* Define a fonte como Arial ou, se não disponível, uma fonte sem serifa genérica */
    font-family: Arial, sans-serif;
}

/* Fonte serifada */
.serif-font {
    /* Define a fonte como 'Times New Roman' ou, se não disponível, uma fonte serifada genérica */
    font-family: 'Times New Roman', serif;
}

/* Fonte sem serifa */
.sans-serif-font {
    /* Define a fonte como 'Helvetica' ou, se não disponível, uma fonte sem serifa genérica */
    font-family: 'Helvetica', sans-serif;
}

/* Fonte monoespaçada */
.monospace-font {
    /* Define a fonte como 'Courier New' ou, se não disponível, uma fonte monoespaçada genérica */
    font-family: 'Courier New', monospace;
}

/* Fonte cursiva */
.cursive-font {
    /* Define a fonte como 'Comic Sans MS' ou, se não disponível, uma fonte cursiva genérica */
    font-family: 'Comic Sans MS', cursive;
}

/* Fonte decorativa */
.fancy-font {
    /* Define a fonte como 'Papyrus' ou, se não disponível, uma fonte decorativa genérica */
    font-family: 'Papyrus', fantasy;
}

/* Fonte em negrito */
.bold-font {
    /* Define o peso da fonte como negrito */
    font-weight: bold;
}

/* Fonte em itálico */
.italic-font {
    /* Define o estilo da fonte como itálico */
    font-style: italic;
}

/* Fonte em maiúsculas */
.uppercase-font {
    /* Transforma o texto para maiúsculas */
    text-transform: uppercase;
}
```

## Alinhamento de fontes
## CONCEITO

Imagine que você tem um pedaço de papel com uma frase escrita nele. 
Agora, você quer posicionar essa frase de maneira específica no papel, como centralizá-la, alinhá-la à direita ou à esquerda. 
Essa posição específica da frase é o que chamamos de "alinhamento de fontes".

No HTML e CSS, o alinhamento de fontes é usado para definir a posição do texto dentro de um elemento. 
Isso ajuda a organizar o conteúdo de maneira clara e visualmente agradável, facilitando a leitura e destacando partes importantes da página.

```css
/* Alinhamentos de texto */
.align-left {
    /* Alinha o texto à esquerda */
    text-align: left;
}

.align-center {
    /* Centraliza o texto horizontalmente */
    text-align: center;
}

.align-right {
    /* Alinha o texto à direita */
    text-align: right;
}

.align-justify {
    /* Justifica o texto, distribuindo o espaço uniformemente entre as palavras */
    text-align: justify;
}

/* Alinhamentos verticais */
.align-top {
    /* Alinha o conteúdo ao topo */
    justify-content: flex-start;
    align-items: flex-start;
}

.align-middle {
    /* Centraliza o conteúdo verticalmente */
    justify-content: center;
    align-items: center;
}

.align-bottom {
    /* Alinha o conteúdo ao fundo */
    justify-content: flex-end;
    align-items: flex-end;
}
```

## Listas mais utilizadas

### Conceito

Imagine que você tem um pedaço de papel e quer organizar algumas informações em formato de lista, como uma lista de compras ou uma lista de tarefas. 
Para fazer isso, você pode usar dois tipos principais de listas: uma lista ordenada (numerada) ou uma lista não ordenada (com marcadores).

No HTML e CSS, listas são usadas para organizar e apresentar informações de maneira clara e estruturada. 
Existem dois tipos principais de listas que são amplamente utilizadas:
Lista Ordenada (Ordered List)
Lista Não Ordenada (Unordered List)

```html
        <section>
        <!-- Seção para lista não ordenada -->
        <h2>Lista Não Ordenada</h2>
        <!-- Título da seção -->
        <ul class="unordered-list">
            <!-- Lista não ordenada (bullet points) com a classe "unordered-list" -->
            <li>Item 1</li>
            <!-- Primeiro item da lista -->
            <li>Item 2</li>
            <!-- Segundo item da lista -->
            <li>Item 3</li>
            <!-- Terceiro item da lista -->
            <li>Item 4</li>
            <!-- Quarto item da lista -->
        </ul>
    </section>

    <section>
        <!-- Seção para lista ordenada -->
        <h2>Lista Ordenada</h2>
        <!-- Título da seção -->
        <ol class="ordered-list">
            <!-- Lista ordenada (números) com a classe "ordered-list" -->
            <li>Primeiro item</li>
            <!-- Primeiro item da lista ordenada -->
            <li>Segundo item</li>
            <!-- Segundo item da lista ordenada -->
            <li>Terceiro item</li>
            <!-- Terceiro item da lista ordenada -->
            <li>Quarto item</li>
            <!-- Quarto item da lista ordenada -->
        </ol>
    </section>

    <section>
        <!-- Seção para lista aninhada -->
        <h2>Lista Aninhada</h2>
        <!-- Título da seção -->
        <ul class="nested-list">
            <!-- Lista não ordenada principal com a classe "nested-list" -->
            <li>Item 1
                <!-- Primeiro item da lista principal com uma sublista -->
                <ul>
                    <!-- Sublista não ordenada dentro do item 1 -->
                    <li>Subitem 1.1</li>
                    <!-- Primeiro subitem da sublista -->
                    <li>Subitem 1.2</li>
                    <!-- Segundo subitem da sublista -->
                </ul>
            </li>
            <li>Item 2
                <!-- Segundo item da lista principal com uma sublista -->
                <ul>
                    <!-- Sublista não ordenada dentro do item 2 -->
                    <li>Subitem 2.1</li>
                    <!-- Primeiro subitem da sublista -->
                    <li>Subitem 2.2</li>
                    <!-- Segundo subitem da sublista -->
                </ul>
            </li>
        </ul>
    </section>

    <section>
        <!-- Seção para lista de descrição -->
        <h2>Lista de Descrição</h2>
        <!-- Título da seção -->
        <dl class="description-list">
            <!-- Lista de descrição com a classe "description-list" -->
            <dt>HTML</dt>
            <!-- Termo a ser descrito -->
            <dd>Uma linguagem de marcação para criar páginas web.</dd>
            <!-- Descrição do termo HTML -->
            <dt>CSS</dt>
            <!-- Outro termo a ser descrito -->
            <dd>Uma linguagem de folha de estilo usada para descrever a apresentação de um documento escrito em HTML ou XML.</dd>
            <!-- Descrição do termo CSS -->
            <dt>JavaScript</dt>
            <!-- Outro termo a ser descrito -->
            <dd>Uma linguagem de programação comumente usada no desenvolvimento web.</dd>
            <!-- Descrição do termo JavaScript -->
        </dl>
    </section>
</div>
```
```css
/* Lista não ordenada (bullet points) */
.unordered-list {
    /* Define o tipo de marcador da lista como discos (círculos preenchidos) */
    list-style-type: disc;
    /* Adiciona um preenchimento à esquerda de 20 pixels para alinhar os itens da lista */
    padding-left: 20px;
}

/* Lista ordenada (números) */
.ordered-list {
    /* Define o tipo de marcador da lista como números decimais */
    list-style-type: decimal;
    /* Adiciona um preenchimento à esquerda de 20 pixels para alinhar os itens da lista */
    padding-left: 20px;
}

/* Lista aninhada (sublistas) */
.nested-list {
    /* Define o tipo de marcador da lista como discos (círculos preenchidos) para a lista principal */
    list-style-type: disc;
    /* Adiciona um preenchimento à esquerda de 20 pixels para alinhar os itens da lista */
    padding-left: 20px;
}

/* Estilo para as sublistas dentro da lista aninhada */
.nested-list ul {
    /* Define o tipo de marcador da sublista como círculos (círculos não preenchidos) */
    list-style-type: circle;
    /* Adiciona um preenchimento à esquerda de 20 pixels para alinhar os itens da sublista */
    padding-left: 20px;
}

/* Lista de descrição */

/* Estilo para os termos a serem descritos na lista de descrição */
.description-list dt {
    /* Define o peso da fonte como negrito */
    font-weight: bold;
}

/* Estilo para as descrições dos termos na lista de descrição */
.description-list dd {
    /* Adiciona uma margem à esquerda de 20 pixels para alinhar as descrições */
    margin-left: 20px;
}
```

## Lista estruturadas
### CONCEITO

No HTML e CSS, listas estruturadas são usadas para criar listas com múltiplos níveis de hierarquia. 
Isso é útil para mostrar relações entre itens e subitens, como em um índice de livro, menu de navegação, ou listas de tarefas com subtarefas.