package br.com.alura.loja;

import br.com.alura.loja.budget.Budget;
import br.com.alura.loja.tax.TaxCalculator;
import br.com.alura.loja.tax.TaxType;

import java.math.BigDecimal;

public class TaxTests {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("10.0"));
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.calculator(budget, TaxType.ISS);
        taxCalculator.calculator(budget, TaxType.ICMS);
    }
}
