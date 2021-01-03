package br.com.alura.loja.budget.state;

import br.com.alura.loja.budget.Budget;

import java.math.BigDecimal;

public class Approved extends BudgetState {
    @Override
    public BigDecimal calculateDiscountValue(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finish(Budget budget) {
        budget.setState(new Finished());
    }
}
