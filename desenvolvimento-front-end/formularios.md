# Formuláriop

## Input e TextArea
### CONCEITO
     
    No HTML, usamos <input> e <textarea> para criar campos onde os usuários podem inserir essas informações em uma página web.
    O <input> é um elemento usado para criar vários tipos de campos de entrada de dados em formulários.        
    O <textarea> é um elemento usado para criar campos de entrada de texto multilinha. 
``` css
input[type="text"], input[type="email"], textarea {
    width: 100%; /* Largura total do elemento pai */
    padding: 10px; /* Espaçamento interno */
    margin-bottom: 20px; /* Espaçamento inferior */
    border: 1px solid #ccc; /* Cor da borda */
    border-radius: 4px; /* Cantos arredondados */
    box-sizing: border-box; /* Inclui padding e border na largura total */
}

```
```html
<!-- Formulário de contato -->
    <form>
        <!-- Campo de texto para o nome -->
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" placeholder="Digite seu nome">
        
        <!-- Campo de texto para o email -->
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" placeholder="Digite seu email">
        
        <!-- Área de texto para a mensagem -->
        <label for="mensagem">Mensagem:</label>
        <textarea id="mensagem" name="mensagem" rows="4" placeholder="Digite sua mensagem"></textarea>
        
        <!-- Botão para enviar o formulário -->
        <button type="submit">Enviar</button>
    </form>
```

## Combobox e FieldSet

### Conceito
    Um combobox é um campo que combina uma caixa de texto com uma lista de opções que você pode escolher. 
    Pense nele como um menu suspenso (dropdown) que permite selecionar uma opção da lista. 
    No HTML, usamos a tag <select> para criar um combobox, e dentro dela, usamos a tag <option> para listar as opções.

    Um fieldset é uma forma de agrupar vários elementos de um formulário em uma seção com uma borda ao redor, ajudando a organizar melhor as informações. 
    Para criar um fieldset, usamos a tag <fieldset>, e para adicionar um título ou legenda ao grupo, usamos a tag <legend>. 

    ```html
        <!-- Usando fieldset para agrupar elementos relacionados -->
    <fieldset>
        <legend>Informações Pessoais</legend> <!-- Título do fieldset -->
        
        <!-- Campo de texto para nome -->
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome">
        
        <!-- Combobox (select) para escolher uma opção de país -->
        <label for="pais">País:</label>
        <select id="pais" name="pais">
            <option value="brasil">Brasil</option>
            <option value="argentina">Argentina</option>
            <option value="chile">Chile</option>
        </select>
    </fieldset>
    ```

## Label, Hidden, E-mail e Data
### CONCEITO

    Um label é uma etiqueta que descreve um campo de um formulário. 
    Ele ajuda a identificar o que o usuário deve inserir em determinado campo. 
    No HTML, usamos a tag <label>. 

    Um campo hidden é um campo de formulário que não é visível para o usuário. 
    Ele é usado para enviar informações que o usuário não precisa ver ou editar. 
    No HTML, usamos a tag <input> com o atributo type="hidden". 

    Um campo de email é um campo de formulário onde o usuário deve inserir um endereço de email. 
    No HTML, usamos a tag <input> com o atributo type="email".

    Um campo de data é um campo de formulário onde o usuário pode selecionar uma data. 
    No HTML, usamos a tag <input> com o atributo type="date".

```html
    <!-- Formulário de cadastro -->
    <form>
        <!-- Campo de texto para o nome, com rótulo (label) -->
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" placeholder="Digite seu nome">
        
        <!-- Campo de email, com rótulo (label) -->
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" placeholder="Digite seu email">
        
        <!-- Campo de data, com rótulo (label) -->
        <label for="dataNascimento">Data de Nascimento:</label>
        <input type="date" id="dataNascimento" name="dataNascimento">
        
        <!-- Campo oculto (hidden) -->
        <input type="hidden" id="userId" name="userId" value="12345">
        
        <!-- Botão para enviar o formulário -->
        <button type="submit">Enviar</button>
    </form>
```

## Tipos de botões
### CONCEITO

    Um botão simples é um botão que pode ser clicado para realizar alguma ação, como enviar um formulário ou executar um script. 
    
    No HTML, usamos a tag <button> ou a tag <input> com o atributo type="button". 

    ```html

        <div class="button-group">
            <!-- Botão padrão -->
            <button class="btn">Botão Padrão</button>
            <!-- Botão primário -->
            <button class="btn btn-primary">Botão Primário</button>
            <!-- Botão de sucesso -->
            <button class="btn btn-success">Botão de Sucesso</button>
            <!-- Botão de aviso -->
            <button class="btn btn-warning">Botão de Aviso</button>
            <!-- Botão de perigo -->
            <button class="btn btn-danger">Botão de Perigo</button>
            <!-- Botão desabilitado -->
            <button class="btn btn-disabled" disabled>Botão Desabilitado</button>
            <!-- Botão com ícone -->
            <button class="btn btn-icon"><span class="icon">⭐</span> Botão com Ícone</button>
        </div>
    ```

    ```css
    /* Estilizando o grupo de botões */
.button-group {
    display: flex; /* Usando flexbox para organizar botões */
    flex-wrap: wrap; /* Permitindo que os botões quebrem linha */
    gap: 10px; /* Espaçamento entre os botões */
    justify-content: center; /* Centralizando os botões */
}

/* Estilizando os botões */
.btn {
    padding: 10px 20px; /* Espaçamento interno */
    border: none; /* Sem borda */
    border-radius: 4px; /* Bordas arredondadas */
    font-size: 16px; /* Tamanho da fonte */
    cursor: pointer; /* Cursor de ponteiro */
    transition: background-color 0.3s; /* Transição suave */
}

/* Botão padrão */
.btn {
    background-color: #e0e0e0; /* Cor de fundo */
    color: #000; /* Cor do texto */
}

.btn:hover {
    background-color: #d5d5d5; /* Cor de fundo ao passar o mouse */
}

/* Botão primário */
.btn-primary {
    background-color: #007bff; /* Cor de fundo */
    color: #fff; /* Cor do texto */
}

.btn-primary:hover {
    background-color: #0056b3; /* Cor de fundo ao passar o mouse */
}

/* Botão de sucesso */
.btn-success {
    background-color: #28a745; /* Cor de fundo */
    color: #fff; /* Cor do texto */
}

.btn-success:hover {
    background-color: #218838; /* Cor de fundo ao passar o mouse */
}

/* Botão de aviso */
.btn-warning {
    background-color: #ffc107; /* Cor de fundo */
    color: #000; /* Cor do texto */
}

.btn-warning:hover {
    background-color: #e0a800; /* Cor de fundo ao passar o mouse */
}

/* Botão de perigo */
.btn-danger {
    background-color: #dc3545; /* Cor de fundo */
    color: #fff; /* Cor do texto */
}

.btn-danger:hover {
    background-color: #c82333; /* Cor de fundo ao passar o mouse */
}

/* Botão desabilitado */
.btn-disabled {
    background-color: #e0e0e0; /* Cor de fundo */
    color: #aaa; /* Cor do texto */
    cursor: not-allowed; /* Cursor não permitido */
}

/* Botão com ícone */
.btn-icon {
    display: flex; /* Usando flexbox para alinhar ícone e texto */
    align-items: center; /* Alinhando itens verticalmente */
    gap: 5px; /* Espaçamento entre ícone e texto */
}

.btn-icon .icon {
    font-size: 20px; /* Tamanho do ícone */
}
    ```
