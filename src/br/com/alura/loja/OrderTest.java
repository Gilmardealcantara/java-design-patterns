package br.com.alura.loja;

import br.com.alura.loja.actions.SaveOrderInDatabase;
import br.com.alura.loja.actions.SendOrderEmail;
import br.com.alura.loja.budget.Budget;
import br.com.alura.loja.order.Order;
import br.com.alura.loja.order.OrderGenerateCommand;
import br.com.alura.loja.order.OrderGenerateCommandHandler;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class OrderTest {
    public static void main(String[] args) {
        String client = "Gilmar";
        BigDecimal budgetValue = new BigDecimal("300");
        int qntItems = 3;

        OrderGenerateCommand cmd = new OrderGenerateCommand(client, budgetValue, qntItems);
        OrderGenerateCommandHandler handler = new OrderGenerateCommandHandler(Arrays.asList(
                new SaveOrderInDatabase(),
                new SendOrderEmail()));
        handler.execute(cmd);
    }
}
