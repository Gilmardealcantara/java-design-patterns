package br.com.alura.loja.order;

import br.com.alura.loja.budget.Budget;

import java.time.LocalDateTime;

public class Order {
    private String client;
    private LocalDateTime date;
    private Budget budget;

    public Order(String client, LocalDateTime date, Budget budget) {
        this.client = client;
        this.date = date;
        this.budget = budget;
    }

    public String getClient() {
        return client;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Budget getBudget() {
        return budget;
    }
}
