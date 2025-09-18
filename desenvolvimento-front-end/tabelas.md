# Tabelas HTML - Guia Completo

## 1. Introdução às Tabelas

As tabelas são elementos essenciais na estruturação de páginas web, permitindo a organização e apresentação de dados de forma clara e concisa. Elas são fundamentais para representar dados tabulares como:

- **Planilhas** e relatórios
- **Listas de preços** e catálogos
- **Horários** e calendários
- **Diretórios** e listas de contatos
- **Comparações** de produtos ou serviços
- **Estatísticas** e dados de desempenho

> **Conceito Principal**: Tabelas organizam informações em **linhas** e **colunas**, facilitando a leitura e compreensão dos dados.

## 2. Estrutura Básica das Tabelas HTML

### 2.1 Tags Fundamentais

Para criar uma tabela HTML, utilizamos um conjunto de tags específicas:

| Tag | Função | Descrição |
|-----|---------|-----------|
| `<table>` | Container principal | Envolve toda a estrutura da tabela |
| `<thead>` | Cabeçalho | Define a seção do cabeçalho da tabela |
| `<tbody>` | Corpo | Contém os dados principais da tabela |
| `<tfoot>` | Rodapé | Define a seção do rodapé (totais, resumos) |
| `<tr>` | Linha | Define cada linha da tabela |
| `<th>` | Célula de cabeçalho | Células do cabeçalho (negrito por padrão) |
| `<td>` | Célula de dados | Células com dados regulares |

### 2.2 Estrutura Hierárquica

```
<table>
├── <thead>
│   └── <tr>
│       ├── <th>Cabeçalho 1</th>
│       ├── <th>Cabeçalho 2</th>
│       └── <th>Cabeçalho 3</th>
├── <tbody>
│   ├── <tr>
│   │   ├── <td>Dado 1</td>
│   │   ├── <td>Dado 2</td>
│   │   └── <td>Dado 3</td>
│   └── <tr>
│       ├── <td>Dado 4</td>
│       ├── <td>Dado 5</td>
│       └── <td>Dado 6</td>
└── <tfoot>
    └── <tr>
        ├── <td>Total</td>
        ├── <td>-</td>
        └── <td>Soma</td>
```

## 3. Exemplo Prático Básico

### 3.1 Código HTML

```html
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Tabela de Produtos</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>Produto</th>
                <th>Preço</th>
                <th>Quantidade</th>
                <th>Total</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>Notebook</td>
                <td>R$ 3.000,00</td>
                <td>2</td>
                <td>R$ 6.000,00</td>
            </tr>
            <tr>
                <td>Mouse</td>
                <td>R$ 50,00</td>
                <td>10</td>
                <td>R$ 500,00</td>
            </tr>
            <tr>
                <td>Teclado</td>
                <td>R$ 150,00</td>
                <td>5</td>
                <td>R$ 750,00</td>
            </tr>
        </tbody>
        <tfoot>
            <tr>
                <td colspan="3">Total Geral</td>
                <td>R$ 7.250,00</td>
            </tr>
        </tfoot>
    </table>
</body>
</html>
```

## 4. Atributos Especiais das Tabelas

### 4.1 Colspan e Rowspan

Para criar tabelas mais flexíveis e dinâmicas, utilizamos atributos especiais:

#### **colspan** - Estender por Colunas
Permite que uma célula se estenda por múltiplas colunas.

```html
<tr>
    <th colspan="3">Informações Pessoais</th>
</tr>
```

#### **rowspan** - Estender por Linhas
Permite que uma célula ocupe várias linhas.

```html
<tr>
    <th rowspan="2">Nome</th>
    <th>Idade</th>
    <th>Cidade</th>
</tr>
<tr>
    <td>25</td>
    <td>São Paulo</td>
</tr>
```

### 4.2 Exemplo Prático com Colspan e Rowspan

