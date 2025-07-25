package br.com.dio.repository;

import java.time.LocalDateTime;

class Transaction {
    private final LocalDateTime timestamp;
    private final String description;

    public Transaction(LocalDateTime timestamp, String description) {
        this.timestamp = timestamp;
        this.description = description;
    }

    @Override
    public String toString() {
        return timestamp + " - " + description;
    }
}

