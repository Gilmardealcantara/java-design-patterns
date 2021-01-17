package br.com.alura.loja.budget;

import br.com.alura.loja.budget.state.BudgetState;
import br.com.alura.loja.budget.state.Finished;
import br.com.alura.loja.budget.state.InAnalysis;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Budget implements CanBeBudgeted{
    private BigDecimal value;
    private BudgetState state;
    private List<CanBeBudgeted> items;

    public Budget() {
        this.value = BigDecimal.ZERO;
        this.items = new ArrayList<>();
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
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return value;
    }

    public int getQntItems() {
        return this.items.size();
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

    public void addItem(CanBeBudgeted item){
        this.items.add(item);
        this.value = this.value.add(item.getValue());
    }
}
