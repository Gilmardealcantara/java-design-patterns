package br.com.alura.loja.budget;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.http.HttpAdapter;

import java.util.Map;

public class BudgetRegister {
    private HttpAdapter http;

    public BudgetRegister(HttpAdapter http) {
        this.http = http;
    }

    public void register(Budget budget){
        if(!budget.isFinished()){
            throw new DomainException("Budget not finished");
        }
        String url = "http://api.external/budget";
        Map<String, Object> data = Map.of(
                "valor", budget.getValue(),
                "qntItems", budget.getQntItems()
        );
        http.post(url, data);
    }
}
