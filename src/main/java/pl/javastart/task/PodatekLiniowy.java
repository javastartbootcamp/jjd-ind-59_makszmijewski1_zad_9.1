package pl.javastart.task;

public class PodatekLiniowy extends FormaOpodatkowania{

    public double wyliczPodatek(double przychody, double wydatki) {
        double zysk = przychody - wydatki;
        return zysk * 0.19;
    }
}
