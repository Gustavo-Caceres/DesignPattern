# Atividade Prática: Adapter — Integração de transportadoras

## Papéis
| Papel   | Classe |
|---------|--------|
| Client  | `CotacaoService` |
| Target  | `CalculadoraFrete` |
| Adapter | `FreteAlfaAdapter`, `FreteBetaAdapter`, `FreteGamaAdapter` |
| Adaptee | `ServicoTransportadoraAlfa`, `ApiTransportadoraBeta`, `ClienteTransportadoraGama` (+ `TarifaGama`) |

Diagrama de classes: `Adapter.drawio` / `Adapter.drawio.png`

## Como executar
```bash
javac -d out *.java
java -cp out Main
```

## Saída do Main
```
Cotação de frete: 2.5 kg | 80010-000 -> 01310-100
--------------------------------------------
Alfa           R$  34,00  (6 dias)
Beta           R$  36,15  (5 dias)
Gama           R$  30,00  (3 dias)
Gama Expresso  R$  48,00  (1 dia)
--------------------------------------------
Mais barata: Gama

Teste de CEP inválido -> CEP inválido (precisa ter 8 dígitos): 8001-000
```

## Por que adaptador de objeto (composição) e não de classe (herança)?
O Java não tem herança múltipla de classes: um adaptador de classe teria que estender o Adaptee e
implementar o Target, o que trava o adapter a uma única classe concreta. Com composição, o adapter
recebe o Adaptee pelo construtor e só delega, então dá para trocar a instância (ou usar subclasses
do Adaptee, ou um mock em testes) sem mudar o adapter. Além disso, a API do fornecedor não vaza
para o checkout, e as classes dos fornecedores e o `CotacaoService` continuam sem nenhuma alteração.
