# Bootstrap Intermediário - Guia Prático

## 📋 Sumário

1. [Introdução](#introdução)
2. [Criação de Menus](#criação-de-menus)
3. [Estilização de Textos](#estilização-de-textos)
4. [Botões Interativos](#botões-interativos)
5. [Responsividade](#responsividade)
6. [Exemplos Práticos](#exemplos-práticos)
7. [Recursos Adicionais](#recursos-adicionais)

---

## 🎯 Introdução

O **Bootstrap Intermediário** é uma ferramenta poderosa que simplifica drasticamente o desenvolvimento de interfaces web responsivas e estilizadas. Este framework permite criar menus, textos e botões de forma eficiente, utilizando recursos pré-configurados que reduzem significativamente o esforço de desenvolvimento.

### 🚀 **Principais Vantagens:**
- ✅ **Redução de código CSS**: Até 80% menos código personalizado
- ✅ **Componentes prontos**: Copy & paste da documentação oficial
- ✅ **Responsividade automática**: Adaptação a diferentes dispositivos
- ✅ **Consistência visual**: Padrões estabelecidos da indústria

> **💡 Importante**: Antes do Bootstrap, criar menus, textos e botões demandava extenso código CSS. Agora, o processo é simplificado com componentes pré-configurados.

---

## 🧭 Criação de Menus

A criação de menus com Bootstrap é extremamente simplificada. Antes, era necessário escrever extenso código CSS para estilizar adequadamente os elementos de navegação. Agora, basta acessar a documentação, escolher um modelo e copiar o código.

### 📋 **Processo Simplificado:**
1. **🔧 Configurar HTML**: Incluir Bootstrap CSS no `<head>` e scripts no `<body>`
2. **🎨 Escolher menu**: Navegar pela documentação oficial
3. **📋 Copiar código**: Copy & paste do componente desejado
4. **✨ Personalizar**: Ajustar textos e links conforme necessário

### 🍔 **Menu Dropdown Responsivo**

**📍 Documentação**: [Bootstrap Dropdowns](https://getbootstrap.com/docs/5.3/components/dropdowns/)

```html
<!-- Navbar Responsiva Completa -->
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">
        <!-- Brand/Logo -->
        <a class="navbar-brand" href="#" style="font-weight: bold;">
            <i class="fas fa-rocket me-2"></i>MeuSite
        </a>
        
        <!-- Botão Toggle para Mobile -->
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarDropdown">
            <span class="navbar-toggler-icon"></span>
        </button>
        
        <!-- Menu de Navegação -->
        <div class="collapse navbar-collapse" id="navbarDropdown">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <!-- Link Simples -->
                <li class="nav-item">
                    <a class="nav-link active" href="#home">Início</a>
                </li>
                
                <!-- Menu Dropdown -->
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">
                        Serviços
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="#web">Desenvolvimento Web</a></li>
                        <li><a class="dropdown-item" href="#mobile">Apps Mobile</a></li>
                        <li><hr class="dropdown-divider"></li>
                        <li><a class="dropdown-item" href="#consultoria">Consultoria</a></li>
                    </ul>
                </li>
                
                <!-- Outro Link -->
                <li class="nav-item">
                    <a class="nav-link" href="#sobre">Sobre</a>
                </li>
                
                <li class="nav-item">
                    <a class="nav-link" href="#contato">Contato</a>
                </li>
            </ul>
            
            <!-- Botões de Ação -->
            <div class="d-flex">
                <button class="btn btn-outline-light me-2" type="button">Login</button>
                <button class="btn btn-warning" type="button">Cadastrar</button>
            </div>
        </div>
    </div>
</nav>
```

### 🎨 **Variações de Menu**

| Tipo | Classe Principal | Uso Recomendado |
|------|------------------|-----------------|
| **Horizontal** | `.navbar-expand-lg` | Desktops e tablets |
| **Vertical** | `.navbar` (sem expand) | Sidebars |
| **Fixo no Topo** | `.navbar.fixed-top` | Sempre visível |
| **Sticky** | `.navbar.sticky-top` | Fixa ao rolar |

---

## ✏️ Estilização de Textos

O Bootstrap oferece uma variedade abrangente de classes para estilização de textos, desde alinhamento e quebra automática até transformação e tamanho das fontes. O processo é simples: escolha o estilo desejado na documentação e aplique as classes correspondentes.

### 📝 **Processo de Estilização:**
1. **🏗️ Estrutura HTML**: Criar arquivo com Bootstrap configurado
2. **📖 Consultar documentação**: [Bootstrap Typography](https://getbootstrap.com/docs/5.3/utilities/text/)
3. **🎨 Aplicar classes**: Copy & paste do exemplo desejado
4. **🔧 Personalizar**: Ajustar conforme necessário

### 🎨 **Exemplo Completo de Textos**

**📍 Documentação**: [Text Utilities](https://getbootstrap.com/docs/5.3/utilities/text/#text-alignment)

```html
<!-- Seção de Textos Estilizados -->
<div class="container my-5">
    <h1 class="text-center mb-5 text-primary">Exemplos de Textos Bootstrap</h1>
    
    <!-- Hierarquia de Títulos -->
    <div class="mb-4">
        <h2 class="text-info mb-3">📋 Hierarquia de Títulos</h2>
        <h1 class="display-1">Display 1 - Título Principal</h1>
        <h1>Título H1</h1>
        <h2>Título H2</h2>
        <h3>Título H3</h3>
        <h4>Título H4</h4>
        <h5>Título H5</h5>
        <h6>Título H6</h6>
    </div>

    <!-- Parágrafos Especiais -->
    <div class="mb-4">
        <h2 class="text-info mb-3">📝 Parágrafos e Destaques</h2>
        <p class="lead fs-4">Este é um parágrafo de destaque (lead) com fonte maior.</p>
        <p class="lead">Este é um parágrafo de destaque padrão.</p>
        <p class="fs-5">Parágrafo com fonte size 5.</p>
        <p>Este é um parágrafo normal com texto corrido para demonstrar o comportamento padrão.</p>
        <blockquote class="blockquote">
            <p>"Uma citação importante que merece destaque especial."</p>
            <footer class="blockquote-footer">Alguém famoso em <cite>Trabalho Fonte</cite></footer>
        </blockquote>
    </div>

    <!-- Cores de Texto -->
    <div class="mb-4">
        <h2 class="text-info mb-3">🎨 Cores de Texto</h2>
        <p class="text-primary">💙 Texto primário (azul)</p>
        <p class="text-secondary">🩶 Texto secundário (cinza)</p>
        <p class="text-success">💚 Texto de sucesso (verde)</p>
        <p class="text-danger">❤️ Texto de perigo (vermelho)</p>
        <p class="text-warning">💛 Texto de aviso (amarelo)</p>
        <p class="text-info">💙 Texto informativo (azul claro)</p>
        <p class="text-dark">🖤 Texto escuro (preto)</p>
        <p class="text-muted">😴 Texto esmaecido (cinza claro)</p>
        <p class="text-light bg-dark p-2 rounded">🤍 Texto claro em fundo escuro</p>
    </div>

    <!-- Formatação e Peso -->
    <div class="mb-4">
        <h2 class="text-info mb-3">✨ Formatação e Peso</h2>
        <p class="fw-bold">Texto em negrito (bold)</p>
        <p class="fw-bolder">Texto ainda mais negrito (bolder)</p>
        <p class="fw-light">Texto leve (light)</p>
        <p class="fw-lighter">Texto mais leve (lighter)</p>
        <p class="fst-italic">Texto em itálico</p>
        <p class="text-decoration-underline">Texto sublinhado</p>
        <p class="text-decoration-line-through">Texto riscado</p>
        <p><mark>Texto destacado com marca</mark></p>
        <p><small class="text-muted">Texto pequeno e esmaecido</small></p>
    </div>

    <!-- Alinhamento -->
    <div class="mb-4">
        <h2 class="text-info mb-3">📐 Alinhamento de Texto</h2>
        <p class="text-start">📍 Texto alinhado à esquerda (start)</p>
        <p class="text-center">🎯 Texto centralizado</p>
        <p class="text-end">📍 Texto alinhado à direita (end)</p>
        <p class="text-justify">📏 Texto justificado. Este texto se estenderá por toda a largura do contêiner, 
        alinhando-se tanto à esquerda quanto à direita, criando margens uniformes em ambos os lados.</p>
    </div>

    <!-- Transformação de Texto -->
    <div class="mb-4">
        <h2 class="text-info mb-3">🔄 Transformação de Texto</h2>
        <p class="text-lowercase">ESTE TEXTO SERÁ MINÚSCULO</p>
        <p class="text-uppercase">este texto será maiúsculo</p>
        <p class="text-capitalize">este texto terá a primeira letra de cada palavra maiúscula</p>
    </div>
</div>
```

### 📊 **Classes de Texto Essenciais**

| Categoria | Classes | Exemplo |
|-----------|---------|---------|
| **Cores** | `.text-primary`, `.text-success`, `.text-danger` | Textos coloridos |
| **Tamanhos** | `.fs-1` a `.fs-6`, `.display-1` a `.display-6` | Hierarquia visual |
| **Peso** | `.fw-bold`, `.fw-light`, `.fw-bolder` | Ênfase e destaque |
| **Alinhamento** | `.text-start`, `.text-center`, `.text-end` | Posicionamento |
| **Transformação** | `.text-uppercase`, `.text-lowercase` | Formatação |
---

## 🔘 Botões Interativos

A criação de botões com Bootstrap contrasta drasticamente com o método tradicional HTML/CSS, que resultava em arquivos CSS extensos. Agora, basta acessar a documentação, escolher o estilo desejado e aplicar as classes correspondentes.

### ⚡ **Processo Otimizado:**
1. **📖 Consultar documentação**: [Bootstrap Buttons](https://getbootstrap.com/docs/5.3/components/buttons/)
2. **🎨 Escolher estilo**: Contorno, sólido, tamanhos, estados
3. **📋 Copiar código**: Copy & paste com personalização mínima
4. **🔧 Ajustar**: Modificar textos e ações conforme necessário

### 🎨 **Coleção Completa de Botões**

**📍 Documentação**: [Bootstrap Buttons](https://getbootstrap.com/docs/5.3/components/buttons/)

```html
<!-- Coleção Completa de Botões Bootstrap -->
<div class="container my-5">
    <h1 class="text-center mb-5 text-primary">🔘 Exemplos de Botões Bootstrap</h1>

    <!-- Botões por Cor/Contexto -->
    <div class="mb-4">
        <h3 class="mb-3">🎨 Botões por Contexto</h3>
        <button type="button" class="btn btn-primary me-2 mb-2">💙 Primary</button>
        <button type="button" class="btn btn-secondary me-2 mb-2">🩶 Secondary</button>
        <button type="button" class="btn btn-success me-2 mb-2">✅ Success</button>
        <button type="button" class="btn btn-danger me-2 mb-2">❌ Danger</button>
        <button type="button" class="btn btn-warning me-2 mb-2">⚠️ Warning</button>
        <button type="button" class="btn btn-info me-2 mb-2">ℹ️ Info</button>
        <button type="button" class="btn btn-light me-2 mb-2">⚪ Light</button>
        <button type="button" class="btn btn-dark me-2 mb-2">⚫ Dark</button>
    </div>

    <!-- Botões Outline -->
    <div class="mb-4">
        <h3 class="mb-3">🔘 Botões Outline</h3>
        <button type="button" class="btn btn-outline-primary me-2 mb-2">💙 Primary</button>
        <button type="button" class="btn btn-outline-secondary me-2 mb-2">🩶 Secondary</button>
        <button type="button" class="btn btn-outline-success me-2 mb-2">✅ Success</button>
        <button type="button" class="btn btn-outline-danger me-2 mb-2">❌ Danger</button>
        <button type="button" class="btn btn-outline-warning me-2 mb-2">⚠️ Warning</button>
        <button type="button" class="btn btn-outline-info me-2 mb-2">ℹ️ Info</button>
        <button type="button" class="btn btn-outline-dark me-2 mb-2">⚫ Dark</button>
    </div>

    <!-- Tamanhos de Botões -->
    <div class="mb-4">
        <h3 class="mb-3">📏 Tamanhos</h3>
        <button type="button" class="btn btn-primary btn-lg me-2 mb-2">🔍 Large Button</button>
        <button type="button" class="btn btn-primary me-2 mb-2">📏 Default Button</button>
        <button type="button" class="btn btn-primary btn-sm me-2 mb-2">🔍 Small Button</button>
    </div>

    <!-- Estados Especiais -->
    <div class="mb-4">
        <h3 class="mb-3">🔄 Estados Especiais</h3>
        <button type="button" class="btn btn-primary me-2 mb-2">✅ Normal</button>
        <button type="button" class="btn btn-primary me-2 mb-2" disabled>❌ Desabilitado</button>
        <button type="button" class="btn btn-success active me-2 mb-2">🎯 Ativo</button>
        <div class="btn-group" role="group">
            <button type="button" class="btn btn-outline-primary">⬅️</button>
            <button type="button" class="btn btn-outline-primary">🏠 Grupo</button>
            <button type="button" class="btn btn-outline-primary">➡️</button>
        </div>
    </div>

    <!-- Formatos Especiais -->
    <div class="mb-4">
        <h3 class="mb-3">🎨 Formatos Especiais</h3>
        <button type="button" class="btn btn-primary rounded-pill me-2 mb-2">💊 Rounded Pill</button>
        <button type="button" class="btn btn-success rounded-0 me-2 mb-2">⬜ Square</button>
        <button type="button" class="btn btn-info w-100 mb-2">📏 Full Width</button>
    </div>

    <!-- Botões com Ícones -->
    <div class="mb-4">
        <h3 class="mb-3">🎯 Botões com Ícones</h3>
        <button type="button" class="btn btn-primary me-2 mb-2">
            <i class="fas fa-download me-1"></i> Download
        </button>
        <button type="button" class="btn btn-success me-2 mb-2">
            ✓ Confirmar
        </button>
        <button type="button" class="btn btn-danger me-2 mb-2">
            🗑️ Excluir
        </button>
        <button type="button" class="btn btn-warning me-2 mb-2">
            ⚙️ Configurar
        </button>
        <button type="button" class="btn btn-info me-2 mb-2">
            📄 Relatório
        </button>
    </div>

    <!-- Botões de Loading -->
    <div class="mb-4">
        <h3 class="mb-3">⏳ Estados de Loading</h3>
        <button class="btn btn-primary me-2 mb-2" type="button" disabled>
            <span class="spinner-border spinner-border-sm me-2"></span>
            Carregando...
        </button>
        <button class="btn btn-success me-2 mb-2" type="button" disabled>
            <span class="spinner-grow spinner-grow-sm me-2"></span>
            Processando...
        </button>
    </div>

    <!-- Dropdown Buttons -->
    <div class="mb-4">
        <h3 class="mb-3">📋 Dropdown Buttons</h3>
        <div class="btn-group me-2 mb-2">
            <button type="button" class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown">
                📋 Ações
            </button>
            <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="#">📝 Editar</a></li>
                <li><a class="dropdown-item" href="#">👁️ Visualizar</a></li>
                <li><hr class="dropdown-divider"></li>
                <li><a class="dropdown-item" href="#">🗑️ Excluir</a></li>
            </ul>
        </div>

        <div class="btn-group me-2 mb-2">
            <button type="button" class="btn btn-outline-secondary">📤 Compartilhar</button>
            <button type="button" class="btn btn-outline-secondary dropdown-toggle dropdown-toggle-split" data-bs-toggle="dropdown">
                <span class="visually-hidden">Toggle Dropdown</span>
            </button>
            <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="#">📧 Email</a></li>
                <li><a class="dropdown-item" href="#">📱 WhatsApp</a></li>
                <li><a class="dropdown-item" href="#">🔗 Copiar Link</a></li>
            </ul>
        </div>
    </div>
</div>
```

### 📊 **Referência Rápida de Botões**

| Categoria | Classes | Exemplo |
|-----------|---------|---------|
| **Cores** | `.btn-primary`, `.btn-success`, `.btn-danger` | Contextos visuais |
| **Outline** | `.btn-outline-*` | Botões vazados |
| **Tamanhos** | `.btn-lg`, `.btn-sm` | Hierarquia de importância |
| **Estados** | `.disabled`, `.active` | Interação do usuário |
| **Formatos** | `.rounded-pill`, `.w-100` | Personalização visual |

---

## 📱 Responsividade

A **responsividade** é essencial para garantir uma excelente experiência do usuário em qualquer dispositivo - seja celular, tablet, notebook, desktop ou TV. O Bootstrap facilita drasticamente essa tarefa com seu sistema de grid flexível e classes utilitárias que automaticamente adaptam os elementos ao tamanho da tela.

### 🎯 **Importância da Responsividade:**
- ✅ **Experiência consistente**: Funciona em todos os dispositivos
- ✅ **SEO otimizado**: Google prioriza sites mobile-friendly
- ✅ **Maior alcance**: Usuários acessam de diferentes devices
- ✅ **Profissionalismo**: Aparência moderna e adaptável

### 📐 **Sistema de Grid Responsivo**

**📍 Documentação**: [Bootstrap Grid System](https://getbootstrap.com/docs/5.3/layout/grid/)

#### **Breakpoints do Bootstrap:**

| Device | Classe | Largura | Exemplo de Uso |
|--------|--------|---------|----------------|
| **📱 Phone** | `col-` | <576px | Coluna única |
| **📱 Phone Large** | `col-sm-*` | ≥576px | 2-3 colunas |
| **📟 Tablet** | `col-md-*` | ≥768px | 3-4 colunas |
| **💻 Desktop** | `col-lg-*` | ≥992px | 4-6 colunas |
| **🖥️ Large Desktop** | `col-xl-*` | ≥1200px | 6+ colunas |
| **🖥️ Extra Large** | `col-xxl-*` | ≥1400px | Layout completo |

### 💻 **Exemplo Prático Responsivo**

```html
<!-- Layout Responsivo Completo -->
<div class="container-fluid">
    <h1 class="text-center my-4 text-primary">📱 Layout Responsivo</h1>
    
    <!-- Grid Básico Responsivo -->
    <div class="row mb-4">
        <div class="col-12 col-md-4 mb-3">
            <div class="bg-primary text-white p-3 rounded text-center">
                <h5>📱 Mobile: 12 colunas</h5>
                <p class="mb-0">🖥️ Desktop: 4 colunas</p>
            </div>
        </div>
        <div class="col-12 col-md-4 mb-3">
            <div class="bg-success text-white p-3 rounded text-center">
                <h5>📱 Mobile: 12 colunas</h5>
                <p class="mb-0">🖥️ Desktop: 4 colunas</p>
            </div>
        </div>
        <div class="col-12 col-md-4 mb-3">
            <div class="bg-warning text-white p-3 rounded text-center">
                <h5>📱 Mobile: 12 colunas</h5>
                <p class="mb-0">🖥️ Desktop: 4 colunas</p>
            </div>
        </div>
    </div>

    <!-- Grid Complexo Multi-Breakpoint -->
    <div class="row mb-4">
        <div class="col-12 col-sm-6 col-md-4 col-lg-3 mb-3">
            <div class="bg-info text-white p-3 rounded text-center h-100">
                <h6>📱 Phone: 12</h6>
                <p class="small mb-1">📱 SM: 6 | 📟 MD: 4 | 💻 LG: 3</p>
            </div>
        </div>
        <div class="col-12 col-sm-6 col-md-4 col-lg-3 mb-3">
            <div class="bg-secondary text-white p-3 rounded text-center h-100">
                <h6>Card 2</h6>
                <p class="small mb-1">Responsivo automático</p>
            </div>
        </div>
        <div class="col-12 col-sm-6 col-md-4 col-lg-3 mb-3">
            <div class="bg-danger text-white p-3 rounded text-center h-100">
                <h6>Card 3</h6>
                <p class="small mb-1">Adapta-se perfeitamente</p>
            </div>
        </div>
        <div class="col-12 col-sm-6 col-md-12 col-lg-3 mb-3">
            <div class="bg-dark text-white p-3 rounded text-center h-100">
                <h6>Card 4</h6>
                <p class="small mb-1">📟 MD: largura total</p>
            </div>
        </div>
    </div>

    <!-- Layout Sidebar + Conteúdo -->
    <div class="row">
        <div class="col-12 col-lg-3 mb-4">
            <div class="bg-light p-4 rounded h-100">
                <h5 class="text-primary">🔧 Sidebar</h5>
                <ul class="list-unstyled">
                    <li class="mb-2">📊 Dashboard</li>
                    <li class="mb-2">👥 Usuários</li>
                    <li class="mb-2">📈 Relatórios</li>
                    <li class="mb-2">⚙️ Configurações</li>
                </ul>
                <div class="d-lg-none">
                    <hr>
                    <p class="text-muted small">👆 Em mobile, sidebar fica no topo</p>
                </div>
            </div>
        </div>
        <div class="col-12 col-lg-9">
            <div class="bg-white border rounded p-4 h-100">
                <h5 class="text-success">📄 Conteúdo Principal</h5>
                <p>Este é o conteúdo principal que se adapta conforme o tamanho da tela:</p>
                <ul>
                    <li><strong>📱 Mobile</strong>: Sidebar fica acima do conteúdo</li>
                    <li><strong>💻 Desktop</strong>: Sidebar fica à esquerda (3 colunas)</li>
                    <li><strong>📄 Conteúdo</strong>: Ocupa o restante do espaço (9 colunas)</li>
                </ul>
                
                <!-- Cards Internos Responsivos -->
                <div class="row mt-4">
                    <div class="col-12 col-sm-6 col-xl-4 mb-3">
                        <div class="card border-primary">
                            <div class="card-body text-center">
                                <h6 class="card-title">📊 Estatística 1</h6>
                                <h3 class="text-primary">1,234</h3>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-sm-6 col-xl-4 mb-3">
                        <div class="card border-success">
                            <div class="card-body text-center">
                                <h6 class="card-title">📈 Estatística 2</h6>
                                <h3 class="text-success">5,678</h3>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-xl-4 mb-3">
                        <div class="card border-warning">
                            <div class="card-body text-center">
                                <h6 class="card-title">⚡ Estatística 3</h6>
                                <h3 class="text-warning">9,012</h3>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
```

### 🎯 **Classes Utilitárias Responsivas**

```html
<!-- Visibilidade por Device -->
<p class="d-none d-md-block">💻 Visível apenas em desktop/tablet</p>
<p class="d-block d-md-none">📱 Visível apenas em mobile</p>

<!-- Espaçamento Responsivo -->
<div class="p-2 p-md-4 p-lg-5">Padding que cresce com a tela</div>
<div class="mb-3 mb-md-4 mb-lg-5">Margin bottom responsiva</div>

<!-- Texto Responsivo -->
<h1 class="fs-6 fs-md-4 fs-lg-1">Título que cresce com a tela</h1>
<p class="text-center text-md-start">Centralizado em mobile, alinhado à esquerda em desktop</p>
```

### 📊 **Benefícios do Sistema Bootstrap**

| Antes do Bootstrap | Com Bootstrap |
|-------------------|---------------|
| ❌ Código CSS extenso para media queries | ✅ Classes prontas para responsividade |
| ❌ Testes em múltiplos dispositivos | ✅ Comportamento padronizado testado |
| ❌ Manutenção complexa | ✅ CSS mínimo personalizado |
| ❌ Inconsistências entre browsers | ✅ Cross-browser compatibility garantida |
---

```html
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bootstrap Intermediário - Template Completo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <!-- Navbar Responsiva -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary sticky-top">
        <div class="container">
            <a class="navbar-brand fw-bold" href="#">
                <i class="fas fa-code me-2"></i>MeuProjeto
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarMain">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarMain">
                <ul class="navbar-nav me-auto">
                    <li class="nav-item">
                        <a class="nav-link active" href="#home">🏠 Início</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" data-bs-toggle="dropdown">
                            📋 Serviços
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="#">💻 Web Development</a></li>
                            <li><a class="dropdown-item" href="#">📱 App Mobile</a></li>
                            <li><hr class="dropdown-divider"></li>
                            <li><a class="dropdown-item" href="#">🎨 UI/UX Design</a></li>
                        </ul>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#sobre">👥 Sobre</a>
                    </li>
                </ul>
                <div class="d-flex">
                    <button class="btn btn-outline-light me-2">Login</button>
                    <button class="btn btn-warning">Cadastrar</button>
                </div>
            </div>
        </div>
    </nav>

    <!-- Hero Section -->
    <section class="bg-primary text-white py-5">
        <div class="container">
            <div class="row align-items-center">
                <div class="col-12 col-lg-6 mb-4 mb-lg-0">
                    <h1 class="display-4 fw-bold">Bootstrap Intermediário</h1>
                    <p class="lead fs-5">Aprenda a criar interfaces modernas e responsivas com componentes avançados do Bootstrap.</p>
                    <div class="d-flex flex-column flex-sm-row gap-2">
                        <button class="btn btn-warning btn-lg">🚀 Começar Agora</button>
                        <button class="btn btn-outline-light btn-lg">📖 Documentação</button>
                    </div>
                </div>
                <div class="col-12 col-lg-6 text-center">
                    <div class="bg-white rounded shadow p-4">
                        <h5 class="text-primary mb-3">💡 Componentes Principais</h5>
                        <div class="row g-2">
                            <div class="col-6">
                                <span class="badge bg-primary w-100 p-2">🧭 Menus</span>
                            </div>
                            <div class="col-6">
                                <span class="badge bg-success w-100 p-2">✏️ Textos</span>
                            </div>
                            <div class="col-6">
                                <span class="badge bg-warning w-100 p-2">🔘 Botões</span>
                            </div>
                            <div class="col-6">
                                <span class="badge bg-info w-100 p-2">📱 Responsivo</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- Conteúdo Principal -->
    <main class="container my-5">
        <div class="row">
            <!-- Sidebar -->
            <aside class="col-12 col-lg-3 mb-4">
                <div class="card">
                    <div class="card-header bg-primary text-white">
                        <h5 class="mb-0">📚 Tópicos</h5>
                    </div>
                    <div class="list-group list-group-flush">
                        <a href="#menus" class="list-group-item list-group-item-action">
                            🧭 Menus Responsivos
                        </a>
                        <a href="#textos" class="list-group-item list-group-item-action">
                            ✏️ Estilização de Textos
                        </a>
                        <a href="#botoes" class="list-group-item list-group-item-action">
                            🔘 Botões Interativos
                        </a>
                        <a href="#grid" class="list-group-item list-group-item-action">
                            📐 Sistema de Grid
                        </a>
                    </div>
                </div>
            </aside>

            <!-- Conteúdo -->
            <section class="col-12 col-lg-9">
                <!-- Cards de Recursos -->
                <div class="row mb-5">
                    <div class="col-12 col-sm-6 col-lg-4 mb-4">
                        <div class="card h-100 shadow-sm">
                            <div class="card-body text-center">
                                <div class="fs-1 text-primary mb-3">🧭</div>
                                <h5 class="card-title">Menus Avançados</h5>
                                <p class="card-text">Navegação responsiva com dropdowns e submenus.</p>
                                <button class="btn btn-primary">Ver Exemplos</button>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-sm-6 col-lg-4 mb-4">
                        <div class="card h-100 shadow-sm">
                            <div class="card-body text-center">
                                <div class="fs-1 text-success mb-3">✏️</div>
                                <h5 class="card-title">Tipografia Rica</h5>
                                <p class="card-text">Classes para cores, tamanhos e formatação de textos.</p>
                                <button class="btn btn-success">Explorar</button>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-sm-6 col-lg-4 mb-4">
                        <div class="card h-100 shadow-sm">
                            <div class="card-body text-center">
                                <div class="fs-1 text-warning mb-3">🔘</div>
                                <h5 class="card-title">Botões Dinâmicos</h5>
                                <p class="card-text">Estados, tamanhos e estilos para todas as situações.</p>
                                <button class="btn btn-warning">Testar</button>
                            </div>
                        </div>
                    </div>
                </div>

                <!-- Demonstração Responsiva -->
                <div class="bg-white border rounded p-4 mb-4">
                    <h4 class="text-primary mb-3">📱 Demonstração Responsiva</h4>
                    <p class="text-muted">Redimensione a janela para ver a adaptação automática:</p>
                    
                    <div class="row">
                        <div class="col-12 col-md-8 mb-3">
                            <div class="alert alert-info">
                                <h6>💻 Conteúdo Principal</h6>
                                <p class="mb-0">Em desktop: 8 colunas | Em mobile: largura total</p>
                            </div>
                        </div>
                        <div class="col-12 col-md-4 mb-3">
                            <div class="alert alert-warning">
                                <h6>📋 Sidebar</h6>
                                <p class="mb-0">Em desktop: 4 colunas | Em mobile: largura total</p>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </div>
    </main>

    <!-- Footer -->
    <footer class="bg-dark text-white py-4 mt-auto">
        <div class="container">
            <div class="row">
                <div class="col-12 col-md-6 mb-3 mb-md-0">
                    <h5>Bootstrap Intermediário</h5>
                    <p class="mb-0">Framework CSS para desenvolvimento rápido e responsivo.</p>
                </div>
                <div class="col-12 col-md-6 text-md-end">
                    <div class="d-flex justify-content-md-end gap-3">
                        <a href="#" class="text-white-50">📧 Contato</a>
                        <a href="#" class="text-white-50">📖 Docs</a>
                        <a href="#" class="text-white-50">💻 GitHub</a>
                    </div>
                </div>
            </div>
        </div>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
```

---

## 📚 Recursos Adicionais

### **🎥 Conteúdo Complementar**
- **Vídeo Recomendado**: "Bootstrap - Crie Menus Responsivos e Códigos Semânticos" - Canal TekZoom (YouTube)

### **🔗 Links Essenciais**
- **Documentação Oficial**: [https://getbootstrap.com](https://getbootstrap.com)
- **Componentes**: [Bootstrap Components](https://getbootstrap.com/docs/5.3/components/)
- **Sistema de Grid**: [Bootstrap Grid](https://getbootstrap.com/docs/5.3/layout/grid/)
- **Utilitários**: [Bootstrap Utilities](https://getbootstrap.com/docs/5.3/utilities/)

### **📖 Bibliografia**
- BONATTI, D. **Desenvolvimento de Sites Dinâmicos com Dreamweaver CC**. Brasport: 2013.
- BONATTI, D. **Desenvolvimento de Jogos em HTML5**. Brasport: 2014.
- MARINHO, A. L.; CRUZ, J. L. da. **Desenvolvimento de aplicações para Internet**. 2.ed. Pearson: 2020.
- NEVES, M. C. B. de A. **Sites de Alta Performance**. Contentus: 2020.
