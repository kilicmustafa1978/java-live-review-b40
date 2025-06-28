package week2.variables;

public class DecimalNumbers {
    public static void main(String[] args) {
        float temperature = 35.5F;
        System.out.println(temperature);

        //-declare double variable appleStockPrice and assign current value then print out
        double appleStockPrice = 205.35;
        System.out.println("$apple price is " + appleStockPrice);

        //-declare a variable that can hold wooden spoon price and assign the value
        double woodenSpoonPrice = 9.99;
        System.out.println("Wooden Spoon price is $" + woodenSpoonPrice);

        //You are comparing the prices of two laptops:
        double laptopPriceA = 799.99;
        double laptopPriceB = 999.49;
        System.out.println("Laptop A price: $" + laptopPriceA);
        System.out.println("Laptop B price: $" + laptopPriceB);

        //Two product ratings are same:
        double rating = 4.6;
        //rating = 5.0;
        double anotherRating = rating;
        //"Product 1 rating is 4.6 and Product 2 rating is 4.6"
        System.out.println("Product 1 rating is " + rating + " and Product 2 rating is " + anotherRating);
    }
}
