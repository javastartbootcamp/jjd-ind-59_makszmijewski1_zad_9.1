package pl.javastart.task;

import java.util.ArrayList;
import java.util.List;

public class Firma {

    private String nazwa;
    private FormaOpodatkowania formaOpodatkowania;
    private List<Przychody> przychody = new ArrayList<>();
    private List<Wydatki> wydatki = new ArrayList<>();

    public Firma(String nazwa, FormaOpodatkowania formaOpodatkowania) {
        this.nazwa = nazwa;
        this.formaOpodatkowania = formaOpodatkowania;
    }

    public void wyswietlPodsumowanie() {
        double sumaPrzychodow = zsumujPrzychody();
        double sumaWydatkow = zsumujWydatki();
        System.out.printf("======= Firma: %s ===========\n", nazwa);
        System.out.printf("Forma opodatkowania: %s\n", formaOpodatkowania.getClass().getSimpleName());
        System.out.printf("Suma przychodów: %.2f zł\n", sumaPrzychodow);
        System.out.printf("Suma wydatków: %.2f zł\n", sumaWydatkow);
        System.out.printf("Podatek do zapłacenia: %.2f zł",
                 formaOpodatkowania.wyliczPodatek(sumaPrzychodow, sumaWydatkow));
        System.out.print("\n\n");
    }

    private double zsumujWydatki() {
        double sumaWydatkow = 0;
        for (Wydatki wydatek : wydatki) {
            sumaWydatkow = sumaWydatkow + wydatek.getWartosc();
        }
        return sumaWydatkow;
    }

    private double zsumujPrzychody() {
        double sumaPrzychodow = 0;
        for (Przychody przychod : przychody) {
            sumaPrzychodow = sumaPrzychodow + przychod.getWartosc();
        }
        return sumaPrzychodow;
    }

    public void dodajPrzychod(String nazwa, double wartosc) {
        Przychody przychod = new Przychody(nazwa, wartosc);
        przychody.add(przychod);
    }

    public void dodajWydatek(String nazwa, double wartosc) {
        Wydatki wydatek = new Wydatki(nazwa, wartosc);
        wydatki.add(wydatek);
    }
}
