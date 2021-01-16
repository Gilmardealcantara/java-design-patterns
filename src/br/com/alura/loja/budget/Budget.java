package br.com.alura.loja.budget;

import br.com.alura.loja.budget.state.BudgetState;
import br.com.alura.loja.budget.state.Finished;
import br.com.alura.loja.budget.state.InAnalysis;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal value;
    private int qntItems;
    private BudgetState state;

    public Budget(BigDecimal value, int qntItems) {
        this.value = value;
        this.qntItems = qntItems;
        this.state = new InAnalysis();
    }

    public void applyExtraDiscount(){
        BigDecimal value = this.state.calculateDiscountValue(this);
        this.value = this.value.subtract(value);
    }

    public void approve() {
        this.state.approve(this);

    }

    public void deny() {
        this.state.deny(this);
    }

    public void finish() {
        this.state.finish(this);
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getQntItems() {
        return qntItems;
    }

    public BudgetState getState() {
        return state;
    }

    public void setState(BudgetState state) {
        this.state = state;
    }

    public boolean isFinished() {
        return state instanceof Finished;
    }
}
