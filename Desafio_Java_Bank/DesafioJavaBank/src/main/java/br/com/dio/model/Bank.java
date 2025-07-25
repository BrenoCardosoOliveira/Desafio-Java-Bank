package br.com.dio.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Bank {
    private final List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Optional<Account> findAccountByNumber(int number) {
        return accounts.stream().filter(a -> a.getNumber() == number).findFirst();
    }
}
