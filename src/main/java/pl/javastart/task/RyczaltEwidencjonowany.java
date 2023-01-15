package pl.javastart.task;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {
    public static final double OPROCENTOWANIE_RYCZALT = 0.15;

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        return przychody * OPROCENTOWANIE_RYCZALT;
    }

    @Override
    String getName() {
        return "Ryczałt ewidencjonowany";
    }
}
