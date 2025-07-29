# **JWT (JSON Web Token) - Guia Explicativo**  

## **1. O que é um JWT?**  
Um **JWT (JSON Web Token)** é um padrão (**RFC 7519**) para representar *claims* (informações) entre duas partes de forma segura e compacta. Ele é muito usado em **autenticação** e **troca de informações** em APIs.  

- **Stateless**: O servidor não armazena o token (diferente de sessões tradicionais).  
- **Auto-contido**: O token carrega todas as informações necessárias (ex: ID do usuário, permissões).  
- **Assinado digitalmente**: Garante que o token não foi alterado.  

---

## **2. Como um JWT é gerado?**  
Quando um usuário faz login:  

1. **Envia credenciais** (email/senha) para o servidor.  
2. **Servidor valida** e, se corretas, **gera um JWT**.  
3. **JWT é enviado de volta ao cliente**, que o usará em requisições futuras.  

### **Estrutura do JWT**  
Um JWT tem **3 partes**, separadas por pontos:  

```
Header.Payload.Signature
```  

#### **a) Header**  
Contém **metadados** sobre o token:  
```json
{
  "alg": "HS256",  // Algoritmo de assinatura (ex: HMAC-SHA256)
  "typ": "JWT"     // Tipo do token
}
```  

#### **b) Payload (Dados)**  
Contém as *claims* (informações do usuário e metadados). Exemplos comuns:  
```json
{
  "sub": "12345",          // Subject (ID do usuário)
  "name": "João Silva",    // Dados customizados
  "iat": 1710000000,       // Issued At (quando foi criado, em segundos Unix)
  "exp": 1710003600        // Expiration (expira em 1 hora)
}
```  

#### **c) Signature (Assinatura)**  
Garante que o token **não foi adulterado**. É gerada assim:  
```
HMACSHA256(
  base64UrlEncode(header) + "." + base64UrlEncode(payload),
  secret_key
)
```  
- Se alguém alterar o `Payload`, a assinatura não baterá mais.  

---

## **3. Como o Token é Usado?**  
O cliente envia o JWT no **cabeçalho das requisições**:  
```http
GET /api/dados HTTP/1.1
Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...
```  

O servidor:  
1. **Extrai o token** do cabeçalho `Authorization`.  
2. **Verifica a assinatura** (usando a `secret_key`).  
3. **Checa a expiração** (`exp`).  
4. Se tudo estiver OK, **permite o acesso**.  

---

## **4. Como Funciona a Expiração?**  
### **Opção 1: Tempo de Vida Fixo (`exp`)**  
- O token tem uma **data de validade** (ex: 15 minutos).  
- Após expirar, o usuário **precisa fazer login novamente**.  

### **Opção 2: Refresh Token (Mais Usado)**  
1. **Access Token (JWT)**:  
   - Validade curta (ex: 15 minutos).  
   - Usado nas requisições.  

2. **Refresh Token**:  
   - Validade longa (ex: 7 dias).  
   - **Armazenado no banco de dados** (pode ser revogado).  
   - Usado para **gerar um novo Access Token** quando o atual expira.  

**Fluxo:**  
- Access Token expira → cliente envia Refresh Token.  Quer que eu explique algo mais detalhadamente? 🚀
- Servidor verifica se o Refresh Token é válido.  
- Se sim, **emite um novo Access Token**.  

---

## **5. Segurança do JWT**  
### **Problemas Comuns**  
❌ **XSS (Cross-Site Scripting)**:  
   - Se o JWT estiver no `localStorage`, um hacker pode roubá-lo via JavaScript.  
   - **Solução**: Use cookies `HttpOnly` (inacessíveis via JS).  

❌ **CSRF (Cross-Site Request Forgery)**:  
   - Se usar cookies, um site malicioso pode enviar requisições com o JWT.  
   - **Solução**: Cookies com `SameSite=Strict` + proteção CSRF.  

❌ **Secret Key Fraca**:  
   - Se a chave for simples (`"minhasenha123"`), um hacker pode quebrar a assinatura.  
   - **Solução**: Use `openssl rand -hex 32` para gerar uma chave forte.  

---

## **6. Quando Usar JWT?**  
✅ **APIs Stateless** (microsserviços).  
✅ **Autenticação entre sistemas**.  
✅ **Aplicações Single-Page (SPA)**.  

❌ **Não use JWT para:**  
- **Sessões tradicionais** (se precisar revogar tokens facilmente).  
- **Dados sensíveis** (o Payload é **apenas codificado em Base64**, não criptografado).  

---

## **Resumo Final**  
✔ **JWT = Header + Payload + Signature**.  
✔ **Stateless**: O servidor não armazena o token.  
✔ **Expiração**: Use `exp` ou **Refresh Token + Access Token**.  
✔ **Segurança**: Evite `localStorage`, use chaves fortes e proteja contra CSRF/XSS.  
