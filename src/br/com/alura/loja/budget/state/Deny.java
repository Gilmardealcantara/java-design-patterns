package br.com.alura.loja.budget.state;

import br.com.alura.loja.budget.Budget;

public class Deny extends BudgetState {
    @Override
    public void finish(Budget budget) {
        budget.setState(new Finished());
    }
}
