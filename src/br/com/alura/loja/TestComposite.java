package br.com.alura.loja;

import br.com.alura.loja.budget.Budget;
import br.com.alura.loja.budget.BudgetItem;

import java.math.BigDecimal;

public class TestComposite {
    public static void main(String[] args) {
        Budget old = new Budget();
        old.addItem(new BudgetItem(new BigDecimal("200")));
        old.deny();

        Budget nnew = new Budget();
        nnew.addItem(new BudgetItem(new BigDecimal("500")));
        nnew.addItem(old);

        System.out.println(nnew.getValue());
    }
}
