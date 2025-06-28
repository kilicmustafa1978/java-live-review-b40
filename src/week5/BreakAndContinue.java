package week5;

public class BreakAndContinue {
    public static void main(String[] args) {
        //🚪 Exit Loop When Number is Found
        for (int i = 0; i < 11; i++) {
            System.out.println("i = " + i);
            if (i == 5) {
                System.out.println("Found the number " + i);
                break; //exit loop
            }
        }

        System.out.println("======================");
        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 == 0) {
                continue; //goto next iteration
            }

            System.out.print(i +" ");
        }
    }
}
