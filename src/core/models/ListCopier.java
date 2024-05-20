package core.models;

import java.util.ArrayList;
import java.util.Collections;

public class ListCopier {

    public static void copyList(ArrayList<PrintableOperation> originalList, ArrayList<PrintableOperation> duplicatedList) {
        for(PrintableOperation operation : originalList){
            duplicatedList.add(operation);
        }
        Collections.reverse(duplicatedList);
    }
}
