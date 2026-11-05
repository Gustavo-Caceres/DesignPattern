# Observer: Alerta de preço

**Enunciado:** uma loja quer que, sempre que o preço de um produto mudar, a vitrine atualize a
etiqueta e os clientes interessados recebam um aviso. Usando o padrão Observer, conforme o exemplo
`Subject` / `Observer` / `ConcreteObserver` da apresentação, faça o produto notificar
automaticamente todos os observadores registrados.

| Papel            | Classe |
|------------------|--------|
| Subject          | `Produto` (`attach`, `notifyAllObservers`, `setPreco` notifica) |
| Observer         | `Observer` (abstrata, `update()`) |
| ConcreteObserver | `ClienteObserver`, `VitrineObserver` |
| Consumidor       | `ConsumidorObserver` |

Diagrama: `Observer.drawio` / `Observer.drawio.png`

## Executar
```bash
javac -d out *.java
java -cp out ConsumidorObserver
```

## Saída
```
Antes de atualizar o preço do produto
[Vitrine] Etiqueta atualizada: Notebook - R$ 4200,00
[Ana] Aviso: o Notebook agora custa R$ 4200,00
[Bruno] Aviso: o Notebook agora custa R$ 4200,00
Depois de atualizar o preço do produto

Antes da nova atualização do preço do produto
[Vitrine] Etiqueta atualizada: Notebook - R$ 3999,90
[Ana] Aviso: o Notebook agora custa R$ 3999,90
[Bruno] Aviso: o Notebook agora custa R$ 3999,90
Depois de atualizar pela segunda vez o preço do produto
```
