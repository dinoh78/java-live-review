package week02.variables;

/*
model, CPU, ram, storage, price, onSale
 */
public class Computer {
    public static void main(String[] args) {
        String model = "LG - gram 16\" Laptop";
        String cpu = "Intel evo 13th Gen Intel Core i7-1360P";
        int ram = 16;
        String storage = "1TB SSD";
        double price = 849.99;
        boolean onSale = true;

        System.out.println(model + " - " + cpu + " _ " + ram + "GB RAM - " + storage + "\n$" + price);
        System.out.println("Saving = " + onSale);

        //another laptop - HP - Victus 15.6" Full HD 144Hz Gaming Laptop - Intel Core i7 - 16GB Memory - NVIDIA GeForce RTX 4050 - 512GB SSD - Performance Blue

        model = "HP - Victus 15.6\" Full HD 144Hz Gaming Laptop";cpu = "Intel Core i7";
        ram = 16;
        storage = "5124GB SSD";
        price = 1099.99;
        onSale = false;

        System.out.println("==================================");
        System.out.println(model + " - " + cpu + " _ " + ram + "GB RAM - " + storage + "\n$" + price);
        System.out.println("Saving = " + onSale);





    }
}
