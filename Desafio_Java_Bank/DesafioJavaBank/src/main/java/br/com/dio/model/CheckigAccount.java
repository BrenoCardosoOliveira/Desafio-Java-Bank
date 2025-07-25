package br.com.dio.model;

import br.com.dio.repository.Customer;

import java.math.BigDecimal;

import static org.gradle.internal.impldep.org.apache.commons.compress.harmony.pack200.PackingUtils.log;

public class CheckigAccount extends Account {
    public CheckigAccount(Customer customer) {
        super(customer);
    }

    @Override
    public void invest(BigDecimal amount) {
        log("Conta corrente não permite investimento. Valor: R$ " + amount);
    }
}
