package core.models.operations;

public class Division implements Operation {

    @Override
    public double perform(double a, double b) {
        return a / b;
    }
}
