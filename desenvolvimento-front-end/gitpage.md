# GitHub Pages

## O que é GitHub Pages?
O GitHub Pages é um serviço oferecido pelo GitHub que permite hospedar sites estáticos diretamente de um repositório do GitHub. É uma maneira fácil e rápida de publicar projetos, portfólios ou documentação sem a necessidade de um servidor web separado.
## Vantagens do GitHub Pages
- **Gratuito**: O serviço é gratuito para repositórios públicos.
- **Integração com GitHub**: Facilita a publicação de sites diretamente do seu repositório.
- **Suporte a Jekyll**: Permite a criação de sites dinâmicos usando o gerador de sites estáticos Jekyll.
- **Domínio personalizado**: Permite o uso de domínios personalizados.
## Como criar um site com GitHub Pages
1. **Crie um repositório no GitHub**: O nome do repositório pode ser qualquer um, mas para sites pessoais, o nome deve ser `username.github.io`.
2. **Adicione arquivos do site**: Adicione os arquivos HTML, CSS, JavaScript e outros recursos ao repositório.
3. **Ative o GitHub Pages**:
    - Vá para as configurações do repositório.
    - Na seção "Pages", selecione a branch que deseja usar (geralmente `main` ou `master`) e clique em "Save".
4. **Acesse seu site**: Após alguns minutos, seu site estará disponível em `https://username.github.io` ou `https://username.github.io/repository-name` para repositórios que não sejam pessoais.
## Seleção e configuração de temas jekyll
### O que é jekyll?
Jekyll é um gerador de sites estáticos que transforma arquivos de texto simples em sites estáticos e blogs. Ele é integrado ao GitHub Pages, permitindo que você crie sites dinâmicos com facilidade.
### Como escolher e configurar temas jekyll no GitHub Pages
O GitHub Pages oferece uma variedade de temas Jekyll que podem ser facilmente aplicados ao seu site. Para selecionar e configurar um tema:
1. **Escolha um tema**: Visite a [página de temas do GitHub Pages](https://pages.github.com/themes/) para ver os temas disponíveis.
2. **Adicione o tema ao seu repositório**:
    - Crie um arquivo `_config.yml` na raiz do seu repositório, se ainda não existir.
    - Adicione a seguinte linha ao arquivo, substituindo `the-theme-name` pelo nome do tema escolhido:
      ```yaml
      theme: the-theme-name
      ```
3. **Personalize o tema**: Muitos temas permitem personalização adicional através do arquivo `_config.yml`. Consulte a documentação do tema para ver as opções disponíveis.
4. **Atualize e publique**: Faça commit das alterações e envie para o GitHub. Seu site será atualizado automaticamente com o novo tema.
## Recursos adicionais