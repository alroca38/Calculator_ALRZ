package core.controllers;

import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.History;
import core.models.ListCopier;
import core.models.ModelSetter;
import core.models.PrintableOperation;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class HistoryController {
    
    public static Response updateHistory(ArrayList<PrintableOperation> operations, DefaultListModel model) {
        try {
            if (History.getInstance().getOperations().isEmpty()) {
                return new Response("Operations History is empty", Status.NO_CONTENT);
            }
            ListCopier.copyList(History.getInstance().getOperations(), operations);
            ModelSetter.setModel(model, operations);
            return new Response("History Updated", Status.OK);
        } catch (Exception e) {
            return new Response("Unexpected Error", Status.INTERNAL_SERVER_ERROR);
        }
    }
}
