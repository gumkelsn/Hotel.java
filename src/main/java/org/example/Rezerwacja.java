package org.example;

public class Rezerwacja {
    private String dataPrzyjazdu;
    private String dataOdjazdu;
    private int iloscGosci;

    public Rezerwacja(String dataPrzyjazdu, String dataOdjazdu, int iloscGosci) {
        this.dataPrzyjazdu = dataPrzyjazdu;
        this.dataOdjazdu = dataOdjazdu;
        this.iloscGosci = iloscGosci;
    }

    public String getDataPrzyjazdu() {
        return dataPrzyjazdu;
    }

    public String getDataOdjazdu() {
        return dataOdjazdu;
    }

    public int getIloscGosci() {
        return iloscGosci;
    }
}
