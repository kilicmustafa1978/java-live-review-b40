package week7;

import java.util.Scanner;

public class StudyTopics {
    public static void main(String[] args) {
        //Create scanner object:
        Scanner input = new Scanner(System.in);

        System.out.println("What topics are you learning this week?");
        String topic1 = input.next();
        String topic2 = input.next();

        System.out.println("I will learn \"" + topic1 + "\" and \"" + topic2 + "\" at Cydeo");

        input.close();
    }
}
