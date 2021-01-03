package br.com.alura.loja.order;

import br.com.alura.loja.budget.Budget;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderGenerateCommandHandler {
    public OrderGenerateCommandHandler(/*repository, services, etc*/) {
    }

    public void execute(OrderGenerateCommand command){
        Budget budget = new Budget(command.getBudgetValue(), command.getQntItems());
        Order order = new Order(command.getClient(), LocalDateTime.now(), budget);

        System.out.printf("Save Order");
        System.out.printf("email for order received");
    }
}
