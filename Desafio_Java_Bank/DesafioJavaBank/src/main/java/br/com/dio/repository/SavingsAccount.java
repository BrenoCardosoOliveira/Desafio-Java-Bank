package br.com.dio.repository;

import br.com.dio.model.Account;

import java.math.BigDecimal;

import static org.gradle.internal.impldep.org.apache.commons.compress.harmony.pack200.PackingUtils.log;

public class SavingsAccount extends Account {
    public SavingsAccount(Customer customer) {
        super(customer);
    }

    @Override
    public void invest(BigDecimal amount) {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
            log("Investimento aplicado: R$ " + amount);
        } else {
            log("Tentativa de investimento sem saldo: R$ " + amount);
        }
    }
}