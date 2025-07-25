package br.com.dio.model;

import br.com.dio.repository.Customer;
import org.apache.tools.ant.taskdefs.SQLExec;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    private static int sequence = 1001;
    private final int number;
    private final Customer customer;
    protected BigDecimal balance = BigDecimal.ZERO;
    private final List<SQLExec.Transaction> transactions = new ArrayList<>();

    public Account(Customer customer) {
        this.number = sequence++;
        this.customer = customer;
        log("Conta criada para " + customer.getName());
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
        log("Depósito: R$ " + amount);
    }

    public void withdraw(BigDecimal amount) {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
            log("Saque: R$ " + amount);
        } else {
            log("Tentativa de saque sem saldo: R$ " + amount);
        }
    }

    public void transferPix(Account target, BigDecimal amount) {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
            target.balance = target.balance.add(amount);
            log("PIX enviado para conta " + target.number + ": R$ " + amount);
            target.log("PIX recebido da conta " + number + ": R$ " + amount);
        } else {
            log("PIX falhou. Saldo insuficiente: R$ " + amount);
        }
    }

    private void log(String s) {
    }

    public void printStatement() {
    }

    public void invest(BigDecimal amount) {
        // Implementação padrão ou abstrata
    }

    public int getNumber() {
        return 0;
    }

}
