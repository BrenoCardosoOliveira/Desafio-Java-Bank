package br.com.dio;
import br.com.dio.model.*;
import br.com.dio.repository.Customer;
import br.com.dio.repository.SavingsAccount;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Customer joao = new Customer("João Silva", "123.456.789-00");
        Customer maria = new Customer("Maria Oliveira", "987.654.321-00");

        Account correnteJoao = new CheckigAccount(joao);
        Account poupancaMaria = new SavingsAccount(maria);

        bank.addAccount(correnteJoao);
        bank.addAccount(poupancaMaria);

        correnteJoao.deposit(new BigDecimal("1000.00"));
        correnteJoao.transferPix(poupancaMaria, new BigDecimal("200.00"));
        ((SavingsAccount) poupancaMaria).invest(new BigDecimal("150.00"));

        correnteJoao.printStatement();
        poupancaMaria.printStatement();
    }
}