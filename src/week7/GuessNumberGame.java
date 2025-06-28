package week7;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        System.out.println("--Welcome to Guessing Number Game--");

        Scanner input = new Scanner(System.in);
        Random random = new Random();//helps generate random numbers

        //System.out.println(random.nextInt(11));
        int secretNumber = random.nextInt(100);
        int guessingNumber;

        do {
            System.out.println("Guess the secret number:");
            guessingNumber = input.nextInt();
            if (guessingNumber > secretNumber) {
                System.out.println("Too big");
            }else if (guessingNumber < secretNumber) {
                System.out.println("Too small");
            } else {
                System.out.println("Congratulations you won!");
            }
            /*
            4.	Track Attempts:
            •	Count the number of tries using a variable tries.
            •	If the user uses all 5 tries and doesn’t guess the number, print:
             */
        }while(guessingNumber != secretNumber);

        System.out.println("Game over!");

    }
}
