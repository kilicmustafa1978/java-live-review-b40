package week2.variables;

public class PrimitiveCasting {

    public static void main(String[] args) {
        //Implicit casting / Widening
        //You are putting small primitive to larger one:
        byte small = 100;
        int large = small;
        System.out.println("small = " + small);
        System.out.println("large = " + large);

        //An item costs $5, and you want to calculate price with tax as a double.
        int itemPrice = 5;
        double finalPrice = itemPrice;
        System.out.println("itemPrice = " + itemPrice);
        System.out.println("finalPrice = " + finalPrice);

        //Explicit casting. Narrowing.
        //double -> int
        double balance = 1250.75;
        int roundedBalance = (int)balance;
        System.out.println("balance = " + balance);
        System.out.println("roundedBalance = " + roundedBalance);

        //A vending machine only stores item codes as bytes:
        int itemCode = 120;
        byte storedCode = (byte) itemCode;
        System.out.println("itemCode = " + itemCode);
        System.out.println("storedCode = " + storedCode);

        char letter = 'm';//109
        int ascii = letter;
        System.out.println("letter = " + letter);
        System.out.println("ascii = " + ascii);
    }
}
