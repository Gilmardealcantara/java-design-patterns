package br.com.alura.loja.tax;

import br.com.alura.loja.budget.Budget;

import java.math.BigDecimal;

public class ISS implements Tax {
    public BigDecimal calculate(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.6"));
    }
}
