package week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(100);
        nums.add(200);

        System.out.println(nums.size() + " elements = " + nums);
        //add to specific index
        nums.add(0, 5);
        nums.add(2, 99);
        System.out.println(nums.size() + " elements = " + nums);

        //change 0 index to 50
        nums.set(0, 50);
        System.out.println(nums.size() + " elements = " + nums);

        //read specific index
        System.out.println("Index 0 = " + nums.get(0));
        System.out.println("Last index = " + nums.get(nums.size()-1));

        int sum = 0;
        for(int n : nums) {
            sum += n;
        }
        System.out.println("sum = " + sum);

        if (nums.contains(100)) {
            System.out.println("100 is present");
        } else {
            System.out.println("100 is not present");
        }

        nums.remove(0);
        System.out.println(nums.size() + " elements = " + nums);

        nums.remove(Integer.valueOf(100)); //remove first number 100
        System.out.println(nums.size() + " elements = " + nums);

        System.out.println("---------");
        String[] s = {"New York", "London", "Paris", "Tokyo"};

        ArrayList<String> cities = new ArrayList<>(Arrays.asList("New York", "London", "Paris", "Tokyo"));
        cities.add("Miami");
        System.out.println("cities = " + cities);
        cities.remove("London");
        System.out.println(cities.size() + " cities = " + cities);

        System.out.println("---------");

        ArrayList<String> movies = new ArrayList<>(List.of("Inception", "Titanic", "Avatar"));
        System.out.println("movies = " + movies);
        movies.set(1, "Interstellar");
        System.out.println(movies.size() + " movies = " + movies);

        System.out.println("----------");

        ArrayList<String> fruits = new ArrayList<>(List.of("Banana", "Apple", "Grapes"));
        if (fruits.contains("Apple")) {
            System.out.println("Apple is here");
        }
        int i = fruits.indexOf("Grapes");
        System.out.println("Grapes is at index " + i);

        System.out.println("--------------");

        ArrayList<String> students = new ArrayList<>(List.of("Ali", "Mira", "John"));
        System.out.println("students = " + students);
        String nameToSearch = "Mira";
        int idx = students.indexOf(nameToSearch);
        if (idx >= 0) {
            System.out.println(nameToSearch + " is at index " + idx);
        } else {
            System.out.println(nameToSearch + " is not in the list");
        }

        students.remove(idx);
        System.out.println("After removing = " + students);

        students.clear();
        System.out.println("after clear() = " + students);

        System.out.println("isEmpty() = " + students.isEmpty());
    }
}