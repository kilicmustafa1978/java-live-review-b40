package week6;

public class MethodsWithReturn {
    public static void main(String[] args) {
        //2025
        System.out.println(getCurrentYear());
        int year = getCurrentYear();
        System.out.println("year = " + year);

        System.out.println("----------------------");

        int age = calculateAge(1990);
        System.out.println("age = " + age);
        System.out.println(calculateAge(1955));

        int birthYear = 2007;

        if (calculateAge(birthYear) >= 18) {
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }

        System.out.println("----------------------");

        System.out.println("is it free shipping? - " + hasFreeShipping(120.50));
        System.out.println("is it free shipping? - " + hasFreeShipping(20.50));

        System.out.println("----------------------");

        double euros = convertDollars(100, "EUR");
        System.out.println("euros = " + euros);

        double japanese = convertDollars(100, "JPY");
        System.out.println("japanese = " + japanese);
    }

    public static int getCurrentYear() {
        //System.out.println("Returning value 2025");
        return 2025;
    }

    //1990
    public static int calculateAge(int birthYear) {
        int age = getCurrentYear() - birthYear;
        //int age = 2025 - birthYear;
        return age;
    }

    public static boolean hasFreeShipping(double orderTotal) {
        return orderTotal >= 50;
//        if (orderTotal >= 50) {
//            return true;
//        } else {
//            return false;
//        }
    }

    /*
    1 USD = 0.94 EUR
    1 USD = 149.51 JPY
    1 USD = 39.21 TRY
    1 USD = 1,395.22 KRW
    1 USD = 83.97 INR
    convertDollars(50, "EUR");
     */
    public static double convertDollars(double USDAmount, String currency) {
        double result = 0.0;
        switch (currency) {
            case "EUR" -> result = USDAmount * 0.94;
            case "JPY" -> result = USDAmount * 149.51;
            case "TRY" -> result = USDAmount * 39.21;
            case "KRW" -> result = USDAmount * 1395.22;
            case "INR" -> result = USDAmount * 83.97;
            default -> System.out.println("Currency not supported");
        }

        return result;
    }
}
