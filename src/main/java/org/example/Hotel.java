package org.example;
import java.util.ArrayList;
import java.util.List;
public class Hotel {
    private List<Pokoj> pokoje = new ArrayList<>();

    public void dodajPokoj(Pokoj pokoj) {
        pokoje.add(pokoj);
    }

    public void wyswietlDostepnePokoje() {
        System.out.println("Dostępne pokoje w hotelu:");
        for (Pokoj pokoj : pokoje) {
            if (pokoj.isDostepny()) {
                System.out.println("Numer komnaty: " + pokoj.getNumerPokoju());
                System.out.println("Typ łóżka: " + pokoj.getTypLozka());
                System.out.println("Cena za noc: " + pokoj.getCenaZaNoc());
                System.out.println();
            }
        }
    }
    public List<Pokoj> getAvailablePokoje() { //metod dla dalnejszej rezervacyi w main
        List<Pokoj> dostepnePokoje = new ArrayList<>();
        for (Pokoj pokoj : pokoje) {
            if (pokoj.isDostepny()) {
                dostepnePokoje.add(pokoj);
            }
        }
        return dostepnePokoje;
    }
    public boolean zarezerwujPokoj(Pokoj pokoj, Rezerwacja rezerwacja) {
        if (pokoj.isDostepny()) {
            pokoj.zarezerwuj();
            System.out.println("Rezerwacja zrealizowana.");
            System.out.println("Data przyjazdu: " + rezerwacja.getDataPrzyjazdu());
            System.out.println("Data odjazdu: " + rezerwacja.getDataOdjazdu());
            System.out.println("Ilość gości: " + rezerwacja.getIloscGosci());
            return true;
        } else {
            System.out.println("Przepraszamy, ten pokój jest już zarezerwowany.");
            return false;
        }
    }

}
