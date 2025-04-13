package week13.abstract_and_interface.exceptions;

public class Checked {
    public static void main(String[] args) throws InterruptedException {
        //1)HANDLEusing try catch:
        try {
        Thread.sleep(200);
    }catch (InterruptedException e){
            e.printStackTrace();
        }
        //2) IGNORE/DECLARE using throws keyword:
        Thread.sleep(2500);

        System.out.println("bye");
    }
}
