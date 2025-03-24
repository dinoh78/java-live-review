package week05;

public class MuliplicationTable {
    public static void main(String[] args) {
int num =3;
        System.out.println("Multiplication table for" +num);
        for (int i = 1; i <=12  ; i++) {
            System.out.println(num+"x"+i+"="+i+" = " +(num*i));

        }
        System.out.println("================ Multiplication table =================");

        for (int i = 1; i <=12  ; i++) {
            for (int j = 1; j < 12; j++) {
                System.out.println(i + " x " + j + " = " +(i * j));

            }
        }

    }
}
