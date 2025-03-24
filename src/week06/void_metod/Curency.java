package week06.void_metod;

/*
 Use the following sample rates for currency conversions
    •    1 USD = 0.93 EUR
    •    1 USD = 152.87 JPY
    •    1 USD = 34.35 TRY
    •    1 USD = 1,386.05 KRW
    •    1 USD = 84.29 INR

    convertDollars("EUR", 100.55); ->
     */

public class Curency {
    public static double convertDollars(String currency, double USDAmount) {
        double result;
        switch (currency) {
            case "EUR" -> result = USDAmount * 0.93;
            case "JPY" -> result = USDAmount * 152.87;
            case "TRY" -> result = USDAmount * 34.35;
            case "KRW" -> result = USDAmount * 1386.05;
            case "INR" -> result = USDAmount * 84.29;
            default -> {
                System.out.println("Invalid currency " + currency);
                result = 0.0;
            }
        }

        return result;

    }
}
