package week13.abstract_and_interface.exceptions;

import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter 2 numbers: ");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            System.out.println("Add = " + (num1 + num2));
            System.out.println("Divide = " + (num1 / num2));
            System.out.println("Minus = " + (num1 - num2));
            System.out.println("Multiply = " + (num1 * num2));
        } catch (Exception e) {
            System.out.println("Exception caught - " + e.getMessage());
        } finally { //always runs
            System.out.println("Finally block");
            scan.close();
        }
    }
}