package week04;

/*
PizzaSize[switch, char]
    declare char pizzaSize.
    can be 'S' = 12.09, 'M' = 15.39, 'L' = 18.69
    print message for selection.
    assign price value based on size

    If all false, invalid selection
 */

public class PizzaSize {
    public static void main(String[] args) {
        System.out.println("Welcome to Pizza Hut!");

        char pizzaSize = 'L';
        double price;

        switch (pizzaSize) {
            case 'S','s' -> {
                System.out.println("Cheese Pizza - small 10\"");
                price = 12.09;
            }
            case 'M','m' -> {
                System.out.println("Cheese Pizza - medium 12\"");
                price = 15.39;
            }
            case 'L','l' -> {
                System.out.println("Cheese Pizza - large 14\"");
                price = 18.69;
            }
            default -> {
                System.out.println("Invalid pizza Size = " + pizzaSize);
                price = 0.0;
            }
        }

        System.out.println("Pizza size = " + pizzaSize + " Price = $" + price);
    }
}












