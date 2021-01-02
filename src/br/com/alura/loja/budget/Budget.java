package br.com.alura.loja.budget;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal value;
    private int qntItems;

    public Budget(BigDecimal value, int qntItems) {
        this.value = value;
        this.qntItems = qntItems;
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getQntItems() {
        return qntItems;
    }
}
