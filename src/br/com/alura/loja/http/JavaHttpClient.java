package br.com.alura.loja.http;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter{

    @Override
    public void post(String url, Map<String, Object> data) {
        try {
            URL urlApi = new URL(url);
            urlApi.openConnection().connect();
        } catch (IOException e) {
            throw new RuntimeException("Error to send http request", e);
        }

    }
}
