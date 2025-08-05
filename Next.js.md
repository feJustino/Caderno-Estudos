# Next.js

> Framework React para produção com renderização híbrida e otimizações automáticas.

## Sumário
1. [O que é Next.js](#o-que-é-nextjs)
2. [Principais Problemas que Resolve](#principais-problemas-que-resolve)
3. [Como Funciona](#como-funciona)
4. [Métodos de Renderização](#métodos-de-renderização)
   - [CSR (Client Side Rendering)](#csr-client-side-rendering)
   - [SSR (Server Side Rendering)](#ssr-server-side-rendering)
   - [SSG (Static Site Generation)](#ssg-static-site-generation)
   - [ISR (Incremental Static Regeneration)](#isr-incremental-static-regeneration)
5. [Recursos e Funcionalidades](#recursos-e-funcionalidades)
6. [Estrutura de Projeto](#estrutura-de-projeto)
7. [Quando Usar Cada Método](#quando-usar-cada-método)

---

## O que é Next.js
Next.js é um framework React que oferece:
- **Renderização Híbrida**: Combina CSR, SSR, SSG e ISR
- **Otimizações Automáticas**: Code splitting, image optimization, font optimization
- **File-based Routing**: Sistema de rotas baseado na estrutura de arquivos
- **API Routes**: Criação de APIs dentro do mesmo projeto
- **Full-stack Capabilities**: Frontend e backend em um só framework

## Principais Problemas que Resolve
- **SEO**: Melhora a indexação por motores de busca
- **Performance**: Otimizações automáticas de bundle e carregamento
- **Developer Experience**: Hot reload, TypeScript support, etc.
- **Hydration**: Combina os benefícios do SSR com interatividade do React

## Como Funciona
Next.js atua como um **middleware/BFF (Backend for Frontend)**:
1. Recebe requests do cliente
2. Processa a renderização (SSR/SSG/ISR)
3. Pode fazer chamadas para APIs backend
4. Retorna HTML renderizado + JavaScript para hidratação
5. Fornece interatividade no cliente

---

## Métodos de Renderização
### CSR (Client Side Rendering)
**Definição:** Renderização da página do lado do cliente (browser).

**Como Funciona:**
1. Usuário faz request da página
2. Servidor envia HTML mínimo para o browser
3. Browser baixa o JavaScript bundle
4. Browser executa JavaScript
5. Browser gera a tela e faz fetch dos dados

**✅ Vantagens:**
- **Experiência app-like**: Navegação fluida entre páginas
- **Transições sem reload**: Melhor UX nas mudanças de página
- **Dinamismo**: Interatividade rica e responsiva
- **Menor carga no servidor**: Processamento no cliente

**❌ Desvantagens:**
- **SEO prejudicado**: Search engines precisam executar JS para indexar
- **Tempo de load inicial alto**: Processamento no browser
- **Segurança**: Informações sensíveis podem ser expostas
- **Performance em dispositivos lentos**: Depende da capacidade do cliente

**Quando usar:**
- Dashboards e painéis administrativos
- Aplicações com muita interatividade
- SPAs (Single Page Applications)
### SSR (Server Side Rendering)
**Definição:** Renderização da página do lado do servidor a cada request.

**Como Funciona:**
1. Usuário faz request da página
2. Servidor renderiza a página dinamicamente
3. Servidor envia HTML completo para o browser
4. Browser exibe o HTML
5. Next.js injeta scripts para interatividade (Hydration)

**✅ Vantagens:**
- **SEO otimizado**: Página pré-renderizada facilita indexação
- **Segurança**: Cookies e APIs gerenciados no servidor
- **Primeiro carregamento rápido**: HTML já renderizado
- **Dados dinâmicos**: Conteúdo sempre atualizado

**❌ Desvantagens:**
- **Server workload**: Maior carga no servidor
- **APIs específicas do browser indisponíveis**: `window`, `document` não existem no servidor
- **TTFB mais alto**: Time to First Byte pode ser maior
- **Necessita servidor sempre rodando**: Não pode ser servido estaticamente

**Implementação no Next.js:**
```js
// pages/produto/[id].js
export async function getServerSideProps(context) {
  const { id } = context.params
  const produto = await fetchProduto(id)
  
  return {
    props: {
      produto,
    },
  }
}

export default function Produto({ produto }) {
  return <div>{produto.nome}</div>
}
```

**Quando usar:**
- E-commerce com dados que mudam frequentemente
- Dashboards com dados em tempo real
- Páginas que precisam de autenticação
- Conteúdo personalizado por usuário
### SSG (Static Site Generation)
**Definição:** Páginas geradas estaticamente durante o build.

**Como Funciona:**
1. Páginas são geradas no momento do build
2. Arquivos HTML são deployados para servidor ou CDN
3. Usuário faz request da página
4. HTML é enviado diretamente do servidor/CDN

**✅ Vantagens:**
- **Performance máxima**: HTML já renderizado, carregamento instantâneo
- **Escalabilidade**: Facilmente cacheado em CDN
- **SEO excelente**: Fácil indexação do conteúdo
- **Menor custo**: Não precisa de servidor sempre rodando
- **Segurança**: Sem surface de ataque no servidor

**❌ Desvantagens:**
- **Não recomendado para conteúdo dinâmico**: Requer rebuilds frequentes
- **Build time**: Quanto mais páginas, mais tempo de build
- **Dados podem ficar desatualizados**: Só atualiza no próximo build

**Implementação no Next.js:**
```js
// pages/blog/[slug].js
export async function getStaticProps({ params }) {
  const post = await getPostBySlug(params.slug)
  
  return {
    props: {
      post,
    },
  }
}

export async function getStaticPaths() {
  const posts = await getAllPosts()
  
  return {
    paths: posts.map((post) => ({
      params: { slug: post.slug },
    })),
    fallback: false,
  }
}

export default function BlogPost({ post }) {
  return <article>{post.content}</article>
}
```

**Quando usar:**
- Blogs e sites de conteúdo
- Landing pages
- Documentação
- Sites corporativos com conteúdo que muda pouco
### ISR (Incremental Static Regeneration)
**Definição:** Combinação do SSG com regeneração automática, sem rebuild completo do site.

**Como Funciona:**
1. Página é gerada estaticamente no build inicial
2. Define-se um tempo de revalidação
3. Após esse tempo, Next.js regenera a página em background
4. Usuários veem a versão em cache até a nova ficar pronta

**✅ Vantagens:**
- **Performance**: Carregamento rápido como SSG
- **Conteúdo atualizado**: Regeneração automática das páginas
- **Redução de carga no servidor**: Não gera páginas a cada request como SSR
- **SEO**: Páginas pré-renderizadas com conteúdo atualizado
- **Escalabilidade**: Combina benefícios de SSG e SSR

**❌ Desvantagens:**
- **Delay no conteúdo**: Usuários podem acessar páginas desatualizadas
- **Não é real-time**: Todos os usuários veem a mesma versão
- **Complexidade**: Lógica de cache e revalidação
- **Background processing**: Regeneração consome recursos

**Implementação no Next.js:**
```js
// pages/produtos/[id].js
export async function getStaticProps({ params }) {
  const produto = await fetchProduto(params.id)
  
  return {
    props: {
      produto,
    },
    // Revalida a cada 60 segundos
    revalidate: 60,
  }
}

export async function getStaticPaths() {
  // Gera apenas algumas páginas populares no build
  const produtosPopulares = await fetchProdutosPopulares()
  
  return {
    paths: produtosPopulares.map((produto) => ({
      params: { id: produto.id },
    })),
    // Permite gerar outras páginas sob demanda
    fallback: 'blocking',
  }
}
```

**Estratégias de Fallback:**
- `false`: Retorna 404 para páginas não geradas
- `true`: Mostra loading, gera página em background
- `'blocking'`: Aguarda geração da página antes de mostrar

**Quando usar:**
- E-commerce com catálogo extenso
- Blogs com posts frequentes
- Sites de notícias
- Qualquer conteúdo que muda regularmente mas não precisa ser real-time

---

## Recursos e Funcionalidades

### Sistema de Rotas
**File-based Routing**: As rotas são definidas pela estrutura de arquivos.

```
pages/
├── index.js          → /
├── sobre.js          → /sobre
├── blog/
│   ├── index.js      → /blog
│   └── [slug].js     → /blog/:slug
└── api/
    └── users.js      → /api/users
```

**Rotas Dinâmicas:**
```js
// pages/produto/[id].js → /produto/123
// pages/categoria/[...slug].js → /categoria/roupas/camisetas/nike
```

### API Routes
Crie APIs dentro do próprio projeto Next.js:

```js
// pages/api/usuarios.js
export default function handler(req, res) {
  if (req.method === 'GET') {
    res.status(200).json({ usuarios: [] })
  }
}
```

### Otimizações Automáticas

**Image Optimization:**
```jsx
import Image from 'next/image'

function Produto() {
  return (
    <Image
      src="/produto.jpg"
      alt="Produto"
      width={500}
      height={300}
      priority // Carrega com prioridade
    />
  )
}
```

**Font Optimization:**
```js
// next.config.js
module.exports = {
  optimizeFonts: true, // Habilitado por padrão
}
```

**Code Splitting:**
- Automático por páginas
- Manual com `dynamic`:

```js
import dynamic from 'next/dynamic'

const ComponentePesado = dynamic(() => import('../components/ComponentePesado'), {
  loading: () => <p>Carregando...</p>,
})
```

### Middleware
Executar código antes da request chegar na página:

```js
// middleware.js
export function middleware(request) {
  if (request.nextUrl.pathname.startsWith('/admin')) {
    // Verificar autenticação
    return NextResponse.redirect(new URL('/login', request.url))
  }
}

export const config = {
  matcher: '/admin/:path*',
}
```

---

## Estrutura de Projeto

### App Router (Next.js 13+)
```
app/
├── globals.css
├── layout.tsx        → Layout raiz
├── page.tsx         → Página inicial (/)
├── loading.tsx      → UI de loading
├── error.tsx        → UI de erro
├── not-found.tsx    → UI de 404
├── about/
│   └── page.tsx     → /about
└── blog/
    ├── page.tsx     → /blog
    ├── [slug]/
    │   └── page.tsx → /blog/[slug]
    └── loading.tsx  → Loading específico do blog
```

### Pages Router (Tradicional)
```
pages/
├── _app.js          → Componente raiz
├── _document.js     → HTML document customizado
├── index.js         → Página inicial
└── 404.js           → Página de erro 404

components/
├── Header.js
└── Footer.js

public/
├── images/
└── favicon.ico

styles/
├── globals.css
└── Home.module.css
```

---

## Quando Usar Cada Método

### Decision Tree

```
Precisa de dados em tempo real?
├── SIM → SSR
└── NÃO
    ├── Conteúdo muda frequentemente?
    │   ├── SIM → ISR
    │   └── NÃO → SSG
    └── É uma aplicação interativa/dashboard?
        └── SIM → CSR (com SWR/React Query)
```

### Por Tipo de Aplicação

| Tipo de Aplicação | Método Recomendado | Motivo |
|---|---|---|
| **Blog** | SSG + ISR | Conteúdo estático que muda ocasionalmente |
| **E-commerce** | SSG + ISR | Produtos mudam, mas não constantemente |
| **Dashboard** | SSR + CSR | Dados dinâmicos e interatividade |
| **Landing Page** | SSG | Conteúdo estático, máxima performance |
| **Rede Social** | SSR + CSR | Conteúdo personalizado e interativo |
| **Documentação** | SSG | Conteúdo estático, SEO importante |

### Híbrido (Recomendado)
Combine diferentes métodos na mesma aplicação:

```js
// Página inicial: SSG (performance)
// Página de produto: ISR (dados atualizados)
// Dashboard do usuário: SSR (personalização)
// Interações: CSR (dinamismo)
```

---

## Considerações de Performance

### Core Web Vitals
Next.js otimiza automaticamente para:
- **LCP (Largest Contentful Paint)**: Image optimization, code splitting
- **FID (First Input Delay)**: Code splitting, script optimization
- **CLS (Cumulative Layout Shift)**: Image dimensions, font optimization

### Boas Práticas
1. **Use Image component** para otimização automática
2. **Implemente loading states** para melhor UX
3. **Use dynamic imports** para componentes pesados
4. **Configure cache headers** apropriadamente
5. **Monitore bundle size** com `@next/bundle-analyzer`

---

## Resumo das Vantagens do Next.js
1. **Flexibilidade de renderização** (CSR, SSR, SSG, ISR)
2. **Otimizações automáticas** (images, fonts, code splitting)
3. **Developer Experience** excelente
4. **SEO otimizado** por padrão
5. **Full-stack capabilities** com API routes
6. **Ecosystem maduro** com grande comunidade
    
