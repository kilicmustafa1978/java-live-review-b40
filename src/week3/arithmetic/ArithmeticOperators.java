package week3.arithmetic;

public class ArithmeticOperators {
    public static void main(String[] args) {
        //➕ Addition Example – Total Fruits:
        int apples = 11;
        int bananas = 33;
        System.out.println(apples + bananas);
        int totalNumberOfFruits = apples + bananas;
        System.out.println("totalNumberOfFruits = " + totalNumberOfFruits);

        //➖ Subtraction Example – Wallet After Purchase:
        double wallet = 120.50;
        double price = 75.0;
        System.out.println(wallet - price);
        double remaining = wallet - price;
        System.out.println("remaining cash = $" + remaining);

        //✖️ Multiplication Example – Items in Boxes:
        int boxes = 2;
        int itemsPerBox = 3;
        int totalItems = boxes * itemsPerBox;
        System.out.println("totalItems = " + totalItems);

        //➗ Division Example – Time per Task:
        int totalMinutes = 10;
        int tasks = 2;
        int minutesPerTask = totalMinutes / tasks;
        System.out.println("minutesPerTask = " + minutesPerTask);

        //% Modulus/Remainder Example – Leftover Chocolates:
        int chocolates = 10;
        int friends = 3;
        int leftOver = chocolates % friends;
        System.out.println("leftOver chocolates = " + leftOver);

        //From totalSeconds calculate minutes and remainingSeconds:
        int totalSeconds = 550;
        int minutes = totalSeconds / 60;
        int remainingSeconds = totalSeconds % 60;
        //-In 550 seconds - there are 9 minutes and 10 seconds
        System.out.println("In " + totalSeconds + " seconds - there are " + minutes + " minutes and " + remainingSeconds + " seconds");

    }
}
