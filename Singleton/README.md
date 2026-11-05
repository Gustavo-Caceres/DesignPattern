# Singleton: Logger do sistema

**Enunciado:** uma loja virtual precisa de um único log, compartilhado por todas as partes do
sistema (login, carrinho etc.). Usando o padrão Singleton, conforme a estrutura da apresentação
(atributo estático `instancia`, construtor privado e `getInstance()` com inicialização tardia),
crie a classe `Logger` e mostre que todas as partes usam o mesmo objeto.

| Elemento do padrão          | No código |
|-----------------------------|-----------|
| Atributo estático da instância | `private static Logger instancia` |
| Construtor privado          | `private Logger()` |
| Ponto de acesso global      | `public static Logger getInstance()` (cria só se `instancia == null`) |

Diagrama: `Singleton.drawio` / `Singleton.drawio.png`

## Executar
```bash
javac -d out *.java
java -cp out Main
```

## Saída
```
>> Logger criado (isso só deve aparecer uma vez)
Mesma instância? true

Log do sistema Loja Virtual:
  1. Usuário Ana fez login
  2. Notebook adicionado ao carrinho
  3. Usuário Ana fez logout
```
