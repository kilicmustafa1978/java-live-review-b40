package week5;

public class DoWhileLoop {
    public static void main(String[] args) {
        //🔁 Print Numbers 1 to 5
        int num = 1;
        do {
            System.out.println(num);
            num++;
        } while (num <= 5);

        System.out.println("-----------------");
        //🍽️ Eating Until Full (Minimum One Bite)

        int bites = 1;

        do {
            System.out.println("Taking a bite = " + bites);
            bites++;
        } while(bites < 4);

        System.out.println("Feeling full, cannot eat any more!");
    }
}
