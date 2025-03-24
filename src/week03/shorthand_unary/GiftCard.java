package week03.shorthand_unary;
/*
GiftCard
    declare and assign a gift card with 200.0
    declare and assign String variable items and assign ""
    buy 2 items.
    buy item 1 for x price and subtract from your gift card,
        also add item name to items
    buy item 2 for x price and subtract from your gift card,
        also add item name to items
    print the remaining balance of your gift card and all items
 */
public class GiftCard {
    public static void main(String[] args) {
        double giftCard = 200.0;

        System.out.println("Buying sneakers for $45.0");
        //giftCard = giftCard - 45.0;
        giftCard -= 45.0;


        System.out.println("Buying jacket for $75.50");
        giftCard -= 75.50;

        System.out.println("Buying computer bag for $47.0");
        giftCard -= 47.0;

        System.out.println("Remaining balance = $" + giftCard);

    }
}

 /*
    int n = 5;
    //n = n + 2;
    n += 2;
    System.out.println("n = " + n);//7
*/