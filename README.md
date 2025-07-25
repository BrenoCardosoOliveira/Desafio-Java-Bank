# 💰 Desafio-Java-Bank

Este projeto é uma simulação de um sistema bancário simples, desenvolvido em Java com foco nos princípios da **Programação Orientada a Objetos (POO)**: herança, abstração, polimorfismo e encapsulamento.

---

## 🚀 Funcionalidades

- 📂 Criação de contas bancárias (Corrente e Poupança)
- 💵 Depósitos
- 🏧 Saques com verificação de saldo
- 🔁 Transferências via PIX entre contas
- 📈 Investimentos (permitidos apenas em contas poupança)
- 🧾 Geração de extratos com histórico de transações

---

## 🧠 Conceitos de POO aplicados

| Conceito        | Implementação                                                                 |
|-----------------|--------------------------------------------------------------------------------|
| **Herança**     | `CheckingAccount` e `SavingsAccount` herdam de `Account`                      |
| **Encapsulamento** | Atributos privados com acesso via métodos públicos                          |
| **Abstração**   | A classe `Account` é abstrata e representa a base para diferentes contas      |
| **Polimorfismo**| O método `invest()` tem comportamentos distintos para cada tipo de conta      |

---

## 📦 Estrutura de Classes

br.com.dio
│
├── Main.java # Classe principal com simulação
├── Bank.java # Gerenciador de contas
├── Customer.java # Representa o cliente
├── Account.java # Classe abstrata base para contas
│ ├── CheckingAccount.java # Conta corrente
│ └── SavingsAccount.java # Conta poupança com investimento
└── Transaction.java # Histórico das transações


---

## 🧪 Exemplo de uso

```java
Customer joao = new Customer("João Silva", "123.456.789-00");
Customer maria = new Customer("Maria Oliveira", "987.654.321-00");

Account correnteJoao = new CheckingAccount(joao);
Account poupancaMaria = new SavingsAccount(maria);

correnteJoao.deposit(new BigDecimal("1000.00"));
correnteJoao.transferPix(poupancaMaria, new BigDecimal("200.00"));
poupancaMaria.invest(new BigDecimal("150.00"));

correnteJoao.printStatement();
poupancaMaria.printStatement();
```

## 📄 Exemplo de saída
```yaml
Extrato da conta 1001 - João Silva
2025-07-25T20:41 - Conta criada para João Silva
2025-07-25T20:41 - Depósito: R$ 1000.00
2025-07-25T20:41 - PIX enviado para conta 1002: R$ 200.00
Saldo atual: R$ 800.00
---------------------------
Extrato da conta 1002 - Maria Oliveira
2025-07-25T20:41 - Conta criada para Maria Oliveira
2025-07-25T20:41 - PIX recebido da conta 1001: R$ 200.00
2025-07-25T20:41 - Investimento aplicado: R$ 150.00
Saldo atual: R$ 50.00
---------------------------
```

