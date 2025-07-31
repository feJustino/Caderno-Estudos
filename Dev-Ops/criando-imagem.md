
# Criando Imagens Docker: Estrutura e Comandos

## Estrutura Básica de um Dockerfile

- **FROM:** Define a imagem base para o container (geralmente buscada no Docker Hub)
- **WORKDIR:** Define o diretório de trabalho dentro da imagem base (sem isso, comandos rodam no diretório raiz do SO)
- **COPY:** Copia arquivos do projeto para dentro do container
    - Exemplo: copiar `package.json` para instalar dependências
- **RUN:** Executa comandos de terminal durante o build da imagem (ex: instalar dependências, rodar build)
- **EXPOSE:** Expõe uma porta do container para acesso externo
- **CMD:** Define o comando padrão para subir a aplicação
    - Recebe os executáveis em formato de array
    - Pode ser sobrescrito via CLI

---

## Exemplo de Dockerfile para Node.js

```Dockerfile
# Usa a imagem oficial do Node.js versão 18, na variante slim (mais leve)
FROM node:24-slim

# Define o diretório de trabalho dentro do contêiner
WORKDIR /usr/src/app

# Copia apenas o package.json para o contêiner (útil para aproveitar cache no build)
COPY package.json yarn.lock .yarnrc.yml ./

# Instala as dependências do projeto definidas no package.json
COPY .yarn ./.yarn

# Copia todos os arquivos da aplicação para o diretório de trabalho do contêiner
COPY . .

# Essa flag garante que a instalação respeite exatamente o yarn.lock e não modifique nada
RUN yarn install --immutable
# Executa novamente o yarn (pode ser necessário se scripts de instalação usam arquivos do projeto)
RUN yarn run build

# Informa que o contêiner pretende expor a porta 3000 (usada por apps web em Node.js, como Express)
EXPOSE 3000

# Define o comando padrão que será executado quando o contêiner iniciar
CMD ["yarn", "run", "start"]
```

---

## Comandos Úteis

- **Buildar imagem:**
    ```bash
    docker build -t <nome-da-imagem> .
    ```
- **Ver histórico de execução do build da imagem:**
    ```bash
    docker image history <nome-da-imagem>
    ```
- **Listar imagens disponíveis:**
    ```bash
    docker image ls
    ```
-  **Cria o Container**
    ```bash
    docker run --rm -p 3000:3000 <image-name>
    ```
    - ```--rm```: opção adicionada para ao parar o container deletera ele
    - ```-p```: port -> mapeia a porta da interface para uma porta do container
    - ```-d```: Roda em modo deateched
- **Lista containeres:**
    ```bash
    docker ps
    ```
- **Para o Container**
    ```bash
    docker stop <container-id>
    ```
- **Roda o Container**
    ```bash
    docker start <container-id>
    ```
- **Lista logs**
    ```bash
    docker logs <container-id>
    ```

## Boas Práticas

### 🚀 Otimização de Performance e Tamanho

#### 1. **Aproveitamento do Cache de Layers**
- Copie arquivos de dependência primeiro (`package.json`, `yarn.lock`, `.yarnrc.yml`)
- Instale dependências antes de copiar o código da aplicação
- Evite invalidar cache desnecessariamente

#### 2. **Gerenciamento de Dependências**
- Use `yarn install --immutable` ou `npm ci` para instalações determinísticas
- Copie arquivos de configuração do gerenciador de pacotes:
  - `yarn.lock` / `package-lock.json`
  - `.yarnrc.yml` / `.npmrc`
  - Pasta `.yarn` (para Yarn Berry)

#### 3. **Dockerignore para Reduzir Contexto**
Crie um `.dockerignore` para excluir arquivos desnecessários:
```dockerignore
node_modules
npm-debug.log
.git
.gitignore
README.md
.env
.env.local
.env.development.local
.env.test.local
.env.production.local
coverage
.nyc_output
.vscode
.idea
*.md
```

### 🛡️ Segurança

#### 4. **Usuário Não-Root**
```dockerfile
# Crie um usuário não-root
RUN addgroup --system --gid 1001 nodejs
RUN adduser --system --uid 1001 nextjs
USER nextjs
```

#### 5. **Imagens Base Seguras**
- Prefira imagens oficiais e com tags específicas
- Use variantes `slim` ou `alpine` quando possível
- Exemplo: `node:18-alpine` ao invés de `node:latest`

### 📦 Multi-stage Builds

#### 6. **Separação de Build e Runtime**
```dockerfile
# Build stage
FROM node:18-alpine AS builder
WORKDIR /app
COPY package*.json ./
RUN npm ci --only=production

# Production stage
FROM node:18-alpine AS production
WORKDIR /app
COPY --from=builder /app/node_modules ./node_modules
COPY . .
CMD ["npm", "start"]
```

### 🔧 Configuração e Manutenção

#### 7. **Variáveis de Ambiente**
- Use `ARG` para valores de build-time
- Use `ENV` para valores de runtime
- Defina valores padrão sensatos

#### 8. **Health Checks**
```dockerfile
HEALTHCHECK --interval=30s --timeout=3s --start-period=5s --retries=3 \
  CMD curl -f http://localhost:3000/health || exit 1
```

#### 9. **Labels para Metadata**
```dockerfile
LABEL maintainer="seu-email@exemplo.com"
LABEL version="1.0"
LABEL description="Aplicação Node.js"
```

### 📋 Checklist de Boas Práticas

- [ ] Usar imagem base oficial e específica
- [ ] Implementar multi-stage build quando aplicável
- [ ] Criar e configurar `.dockerignore`
- [ ] Copiar dependências antes do código
- [ ] Usar usuário não-root
- [ ] Implementar health checks
- [ ] Adicionar labels informativos
- [ ] Minimizar número de layers
- [ ] Usar cache de layers eficientemente