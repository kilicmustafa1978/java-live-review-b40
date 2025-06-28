package week3.shothand_unary;

public class ShorthandOperators {
    public static void main(String[] args) {
        //You scored 5 more points in a game:
        int score = 10;
        score += 5;
        score = score + 5;
        System.out.println("score = " + score);

        //You spent $30 from your $100 wallet:
        int wallet = 100;
        wallet -= 30;
        System.out.println("Money left in wallet : $" + wallet);
        wallet -= 20;
        System.out.println("Money left in wallet : $" + wallet);

        //You restock 4 times more boxes:
        int boxes = 3;
        boxes *= 4; //boxes = boxes * 4;
        System.out.println("Total boxes = " + boxes);

        //You plan to read a 100-page book over 5 days:
        int totalPages = 100;
        totalPages /= 5;
        System.out.println("Pages per day = " + totalPages);

        //You share 17 candies with 6 friends:
        int candies = 17;
        candies %= 6;
        System.out.println("Candies left = " + candies);

        //Parking lot cars are coming and leaving:
        int cars = 10;
        cars += 5;
        System.out.println("cars = " + cars);
        cars -= 3;
        System.out.println("cars = " + cars);
        cars *= 2;
        System.out.println("cars = " + cars);
    }
}
