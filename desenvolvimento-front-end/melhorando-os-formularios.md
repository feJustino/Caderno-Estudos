# Melhorando os formulários

## Métodos de envio de formulários

Os formulários HTML usam o atributo `method` para definir como os dados serão enviados ao servidor. Os dois métodos mais comuns são GET e POST — abaixo estão diferenças práticas e recomendações de uso.

### GET
- Os dados são anexados à URL como query string (visíveis na barra de endereços).
- Útil para buscas, filtros e páginas que podem ser indexadas, compartilhadas ou marcadas (bookmark).
- Limitado pelo tamanho da URL (pode variar entre navegadores e servidores).
- Não deve ser usado para dados sensíveis (ex.: senhas).
- Exemplo: `/buscar?q=termo&page=2`

### POST
- Os dados são enviados no corpo da requisição HTTP (não aparecem na URL).
- Indicado para envio de dados sensíveis, formulários de cadastro/alteração e payloads maiores.
- Requer HTTPS para proteger a transmissão de informações confidenciais.
- Não é adequado quando se precisa que a URL represente o estado/resultados para compartilhamento.

Observação: a escolha do método também afeta comportamento de cache, idempotência e como o servidor recebe os dados — selecione GET para leituras/consultas e POST para operações que criam/alteram dados.
## Submissão de formulários

### O que é
Um formulário permite que usuários insiram dados em uma página e os enviem ao servidor para processamento (login, cadastro, busca, envio de mensagens etc.). Submissão é o ato de enviar esses dados usando o atributo method do elemento `<form>`.

### Estrutura básica e elementos principais
- `<form action="URL" method="GET|POST">`: define onde e como os dados serão enviados.
    - Use GET para consultas/leituras (parâmetros na URL).
    - Use POST para criação/alteração ou dados sensíveis (dados no corpo).
- `<label for="id">`: descreve um campo; sempre prefira labels para acessibilidade.
- `<input>` / `<textarea>` / `<select>`: campos de entrada. Use o atributo `name` para que o servidor receba os valores.
- `<button type="submit">` (ou `<input type="submit">`): dispara a submissão do formulário.

### Boas práticas
- Sempre inclua `<label>` associado (`for` ↔ `id`) — ajuda leitores de tela e aumenta a área clicável.
- Use `type="email"`, `type="tel"`, `type="password"`, etc., para validação nativa e teclado adequado em dispositivos móveis.
- Marque campos obrigatórios com `required` e forneça mensagens de erro claras no servidor/cliente.
- Não confie apenas em validação do cliente — efetue validação e sanitização no servidor.
- Para envio de arquivos, adicione `enctype="multipart/form-data"`.
- Use HTTPS para proteger dados enviados por POST; implemente proteção CSRF quando aplicável.
- Prefira que o estado importante esteja refletido na URL somente quando for desejável compartilhar/bookmarkar.

### Exemplo simples (acessível e semântica)
```html
<form action="/pagina-de-destino" method="post">
    <label for="nome">Nome</label>
    <input id="nome" name="nome" type="text" placeholder="Digite seu nome" required>

    <label for="email">Email</label>
    <input id="email" name="email" type="email" placeholder="seu@exemplo.com" required>

    <label for="mensagem">Mensagem</label>
    <textarea id="mensagem" name="mensagem" rows="4" placeholder="Digite sua mensagem" required></textarea>

    <button type="submit">Enviar</button>
</form>
```

### Observações rápidas
- Use `aria-*` quando necessário para melhorar a experiência de usuários com tecnologias assistivas.
- Para submissões assíncronas (AJAX/Fetch), capture o evento `submit` e trate a validação/serialização antes de enviar.
- Documente no servidor o formato esperado dos dados (nomes dos campos, tipos, limites).
## Mensagens de erro

Uma mensagem de erro informa ao usuário que algum campo ou ação não atende aos requisitos do formulário. Além de apontar o problema, ela deve orientar como corrigi‑lo. Abaixo há conceitos, boas práticas e exemplos práticos com foco em acessibilidade e robustez (cliente + servidor).

Por que são importantes
- Melhoram a usabilidade: reduzem fricção e aumentam a taxa de sucesso das submissões.
- Reduzem suporte: usuários entendem o que consertar sem precisar contato humano.
- Tornam o sistema mais seguro: combinadas com validação no servidor, evitam dados inválidos.

