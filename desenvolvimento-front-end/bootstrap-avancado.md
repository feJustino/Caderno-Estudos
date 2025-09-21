# Bootstrap Avançado - Guia Prático

## 📚 Índice
1. [Introdução](#introdução)
2. [Imagens Responsivas](#imagens-responsivas)
3. [Cards](#cards)
4. [Modais](#modais)
5. [Tabelas](#tabelas)
6. [Atividade Prática](#atividade-prática)
7. [Conteúdo Bônus](#conteúdo-bônus)
8. [Referências](#referências)

---

## 🎯 Introdução

O **Bootstrap Avançado** representa um passo importante no desenvolvimento front-end moderno. Este guia aborda quatro componentes essenciais que transformam interfaces básicas em experiências ricas e interativas:

- **Imagens Responsivas**: Adaptação automática a diferentes dispositivos
- **Cards**: Containers versáteis para organização de conteúdo  
- **Modais**: Janelas interativas para melhor UX
- **Tabelas**: Apresentação elegante de dados estruturados

### 🚀 Vantagens do Bootstrap
- **80% menos código** comparado ao CSS puro
- **Responsividade nativa** em todos os componentes
- **Consistência visual** garantida
- **Desenvolvimento ágil** e padronizado

---

## 📸 Imagens Responsivas
> **Documentação oficial**: [Bootstrap Images](https://getbootstrap.com/docs/5.3/content/images/#responsive-images)

As imagens são elementos fundamentais em qualquer interface web. O Bootstrap simplifica drasticamente sua implementação e estilização.

### 🔧 Classes Principais

#### 1. Imagem Responsiva
```html
<img src="exemplo.jpg" class="img-fluid" alt="Imagem responsiva">
```
- **`img-fluid`**: Adapta automaticamente ao container
- **Comportamento**: `max-width: 100%` e `height: auto`

#### 2. Miniaturas
```html
<img src="thumb.jpg" class="img-thumbnail" alt="Miniatura">
```
- **`img-thumbnail`**: Cria bordas arredondadas de 1px
- **Uso**: Galerias, listas de produtos, perfis

#### 3. Bordas Arredondadas
```html
<img src="perfil.jpg" class="rounded" alt="Imagem com bordas suaves">
<img src="avatar.jpg" class="rounded-circle" alt="Avatar circular">
```

#### 4. Alinhamento
```html
<img src="logo.jpg" class="float-left" alt="Alinhado à esquerda">
<img src="banner.jpg" class="mx-auto d-block" alt="Centralizado">
```

### � Tabela de Classes - Imagens

| Classe | Quando Utilizar | Para que Serve | Exemplo |
|--------|-----------------|----------------|---------|
| `img-fluid` | Sempre que precisar de responsividade | Torna a imagem responsiva (`max-width: 100%`) | `<img class="img-fluid">` |
| `img-thumbnail` | Para miniaturas e galerias | Adiciona borda arredondada de 1px | `<img class="img-thumbnail">` |
| `rounded` | Para suavizar bordas | Aplica `border-radius: 0.375rem` | `<img class="rounded">` |
| `rounded-circle` | Para avatars circulares | Torna a imagem perfeitamente circular | `<img class="rounded-circle">` |
| `rounded-pill` | Para imagens ovais | Aplica bordas muito arredondadas | `<img class="rounded-pill">` |
| `float-left` | Alinhamento à esquerda | Flutua a imagem à esquerda do texto | `<img class="float-left">` |
| `float-right` | Alinhamento à direita | Flutua a imagem à direita do texto | `<img class="float-right">` |
| `mx-auto d-block` | Centralização horizontal | Centraliza a imagem no container | `<img class="mx-auto d-block">` |

### �💡 Exemplo Prático
```html
<div class="container">
    <div class="row">
        <div class="col-md-4">
            <img src="img1.jpg" class="img-fluid rounded" alt="Produto 1">
        </div>
        <div class="col-md-4">
            <img src="img2.jpg" class="img-thumbnail" alt="Produto 2">
        </div>
        <div class="col-md-4">
            <img src="img3.jpg" class="img-fluid rounded-circle" alt="Produto 3">
        </div>
    </div>
</div>
```

---

## 🃏 Cards
> **Documentação oficial**: [Bootstrap Cards](https://getbootstrap.com/docs/5.3/components/card/#about)

Os cards são containers flexíveis e extensíveis para exibir conteúdo. Substituem estruturas complexas de HTML e CSS por classes simples e intuitivas.

### 🏗️ Estrutura Básica
```html
<div class="card" style="width: 18rem;">
    <img src="..." class="card-img-top" alt="...">
    <div class="card-body">
        <h5 class="card-title">Título do Card</h5>
        <p class="card-text">Descrição do conteúdo do card.</p>
        <a href="#" class="btn btn-primary">Saiba mais</a>
    </div>
</div>
```

### 🎨 Variações de Cards

#### 1. Card com Header e Footer
```html
<div class="card">
    <div class="card-header">
        Cabeçalho destacado
    </div>
    <div class="card-body">
        <h5 class="card-title">Título especial</h5>
        <p class="card-text">Conteúdo principal do card.</p>
        <a href="#" class="btn btn-primary">Ação</a>
    </div>
    <div class="card-footer text-muted">
        Rodapé com informações extras
    </div>
</div>
```

#### 2. Cards em Grupo
```html
<div class="card-group">
    <div class="card">
        <div class="card-body">
            <h5 class="card-title">Card 1</h5>
            <p class="card-text">Conteúdo do primeiro card.</p>
        </div>
    </div>
    <div class="card">
        <div class="card-body">
            <h5 class="card-title">Card 2</h5>
            <p class="card-text">Conteúdo do segundo card.</p>
        </div>
    </div>
</div>
```

#### 3. Cards com Cores
```html
<div class="card bg-primary text-white">
    <div class="card-body">
        <h5 class="card-title">Card Primário</h5>
        <p class="card-text">Card com fundo azul.</p>
    </div>
</div>

<div class="card border-success">
    <div class="card-body">
        <h5 class="card-title text-success">Card com Borda</h5>
        <p class="card-text">Card com borda verde.</p>
    </div>
</div>
```

### � Tabela de Classes - Cards

| Classe | Quando Utilizar | Para que Serve | Exemplo |
|--------|-----------------|----------------|---------|
| `card` | Base de qualquer card | Container principal do componente | `<div class="card">` |
| `card-header` | Para títulos ou navegação | Seção superior com padding e borda | `<div class="card-header">` |
| `card-body` | Para conteúdo principal | Área principal com padding padrão | `<div class="card-body">` |
| `card-footer` | Para ações ou info extra | Seção inferior com estilo diferenciado | `<div class="card-footer">` |
| `card-title` | Títulos dentro do card | Estiliza títulos com margin adequada | `<h5 class="card-title">` |
| `card-text` | Texto descritivo | Remove margin-bottom do último elemento | `<p class="card-text">` |
| `card-img-top` | Imagem no topo | Ajusta bordas e dimensões da imagem | `<img class="card-img-top">` |
| `card-group` | Agrupar cards | Cards com mesmo tamanho e sem espaço | `<div class="card-group">` |
| `h-100` | Cards de mesma altura | Força altura igual em grid responsivo | `<div class="card h-100">` |
| `bg-primary` | Fundo colorido | Aplica cor de fundo do tema | `<div class="card bg-primary">` |
| `border-success` | Borda colorida | Aplica borda verde de sucesso | `<div class="card border-success">` |
| `shadow-sm` | Sombra sutil | Adiciona elevação suave ao card | `<div class="card shadow-sm">` |

### �📱 Layout Responsivo
```html
<div class="row">
    <div class="col-md-6 col-lg-4 mb-3">
        <div class="card h-100">
            <!-- Conteúdo do card -->
        </div>
    </div>
    <div class="col-md-6 col-lg-4 mb-3">
        <div class="card h-100">
            <!-- Conteúdo do card -->
        </div>
    </div>
</div>
```

---

## 🪟 Modais
> **Documentação oficial**: [Bootstrap Modals](https://getbootstrap.com/docs/5.3/components/modal/#how-it-works)

Modais são janelas sobrepostas que exibem conteúdo sem redirecionar o usuário. Ideais para formulários, confirmações e informações detalhadas.

### 🔧 Estrutura Básica

#### Botão de Ativação
```html
<button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exemploModal">
    Abrir Modal
</button>
```

#### Estrutura do Modal
```html
<div class="modal fade" id="exemploModal" tabindex="-1" aria-labelledby="exemploModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title fs-5" id="exemploModalLabel">Título do Modal</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Fechar"></button>
            </div>
            <div class="modal-body">
                <p>Conteúdo do modal aqui...</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Fechar</button>
                <button type="button" class="btn btn-primary">Salvar</button>
            </div>
        </div>
    </div>
</div>
```

### 📏 Tamanhos de Modal

#### Modal Pequeno
```html
<div class="modal-dialog modal-sm">
    <!-- Conteúdo -->
</div>
```

#### Modal Grande
```html
<div class="modal-dialog modal-lg">
    <!-- Conteúdo -->
</div>
```

#### Modal Extra Grande
```html
<div class="modal-dialog modal-xl">
    <!-- Conteúdo -->
</div>
```

### � Tabela de Classes - Modais

| Classe | Quando Utilizar | Para que Serve | Exemplo |
|--------|-----------------|----------------|---------|
| `modal` | Container principal | Define comportamento e backdrop | `<div class="modal">` |
| `modal-fade` | Para animação suave | Adiciona transição de entrada/saída | `<div class="modal fade">` |
| `modal-dialog` | Container do conteúdo | Centraliza e define largura do modal | `<div class="modal-dialog">` |
| `modal-sm` | Modal pequeno | Largura reduzida (300px) | `<div class="modal-dialog modal-sm">` |
| `modal-lg` | Modal grande | Largura expandida (800px) | `<div class="modal-dialog modal-lg">` |
| `modal-xl` | Modal extra grande | Largura máxima (1140px) | `<div class="modal-dialog modal-xl">` |
| `modal-content` | Corpo principal | Container com bordas e sombra | `<div class="modal-content">` |
| `modal-header` | Cabeçalho do modal | Área para título e botão fechar | `<div class="modal-header">` |
| `modal-body` | Conteúdo principal | Área scrollável do conteúdo | `<div class="modal-body">` |
| `modal-footer` | Rodapé com ações | Área para botões de ação | `<div class="modal-footer">` |
| `modal-title` | Título do modal | Estilização adequada para títulos | `<h5 class="modal-title">` |
| `btn-close` | Botão de fechar | X padronizado para fechamento | `<button class="btn-close">` |
| `data-bs-toggle="modal"` | Ativar modal | Atributo para trigger do modal | No botão de abertura |
| `data-bs-target="#id"` | Definir alvo | Especifica qual modal abrir | No botão de abertura |
| `data-bs-dismiss="modal"` | Fechar modal | Atributo para fechar o modal | No botão de fechamento |

### �💡 Exemplo Prático: Modal de Confirmação
```html
<!-- Botão -->
<button class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#confirmaExclusao">
    Excluir Item
</button>

<!-- Modal -->
<div class="modal fade" id="confirmaExclusao">
    <div class="modal-dialog modal-sm">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Confirmar Exclusão</h5>
            </div>
            <div class="modal-body">
                <p>Tem certeza que deseja excluir este item?</p>
            </div>
            <div class="modal-footer">
                <button class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                <button class="btn btn-danger">Confirmar</button>
            </div>
        </div>
    </div>
</div>
```

---

## 📊 Tabelas
> **Documentação oficial**: [Bootstrap Tables](https://getbootstrap.com/docs/5.3/content/tables/#overview)

As tabelas do Bootstrap oferecem estilização elegante e funcionalidades avançadas para apresentação de dados estruturados.

### 🎨 Estilos Básicos

#### Tabela Padrão
```html
<table class="table">
    <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Nome</th>
            <th scope="col">Email</th>
            <th scope="col">Status</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>1</td>
            <td>João Silva</td>
            <td>joao@email.com</td>
            <td>Ativo</td>
        </tr>
    </tbody>
</table>
```

#### Variações de Estilo
```html
<!-- Tabela listrada -->
<table class="table table-striped">
    <!-- Conteúdo -->
</table>

<!-- Tabela com bordas -->
<table class="table table-bordered">
    <!-- Conteúdo -->
</table>

<!-- Tabela sem bordas -->
<table class="table table-borderless">
    <!-- Conteúdo -->
</table>

<!-- Tabela compacta -->
<table class="table table-sm">
    <!-- Conteúdo -->
</table>
```

### 🎯 Cores Contextuais
```html
<table class="table">
    <thead class="table-dark">
        <tr>
            <th>Produto</th>
            <th>Preço</th>
            <th>Status</th>
        </tr>
    </thead>
    <tbody>
        <tr class="table-success">
            <td>Produto A</td>
            <td>R$ 100,00</td>
            <td>Disponível</td>
        </tr>
        <tr class="table-warning">
            <td>Produto B</td>
            <td>R$ 150,00</td>
            <td>Estoque Baixo</td>
        </tr>
        <tr class="table-danger">
            <td>Produto C</td>
            <td>R$ 200,00</td>
            <td>Esgotado</td>
        </tr>
    </tbody>
</table>
```

### 📱 Tabela Responsiva
```html
<div class="table-responsive">
    <table class="table">
        <!-- Conteúdo da tabela -->
    </table>
</div>

<!-- Responsividade específica -->
<div class="table-responsive-md">
    <table class="table">
        <!-- Quebra em telas médias -->
    </table>
</div>
```

### � Tabela de Classes - Tabelas

| Classe | Quando Utilizar | Para que Serve | Exemplo |
|--------|-----------------|----------------|---------|
| `table` | Base de qualquer tabela | Aplicar estilização básica do Bootstrap | `<table class="table">` |
| `table-striped` | Melhorar legibilidade | Alterna cores de fundo das linhas | `<table class="table table-striped">` |
| `table-bordered` | Dados estruturados | Adiciona bordas em todas as células | `<table class="table table-bordered">` |
| `table-borderless` | Layout limpo | Remove todas as bordas | `<table class="table table-borderless">` |
| `table-sm` | Espaço limitado | Reduz padding das células pela metade | `<table class="table table-sm">` |
| `table-hover` | Interatividade | Destaca linha ao passar mouse | `<table class="table table-hover">` |
| `table-responsive` | Dispositivos móveis | Adiciona scroll horizontal | `<div class="table-responsive">` |
| `table-responsive-md` | Breakpoint específico | Responsivo apenas em telas médias+ | `<div class="table-responsive-md">` |
| `table-dark` | Tema escuro | Aplica fundo escuro ao header/tabela | `<thead class="table-dark">` |
| `table-light` | Destaque claro | Aplica fundo claro diferenciado | `<thead class="table-light">` |
| `table-success` | Status positivo | Linha verde para sucesso | `<tr class="table-success">` |
| `table-warning` | Status de atenção | Linha amarela para alertas | `<tr class="table-warning">` |
| `table-danger` | Status de erro | Linha vermelha para erros | `<tr class="table-danger">` |
| `table-info` | Informação | Linha azul para informações | `<tr class="table-info">` |
| `table-primary` | Destaque principal | Linha com cor primária do tema | `<tr class="table-primary">` |
| `table-secondary` | Elementos secundários | Linha com cor secundária | `<tr class="table-secondary">` |

### �🔍 Tabela com Hover
```html
<table class="table table-hover">
    <tbody>
        <tr>
            <td>Linha com efeito hover</td>
            <td>Dados adicionais</td>
        </tr>
    </tbody>
</table>
```

### 🎨 Combinações Úteis de Classes

#### 🖼️ **Imagens Populares**
```html
<!-- Avatar perfil -->
<img src="avatar.jpg" class="img-fluid rounded-circle border border-3 border-primary" style="width: 80px;">

<!-- Galeria responsiva -->
<img src="foto.jpg" class="img-thumbnail hover-shadow" style="cursor: pointer;">

<!-- Banner hero -->
<img src="banner.jpg" class="img-fluid w-100" style="max-height: 400px; object-fit: cover;">
```

#### 🃏 **Cards Avançados**
```html
<!-- Card interativo -->
<div class="card shadow-lg border-0 h-100 hover-lift">
    <div class="card-body p-4">
        <div class="d-flex align-items-center mb-3">
            <i class="bi bi-star-fill text-warning me-2"></i>
            <span class="badge bg-success">Novo</span>
        </div>
    </div>
</div>

<!-- Card com gradiente -->
<div class="card bg-gradient bg-primary text-white overflow-hidden">
    <div class="card-img-overlay d-flex align-items-end">
        <div class="w-100">
            <h5 class="card-title text-white">Título Sobreposto</h5>
        </div>
    </div>
</div>
```

#### 🪟 **Modais Especializados**
```html
<!-- Modal fullscreen mobile -->
<div class="modal-dialog modal-fullscreen-sm-down">
    <!-- Para mobile ocupa tela toda -->
</div>

<!-- Modal centralizado verticalmente -->
<div class="modal-dialog modal-dialog-centered">
    <!-- Sempre centralizado vertical -->
</div>

<!-- Modal scrollável -->
<div class="modal-dialog modal-dialog-scrollable">
    <!-- Body com scroll interno -->
</div>
```

#### 📊 **Tabelas Profissionais**
```html
<!-- Tabela completa moderna -->
<div class="table-responsive shadow rounded">
    <table class="table table-hover table-striped mb-0">
        <thead class="table-dark sticky-top">
            <tr>
                <th scope="col" class="border-0">
                    <i class="bi bi-hash me-1"></i>ID
                </th>
            </tr>
        </thead>
        <tbody>
            <tr class="align-middle">
                <td class="fw-bold">001</td>
                <td>
                    <span class="badge rounded-pill bg-success">
                        <i class="bi bi-check-circle me-1"></i>Ativo
                    </span>
                </td>
            </tr>
        </tbody>
    </table>
</div>
```

---
- [ ] Header com navegação responsiva
- [ ] Carrossel funcional com 3+ slides
- [ ] Mínimo 3 cards de artigos com imagem
- [ ] Tabela com dados estruturados
- [ ] Modal de contato com formulário
- [ ] Sidebar com categorias e newsletter
- [ ] Footer com informações e links sociais
- [ ] Responsividade em dispositivos móveis
- [ ] Código limpo e comentado

---

## 🎁 Conteúdo Bônus

### 📺 **Recursos Recomendados**

#### Vídeos Tutoriais
- **"Bootstrap 5 - Cards Avançados"** - The Net Ninja
- **"Modais Responsivos com Bootstrap"** - Traversy Media
- **"Galeria de Imagens com Bootstrap 5"** - The Purple Fox Design

#### Ferramentas Úteis
- **[Bootstrap Icons](https://icons.getbootstrap.com/)** - Biblioteca oficial de ícones
- **[Bootstrap Themes](https://themes.getbootstrap.com/)** - Templates profissionais
- **[Bootsnipp](https://bootsnipp.com/)** - Snippets de código Bootstrap

#### Extensões VS Code
- **Bootstrap 5 Quick Snippets** - Acelera desenvolvimento
- **Auto Rename Tag** - Sincroniza tags HTML
- **Live Server** - Preview em tempo real

---

## 📚 Referências

### Bibliografia Principal
- **BONATTI, D.** *Desenvolvimento de Sites Dinâmicos com Dreamweaver CC*. Brasport: 2013.
- **FLATSCHART, F.** *HTML 5 - Embarque Imediato*. Brasport: 2011.
- **MARINHO, A. L.; CRUZ, J. L. da.** *Desenvolvimento de aplicações para Internet*. 2.ed. Pearson: 2020.
- **NEVES, M. C. B. de A.** *Sites de Alta Performance*. Contentus: 2020.

### Documentação Oficial
- **[Bootstrap 5.3 Documentation](https://getbootstrap.com/docs/5.3/)**
- **[MDN Web Docs - HTML](https://developer.mozilla.org/pt-BR/docs/Web/HTML)**
- **[MDN Web Docs - CSS](https://developer.mozilla.org/pt-BR/docs/Web/CSS)**

### Recursos Online
- **[W3Schools Bootstrap Tutorial](https://www.w3schools.com/bootstrap5/)**
- **[CSS-Tricks Bootstrap Guide](https://css-tricks.com/)**
- **[Stack Overflow - Bootstrap Questions](https://stackoverflow.com/questions/tagged/bootstrap-5)**

---

## 📖 Guia de Referência Rápida

### 🔍 Classes Mais Utilizadas por Categoria

| Componente | Classes Essenciais | Uso Frequente |
|------------|-------------------|---------------|
| **🖼️ Imagens** | `img-fluid`, `rounded-circle`, `img-thumbnail` | Responsividade e avatares |
| **🃏 Cards** | `card`, `card-body`, `h-100`, `shadow-sm` | Layouts e elevação |
| **🪟 Modais** | `modal`, `modal-lg`, `data-bs-toggle`, `btn-close` | Tamanhos e controles |
| **📊 Tabelas** | `table`, `table-striped`, `table-responsive`, `table-hover` | Legibilidade e responsividade |

### 🎨 Padrões de Combinação

| Situação | Classes Recomendadas | Resultado |
|----------|---------------------|-----------|
| **Avatar circular** | `img-fluid rounded-circle border` | Imagem de perfil estilizada |
| **Card uniforme** | `card h-100 shadow-sm` | Cards de mesma altura com sombra |
| **Modal responsivo** | `modal-dialog modal-lg modal-dialog-centered` | Modal grande e centralizado |
| **Tabela moderna** | `table table-hover table-striped table-responsive` | Tabela interativa e responsiva |

### 🚀 Dicas de Performance

- ✅ **Use `img-fluid`** em todas as imagens para responsividade automática
- ✅ **Combine `h-100`** com cards em grids para altura uniforme  
- ✅ **Prefira `table-responsive`** a CSS customizado para tabelas
- ✅ **Utilize `modal-dialog-centered`** para melhor UX em modais
