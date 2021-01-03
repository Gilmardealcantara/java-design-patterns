package br.com.alura.loja.actions;

import br.com.alura.loja.order.Order;
import br.com.alura.loja.order.action.ActionsAfterOrderGenerate;

public class SendOrderEmail implements ActionsAfterOrderGenerate {
    @Override
    public void executeAction(Order order){
        System.out.println("Enviando email com dados do pedido!");
    }
}
