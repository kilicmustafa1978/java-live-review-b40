package week5;

public class NestedLoop {
    public static void main(String[] args) {
        //🔁 Multiplication Table (1 to 10)
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + "  = " + (i*j));
            }
            System.out.println("-------------");
        }

        //⌛ Show Days and Hours
        for (int day = 1; day <= 7; day++) {
            System.out.print("Day " + day +" - ");
            for (int hour = 0; hour <= 23; hour++) {
                System.out.print(hour +" ");
            }
            System.out.println();
        }
    }
}
