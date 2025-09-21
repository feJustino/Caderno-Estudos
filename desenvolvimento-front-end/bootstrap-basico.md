# Bootstrap Básico - Guia Introdutório

## 📋 Sumário

1. [O que é Bootstrap](#o-que-é-bootstrap)
2. [Por que Usar Bootstrap](#por-que-usar-bootstrap)
3. [Como Começar](#como-começar)
4. [Sistema de Grid](#sistema-de-grid)
5. [Componentes Essenciais](#componentes-essenciais)
6. [Atividade Prática](#atividade-prática)
7. [Recursos Adicionais](#recursos-adicionais)

---

## 🎯 O que é Bootstrap

O **Bootstrap** é um dos frameworks front-end mais populares do mundo, desenvolvido pelo Twitter. É um conjunto abrangente de ferramentas de código aberto que permite criar sites e aplicações web de forma rápida e eficiente.

### 🔧 Principais Componentes:

| Componente | Descrição | Funcionalidade |
|------------|-----------|----------------|
| **CSS** | Estilos prontos | Tipografia, cores, layouts |
| **JavaScript** | Componentes interativos | Modais, dropdowns, carrosséis |
| **Ícones** | Biblioteca de ícones | Bootstrap Icons |
| **Grid System** | Sistema de grades | Layout responsivo |

> **📝 Definição**: Framework CSS que fornece componentes pré-construídos e um sistema de grid responsivo para desenvolvimento web rápido e consistente.

---

## ⭐ Por que Usar Bootstrap

### 🚀 **Principais Vantagens:**

- **⚡ Redução de Código CSS**: Diminui até 80% do código CSS necessário
- **📱 Layout Responsivo**: Sistema de grid de 12 colunas que se adapta automaticamente
- **🎨 Componentes Prontos**: Botões, formulários, navegação e muito mais
- **🛠️ Facilidade de Uso**: Copy & paste da documentação oficial
- **📏 Conformidade W3C**: Segue padrões estabelecidos de desenvolvimento web

---

## 🚀 Como Começar

### **Método 1: CDN (Mais Rápido)**

Adicione estes links no `<head>` do seu HTML:

```html
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Meu Site com Bootstrap</title>
    
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <!-- Conteúdo da página -->
    
    <!-- Bootstrap JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
```

### **Método 2: Download Local**

1. Acesse: [https://getbootstrap.com](https://getbootstrap.com)
2. Clique em "Download"
3. Extraia os arquivos no seu projeto
4. Referencie os arquivos locais:

```html
<!-- CSS Local -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- JavaScript Local -->
<script src="js/bootstrap.bundle.min.js"></script>
```

---

## 📐 Sistema de Grid

O sistema de grid do Bootstrap é baseado em **12 colunas** e torna a criação de layouts responsivos muito mais simples que com HTML e CSS puros.

### 🔧 **Configuração Básica (3 Passos Essenciais)**

1. **📄 Estrutura HTML**: No VS Code, digite `Shift + !` + `Enter` para criar estrutura básica
2. **🎨 CSS Bootstrap**: Adicionar link no `<head>` do HTML
3. **⚙️ JavaScript Bootstrap**: Incluir script no final do `<body>`

### 📱 **Classes de Breakpoints**

| Classe | Tela | Largura |
|--------|------|---------|
| `col-sm-*` | Small | ≥576px (tablets) |
| `col-md-*` | Medium | ≥768px (desktops pequenos) |
| `col-lg-*` | Large | ≥992px (desktops grandes) |
| `col-xl-*` | Extra Large | ≥1200px (telas grandes) |

### 💻 **Exemplo Prático de Grid**

```html
<div class="container">
    <h1 class="text-center my-4">Sistema de Grid Bootstrap</h1>
    <div class="row">
        <!-- Responsivo: 4 colunas (sm), 6 colunas (md), 4 colunas (lg) -->
        <div class="col-sm-4 col-md-6 col-lg-4">
            <div class="bg-primary text-white p-3">Coluna 1</div>
        </div>
        <div class="col-sm-4 col-md-6 col-lg-4">
            <div class="bg-secondary text-white p-3">Coluna 2</div>
        </div>
        <div class="col-sm-4 col-md-12 col-lg-4">
            <div class="bg-success text-white p-3">Coluna 3</div>
        </div>
    </div>
</div>
```

---

## 🧩 Componentes Essenciais

O Bootstrap oferece componentes prontos que você pode copiar da documentação oficial e personalizar conforme necessário.

### 📋 **Componentes Principais**

| Componente | Uso | Classe Principal |
|------------|-----|------------------|
| **Navegação** | Menus e barras | `.navbar` |
| **Cartões** | Conteúdo organizado | `.card` |
| **Botões** | Ações e links | `.btn` |
| **Alertas** | Mensagens informativas | `.alert` |
| **Formulários** | Entrada de dados | `.form-control` |

### 🎯 **Exemplo: Navbar Responsiva**

```html
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">
        <a class="navbar-brand" href="#">Meu Site</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link active" href="#">Início</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Sobre</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Contato</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
```

---

## 🎨 Primeiros Passos
### **Classes Essenciais para Começar**

| Classe | Função | Exemplo |
|--------|--------|---------|
| `.container` | Container responsivo | `<div class="container">` |
| `.row` | Linha do grid | `<div class="row">` |
| `.col-*` | Colunas responsivas | `<div class="col-md-6">` |
| `.btn` | Botões estilizados | `<button class="btn btn-primary">` |
| `.card` | Cards/cartões | `<div class="card">` |
| `.navbar` | Barra de navegação | `<nav class="navbar">` |

```html
    <div class="container">
        <h1 class="text-center my-4">Exemplo de Grid do Bootstrap</h1>
        <!-- Sistema de grid do Bootstrap -->
        <div class="row">
            <!-- Coluna que ocupa 4 colunas em telas pequenas, 6 colunas em telas médias e 4 colunas em telas grandes -->
            <div class="col-sm-4 col-md-6 col-lg-4 box">Coluna 1</div>
            <!-- Coluna que ocupa 4 colunas em telas pequenas, 6 colunas em telas médias e 4 colunas em telas grandes -->
            <div class="col-sm-4 col-md-6 col-lg-4 box">Coluna 2</div>
            <!-- Coluna que ocupa 4 colunas em telas pequenas, 12 colunas em telas médias e 4 colunas em telas grandes -->
            <div class="col-sm-4 col-md-12 col-lg-4 box">Coluna 3</div>
        </div>
    </div>
```

---

## 📝 Atividade Prática

### **🎯 Objetivo**: Criar uma página HTML responsiva com Bootstrap

**📋 Elementos Obrigatórios:**
- ✅ Cabeçalho com título
- ✅ Menu de navegação (3 links mínimo)
- ✅ Seção principal com texto e imagem
- ✅ Rodapé com copyright

### 🔧 **Estrutura Completa**

```html
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página Bootstrap Básica</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <!-- Cabeçalho -->
    <header class="bg-primary text-white text-center py-4">
        <div class="container">
            <h1>Meu Site Bootstrap</h1>
            <p class="lead">Exemplo prático de uso do framework</p>
        </div>
    </header>

    <!-- Navegação -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand" href="#">Meu Site</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link active" href="#">Início</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Sobre</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Contato</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Conteúdo Principal -->
    <main class="container my-5">
        <div class="row align-items-center">
            <div class="col-md-8">
                <h2>Bem-vindo ao Bootstrap!</h2>
                <p class="lead">Este é um exemplo prático de página usando Bootstrap. 
                O framework facilita a criação de layouts responsivos e modernos.</p>
                <p>Com o sistema de grid de 12 colunas, você pode criar layouts 
                que se adaptam perfeitamente a qualquer dispositivo.</p>
                <button class="btn btn-primary me-2">Saiba Mais</button>
                <button class="btn btn-outline-secondary">Contato</button>
            </div>
            <div class="col-md-4 text-center">
                <img src="https://via.placeholder.com/300x200/007bff/ffffff?text=Bootstrap" 
                     alt="Bootstrap Logo" class="img-fluid rounded shadow">
            </div>
        </div>
    </main>

    <!-- Rodapé -->
    <footer class="bg-light text-center py-4 mt-auto">
        <div class="container">
            <p class="mb-0">&copy; 2025 Seu Nome. Todos os direitos reservados.</p>
        </div>
    </footer>

    <!-- Bootstrap JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
```

### 💡 **Dicas Importantes**
- 📱 **Teste a responsividade** redimensionando o navegador
- 🎨 **Personalize as cores** usando classes como `bg-primary`, `bg-secondary`
- 📝 **Ajuste apenas textos e imagens**, mantenha a estrutura Bootstrap
- 🔗 **Use a documentação oficial** para explorar mais componentes

---

## 📚 Recursos Adicionais

### **🎥 Conteúdo Complementar**
- **Vídeo Recomendado**: "Como usar o Sistema de Grid do Bootstrap? Grid System Bootstrap para iniciantes" - Canal Professor Miltin (YouTube)

### **🔗 Links Úteis**
- **Documentação Oficial**: [https://getbootstrap.com](https://getbootstrap.com)
- **Exemplos Prontos**: [Bootstrap Examples](https://getbootstrap.com/docs/5.3/examples/)
- **Bootstrap Icons**: [https://icons.getbootstrap.com](https://icons.getbootstrap.com)

### **📖 Bibliografia**
- BONATTI, D. **Desenvolvimento de Sites Dinâmicos com Dreamweaver CC**. Brasport: 2013.
- MARINHO, A. L.; CRUZ, J. L. da. **Desenvolvimento de aplicações para Internet**. 2.ed. Pearson: 2020.
- NEVES, M. C. B. de A. **Sites de Alta Performance**. Contentus: 2020.

### **🚀 Próximos Passos**
1. **Explore componentes**: Cards, modais, carrosséis
2. **Pratique o grid system**: Diferentes combinações de colunas  
3. **Personalize temas**: Aprenda a customizar cores e estilos
4. **Estude JavaScript**: Componentes interativos do Bootstrap

---

*🎯 **Lembre-se**: O Bootstrap reduz significativamente o tempo de desenvolvimento. Foque em copiar componentes da documentação oficial e personalize apenas o que for necessário!*