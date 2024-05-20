package core.models;

public class DoubleRounder {

    public static double round(double valor) {
        return Math.round(valor * 1000.0) / 1000.0;
    }
}
