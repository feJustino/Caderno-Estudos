
# Layouts 
## 🔹 Introdução

Nesta aula, vamos explorar o conceito de **layouts no desenvolvimento front-end**, abordando os diferentes tipos que podemos utilizar em HTML e CSS.

Um **layout** define como os elementos de uma página web são organizados e apresentados ao usuário, sendo crucial para a criação de **interfaces eficientes e atraentes**.

Vamos discutir três tipos principais de layout:

* **Centralizado**
* **Fixo**
* **Elástico**

Destacando suas **características, vantagens, desvantagens** e **exemplos práticos de implementação**.

---

## 🔹 Tipos de Layout

Existem diversos tipos de layout que podemos aplicar em projetos web. Cada um possui **especificidades e aplicações**.
Além dos clássicos (centralizado, fixo e elástico), também existem **grid layout**, **flexbox layout** e até o antigo **float layout**.

---

## 📍 Layout Centralizado

O **layout centralizado** é utilizado quando o conteúdo precisa ficar **destacado no centro da tela**, independentemente do tamanho da janela.

👉 **Exemplo clássico**:

* Sites de portfólio.
* Páginas de login.
* Landing pages.

### Exemplo prático em HTML + CSS

```html
<div class="CenteredContainer">
  <div class="content">
    <h1>Título Centralizado</h1>
    <p>Este é um exemplo de layout centralizado.</p>
  </div>
</div>
```

```css
html, body {
  margin: 0;
  height: 100%;
  display: flex;
  align-items: center;
  justify-content: center;
  background: #f0f0f0;
  font-family: Arial, sans-serif;
}

.CenteredContainer {
  display: flex;
  align-items: center;
  justify-content: center;
  width: 80%;
  height: 80%;
  background: #fff;
  border: 1px solid #ddd;
  border-radius: 10px;
  box-shadow: 0 4px 6px rgba(0,0,0,0.1);
}
```

✅ **Vantagens**

* Destaque no conteúdo principal.
* Experiência agradável em páginas focadas.

❌ **Desvantagens**

* Pode não se adaptar bem em telas muito pequenas (precisa de ajustes responsivos).

---

## 📍 Layout Fixo

O **layout fixo** possui uma largura definida em pixels e não muda conforme o navegador é redimensionado.

👉 **Exemplo clássico**:

* Blogs.
* Portfólios.
* Sites de leitura com largura controlada.

### Exemplo prático em HTML + CSS

```html
<main>
  <div class="content">
    <h2>Layout Fixo</h2>
    <p>Este conteúdo mantém a mesma largura em qualquer tela.</p>
  </div>
</main>
```

```css
body {
  margin: 0;
  display: flex;
  justify-content: center;
}

.content {
  width: 600px;   /* largura fixa */
  background: #fafafa;
  padding: 20px;
  border-radius: 8px;
  box-shadow: 0 4px 8px rgba(0,0,0,0.1);
}
```

✅ **Vantagens**

* Consistência visual total.
* Controle preciso do design.

❌ **Desvantagens**

* **Não responsivo**.
* Pode quebrar em telas pequenas e sobrar espaço em telas grandes.

---

## 📍 Layout Elástico

O **layout elástico** se adapta ao conteúdo ou ao tamanho da fonte, utilizando **unidades relativas** (`em`, `rem`, `%`, `vw/vh`).

👉 **Exemplo clássico**:

* Páginas de leitura (artigos, blogs).
* Perfis de usuário.
* Layouts que precisam acompanhar acessibilidade (zoom e fontes).

### Exemplo prático em HTML + CSS

```html
<main>
  <div class="elastic-container">
    <h2>Layout Elástico</h2>
    <p>Este layout cresce ou diminui conforme o tamanho da fonte ou tela.</p>
  </div>
</main>
```

```css
body {
  font-size: 16px;
  margin: 0;
  display: flex;
  justify-content: center;
}

.elastic-container {
  width: 40em;        /* largura baseada em fonte */
  max-width: 90%;     /* limite relativo à tela */
  padding: 2em;
  background: #fff;
  border-radius: 10px;
  box-shadow: 0 4px 8px rgba(0,0,0,0.1);
}
```

✅ **Vantagens**

* Flexível e adaptável.
* Melhora a acessibilidade.

❌ **Desvantagens**

* Pode se esticar demais em telas grandes.
* Exige limites (`min-width`, `max-width`).

---

## 📊 Comparação Geral

| Tipo de Layout   | Característica Principal    | Vantagens              | Desvantagens                    |
| ---------------- | --------------------------- | ---------------------- | ------------------------------- |
| **Centralizado** | Conteúdo no centro          | Limpo, foco no usuário | Pouco responsivo sem ajustes    |
| **Fixo**         | Sempre mesma largura        | Consistência visual    | Não responsivo                  |
| **Elástico**     | Baseado em `%`, `em`, `rem` | Flexível, acessível    | Pode distorcer em telas grandes |

---

## 📍 Outros Layouts Importantes

Além dos três estudados, é importante conhecer:

* **Grid Layout (CSS Grid):**
  Permite criar estruturas em **linhas e colunas**. Exemplo: dashboards e sistemas complexos.

* **Flexbox Layout:**
  Ótimo para **menus, cabeçalhos e distribuição de elementos**. Se adapta de forma responsiva.

* **Float Layout:**
  Usado no passado para galerias e colunas. Hoje, substituído por **Grid** e **Flexbox**, mas ainda útil em casos específicos.

---

## 📌 Conclusão

Cada tipo de layout tem sua aplicação:

* **Centralizado** → foco no conteúdo.
* **Fixo** → consistência visual.
* **Elástico** → adaptação e acessibilidade.

Atualmente, o mais comum é utilizar **layouts híbridos responsivos** combinando `Grid`, `Flexbox`, `media queries` e funções modernas como `clamp()`.

---

## 📚 Referências Bibliográficas

* BONATTI, D. *Desenvolvimento de Sites Dinâmicos com Dreamweaver CC*. Brasport, 2013.
* BONATTI, D. *Desenvolvimento de Jogos em HTML5*. Brasport, 2014.
* FLATSCHART, F. *HTML 5 - Embarque Imediato*. Brasport, 2011.
* JOÃO, B. do N. (Org.). *Informática aplicada*. 2.ed. Pearson, 2019.
* MARINHO, A. L.; CRUZ, J. L. da. *Desenvolvimento de aplicações para Internet*. 2.ed. Pearson, 2020.
* NEVES, M. C. B. de A. *Sites de Alta Performance*. Contentus, 2020.
* SOUSA, R. F. M. *Canvas HTML 5 - Composição gráfica e interatividade na web*. Brasport, 2018.
* TANENBAUM, A. S.; FEAMSTER, N.; WETHERALL, D. J. *Redes de computadores*. 6.ed. Pearson, 2021.

