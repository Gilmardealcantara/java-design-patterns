package br.com.alura.loja.tax;

import br.com.alura.loja.budget.Budget;

import java.math.BigDecimal;

public class TaxCalculator {
    public BigDecimal calculator(Budget budget, TaxType taxType){
        return switch (taxType){
            case ICMS -> budget.getValue().multiply(new BigDecimal("0.1"));
            case ISS -> budget.getValue().multiply(new BigDecimal("0.06"));
            default -> new BigDecimal("0.0");
        };
    }
}
