package br.com.alura.loja;

import br.com.alura.loja.budget.Budget;
import br.com.alura.loja.discounts.DiscountsCalculator;
import br.com.alura.loja.tax.ICMS;
import br.com.alura.loja.tax.ISS;
import br.com.alura.loja.tax.TaxCalculator;

import java.math.BigDecimal;

public class DiscountsTests {
    public static void main(String[] args) {

        Budget budget = new Budget(new BigDecimal("10.0"), 1);
        DiscountsCalculator taxCalculator = new DiscountsCalculator();
        var value = taxCalculator.calculate(budget);
        System.out.println(value);

        Budget budget2 = new Budget(new BigDecimal("1000.0"), 1);
        value = taxCalculator.calculate(budget2);
        System.out.println(value);

        Budget budget3 = new Budget(new BigDecimal("10.0"), 7);
        value = taxCalculator.calculate(budget3);
        System.out.println(value);
    }
}
