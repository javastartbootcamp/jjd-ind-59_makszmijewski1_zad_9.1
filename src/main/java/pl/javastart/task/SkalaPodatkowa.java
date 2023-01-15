package pl.javastart.task;

public class SkalaPodatkowa extends FormaOpodatkowania {
    public static final double KWOTA_WOLNA_OD_PODATKU = 10000;
    public static final double KWOTA_PROG_PODATKOWY = 100000;
    public static final double PROCENT_PIERWSZY_PROG_PODATKOWY = 0.18;
    public static final double PROCENT_DRUGI_PROG_PODATKOWY = 0.32;

    public double wyliczPodatek(double przychody, double wydatki) {
        double zysk = przychody - wydatki;
        if (zysk < KWOTA_WOLNA_OD_PODATKU) {
            return 0;
        } else if (zysk < KWOTA_PROG_PODATKOWY) {
            return (zysk - KWOTA_WOLNA_OD_PODATKU) * PROCENT_PIERWSZY_PROG_PODATKOWY;
        } else {
            return (zysk - KWOTA_PROG_PODATKOWY) * PROCENT_DRUGI_PROG_PODATKOWY
                    + (zysk - KWOTA_WOLNA_OD_PODATKU) * PROCENT_PIERWSZY_PROG_PODATKOWY;
        }
    }

    @Override
    String getName() {
        return "Skala podatkowa";
    }
}
