package br.com.alura.loja.tax;

import br.com.alura.loja.budget.Budget;

import java.math.BigDecimal;

/* Use Strategy for calculate Tax. A estratégia é clara e é passada diretamente para a função*/
public class TaxCalculator {
    public BigDecimal calculate(Budget budget, Tax tax){
        return tax.calculate(budget);
    }
}
