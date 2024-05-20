package core.models.operations;

public class Multiplication implements Operation {

    @Override
    public double perform(double a, double b) {
        return a * b;
    }
}
