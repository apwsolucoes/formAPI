package com.example.formAPI.domain.dto;

import java.util.List;

public class RetornoSapDto {

    private String response;
    private List<String> lista;

    public String getResponse() {
        return response;
    }

    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    
}