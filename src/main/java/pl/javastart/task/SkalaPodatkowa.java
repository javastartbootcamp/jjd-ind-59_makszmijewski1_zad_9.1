package pl.javastart.task;

public class SkalaPodatkowa extends FormaOpodatkowania{

    public double wyliczPodatek(double przychody) {
        if (przychody < 10000) {
            return 0;
        } else if (przychody < 100000) {
            return (przychody - 10000) * 0.18;
        } else {
            return (przychody - 100000) * 0.32
                    + (przychody - 10000) * 0.18;
        }
    }
}