```html
<table>
    <tr>
        <th colspan="3">Informações de Funcionários</th>
    </tr>
    <tr>
        <th rowspan="2">Departamento</th>
        <th>Nome</th>
        <th>Cargo</th>
    </tr>
    <tr>
        <td>João Silva</td>
        <td>Analista</td>
    </tr>
    <tr>
        <td>TI</td>
        <td>Maria Santos</td>
        <td>Desenvolvedora</td>
    </tr>
</table>
```

### 4.3 Atributos HTML Básicos (Legados)

**Nota**: Estes atributos ainda funcionam, mas recomenda-se usar CSS para estilização.

| Atributo | Função | Exemplo |
|----------|---------|---------|
| `border` | Define bordas | `border="1"` |
| `cellpadding` | Espaçamento interno | `cellpadding="10"` |
| `cellspacing` | Espaçamento entre células | `cellspacing="5"` |

## 5. Estilização com CSS

### 5.1 Propriedades CSS Fundamentais

#### **Border e Border-Collapse**
```css
table {
    border-collapse: collapse; /* Remove espaços duplos entre bordas */
    border: 1px solid #333;
}

td, th {
    border: 1px solid #ddd;
}
```

#### **Espaçamento e Padding**
```css
td, th {
    padding: 12px;           /* Espaçamento interno */
    text-align: center;      /* Alinhamento do texto */
}
```

#### **Dimensões e Layout**
```css
table {
    width: 100%;             /* Largura da tabela */
    max-width: 800px;        /* Largura máxima */
    margin: 20px auto;       /* Centralizar na página */
}
```

### 5.2 Exemplo de CSS Completo

```css
/* Estilo geral da tabela */
table {
    width: 80%;
    margin: 20px auto;
    border-collapse: collapse;
    font-family: Arial, sans-serif;
    box-shadow: 0 2px 8px rgba(0,0,0,0.1);
}

/* Cabeçalho da tabela */
thead {
    background-color: #2c3e50;
    color: white;
}

thead th {
    padding: 15px 10px;
    font-weight: bold;
    text-transform: uppercase;
    letter-spacing: 1px;
}

/* Corpo da tabela */
tbody tr {
    border-bottom: 1px solid #ddd;
    transition: background-color 0.3s ease;
}

tbody tr:hover {
    background-color: #f8f9fa;
}

tbody tr:nth-child(odd) {
    background-color: #f9f9f9;
}

tbody tr:nth-child(even) {
    background-color: #ffffff;
}

tbody td {
    padding: 12px 10px;
    text-align: center;
}

/* Rodapé da tabela */
tfoot {
    background-color: #34495e;
    color: white;
    font-weight: bold;
}

tfoot td {
    padding: 15px 10px;
}

/* Bordas */
table, th, td {
    border: 1px solid #ddd;
}
```

### 5.3 Técnicas Avançadas de Estilização

#### **Efeitos de Hover e Transições**
```css
tr:hover {
    background-color: #e8f4fd;
    transform: scale(1.01);
    transition: all 0.2s ease-in-out;
}
```

#### **Responsividade**
```css
@media screen and (max-width: 768px) {
    table {
        font-size: 14px;
    }
    
    th, td {
        padding: 8px;
    }
}
```

#### **Pseudoelementos**
```css
th::before {
    content: "📊 ";
}

td:first-child::before {
    content: "• ";
    color: #3498db;
}
```

## 6. Melhores Práticas e Acessibilidade

### 6.1 Semântica Adequada

```html
<table>
    <caption>Relatório de Vendas - Primeiro Trimestre 2024</caption>
    <thead>
        <tr>
            <th scope="col">Mês</th>
            <th scope="col">Vendas (R$)</th>
            <th scope="col">Meta (%)</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <th scope="row">Janeiro</th>
            <td>150.000</td>
            <td>95%</td>
        </tr>
    </tbody>
</table>
```

### 6.2 Atributos de Acessibilidade

| Atributo | Função | Exemplo |
|----------|---------|---------|
| `scope` | Define escopo do cabeçalho | `scope="col"` ou `scope="row"` |
| `caption` | Título descritivo da tabela | `<caption>Descrição da tabela</caption>` |
| `summary` | Resumo da estrutura (deprecated) | Use `aria-describedby` |

