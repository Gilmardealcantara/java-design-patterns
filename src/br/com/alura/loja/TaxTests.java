package br.com.alura.loja;

import br.com.alura.loja.budget.Budget;
import br.com.alura.loja.tax.ICMS;
import br.com.alura.loja.tax.ISS;
import br.com.alura.loja.tax.TaxCalculator;

import java.math.BigDecimal;

public class TaxTests {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("10.0"));
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.calculate(budget, new ISS());
        taxCalculator.calculate(budget, new ICMS());
    }
}
