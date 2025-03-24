package week02.variables;
public class CastingPrimitives {
    public static void main(String[] args) {
        byte b1 = 10;
        short sh1 = b1;// casting from small to large

        int n1 = 56;
        byte b2 = (byte)n1;

        double price = 433.44;
        int wholePrice = (int)price;

        System.out.println("price = " + price );
        System.out.println("wholePrice = " + wholePrice);

        int apples = 544;
        double applesD = apples;
        System.out.println("apples = " + apples);
        System.out.println("applesD = " + applesD);

    }
}