## 7. Otimização e Performance

### 7.1 Paginação para Tabelas Grandes

```javascript
// Exemplo básico de paginação
function paginarTabela(dados, itensPorPagina) {
    const totalPaginas = Math.ceil(dados.length / itensPorPagina);
    
    function mostrarPagina(numeroPagina) {
        const inicio = (numeroPagina - 1) * itensPorPagina;
        const fim = inicio + itensPorPagina;
        const dadosPagina = dados.slice(inicio, fim);
        
        // Renderizar apenas os dados da página atual
        renderizarTabela(dadosPagina);
    }
}
```

### 7.2 Técnicas de Otimização

- **Virtual Scrolling**: Para tabelas com milhares de linhas
- **Lazy Loading**: Carregar dados conforme necessário
- **Filtros e Busca**: Reduzir quantidade de dados exibidos
- **Compressão CSS**: Minificar estilos em produção

## 8. Casos de Uso Avançados

### 8.1 Tabelas Responsivas com CSS Grid

```css
.tabela-responsiva {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
    gap: 1rem;
}

@media (max-width: 768px) {
    .tabela-responsiva {
        grid-template-columns: 1fr;
    }
}
```

### 8.2 Tabelas Interativas com JavaScript

```javascript
// Ordenação de colunas
function ordenarTabela(coluna, direcao) {
    const tbody = document.querySelector('tbody');
    const linhas = Array.from(tbody.querySelectorAll('tr'));
    
    linhas.sort((a, b) => {
        const valorA = a.cells[coluna].textContent.trim();
        const valorB = b.cells[coluna].textContent.trim();
        
        return direcao === 'asc' 
            ? valorA.localeCompare(valorB)
            : valorB.localeCompare(valorA);
    });
    
    linhas.forEach(linha => tbody.appendChild(linha));
}
```

## 9. Exemplo Completo - Projeto Prático
- [**HTML**](/desenvolvimento-front-end/tabelas/index.html)
- [**CSS**](/desenvolvimento-front-end/tabelas/styles.css)

## 10. Considerações Finais

### 10.1 Resumo das Melhores Práticas

1. **Estrutura Semântica**: Use `<thead>`, `<tbody>` e `<tfoot>` adequadamente
2. **Acessibilidade**: Implemente `scope`, `caption` e navegação por teclado
3. **Performance**: Considere paginação para grandes volumes de dados
4. **Responsividade**: Adapte para diferentes tamanhos de tela
5. **Estilização**: Use CSS moderno com variáveis e transições
6. **Interatividade**: Adicione funcionalidades como ordenação e filtros

### 10.2 Recursos Adicionais

- **Frameworks CSS**: Bootstrap, Tailwind CSS para estilos pré-definidos
- **Bibliotecas JavaScript**: DataTables, AG-Grid para funcionalidades avançadas
- **Ferramentas de Teste**: Axe, WAVE para verificar acessibilidade
- **Performance**: Lighthouse para otimização

### 10.3 Tendências Futuras

- **CSS Container Queries**: Para responsividade mais inteligente
- **Web Components**: Tabelas reutilizáveis e encapsuladas
- **CSS Grid**: Alternativas modernas para layouts tabulares
- **Progressive Enhancement**: Melhorar experiência gradualmente

---

## Referências

- **MDN Web Docs**: [HTML Table Reference](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/table)
- **W3C**: [HTML Table Accessibility](https://www.w3.org/WAI/tutorials/tables/)
- **CSS-Tricks**: [Complete Guide to CSS Grid](https://css-tricks.com/snippets/css/complete-guide-grid/)
- **WCAG 2.1**: [Web Content Accessibility Guidelines](https://www.w3.org/WAI/WCAG21/quickref/)

---

*Este guia fornece uma base sólida para trabalhar com tabelas HTML, desde conceitos básicos até implementações avançadas. Pratique os exemplos e adapte-os conforme suas necessidades específicas.*