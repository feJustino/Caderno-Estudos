# Estilizando

## Bordas
### Conceito

Imagine que você tem um pedaço de papel com uma frase escrita nele. 
Agora, você quer desenhar uma linha ao redor desse pedaço de papel para destacar a frase. 
Essa linha ao redor é o que chamamos de "borda".

No HTML e CSS, as bordas são usadas para colocar uma linha ao redor de elementos como textos, imagens, caixas de conteúdo, etc. 
Isso ajuda a separar e destacar diferentes partes de uma página web.

```css

/* Estilo para borda sólida */
.solid-border {
    /* Define uma borda sólida de 3px de espessura e cor verde */
    border: 3px solid #4CAF50;
}

/* Estilo para borda pontilhada */
.dotted-border {
    /* Define uma borda pontilhada de 3px de espessura e cor azul */
    border: 3px dotted #2196F3;
}

/* Estilo para borda tracejada */
.dashed-border {
    /* Define uma borda tracejada de 3px de espessura e cor laranja */
    border: 3px dashed #FF9800;
}

/* Estilo para borda dupla */
.double-border {
    /* Define uma borda dupla de 3px de espessura e cor roxa */
    border: 3px double #9C27B0;
}

/* Estilo para borda em relevo (groove) */
.groove-border {
    /* Define uma borda em relevo de 3px de espessura e cor marrom */
    border: 3px groove #795548;
}

/* Estilo para borda em crista (ridge) */
.ridge-border {
    /* Define uma borda em crista de 3px de espessura e cor amarela */
    border: 3px ridge #FFEB3B;
}

/* Estilo para borda embutida (inset) */
.inset-border {
    /* Define uma borda embutida de 3px de espessura e cor cinza */
    border: 3px inset #607D8B;
}

/* Estilo para borda saliente (outset) */
.outset-border {
    /* Define uma borda saliente de 3px de espessura e cor vermelha */
    border: 3px outset #F44336;
}

/* Estilo para borda arredondada */
.rounded-border {
    /* Define uma borda sólida de 3px de espessura e cor rosa */
    border: 3px solid #E91E63;
    /* Arredonda os cantos da borda */
    border-radius: 15px;
}

/* Estilo para borda complexa */
.complex-border {
    /* Define uma borda superior sólida de 5px de espessura e cor roxa */
    border-top: 5px solid #673AB7;
    /* Define uma borda direita tracejada de 5px de espessura e cor amarela */
    border-right: 5px dashed #FFC107;
    /* Define uma borda inferior pontilhada de 5px de espessura e cor verde água */
    border-bottom: 5px dotted #009688;
    /* Define uma borda esquerda dupla de 5px de espessura e cor azul clara */
    border-left: 5px double #03A9F4;
    /* Arredonda os cantos da borda */
    border-radius: 15px;
}

```
## Sombras
### Conceito

Imagine que você está segurando um objeto, como uma folha de papel, e a luz está brilhando sobre ele. 
No chão, você verá uma sombra do objeto. 
Essa sombra ajuda a dar uma ideia de profundidade, fazendo o objeto parecer mais real e destacado.

No HTML e CSS, podemos criar esse mesmo efeito de sombra para elementos como textos, caixas de conteúdo, imagens, etc. 
Isso ajuda a dar uma aparência mais bonita e profissional à sua página web.


```css
/* Sombra simples */
.simple-shadow {
    /* Adiciona uma sombra com leve desvio e suavidade */
    box-shadow: 2px 2px 5px rgba(0, 0, 0, 0.2);
}

/* Sombra com propagação */
.spread-shadow {
    /* Adiciona uma sombra mais espalhada e um pouco mais escura */
    box-shadow: 2px 2px 10px rgba(0, 0, 0, 0.3);
}

/* Sombra interna */
.inset-shadow {
    /* Adiciona uma sombra interna com leve desvio e suavidade */
    box-shadow: inset 2px 2px 5px rgba(0, 0, 0, 0.2);
}

/* Sombra desfocada */
.blur-shadow {
    /* Adiciona uma sombra mais desfocada */
    box-shadow: 2px 2px 15px rgba(0, 0, 0, 0.2);
}

/* Sombra colorida */
.color-shadow {
    /* Adiciona uma sombra vermelha */
    box-shadow: 2px 2px 10px rgba(255, 0, 0, 0.5);
}

/* Múltiplas sombras */
.multiple-shadows {
    /* Adiciona duas sombras com direções e desvios diferentes */
    box-shadow: 2px 2px 5px rgba(0, 0, 0, 0.2), -2px -2px 5px rgba(0, 0, 0, 0.2);
}

/* Sombra no canto inferior direito */
.bottom-right-shadow {
    /* Adiciona uma sombra no canto inferior direito */
    box-shadow: 5px 5px 10px rgba(0, 0, 0, 0.3);
}

/* Sombra no canto superior esquerdo */
.top-left-shadow {
    /* Adiciona uma sombra no canto superior esquerdo */
    box-shadow: -5px -5px 10px rgba(0, 0, 0, 0.3);
}
```
## Opacidade

