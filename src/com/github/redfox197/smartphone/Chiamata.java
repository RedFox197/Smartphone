package com.github.redfox197.smartphone;

public class Chiamata {
    private final String numero;
    private final int durata;

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
