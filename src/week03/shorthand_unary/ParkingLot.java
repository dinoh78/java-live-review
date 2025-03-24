package week03.shorthand_unary;

public class ParkingLot {
    public static void main(String[] args) {
        System.out.println("--- Welcome to Costco ---");

        int cars = 0;

        System.out.println("2 cars parked");

        cars += 2; //cars = cars + 2;

        System.out.println("cars = " + cars);

        System.out.println("One car parked");
        //cars += 1;
        cars++; //increment by one

        System.out.println("cars = " + cars);

        System.out.println("10 more cars parked");
        cars += 10;

        System.out.println("cars = " + cars);

        System.out.println("One car left");
        cars--;
        System.out.println("5 more cars left");
        cars -= 5;

        System.out.println("Cars = " + cars);

        System.out.println("3 times more cars parked");
        cars *= 3; //7 * 3
        System.out.println("Cars = " + cars);
    }
}
