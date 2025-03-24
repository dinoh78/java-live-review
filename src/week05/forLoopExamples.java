package week05;

public class forLoopExamples {
    public static void main(String[] args) {
        // print "Hello Friends! 10 times

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello Friends");

        }
        System.out.println("------------------");

        for (int n = 30; n < 20; n++) {
            System.out.println("Hello Friends");


        }
        // print java-number 5 times.Java -2 java -3 java- java 4- java5
        for (int i = 1; i < 5; i++) {
            System.out.println("java-"+ i);
        }
// selenium -8.. selenium-0
        for (int i = 8; i >= 0; i--) {
            System.out.println("Selenium-"+i);

        }
        //loop from 1 to 1_000_000 and print" Heart beat - number " every 1000
        for (int r = 1; r <= 1_000_000; r++) {
            if (r % 100_000 == 0){
                System.out.println("Heart beat -"+r);

            }

        }

    }


}

