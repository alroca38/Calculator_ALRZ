package core.models;

import java.math.BigDecimal;

public class DecimalsChecker {

    public static boolean verifyDecimals(String number) {
        BigDecimal bd = new BigDecimal(number);
        int numberOfDecimalPlaces = bd.scale();
        return numberOfDecimalPlaces <= 3;
    }
}
