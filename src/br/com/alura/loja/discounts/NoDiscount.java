package br.com.alura.loja.discounts;

import br.com.alura.loja.budget.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount {
    public NoDiscount() {
        super(null);
    }

    @Override
    protected BigDecimal doCalc(Budget budget) {
        return BigDecimal.ZERO;
    }

    @Override
    protected boolean shouldApplyCalc(Budget budget) {
        return true;
    }
}
