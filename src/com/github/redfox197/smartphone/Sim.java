package com.github.redfox197.smartphone;

public class Sim {
    private String numero;
    private String operatore;
    private float credito;
    private float costoPerMinuto;
    private float costoSMS;

    public Sim(String numero, String operatore, float credito) {
        this.numero = numero;
        this.operatore = operatore;
        this.credito = credito;

        costoPerMinuto = 0.3f;
        costoSMS = 0.15f;
    }

    public float verificaCredito() {
        return credito;
    }

    public void ricarica(float credito) {
        if (credito <= 0) throw new IllegalArgumentException("Credito " + credito + " non valido");
        credito += credito;
    }

    public boolean scalaCredito(float costo) {
        if (costo < 0) throw new IllegalArgumentException("Costo " + costo + " non valido");
        if (credito >= costo) {
            credito -= costo;
            return true;
        }

        return false;
    }
}
