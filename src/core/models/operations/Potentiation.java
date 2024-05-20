package core.models.operations;

public class Potentiation implements Operation {

    @Override
    public double perform(double a, double b) {
        return Math.pow(a, b);
    }
}
