package br.com.alura.loja.budget.state;

import br.com.alura.loja.budget.Budget;

import java.math.BigDecimal;

public class InAnalysis extends BudgetState {
    @Override
    public BigDecimal calculateDiscountValue(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void approve(Budget budget) {
        budget.setState(new Approved());
    }

    @Override
    public void deny(Budget budget) {
        budget.setState(new Deny());
    }
}
