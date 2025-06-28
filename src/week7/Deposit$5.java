package week7;

import java.util.Scanner;

public class Deposit$5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int deposit;

        do {
            System.out.println("Deposit $5");
            deposit = input.nextInt();
        } while(deposit != 5);

        System.out.println("Thank you for depositing $5");
    }
}
