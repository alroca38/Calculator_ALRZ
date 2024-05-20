package core.controllers;

import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.DecimalsChecker;
import core.models.DoubleRounder;
import core.models.History;
import core.models.PrintableOperation;
import core.models.operations.Operation;
import core.models.operations.Substraction;

public class SubstractionController {

    public static Response performSubstraction(String number1, String number2, String[] result) {
        try {
            if ("".equals(number1) || "".equals(number2)) {
                return new Response("There are empty fields", Status.BAD_REQUEST);
            }
            double number1Double, number2Double;
            try {
                number1Double = Double.parseDouble(number1);
                number2Double = Double.parseDouble(number2);
            } catch (NumberFormatException e) {
                return new Response("Operands must be numeric", Status.BAD_REQUEST);
            }
            if (!(DecimalsChecker.verifyDecimals(number1) && DecimalsChecker.verifyDecimals(number2))) {
                return new Response("Operands must have a maximum of 3 decimal places", Status.BAD_REQUEST);
            }
            Operation operationToPerfom = new Substraction();
            History history = History.getInstance();
            Double resultDouble = operationToPerfom.perform(number1Double, number2Double);
            resultDouble = DoubleRounder.round(resultDouble);
            PrintableOperation operation = new PrintableOperation(number1Double, number2Double, "-", resultDouble);
            result[0] = Double.toString(resultDouble);
            history.addOperation(operation);
            return new Response("Operation completed successfully", Status.OK);
        } catch (Exception e) {
            return new Response("Unexpected Error", Status.INTERNAL_SERVER_ERROR);
        }
    }
}
