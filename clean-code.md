# Clean Code

> Guia prático para escrever código limpo, legível e manutenível.

## Sumário
1. [O que é Clean Code](#o-que-é-clean-code)
2. [O que não é Clean Code](#o-que-não-é-clean-code)  
3. [Princípios](#princípios)
4. [Boas Práticas Gerais](#boas-práticas-gerais)
   - [Nomenclatura de Variáveis](#nomenclatura-de-variáveis)
   - [Booleans e Semântica](#booleans-e-semântica)
   - [Causa e Efeito](#causa-e-efeito)
   - [Regras em Condicionais](#regras-em-condicionais)
   - [Parâmetros e Desestruturação](#parâmetros-e-desestruturação)
   - [Números Mágicos](#números-mágicos)
   - [Comentários](#comentários)
   - [Syntactic Sugars](#syntactic-sugars)
5. [Clean Code no React](#clean-code-no-react)
   - [Desacoplando Componentes](#desacoplando-componentes)
   - [Componentes Puros](#componentes-puros)
   - [Funções e Eventos](#funções-e-eventos)
   - [Composição vs Customização](#composição-vs-customização)
6. [Clean Code no Node.js](#clean-code-no-nodejs)
   - [SOLID](#solid)
   - [DDD (Domain Driven Design)](#ddd-domain-driven-design)

---

## O que é Clean Code
Clean Code é um conjunto de boas práticas que torna o código:
- **Legível**: Fácil de ler e entender
- **Manutenível**: Simples de modificar e estender
- **Previsível**: Comportamento esperado e consistente
- **Confiável**: Reduz bugs e problemas

## O que não é Clean Code
- Não é um manual rígido de regras
- Não depende apenas de teoria
- Não é apenas sobre estrutura de pastas
- Não significa necessariamente código menor
- Não tem relação direta com arquitetura ou design
- Não é sobre performance (embora possa impactar indiretamente)

---

## Princípios
1. **Testes Automatizados**: Garante que mudanças não quebrem funcionalidades
2. **Revisão de Código (Code Review)**: Múltiplos olhares melhoram a qualidade
3. **Refatoração**: Melhoria contínua do código sem alterar funcionalidade
4. **Simplicidade (KISS)**: Keep It Simple & Stupid - prefira soluções simples
5. **Iterações Curtas**: Pequenas adições frequentes ao invés de grandes mudanças

---

## Boas Práticas Gerais

### Nomenclatura de Variáveis
**Princípios:**
- Facilite a leitura para outros desenvolvedores
- Use nomes descritivos e específicos
- Evite nomes genéricos como `data`, `response`, `list`, `args`
- Seja consistente na nomenclatura

**❌ Errado:**
```ts
const user = ['Felipe', 'Diego', 'Roberto']
const filtered = user.filter(u => {
    return u.startsWith('F')
})
```

**✅ Correto:**
```ts
const users = ['Felipe', 'Diego', 'Roberto']
const usersStartWithLetterF = users.filter(user => {
    return user.startsWith('F')
})
```

**❌ Errado:**
```ts
function getUsers() {
    const data = getUsersFromDataBase()
    return data
}
```

**✅ Correto:**
```ts
function getUsers() {
    const usersData = getUsersFromDataBase()
    return usersData
}
```

---

### Booleans e Semântica
**Princípios:**
- Escreva variáveis booleanas como perguntas
- Use prefixos como `is`, `does`, `has`, `can`, `should`
- Mantenha a semântica clara
- Evite nomes genéricos

**❌ Errado:**
```ts
const userMajority = true
const disabled = true
const active = false
```

**✅ Correto:**
```ts
const isUserOfMajority = true
const isDisabled = true
const isActive = false
const canUserAccess = true
const hasPermission = false
const shouldShowModal = true
```

---

### Causa e Efeito
**Princípio:** O nome da variável deve descrever a **causa**, não o **efeito**.

**❌ Errado:**
```tsx
function Button() {
    const isButtonDisabled = true
    return (
        <button disabled={isButtonDisabled}>
            {isButtonDisabled ? 'Carregando...' : 'Enviar'}
        </button>
    )
}
```

**✅ Correto:**
```tsx
function Button() {
    const isFormSubmitting = true
    return (
        <button disabled={isFormSubmitting}>
            {isFormSubmitting ? 'Carregando...' : 'Enviar'}
        </button>
    )
}
```

**Por quê?** `isFormSubmitting` explica a **causa** do botão estar desabilitado, enquanto `isButtonDisabled` apenas descreve o **efeito**.

---

### Regras em Condicionais

#### 1. Evite negação dentro de `if`
**❌ Errado:**
```ts
const isUserOlderThan18Years = true
const isUserLivesInBrazil = true

if (!isUserOlderThan18Years && !isUserLivesInBrazil) {
    // difícil de entender
}
```

**✅ Correto:**
```ts
const isUserYoungerThan18Years = true
const doesUserLiveOutsideBrazil = true

if (isUserYoungerThan18Years && doesUserLiveOutsideBrazil) {
    // mais claro e legível
}
```

#### 2. Prefira Early Return ao invés de `else`
**❌ Errado:**
```ts
function isUserOlderThan18Years(user) {
    if (!user) {
        return { error: true }
    } else {
        return user.age > 18
    }
}
```

**✅ Correto:**
```ts
function isUserOlderThan18Years(user) {
    if (!user) return { error: true }
    return user.age > 18
}
```

#### 3. Evite condicionais aninhadas
**❌ Errado:**
```ts
function processUser(user) {
    if (user) {
        if (user.age > 18) {
            if (user.hasPermission) {
                return 'Acesso permitido'
            }
        }
    }
    return 'Acesso negado'
}
```

**✅ Correto:**
```ts
function processUser(user) {
    if (!user) return 'Acesso negado'
    if (user.age <= 18) return 'Acesso negado'
    if (!user.hasPermission) return 'Acesso negado'
    
    return 'Acesso permitido'
}
```

### Parâmetros e Desestruturação
**Princípios:**
- Utilize desestruturação para facilitar a leitura
- Prefira receber objetos ao invés de múltiplos parâmetros
- Prefira retornar objetos de funções

**❌ Errado:**
```ts
function createUser(name, email, age, city, country) {
    // muitos parâmetros são difíceis de lembrar a ordem
    return `${name} - ${email}`
}

createUser('João', 'joao@email.com', 25, 'São Paulo', 'Brasil')
```

**✅ Correto:**
```ts
interface CreateUserParams {
    name: string
    email: string
    age: number
    city: string
    country: string
}

function createUser({ name, email, age, city, country }: CreateUserParams) {
    return {
        displayName: `${name} - ${email}`,
        location: `${city}, ${country}`,
        isAdult: age >= 18
    }
}

createUser({
    name: 'João',
    email: 'joao@email.com',
    age: 25,
    city: 'São Paulo',
    country: 'Brasil'
})
```

### Números Mágicos
**Problema:** Números mágicos são valores numéricos que aparecem no código sem explicação do seu significado.

**❌ Errado:**
```ts
function calculateDiscount(price: number) {
    return price * 0.1 // o que significa 0.1?
}

function isValidAge(age: number) {
    return age >= 18 // por que 18?
}
```

**✅ Correto:**
```ts
const DISCOUNT_PERCENTAGE = 0.1
const MINIMUM_AGE_FOR_VOTING = 18

function calculateDiscount(price: number) {
    return price * DISCOUNT_PERCENTAGE
}

function isValidAge(age: number) {
    return age >= MINIMUM_AGE_FOR_VOTING
}

// Ou ainda melhor, seja específico sobre unidades:
const priceInCents = 5000
const discountAmountInPercentage = 10
```

### Comentários
**Princípios:**
- Comentário não é documentação
- Comentário deve ser um aviso quando necessário
- Código bom se explica sozinho

**❌ Errado:**
```ts
// Incrementa o contador em 1
counter++

// Retorna o nome do usuário
function getUserName(user) {
    return user.name
}
```

**✅ Correto:**
```ts
// FIXME: Este cálculo não considera fuso horário
const deadline = new Date(startDate.getTime() + 24 * 60 * 60 * 1000)

// WARNING: Esta função faz uma chamada para API externa
async function validateCPF(cpf: string) {
    return await externalCPFValidator.validate(cpf)
}

// TODO: Implementar cache para melhorar performance
function expensiveCalculation() {
    // ...
}
```

### Syntactic Sugars
**Problema:** Construções que podem dificultar o entendimento para desenvolvedores menos experientes.

**❌ Evite quando puder:**
```ts
const result = user?.profile?.preferences?.theme ?? 'dark'
const users = data?.users?.filter(u => u.active)?.map(u => u.name) || []
```

**✅ Prefira clareza:**
```ts
const defaultTheme = 'dark'
const userTheme = user && user.profile && user.profile.preferences 
    ? user.profile.preferences.theme 
    : defaultTheme

const activeUsers = data && data.users 
    ? data.users.filter(user => user.active)
    : []
const userNames = activeUsers.map(user => user.name)
```

---

## Clean Code no React

### Desacoplando Componentes
**Quando separar componentes em componentes menores?**
- Quando há algo repetitivo
- Quando é possível isolar algo do contexto sem prejudicar o comportamento original
- Quando há variáveis, funções ou hooks dedicados apenas a uma parte do componente

**Princípios:**
- Nem tudo que se repete precisa ser separado
- Evite componentização excessiva
- Analise o JavaScript para determinar se deve desacoplar

**❌ Errado - Componentização excessiva:**
```tsx
function UserName({ name }) {
    return <span>{name}</span>
}

function UserEmail({ email }) {
    return <span>{email}</span>
}

function UserCard({ user }) {
    return (
        <div>
            <UserName name={user.name} />
            <UserEmail email={user.email} />
        </div>
    )
}
```

**✅ Correto - Componente coeso:**
```tsx
function UserCard({ user }) {
    return (
        <div>
            <span>{user.name}</span>
            <span>{user.email}</span>
        </div>
    )
}

// Ou se realmente precisar desacoplar:
function UserInfo({ name, email }) {
    return (
        <div>
            <span>{name}</span>
            <span>{email}</span>
        </div>
    )
}
```

### Componentes Puros
**Conceito:** Funções puras não dependem do meio externo, apenas dos parâmetros enviados.

**❌ Errado - Componente impuro:**
```tsx
const globalTheme = 'dark'

function Button({ children }) {
    const theme = globalTheme // dependência externa
    return (
        <button className={theme}>
            {children}
        </button>
    )
}
```

**✅ Correto - Componente puro:**
```tsx
function Button({ children, theme }) {
    return (
        <button className={theme}>
            {children}
        </button>
    )
}

// Uso:
<Button theme="dark">Clique aqui</Button>
```

### Funções e Eventos
**Convenções de nomenclatura:**
- **handle**: Função que lida com evento do usuário
- **on**: Função disparada por evento recebida via parâmetros

**❌ Errado:**
```tsx
function Form({ submitCallback }) {
    const clickSubmit = () => {
        submitCallback()
    }
    
    return <button onClick={clickSubmit}>Enviar</button>
}
```

**✅ Correto:**
```tsx
function Form({ onSubmit }) {
    const handleSubmitClick = () => {
        onSubmit()
    }
    
    return <button onClick={handleSubmitClick}>Enviar</button>
}
```

### Composição vs Customização
**Composição:** Mais flexível, permite diferentes combinações.
**Customização:** Apenas mudanças visuais específicas.

**❌ Customização excessiva:**
```tsx
function Modal({ 
    title, 
    content, 
    showCloseButton, 
    closeButtonText, 
    closeButtonColor,
    showFooter,
    footerContent,
    footerAlignment 
}) {
    return (
        <div className="modal">
            <header>{title}</header>
            <main>{content}</main>
            {showFooter && (
                <footer style={{ textAlign: footerAlignment }}>
                    {footerContent}
                </footer>
            )}
            {showCloseButton && (
                <button style={{ color: closeButtonColor }}>
                    {closeButtonText}
                </button>
            )}
        </div>
    )
}
```

**✅ Composição Pattern:**
```tsx
function Modal({ children }) {
    return <div className="modal">{children}</div>
}

function ModalHeader({ children }) {
    return <header className="modal-header">{children}</header>
}

function ModalContent({ children }) {
    return <main className="modal-content">{children}</main>
}

function ModalFooter({ children }) {
    return <footer className="modal-footer">{children}</footer>
}

// Uso flexível:
<Modal>
    <ModalHeader>Título personalizado</ModalHeader>
    <ModalContent>Conteúdo específico</ModalContent>
    <ModalFooter>
        <button>Cancelar</button>
        <button>Confirmar</button>
    </ModalFooter>
</Modal>
```

---

## Clean Code no Node.js

### SOLID
**Conceito:** Os cinco princípios do SOLID são interconectados e interdependentes, formando um conjunto coeso de boas práticas.

#### S - Single Responsibility Principle (Princípio da Responsabilidade Única)
**Definição:** Cada parte da aplicação deve ser responsável por uma única ação.

**❌ Errado:**
```ts
class User {
    constructor(private name: string, private email: string) {}
    
    save() {
        // salva no banco
    }
    
    sendEmail() {
        // envia email
    }
    
    generateReport() {
        // gera relatório
    }
    
    validateEmail() {
        // valida email
    }
}
```

**✅ Correto:**
```ts
class User {
    constructor(private name: string, private email: string) {}
    
    getName() { return this.name }
    getEmail() { return this.email }
}

class UserRepository {
    save(user: User) {
        // salva no banco
    }
}

class EmailService {
    send(email: string, message: string) {
        // envia email
    }
}

class UserReportGenerator {
    generate(user: User) {
        // gera relatório
    }
}
```

#### O - Open/Closed Principle (Aberto/Fechado)
**Definição:** Classes devem estar abertas para extensão, mas fechadas para modificação.

**❌ Errado:**
```ts
class Calculator {
    calculate(operation: string, a: number, b: number) {
        if (operation === 'add') {
            return a + b
        }
        if (operation === 'subtract') {
            return a - b
        }
        // Para adicionar multiplicação, preciso modificar esta classe
    }
}
```

**✅ Correto:**
```ts
interface Operation {
    execute(a: number, b: number): number
}

class Addition implements Operation {
    execute(a: number, b: number): number {
        return a + b
    }
}

class Subtraction implements Operation {
    execute(a: number, b: number): number {
        return a - b
    }
}

class Calculator {
    calculate(operation: Operation, a: number, b: number) {
        return operation.execute(a, b)
    }
}

// Para adicionar nova operação, só criar nova classe
class Multiplication implements Operation {
    execute(a: number, b: number): number {
        return a * b
    }
}
```

#### L - Liskov Substitution Principle (Substituição de Liskov)
**Definição:** Deve ser possível substituir uma dependência por outra desde que tenham o mesmo formato.

**❌ Errado:**
```ts
class Bird {
    fly() {
        return 'Flying'
    }
}

class Penguin extends Bird {
    fly() {
        throw new Error('Penguins cannot fly') // Quebra o contrato
    }
}
```

**✅ Correto:**
```ts
interface Bird {
    move(): string
}

class FlyingBird implements Bird {
    move(): string {
        return 'Flying'
    }
}

class SwimmingBird implements Bird {
    move(): string {
        return 'Swimming'
    }
}
```

#### I - Interface Segregation Principle (Segregação de Interface)
**Definição:** Separe interfaces grandes em interfaces menores e específicas.

**❌ Errado:**
```ts
interface Worker {
    work(): void
    eat(): void
    sleep(): void
    code(): void
    design(): void
}

class Developer implements Worker {
    work() { /* implementa */ }
    eat() { /* implementa */ }
    sleep() { /* implementa */ }
    code() { /* implementa */ }
    design() { /* não deveria implementar */ }
}
```

**✅ Correto:**
```ts
interface Worker {
    work(): void
}

interface Person {
    eat(): void
    sleep(): void
}

interface Programmer {
    code(): void
}

interface Designer {
    design(): void
}

class Developer implements Worker, Person, Programmer {
    work() { /* implementa */ }
    eat() { /* implementa */ }
    sleep() { /* implementa */ }
    code() { /* implementa */ }
}
```

#### D - Dependency Inversion Principle (Inversão de Dependência)
**Definição:** Dependa de abstrações, não de implementações concretas.

**❌ Errado:**
```ts
class EmailService {
    send(message: string) {
        // implementação específica do Gmail
    }
}

class UserService {
    private emailService = new EmailService() // dependência concreta
    
    notifyUser(user: User) {
        this.emailService.send('Hello')
    }
}
```

**✅ Correto:**
```ts
interface NotificationService {
    send(message: string): void
}

class EmailService implements NotificationService {
    send(message: string) {
        // implementação do email
    }
}

class SMSService implements NotificationService {
    send(message: string) {
        // implementação do SMS
    }
}

class UserService {
    constructor(private notificationService: NotificationService) {}
    
    notifyUser(user: User) {
        this.notificationService.send('Hello')
    }
}

// Uso:
const userService = new UserService(new EmailService())
// ou
const userServiceWithSMS = new UserService(new SMSService())
```

**Exemplo Prático Completo:**
```ts
// Interfaces (abstrações)
interface PaymentMethod {
    getDiscountAmount(amount: number): number
}

interface Card {
    number: number
    cvv: number
    expirationDate: Date
}

// Implementações concretas
class Billet implements PaymentMethod {
    getDiscountAmount(amount: number): number {
        return amount * 0.1
    }
}

class Credit implements PaymentMethod, Card {
    number: number
    cvv: number
    expirationDate: Date
    
    constructor(private installments: number) {}

    getDiscountAmount(amount: number): number {
        if (this.installments === 1) {
            return amount * 0.05
        }
        if (this.installments <= 6) {
            return amount * 0.02
        }
        return 0
    }
}

class Debit implements PaymentMethod, Card {
    number: number
    cvv: number
    expirationDate: Date
    
    getDiscountAmount(amount: number): number {
        return amount * 0.05
    }
}

// Classe que usa as abstrações
class CalculateOrderDiscount {
    constructor(private paymentMethod: PaymentMethod) {}
    
    execute(amount: number): number {
        return amount - this.paymentMethod.getDiscountAmount(amount)
    }
}

// Uso
const creditCalculator = new CalculateOrderDiscount(new Credit(1))
const billetCalculator = new CalculateOrderDiscount(new Billet())
const debitCalculator = new CalculateOrderDiscount(new Debit())
```

### DDD (Domain Driven Design)
**Definição:** DDD é uma abordagem para desenhar e estruturar software baseado no domínio do problema que você está resolvendo.

#### O que é DDD?
- **Prática de Design**: Método para pensar e desenhar como será o software antes da implementação
- **Diferença da Arquitetura**: DDD é o desenho conceitual, arquitetura é a implementação técnica
- **Foco no Problema**: Concentra-se no problema real e seu contexto, não na tecnologia

#### Conceitos Fundamentais

**Domínio:**
- O problema que você está resolvendo
- Todo o contexto da problemática
- Área de conhecimento ou atividade em torno da qual a aplicação é aplicada

**Subdomínios:**
- Diferentes áreas dentro do domínio maior
- Processos específicos que acontecem dentro da problemática
- Cada subdomínio tem suas próprias regras e entidades

**Exemplo - E-commerce:**
```
Domínio: E-commerce
├── Subdomínio: Catálogo de Produtos
├── Subdomínio: Carrinho de Compras  
├── Subdomínio: Pagamento
├── Subdomínio: Logística
├── Subdomínio: Faturamento
└── Subdomínio: Estoque
```

#### Domain Experts
- **Quem são**: Pessoas com conhecimento profundo sobre o domínio
- **Papel do Dev**: Identificar através da fala dos experts as entidades e casos de uso
- **Colaboração**: Trabalho conjunto para modelar o software baseado no conhecimento real

#### Entidades e Casos de Uso

**Entidades:**
- Atores dentro de cada subdomínio
- Representam conceitos do mundo real
- Têm identidade e ciclo de vida próprios

**Casos de Uso:**
- Ações realizadas entre as entidades
- Como as entidades se relacionam e interagem
- Representam os processos de negócio

**Exemplo Prático - Subdomínio de Pagamento:**
```ts
// Entidades
class Customer {
    constructor(
        private id: string,
        private name: string,
        private email: string
    ) {}
}

class Order {
    constructor(
        private id: string,
        private customerId: string,
        private amount: number,
        private status: OrderStatus
    ) {}
}

class Payment {
    constructor(
        private id: string,
        private orderId: string,
        private method: PaymentMethod,
        private amount: number
    ) {}
}

// Casos de Uso
class ProcessPaymentUseCase {
    constructor(
        private paymentRepository: PaymentRepository,
        private orderRepository: OrderRepository,
        private paymentGateway: PaymentGateway
    ) {}
    
    async execute(orderId: string, paymentMethod: PaymentMethod) {
        const order = await this.orderRepository.findById(orderId)
        if (!order) throw new Error('Order not found')
        
        const payment = new Payment(
            generateId(),
            orderId,
            paymentMethod,
            order.getAmount()
        )
        
        const result = await this.paymentGateway.process(payment)
        await this.paymentRepository.save(payment)
        
        if (result.success) {
            await this.orderRepository.updateStatus(orderId, 'PAID')
        }
        
        return result
    }
}
```

#### Princípios Importantes

**1. Independência de Persistência:**
- As entidades no código não precisam refletir a estrutura do banco de dados
- A forma de persistir dados não deve influenciar a organização do código

**2. Representação do Mundo Real:**
- O software deve representar o domínio real, não apenas a tecnologia
- Estrutura de arquivos deve refletir o domínio, não frameworks

**3. Linguagem Ubíqua:**
- Mesma linguagem entre desenvolvedores e domain experts
- Termos do domínio devem aparecer no código

**Exemplo de Estrutura de Pastas:**
```
src/
├── domains/
│   ├── payment/
│   │   ├── entities/
│   │   │   ├── Payment.ts
│   │   │   └── PaymentMethod.ts
│   │   ├── usecases/
│   │   │   └── ProcessPaymentUseCase.ts
│   │   └── repositories/
│   │       └── PaymentRepository.ts
│   ├── inventory/
│   │   ├── entities/
│   │   │   └── Product.ts
│   │   └── usecases/
│   │       └── UpdateStockUseCase.ts
│   └── shipping/
│       ├── entities/
│       │   └── Delivery.ts
│       └── usecases/
│           └── CalculateShippingUseCase.ts
```

**Citação Importante:**
> *"O grande ponto é começar a pensar que o software é uma representação de algo do mundo real, da vida real, e menos tecnologia. Isso faz você organizar arquivos e pastas de forma menos dependente de meios técnicos (banco de dados, framework) e mais representativa da realidade e dos problemas que você está resolvendo."*

---

## Resumo das Boas Práticas
1. **Nomenclatura clara e descritiva**
2. **Funções pequenas e com responsabilidade única**
3. **Evitar condicionais complexas e aninhadas**
4. **Preferir composição sobre customização**
5. **Aplicar princípios SOLID**
6. **Modelar software baseado no domínio real**
7. **Escrever código que se explica**
8. **Manter consistência no projeto**