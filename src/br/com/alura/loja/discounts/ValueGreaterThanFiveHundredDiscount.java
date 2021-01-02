package br.com.alura.loja.discounts;

import br.com.alura.loja.budget.Budget;

import java.math.BigDecimal;

public class ValueGreaterThanFiveHundredDiscount extends  Discount {

    public ValueGreaterThanFiveHundredDiscount(Discount next) {
        super(next);
    }

    @Override
    protected BigDecimal doCalc(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    protected boolean shouldApplyCalc(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("500.0")) > 0;
    }
}
