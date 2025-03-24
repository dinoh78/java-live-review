package week04;
/*
num1 =num2 = 55.num3 =7
55is biggest
 */
public class Compar3nNums {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 100;
        int num3 = 7;

        if (num1 > num2 && num1 > num3) {
            System.out.println("num1 is biggest");
        }else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 +" is biggest");
        }else{
            System.out.println(num3 + " is biggest");
        }


    }

}