### Conceito
Opacidade é uma medida de quão transparente ou visível um elemento é. 
Pense em um vidro. 
Quando o vidro é completamente claro, você pode ver através dele perfeitamente – isso é 0% de opacidade (100% transparente). 
Quando o vidro é completamente opaco, você não pode ver através dele – isso é 100% de opacidade (0% transparente).

No HTML e CSS, podemos ajustar a opacidade de elementos como textos, imagens, caixas de conteúdo, etc., para torná-los mais ou menos transparentes.

```css
/* Estilo básico para os exemplos de opacidade */
.opacity-example {
    /* Define a cor de fundo dos elementos para verde */
    background-color: #4CAF50;
    /* Adiciona um preenchimento de 20 pixels ao redor do conteúdo */
    padding: 20px;
    /* Centraliza o texto dentro dos elementos */
    text-align: center;
    /* Define a cor do texto como branco */
    color: white;
    /* Adiciona cantos arredondados com um raio de 8 pixels */
    border-radius: 8px;
    /* Adiciona uma sombra ao redor dos elementos */
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

/* Diferentes níveis de opacidade */

/* Opacidade de 100%, totalmente opaco */
.opacity-100 {
    opacity: 1;
}

/* Opacidade de 75%, ligeiramente transparente */
.opacity-75 {
    opacity: 0.75;
}

/* Opacidade de 50%, meio transparente */
.opacity-50 {
    opacity: 0.5;
}

/* Opacidade de 25%, bastante transparente */
.opacity-25 {
    opacity: 0.25;
}

/* Opacidade de 10%, quase completamente transparente */
.opacity-10 {
    opacity: 0.1;
}

```
## Gradientes

### Conceito
Imagine que você tem uma folha de papel com uma frase escrita nela. 
Agora, você quer pintar o fundo dessa folha de papel com uma transição suave de uma cor para outra, em vez de usar uma cor sólida. 
Essa transição suave de cores é o que chamamos de "gradiente".

No HTML e CSS, os gradientes são usados para criar uma transição suave entre duas ou mais cores no fundo de elementos como textos, imagens, caixas de conteúdo, etc. 
Isso ajuda a criar efeitos visuais atraentes e a destacar diferentes partes de uma página web.


```css
/* Gradiente Linear */
.linear-gradient {
    /* Define um fundo com gradiente linear de 90 graus (horizontal) com duas cores */
    background: linear-gradient(90deg, #ff7e5f, #feb47b);
}

/* Gradiente Radial */
.radial-gradient {
    /* Define um fundo com gradiente radial (circular) com duas cores */
    background: radial-gradient(circle, #ff7e5f, #feb47b);
}

/* Gradiente Cônico */
.conic-gradient {
    /* Define um fundo com gradiente cônico (em forma de cone) começando de 0 graus */
    background: conic-gradient(from 0deg, #ff7e5f, #feb47b, #ff7e5f);
}

/* Gradiente Diagonal */
.diagonal-gradient {
    /* Define um fundo com gradiente linear de 45 graus (diagonal) com duas cores */
    background: linear-gradient(45deg, #ff7e5f, #feb47b);
}

/* Gradiente no Texto */
.text-gradient {
    /* Define um fundo com gradiente linear de 90 graus (horizontal) com duas cores */
    background: linear-gradient(90deg, #ff7e5f, #feb47b);
    /* Usa o gradiente de fundo para a cor do texto no navegador Chrome, Safari e Opera */
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent;
    /* Usa o gradiente de fundo para a cor do texto no restante dos navegadores */
    background-clip: text;
    text-emphasis-color: transparent;
    /* Define a cor de fundo como branco para navegadores que não suportam gradiente no texto */
    background-color: white;
}
```