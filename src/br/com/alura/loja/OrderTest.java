package br.com.alura.loja;

import br.com.alura.loja.budget.Budget;
import br.com.alura.loja.order.Order;
import br.com.alura.loja.order.OrderGenerateCommand;
import br.com.alura.loja.order.OrderGenerateCommandHandler;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderTest {
    public static void main(String[] args) {
        String client = args[0];
        BigDecimal budgetValue = new BigDecimal(args[1]);
        int qntItems = Integer.parseInt(args[2]);

        OrderGenerateCommand cmd = new OrderGenerateCommand(client, budgetValue, qntItems);
        OrderGenerateCommandHandler handler = new OrderGenerateCommandHandler(/*dependencies*/);
        handler.execute(cmd);
    }
}
