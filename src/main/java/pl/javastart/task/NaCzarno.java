package pl.javastart.task;

public class NaCzarno extends FormaOpodatkowania {

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        return 0;
    }

    @Override
    String getName() {
        return "Na czarno";
    }
}
