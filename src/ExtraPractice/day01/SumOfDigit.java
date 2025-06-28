package ExtraPractice.day01;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(123)); //3+2+1
        System.out.println(sumOfDigits(4561));
        System.out.println(sumOfDigits(654564564));
    }
    public static int sumOfDigits(int num) {
        int sum = 0;
        while(num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num = num / 10; //remove last digit
        }
        return sum;
    }
}
