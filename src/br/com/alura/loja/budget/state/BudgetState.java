package br.com.alura.loja.budget.state;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.budget.Budget;

import java.math.BigDecimal;

public abstract class BudgetState {
    public BigDecimal calculateDiscountValue(Budget budget){
        return BigDecimal.ZERO;
    }
    public void approve(Budget budget){
        throw new DomainException("Budget can't be approved!");
    }
    public void deny(Budget budget){
        throw new DomainException("Budget can't be denied!");
    }
    public void finish(Budget budget){
        throw new DomainException("Budget can't be finished!");
    }
}
