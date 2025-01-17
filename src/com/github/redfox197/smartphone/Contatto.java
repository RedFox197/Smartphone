package com.github.redfox197.smartphone;

public class Contatto {
    private final String nome;
    private final String numero;

    public Contatto(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }
}
