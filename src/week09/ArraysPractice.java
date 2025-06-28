package week09;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] dailySteps={3120, 9800,7500,6987,11000,4563,2500};
        System.out.println("Monday steps = "+dailySteps[0]);
        System.out.println("Thursday steps = "+dailySteps[3]);

        //loop array and print values:
        for (int steps : dailySteps) {
            System.out.println("steps = " + steps);

        }
        System.out.println("-------------------------------");
        for (int i = 0; i < dailySteps.length; i++) {
            System.out.println("steps =  " + dailySteps[i]);

        }
        //print all values without a loop ussing Arrays.toString(array)
        System.out.println(Arrays.toString(dailySteps));

        System.out.println("-------------------------------------");

        String[] days=new String[7];
        days[0]="Monday";
        days[1]="Tuesday";
        days[2]="Wednesday";
        days[3]="Thursday";
        days[4]="Friday";
        days[5]="Saturday";
        days[6]="Sunday";
        System.out.println(days.length+" => "+Arrays.toString(days));
        for(String eachDay:days){
            System.out.println("eachDay = " + eachDay);
        }
        System.out.println("----Days = steps----");
        for (int i = 0; i < days.length ; i++) {
            System.out.println(days[i]+ " = "+ dailySteps[i]);

        }
        //CAlculate sum of steps for whole week then print out
        int sumOfSteps = 0;
        for(int steps:dailySteps) {
            sumOfSteps += steps;
        }
        System.out.println("weekly steps = " + sumOfSteps);
        System.out.println("---------------------------------------");

        //Transactions history:

        double accountBalance= 20500.0;
        double [] charges={20.99, 61.60, 250.0, 354.15, 157.50, 0.80, 1.60};

        for( double each : charges  ){
            accountBalance-=each;
            System.out.println("Processing transaction " + each+"  \t"+ accountBalance);
        }

    }
}
