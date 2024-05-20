package core.models;

import java.util.ArrayList;

public class History {

    private static History instance;
    private ArrayList<PrintableOperation> operations;

    private History() {
        this.operations = new ArrayList<>();
    }

    public static History getInstance() {
        if (instance == null) {
            instance = new History();
        }
        return instance;
    }

    public void addOperation(PrintableOperation operation) {
        this.operations.add(operation);
    }

    public ArrayList<PrintableOperation> getOperations() {
        return operations;
    }

}
