package utils;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class BreakTimer {
    public static void main(String[] args) throws InterruptedException {
        setBreakTime(14);
    }

    public static void setBreakTime(int minutes) throws InterruptedException {
        if (minutes <= 0) {
            System.out.println("Minutes cannot be 0 or negative");
            return; //exit method
        }

        //what time to come back:
        System.out.println("Please come back at:");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime comeBackTime = LocalTime.now().plusMinutes(minutes);
        System.out.println(formatter.format(comeBackTime));

        for (int i = minutes-1; i >= 0; i--) {
            for (int j = 59; j >= 0; j--) {
                Thread.sleep(1000);//pause for a second
                System.out.print(i + ":" + j +"\r");
            }
        }

        System.out.println("BREAK TIME IS OVER. PLEASE COME BACK TO CLASS");
    }
}