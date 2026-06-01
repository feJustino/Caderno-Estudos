# Modificadores de acesso

- Modificadores de acesso controlam a visibilidade e o acesso a membros de uma classe
- Tipos de modificadores de acesso:
  - Public: Acessível de qualquer lugar
  - Private: Acessível apenas dentro da própria classe
  - Protected: Acessível dentro da própria classe e por classes derivadas
  - Default (package-private): Acessível apenas dentro do mesmo pacote (sem modificador explícito)
- Exemplo em Java:

```java
public class Principal {
    public String nomePublico; // Acessível de qualquer lugar
    private int idadePrivada; // Acessível apenas dentro da classe Principal
    protected String enderecoProtegido; // Acessível dentro da classe Principal e por classes derivadas
    String telefoneDefault; // Acessível apenas dentro do mesmo pacote

    public void metodoPublico() {
        // Código do método público
    }

    private void metodoPrivado() {
        // Código do método privado
    }

    protected void metodoProtegido() {
        // Código do método protegido
    }

    void metodoDefault() {
        // Código do método default
    }
}
```