Tipos de mensagens
- Inline (por campo): mais imediatas — exibidas perto do campo que falhou.
- Summary (resumo no topo): útil quando há muitos erros; permite navegação sequencial.
- Globais (não‑campo): para erros que não se vinculam a um campo específico (ex.: falha do servidor).

Boas práticas (professor)
1. Valide no cliente e no servidor: o cliente melhora a experiência; o servidor garante integridade.
2. Seja específico: "Email inválido" → "Use um formato como nome@dominio.com".
3. Indique a ação: explique como corrigir (ex.: "Remova espaços no início" ou "Use 8+ caracteres").
4. Priorize foco e ordem: ao submeter, mova foco para o primeiro erro e mantenha a ordem do DOM.
5. Use cores + ícones + texto: não dependa só da cor (acessibilidade).
6. Forneça um resumo acessível: um bloco com role="alert"/aria-live para leitores de tela.
7. Internacionalize: traduza mensagens e formatação (datas, números).
8. Previna perda de dados: preserve valores do formulário após erro de servidor.
9. Evite mensagens técnicas: não exiba mensagens de stacktrace ou detalhes sensíveis.

Acessibilidade (essencial)
- Associe a mensagem ao campo usando aria-describedby no input apontando para o id da mensagem.
- Para mensagens dinâmicas, use role="alert" ou aria-live="assertive" no resumo para notificar leitores de tela.
- Mantenha a ordem do DOM: mensagem imediatamente após o campo facilita navegação por teclado.
- Use setFocus no primeiro erro e ofereça link/âncora para erros em resumos.

Exemplo prático (HTML + CSS + JS simples)
```html
<form id="contato" novalidate>
    <div>
        <label for="email">Email</label>
        <input id="email" name="email" type="email" required aria-describedby="email-err">
        <span id="email-err" class="error-message" aria-live="polite"></span>
    </div>

    <div>
        <label for="mensagem">Mensagem</label>
        <textarea id="mensagem" name="mensagem" required aria-describedby="mensagem-err"></textarea>
        <span id="mensagem-err" class="error-message" aria-live="polite"></span>
    </div>

    <div id="form-summary" class="form-summary" role="alert" aria-live="assertive" hidden></div>

    <button type="submit">Enviar</button>
</form>
```

```css
.error-message { 
    color: #b00020; 
    font-size: .9rem;
    display: block; 
    margin-top: .25rem; 
}
input[aria-invalid="true"], textarea[aria-invalid="true"] { 
    outline: 2px solid #b00020; 
}
.form-summary { 
    border: 1px solid #b00020; 
    background: #ffecec; 
    padding: .5rem; 
    margin-bottom: 1rem; 
    color: #b00020; 
}
```

Mensagens do servidor
- Quando o servidor responde com erro, converta a resposta em mensagens por campo e/ou resumo.
- Mantenha o formulário preenchido com os valores enviados.
- Não repasse mensagens técnicas; normalize e traduza para linguagem do usuário.

Quando usar validação nativa vs. customizada
- Aproveite validação HTML5 (required, type, pattern, minlength) para casos simples.
- Use validação customizada para regras de negócio (unicidade, lógica complexa). Mostre mensagens claras.

Resumo rápido (checklist ao ensinar)
- Mostre onde o erro aconteceu (inline) e por que (mensagem).
- Forneça como consertar (ação).
- Garanta que leitores de tela recebem a mensagem.
- Valide sempre no servidor.
- Preserve dados e focalize o primeiro erro.

Com essas práticas, as mensagens de erro deixam de ser apenas notificações e se tornam ferramentas pedagógicas que ajudam o usuário a completar tarefas com confiança.
## Atributo Placeholder

O atributo `placeholder` em elementos de formulário HTML, como `<input>` e `<textarea>`, é usado para fornecer uma dica ou exemplo de entrada que desaparece quando o usuário começa a digitar. Ele é útil para orientar o usuário sobre o tipo de informação esperada no campo.

### Boas Práticas para o Uso do Placeholder
1. **Seja Claro e Conciso**: O texto do placeholder deve ser breve e direto ao ponto.
2. **Evite Repetição**: Não repita o rótulo do campo no placeholder.
3. **Use Exemplos**: Quando apropriado, forneça um exemplo de formato esperado.
4. **Considere Acessibilidade**: Lembre-se de que o placeholder não substitui o rótulo do campo.

### Exemplo de Uso
```html
<label for="email">Email</label>
<input id="email" name="email" type="email" placeholder="nome@dominio.com">