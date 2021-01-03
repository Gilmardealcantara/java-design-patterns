package br.com.alura.loja.actions;

import br.com.alura.loja.order.Order;
import br.com.alura.loja.order.action.ActionsAfterOrderGenerate;

public class SaveOrderInDatabase implements ActionsAfterOrderGenerate {
    @Override
    public void executeAction(Order order){
        System.out.println("Salvando pedido no banco de dados !");
    }
}
