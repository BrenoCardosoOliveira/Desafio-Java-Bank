package br.com.dio.repository;

public class Customer {
    private final String name;
    private final String document;

    public Customer(String name, String document) {
        this.name = name;
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }
}

