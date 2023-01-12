package pl.javastart.task;

public class Wydatki {
    private String nazwa;
    private double wartosc;

    public Wydatki(String nazwa, double wartosc) {
        this.nazwa = nazwa;
        this.wartosc = wartosc;
    }

    public double getWartosc() {
        return wartosc;
    }

    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }
}
