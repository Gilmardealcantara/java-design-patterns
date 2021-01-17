package br.com.alura.loja;

import br.com.alura.loja.budget.Budget;
import br.com.alura.loja.budget.BudgetItem;
import br.com.alura.loja.budget.BudgetProxy;

import java.math.BigDecimal;

public class TestProxy {
    public static void main(String[] args) {
        Budget budget = new Budget();
        budget.addItem(new BudgetItem(new BigDecimal("111")));
        System.out.println(budget.getValue());
        System.out.println(budget.getValue());

        BudgetProxy proxy = new BudgetProxy(budget);
        System.out.println(proxy.getValue());
        System.out.println(proxy.getValue());
        System.out.println(proxy.getValue());
        System.out.println(proxy.getValue());

    }
}
