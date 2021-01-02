package br.com.alura.loja.discounts;

import br.com.alura.loja.budget.Budget;

import java.math.BigDecimal;

/*
Use Chain of Responsibility for calculate Discounts.
Não é possível usar strategy puro aqui pois não é claro qual o desconto que deve ser aplicado.
é necessário fazer uma validação e passar para o próximo, por isso o conceito de corrente de responsabilidades
caso a estratégia corrente aplique o desconto a corrente é quebrada

Apply Template Method para transformar o método caclular que serve como um template para o calculo do desconto
e chamada do próximo e implementar o calculo e a condição para a execução dele na classe filha
*/

public class DiscountsCalculator {
    public BigDecimal calculate(Budget budget){
        Discount discount = new ValueGreaterThanFiveHundredDiscount(
                new MoreFiveItemsDiscount(
                        new NoDiscount()
                )
        );
        return discount.calculate(budget);
    }
}
