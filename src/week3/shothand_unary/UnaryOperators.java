package week3.shothand_unary;

public class UnaryOperators {
    public static void main(String[] args) {
        //New email notification. Your received one more email:
        int inbox = 10;
        inbox++;
        ++inbox;
        //without ++ operator
        inbox = inbox + 1;
        System.out.println("inbox = " + inbox);

        //During the gaming, one life is lost:
        int lives = 3;
        lives--;
        lives = lives - 1;
        System.out.println("lives left = " + lives);

        //Show a negative temperature reading:
        int temperature = 15;
        //temperature = -temperature;
        int belowZero = -temperature;
        System.out.println("belowZero = " + belowZero);

        int temp = -20;
        int overZero = -temp; //temp * -1;
        System.out.println("overZero = " + overZero);
    }
}
