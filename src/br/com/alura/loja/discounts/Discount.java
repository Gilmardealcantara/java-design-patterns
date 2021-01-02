package br.com.alura.loja.discounts;

import br.com.alura.loja.budget.Budget;

import java.math.BigDecimal;

public abstract class Discount {
    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    public BigDecimal calculate(Budget budget){
        if(shouldApplyCalc(budget))
            return  doCalc(budget);
        return next.calculate(budget);
    }

    protected abstract BigDecimal doCalc(Budget budget);
    protected abstract boolean shouldApplyCalc(Budget budget);
}
