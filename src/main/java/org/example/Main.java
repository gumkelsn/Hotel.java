package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        Pokoj pokoj1 = new Pokoj(101, "Suit", 150.0);
        Pokoj pokoj2 = new Pokoj(102, "Double", 120.0);
        Pokoj pokoj3 = new Pokoj(103, "Single", 100.0);
        hotel.dodajPokoj(pokoj1);
        hotel.dodajPokoj(pokoj2);
        hotel.dodajPokoj(pokoj3);

        hotel.wyswietlDostepnePokoje();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź numer komnaty, którą chcesz zarezerwować: ");
        int numerKomnatyDoZarezerwowania = scanner.nextInt();

        for (Pokoj pokoj : hotel.getAvailablePokoje()) {
            if (pokoj.getNumerPokoju() == numerKomnatyDoZarezerwowania) {
                System.out.print("Wprowadź datę przyjazdu (RRRR-MM-DD): ");
                String dataPrzyjazdu = scanner.next();
                System.out.print("Wprowadź datę odjazdu (RRRR-MM-DD): ");
                String dataOdjazdu = scanner.next();
                System.out.print("Wprowadź ilość gości: ");
                int iloscGosci = scanner.nextInt();

                Rezerwacja rezerwacja1 = new Rezerwacja(dataPrzyjazdu, dataOdjazdu, iloscGosci);
                if (hotel.zarezerwujPokoj(pokoj, rezerwacja1)) {
                    System.out.println("Rezerwacja zrealizowana.");
                    System.out.println();
                } else {
                    System.out.println("Nie można zarezerwować tego pokoju.");
                }
            }
        }

        hotel.wyswietlDostepnePokoje();
    }
}
