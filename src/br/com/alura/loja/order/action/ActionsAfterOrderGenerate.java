package br.com.alura.loja.order.action;

import br.com.alura.loja.order.Order;

public interface ActionsAfterOrderGenerate {
    void executeAction(Order order);
}
