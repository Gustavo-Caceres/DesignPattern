# Decorator: Lanchonete

**Enunciado:** uma lanchonete vende hambúrgueres (R$ 20,00) e permite acrescentar adicionais:
queijo (+R$ 3,00), bacon (+R$ 5,00) e ovo (+R$ 2,50), em qualquer quantidade e ordem.
Usando o padrão Decorator, conforme o exemplo do café da apresentação, monte os lanches e
mostre a descrição e o custo a cada adicional, sem criar uma subclasse para cada combinação.

| Papel             | Classe |
|-------------------|--------|
| Component         | `iLanche` (`Descricao()`, `Preco()`) |
| ConcreteComponent | `Hamburguer` |
| Decorator         | `AdicionalDecorator` (abstrata, guarda `lanche`) |
| ConcreteDecorator | `QueijoDecorator`, `BaconDecorator`, `OvoDecorator` |
| Consumidor        | `ConsumidorDecorator` |

Diagrama: `Decorator.drawio` / `Decorator.drawio.png`

## Executar
```bash
javac -d out *.java
java -cp out ConsumidorDecorator
```

## Saída
```
Lanche pedido: Hambúrguer
Custo        : R$ 20,00

Lanche pedido: Hambúrguer, queijo
Custo        : R$ 23,00

Lanche pedido: Hambúrguer, queijo, bacon
Custo        : R$ 28,00

Lanche pedido: Hambúrguer, queijo, bacon, ovo
Custo        : R$ 30,50

Lanche pedido: Hambúrguer, queijo, queijo
Custo        : R$ 26,00
```
