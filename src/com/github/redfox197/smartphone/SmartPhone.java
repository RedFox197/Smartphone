package com.github.redfox197.smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartPhone {
    private final String modello;
    private final String marca;
    private final List<Contatto> contatti;
    private final List<Chiamata> registroChiamate;
    private Sim sim;

    public SmartPhone(String modello, String marca, Sim sim) {
        this.modello = modello;
        this.marca = marca;
        this.sim = sim;

        contatti = new ArrayList<>();
        registroChiamate = new ArrayList<>();
    }

    public void aggiungiContatto(String nome, String numero) {
        contatti.add(new Contatto(nome, numero));
    }

    public void effettuaChiamata(String numero, int durata) {
        float costo = sim.getCostoPerMinuto() * (durata / 60f);
        if (sim.scalaCredito(costo)) {
            registroChiamate.add(new Chiamata(numero, durata));
        }
    }

    public void inviaSMS(String numero) {
        sim.scalaCredito(sim.getCostoSMS());
    }

    public void cambiaSim(Sim sim) {
        this.sim = sim;
    }

    private Contatto retrieveContatto(String numero) {
        for (Contatto contatto : contatti) {
            if (contatto.getNumero().equalsIgnoreCase(numero)) return contatto;
        }

        return null;
    }

    public List<Contatto> getContatti() {
        return new ArrayList<>(contatti);
    }

    public List<Chiamata> getRegistroChiamate() {
        return new ArrayList<>(registroChiamate);
    }


}
