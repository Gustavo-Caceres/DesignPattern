# Strategy e Singleton: módulo de cálculo de frete

## Como executar
```bash
javac -d out *.java
java -cp out Main           # demonstração pedida no enunciado
java -cp out DesafioExtra   # desafio extra (FreteGratisAcima)
```

## Estrutura
| Padrão    | Classes |
|-----------|---------|
| Singleton | `ConfiguracaoLoja` (initialization-on-demand holder), `AuditLog` (double-checked locking + `volatile`) |
| Strategy  | Contexto `CalculadoraDeFrete`, interface `FreteStrategy`, estratégias `FretePac`, `FreteSedex`, `RetiradaNaLoja` |
| Modelo    | `Pedido` (imutável, valida peso > 0, distância >= 0 e valor >= 0) |
| Extra     | `FreteGratisAcima` (Decorator sobre `FreteStrategy`) |

Diagramas em `docs/`:
- `diagrama-1-singleton.drawio` (+ `.png`)
- `diagrama-2-strategy.drawio` (+ `.png`)

## Saída do Main
```
(a) Pedido 1: 2 kg, 100 km, R$ 200,00 em itens
  PAC       R$ 10,00
  SEDEX     R$ 35,00
  RETIRADA  R$ 0,00

(b) Tarifa PAC por kg alterada para R$ 5,00
  PAC       R$ 15,00

(c) Tarifas restauradas: PAC por kg = R$ 2,50

(d) Mesma instância de ConfiguracaoLoja? true

(e) AuditLog:
  pedido=1 estrategia=PAC frete=10.00
  pedido=1 estrategia=SEDEX frete=35.00
  pedido=1 estrategia=RETIRADA frete=0.00
  pedido=1 estrategia=PAC frete=15.00
```

## Desafio extra
`FreteGratisAcima` recebe outra `FreteStrategy` no construtor e devolve 0 quando `valorItens >= 300,00`;
abaixo disso, delega para a estratégia recebida. Foi feito sem alterar nenhuma classe existente
(nem a `CalculadoraDeFrete`, que não tem `if`/`switch` sobre o tipo de frete).

**Qual outro padrão aparece?** O **Decorator**: a classe implementa a mesma interface do objeto
que envolve, guarda uma referência a ele e acrescenta comportamento antes de delegar.
