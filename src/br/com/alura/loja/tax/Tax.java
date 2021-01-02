package br.com.alura.loja.tax;

import br.com.alura.loja.budget.Budget;

import java.math.BigDecimal;

public interface Tax {
    BigDecimal calculate(Budget budget);
}
