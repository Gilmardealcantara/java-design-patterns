package br.com.alura.loja.budget;

import java.math.BigDecimal;

public class BudgetItem implements CanBeBudgeted {
    private BigDecimal value;

    public BigDecimal getValue() {
        return value;
    }

    public BudgetItem(BigDecimal value) {
        this.value = value;
    }
}
