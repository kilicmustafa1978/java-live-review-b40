package week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Planets {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>(Arrays.asList("Earth", "Mercury", "Venus",
                "Mars" ,"Jupiter","Pluto","Saturn","Neptune","Uranus"));
        System.out.println("planets = " + planets);

        Collections.reverse(planets);

        System.out.println("planets = " + planets);

        Collections.shuffle(planets);

        System.out.println("planets = " + planets);

        Collections.sort(planets);

        System.out.println("planets = " + planets);

        planets.add("Earth");
        planets.add(0,"Earth");
        System.out.println("planets = " + planets);

        int count = Collections.frequency(planets, "Earth");
        System.out.println("Earth count = " + count);

        //replace "Earth" with "Java"
        Collections.replaceAll(planets, "Earth" ,"Java");
        System.out.println("planets = " + planets);

        ArrayList<Integer> nums = new ArrayList<>(List.of(10,43,5445,133,55454,123,1,77));
        System.out.println("nums = " + nums);
        System.out.println("Max number = " + Collections.max(nums));
        System.out.println("Min number = " + Collections.min(nums));
    }


}
