package br.com.alura.loja.tax;

import br.com.alura.loja.budget.Budget;

import java.math.BigDecimal;

public class ICMS implements Tax {
    public BigDecimal calculate(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }
}
