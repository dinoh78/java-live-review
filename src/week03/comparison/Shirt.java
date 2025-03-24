
package week03.comparison;

//size = m and color blue or tan

public class Shirt {
    public static void main(String[] args) {
        char size = 'M';
        String color = "blue";

        System.out.println(size == 'M' && (color == "blue" || color == "tan"));
        boolean buy = size == 'M' && (color == "blue" || color == "tan");
        System.out.println("size = " + size + " color = " + color);
        System.out.println("buy = " + buy);
    }
}






