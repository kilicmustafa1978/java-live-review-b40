package week10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CustomMethods {

    public static void main(String[] args) {
        System.out.println(randomList(5));
        ArrayList<Integer> myNums = randomList(10);
        System.out.println("myNums = " + myNums);

        System.out.println("--------");
        ArrayList<String> colors = new ArrayList<>(List.of("brown","black","yellow","pink","white","silver","purple"));
        printArrayList(colors);

        System.out.println("----------");
        ArrayList<String> numbersStr = new ArrayList<>(List.of("123", "34", "513"));
        System.out.println(getSum(numbersStr));
    }

    //getSum(["123", "34", "513"]) -> [6, 7, 9]
    public static ArrayList<Integer> getSum(ArrayList<String> list) {
        ArrayList<Integer> nums = new ArrayList<>();
        for(String eachNumber : list) {
            int sum = 0;
            for (int i = 0; i < eachNumber.length(); i++) {
                sum += Character.getNumericValue(eachNumber.charAt(i));
            }
            nums.add(sum);
        }

        return nums;
    }

    public static void printArrayList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " - " + list.get(i));
        }
    }

    public static ArrayList<Integer> randomList(int count) {
        Random rd = new Random();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            nums.add(rd.nextInt(1000)); //get random number 0-1000 and add to list
        }
        return nums;
    }
}