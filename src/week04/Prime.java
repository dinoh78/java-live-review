
package week04;
/*
Prime [nested if]
    declare boolean and assign isPrimeMember variable
    double totalPrice
    double shipping

    if isPrimeMember, then shipping is free also if total price is more than $35 then free same day shipping. Otherwise free prime shipping

    if not isPrimeMember, then shipping is free only when total is more than $35, otherwise 5.99

    isPrimeMember = true, Total = 55, shipping = 0, same day
    isPrimeMember = true, Total = 20, shipping = 0, prime shipping
    isPrimeMember = false, Total = 45, shipping = 0, regular shipping
    isPrimeMember = false, Total = 21, shipping = 5.99, regular shipping

 */

public class Prime {

    public static void main(String[] args) {
        boolean isPrimeMember = false;
        double totalPrice = 13.22;
        double shipping;

        if (isPrimeMember) {
            shipping = 0;
            if (totalPrice >= 35.0) {
                System.out.println("PrimeMember - free same day shipping");
            } else {
                System.out.println("PrimeMember - free prime shipping");
            }
        } else {
            if (totalPrice >= 35.0) {
                shipping = 0;
                System.out.println("Not PrimeMember - free regular shipping");
            } else {
                shipping = 5.99;
                System.out.println("Not PrimeMember - $5.99 shipping fee");
            }
        }

        System.out.println("Prime member = " + isPrimeMember + " , totalPrice = $" + totalPrice + ", shipping = $" + shipping );
        System.out.println("Final price = $" + (totalPrice + shipping));
    }
}