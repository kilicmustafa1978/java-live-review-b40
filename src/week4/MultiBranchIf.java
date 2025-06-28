package week4;

public class MultiBranchIf {
    public static void main(String[] args) {
        //🥇 Identify medal:
        int rank = 1;
        System.out.println("rank = " + rank);
        if (rank == 1) {
            System.out.println("Gold");
        } else if (rank == 2) {
            System.out.println("Silver");
        } else if (rank == 3) {
            System.out.println("Bronze");
        } else {
            System.out.println("No medal, try again next time");
        }

        System.out.println("-------------------------");
        //🍽️ Meal Recommendation Based on Time
        int hour = 9;
        System.out.println("hour = " + hour);
        if (hour >= 6 && hour <= 10) {
            System.out.println("Breakfast time");
        } else if (hour >= 11 && hour <= 14) {
            System.out.println("Lunch time");
        } else if (hour >= 15 && hour <= 17) {
            System.out.println("Snack time");
        } else if (hour >= 18 && hour <= 21) {
            System.out.println("Dinner time");
        } else {
            System.out.println("Kitchen is closed");
        }

        System.out.println("-------------------------");
        //🌡️Temperature Category:
        int temperature = 33;
        String status;

        if (temperature <= 0) {
            status = "Freezing";
        } else if (temperature >= 1 && temperature <= 15) {
            status = "Cold";
        } else if (temperature >= 16 && temperature <= 25) {
            status = "Mild";
        } else if (temperature >= 26 && temperature <= 35) {
            status = "Warm";
        } else {
            status = "Hot";
        }

        System.out.println("status = " + status + " temperature = " + temperature);
    }
}
