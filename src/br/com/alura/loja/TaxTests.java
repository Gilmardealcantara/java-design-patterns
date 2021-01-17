package br.com.alura.loja;

import br.com.alura.loja.budget.Budget;
import br.com.alura.loja.budget.BudgetItem;
import br.com.alura.loja.tax.ICMS;
import br.com.alura.loja.tax.ISS;
import br.com.alura.loja.tax.TaxCalculator;

import java.math.BigDecimal;

public class TaxTests {
    public static void main(String[] args) {
        Budget budget = new Budget();
        budget.addItem(new BudgetItem(new BigDecimal("10.0")));
        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println(taxCalculator.calculate(budget, new ISS(null)));
        System.out.println(taxCalculator.calculate(budget, new ICMS(null)));
        System.out.println(taxCalculator.calculate(budget, new ICMS(new ISS(null))));

    }
}
