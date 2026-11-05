# Strategy: Sistema de Processamento de Pagamentos

| Papel do padrão   | Classe |
|-------------------|--------|
| Strategy          | `EstrategiaPagamento` (interface com `pagar(valor)`) |
| ConcreteStrategy  | `PagamentoCartaoCredito`, `PagamentoPayPal`, `PagamentoTransferenciaBancaria` |
| Context           | `ContextoPagamento` (campo `EstrategiaPagamento` + `setEstrategiaPagamento` para trocar em tempo de execução) |
| Client            | `Cliente` (simula a escolha do usuário e processa o pagamento) |

Correspondência com os nomes do enunciado: `PaymentStrategy` → `EstrategiaPagamento`, `pay()` → `pagar()`,
`CreditCardPayment` → `PagamentoCartaoCredito`, `PayPalPayment` → `PagamentoPayPal`,
`BankTransferPayment` → `PagamentoTransferenciaBancaria`, `PaymentContext` → `ContextoPagamento`, `Client` → `Cliente`.

Diagrama de classes: `Strategy.drawio` / `Strategy.drawio.png`

## Como executar
```bash
javac -d out *.java
java -cp out Cliente
```

## Saída
```
Usuário escolheu: cartao
Pagamento de R$ 250,00 no cartão de crédito final 1234 (Gustavo Caceres)

Usuário escolheu: paypal
Pagamento de R$ 250,00 via PayPal na conta gustavo@email.com

Usuário escolheu: transferencia
Pagamento de R$ 250,00 por transferência bancária (Banco do Brasil, conta 12345-6)
```
