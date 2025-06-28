package week6;

public class VoidMethods {
    public static void main(String[] args) {
        printMessage();
        printMessage();
        System.out.println("---------------------");
        for (int i = 1; i <= 3; i++) {
            ringBell();
        }
        System.out.println("---------------------");

        greetUser("Uncle Bob");
        greetUser("Mike Smith");
        String lastName = "Obama";
        greetUser(lastName);

        System.out.println("---------------------");

        printBoxLabel(55);
        printBoxLabel(12345);
        int num = 4321;
        printBoxLabel(num);

        System.out.println("---------------------");

        checkDiscount(120.55);
        checkDiscount(35.0);
        checkDiscount(12.54);

        System.out.println("---------------------");

        canBookFlight(true, true);
        canBookFlight(false, true);
        canBookFlight(false, false);

        System.out.println("---------------------");

        repeatWord("java", 10);
        repeatWord("selenium", 3);
        repeatWord("I can do it!", 100);
    }

    public static void printMessage() {
        System.out.println("Hello there! Let's code Java!");
    }

    public static void ringBell() {
        System.out.println("🔔 Ring Ring!");
    }

    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome Back!");
    }

    public static void printBoxLabel(int id) {
        System.out.println("###################");
        System.out.println("# Box ID: " + id);
        System.out.println("###################");
    }

    public static void checkDiscount(double total) {
        if (total > 100) {
            System.out.println("You get a discount!");
        } else {
            System.out.println("No discount today.");
        }
    }

    /*
    🛫 Can Book Flight (passport OR ID)
    -Create a method called canBookFlight(boolean hasPassport, boolean hasIDCard)
    -If person has either a passport OR an ID card, print “Booking successful”
    -Otherwise, print “Cannot book flight”
     */
    public static void canBookFlight(boolean hasPassport, boolean hasIDCard) {
        if (hasPassport || hasIDCard) {
            System.out.println("Booking successful");
        } else {
            System.out.println("Cannot book flight");
        }
    }

    public static void repeatWord(String word, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}
