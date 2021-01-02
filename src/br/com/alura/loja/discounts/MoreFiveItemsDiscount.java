package br.com.alura.loja.discounts;

import br.com.alura.loja.budget.Budget;

import java.math.BigDecimal;

public class MoreFiveItemsDiscount extends  Discount {

    public MoreFiveItemsDiscount(Discount next) {
        super(next);
    }

    @Override
    protected BigDecimal doCalc(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    protected boolean shouldApplyCalc(Budget budget) {
        return budget.getQntItems() > 5;
    }
}
