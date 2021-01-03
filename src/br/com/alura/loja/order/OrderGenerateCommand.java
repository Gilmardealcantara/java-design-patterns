package br.com.alura.loja.order;

import java.math.BigDecimal;

public class OrderGenerateCommand {
    private String client;
    private BigDecimal budgetValue;
    private int qntItems;

    public OrderGenerateCommand(String client, BigDecimal budgetValue, int qntItems) {
        this.client = client;
        this.budgetValue = budgetValue;
        this.qntItems = qntItems;
    }

    public String getClient() {
        return client;
    }

    public BigDecimal getBudgetValue() {
        return budgetValue;
    }

    public int getQntItems() {
        return qntItems;
    }
}
