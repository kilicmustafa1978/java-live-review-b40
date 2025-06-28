package week10;

import java.util.ArrayList;


public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList <Integer>nums  = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(100);
        nums.add(200);
        System.out.println(nums.size()+ " elements = "+ nums);
    }
}
