package core.models;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class ModelSetter {
    public static void setModel(DefaultListModel model, ArrayList<PrintableOperation> operations){
        model.addAll(operations);
    }
}
