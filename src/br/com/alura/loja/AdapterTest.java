package br.com.alura.loja;

import br.com.alura.loja.budget.Budget;
import br.com.alura.loja.budget.BudgetRegister;
import br.com.alura.loja.http.JavaHttpClient;

import java.math.BigDecimal;

public class AdapterTest {
    public static void main(String[] args) {
        Budget budget = new Budget(BigDecimal.TEN, 1);
        budget.approve();
        budget.finish();
        BudgetRegister budgetRegister = new BudgetRegister(new JavaHttpClient());
        budgetRegister.register(budget);
    }
}
