package br.com.alura.loja.tax;

import br.com.alura.loja.budget.Budget;

import java.math.BigDecimal;

public class ICMS extends Tax {
    public ICMS(Tax other) {
        super(other);
    }

    public BigDecimal makeCalc(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }
}
