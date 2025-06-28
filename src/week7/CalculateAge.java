package week7;

import week6.MethodsWithReturn;

import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter birth year:");
        int year = input.nextInt();
        int age = MethodsWithReturn.calculateAge(year);

        System.out.println("If you are born in " + year + " then you are " + age);
    }
}
