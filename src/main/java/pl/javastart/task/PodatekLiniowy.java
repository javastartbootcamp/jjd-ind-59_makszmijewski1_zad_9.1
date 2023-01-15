package pl.javastart.task;

public class PodatekLiniowy extends FormaOpodatkowania {
    public static final double OPROCENTOWANIE_PODATEK_LINIOWY = 0.19;

    public double wyliczPodatek(double przychody, double wydatki) {
        double zysk = przychody - wydatki;
        return zysk * OPROCENTOWANIE_PODATEK_LINIOWY;
    }

    @Override
    String getName() {
        return "Podatek liniowy";
    }
}
