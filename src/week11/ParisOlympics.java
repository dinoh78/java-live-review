package week11;

public class ParisOlympics {
    //static variable - shared, belongs to class
    public static final String EVENT = "Olympic Games Paris 2024";

    //static block - code that run automatically runs at beginning before anything else
    static {
        System.out.println("---- Welcome to " + EVENT + "!");
        System.out.println("July 26, 2024 – August 11, 2024\n");
        System.out.println("Medals");
    }

    //static method - method can be called with classname, and without creating object:
    public static void showAllMedals() {
        System.out.println("1. USA - Gold: 45, Silver: 30, Bronze: 25");
        System.out.println("2. China - Gold: 38, Silver: 28, Bronze: 18");
        System.out.println("3. France - Gold: 35, Silver: 25, Bronze: 20");
        System.out.println("4. UK - Gold: 33, Silver: 22, Bronze: 17");
        System.out.println("5. Germany - Gold: 30, Silver: 20, Bronze: 15");
        System.out.println("6. Japan - Gold: 28, Silver: 18, Bronze: 16");
        System.out.println("7. Australia - Gold: 26, Silver: 16, Bronze: 14");
        System.out.println("8. Italy - Gold: 24, Silver: 14, Bronze: 12");
        System.out.println("9. Canada - Gold: 22, Silver: 12, Bronze: 10");
        System.out.println("10. Brazil - Gold: 20, Silver: 10, Bronze: 8");
    }
}