package br.com.alura.loja.budget;

import java.math.BigDecimal;

public class BudgetProxy extends Budget {
    private BigDecimal value;
    private Budget budget;

    public BudgetProxy(Budget budget) {
        this.budget = budget;
    }

    @Override
    public BigDecimal getValue() {
        if(value == null)
            value = budget.getValue();

        return value;
    }
}
