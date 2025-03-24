package week09;

public class TransactionsArray {
    public static void main(String[] args) {
        double accountBalance=20500.0;


        double [] expenses ={20.99,61.61, 250.0,354.15,157.50,0.77,1.60};

        //Processing transaction -20.99 20479.01
        for(double each:expenses){
            accountBalance-=each;
            System.out.println("Processing transaction -"+each+ "\t"+accountBalance);

        }
        System.out.println("Remainig balance = $ "+accountBalance);
    }
}
