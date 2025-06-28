package ExtraPractice.day01;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(6));
        System.out.println(factorial(8));
        System.out.println(factorial(3));

        System.out.println("------For loop version------");
        System.out.println(factorial2(5));
        System.out.println(factorial2(6));
        System.out.println(factorial2(8));
        System.out.println(factorial2(3));
    }

    public static int factorial(int num) {
        int result = 1;

        while(num > 0) {
            result *= num;
            num--;
        }

        return result;
    }

    public static int factorial2(int num) {
        int result = 1;

        for (int i = 1; i <= num ; i++) {
            result *= i;
        }

        return result;
    }
}
