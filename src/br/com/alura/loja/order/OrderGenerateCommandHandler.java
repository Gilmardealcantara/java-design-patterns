package br.com.alura.loja.order;

import br.com.alura.loja.actions.SaveOrderInDatabase;
import br.com.alura.loja.actions.SendOrderEmail;
import br.com.alura.loja.budget.Budget;
import br.com.alura.loja.order.action.ActionsAfterOrderGenerate;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class OrderGenerateCommandHandler {
    private List<ActionsAfterOrderGenerate> actions;

    public OrderGenerateCommandHandler(List<ActionsAfterOrderGenerate> actions) {
        this.actions = actions;
    }

    public void execute(OrderGenerateCommand command){
        Budget budget = new Budget(command.getBudgetValue(), command.getQntItems());
        Order order = new Order(command.getClient(), LocalDateTime.now(), budget);

        actions.forEach(a -> a.executeAction(order));
    }
}
