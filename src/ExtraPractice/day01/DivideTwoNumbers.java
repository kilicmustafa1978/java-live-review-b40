package ExtraPractice.day01;

public class DivideTwoNumbers {

    public static void main(String[] args) {
        divideNums(10, 3);
        divideNums(100, 12);
        divideNums(12, 0);
    }

    //divideNums(10, 3)
    public static void divideNums(int num1, int num2) {
        if (num2 == 0) {
            System.err.println("Cannot / by zero");
            return; //exit method
        }

        System.out.println("Dividing " + num1 + " by " + num2);

        int count = 0;
        while(num1 >= num2) {
            count++;
            num1 -= num2;
        }
        System.out.println(count +" with remainder of " + num1);
    }

}
