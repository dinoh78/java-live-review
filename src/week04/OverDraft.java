package week04;

public class OverDraft {
    public static void main(String[] args) {

        double balance = 250.44;
        double price = 25.33;

        balance -= price;

      //  boolean negative = balance < 0;
      //  if (negative) {}
        if (balance < 0) {
            balance -= 35.0;
            System.out.println("Acount overdraft fee applied");

        }
        System.out.println("balance =$" + (float)balance);

    }
}
