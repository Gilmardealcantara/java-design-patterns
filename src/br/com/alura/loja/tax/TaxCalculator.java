package br.com.alura.loja.tax;

import br.com.alura.loja.budget.Budget;

import java.math.BigDecimal;

public class TaxCalculator {
    public BigDecimal calculate(Budget budget, Tax tax){
        return tax.calculate(budget);
    }
}
