package com.github.redfox197.smartphone;

public class Chiamata {
    private String numero;
    private int durata;

    public Chiamata(String numero, int durata) {
        this.numero = numero;
        this.durata = durata;
    }

    public int getDurata() {
        return durata;
    }

    public String getNumero() {
        return numero;
    }
}
