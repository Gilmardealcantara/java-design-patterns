package br.com.alura.loja.tax;

import br.com.alura.loja.budget.Budget;

import java.math.BigDecimal;

public abstract class Tax {
    private Tax other;

    public Tax(Tax other) {
        this.other = other;
    }

    protected abstract BigDecimal makeCalc(Budget budget);

    public BigDecimal calculate(Budget budget){
        BigDecimal taxValue = makeCalc(budget);
        BigDecimal taxValueOther = BigDecimal.ZERO;
        if(other != null)
            taxValueOther = other.makeCalc(budget);
        return taxValue.add(taxValueOther);
    }
}
