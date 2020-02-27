package com.example.formAPI.domain;

import java.util.List;

public class FormSAP {

    private String nome;

    private List<String> listaTexto;

    public String getNome() {
        return nome;
    }

    public List<String> getListaTexto() {
        return listaTexto;
    }

    public void setListaTexto(List<String> listaTexto) {
        this.listaTexto = listaTexto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}