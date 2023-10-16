package org.example;

class Pokoj {
    private int numerpokoju;
    private String typlozka;
    private double cenaZaNoc;
    private boolean dostepnosc;

    public Pokoj(int numerpokoju, String typlozka, double cenaZaNoc) {
        this.numerpokoju = numerpokoju;
        this.typlozka = typlozka;
        this.cenaZaNoc = cenaZaNoc;
        this.dostepnosc = true;
    }

    public int getNumerPokoju() {
        return numerpokoju;
    }

    public String getTypLozka() {
        return typlozka;
    }

    public double getCenaZaNoc() {
        return cenaZaNoc;
    }

    public boolean isDostepny() {
        return dostepnosc;
    }

    public void zarezerwuj() {
        dostepnosc = false;
    }
}