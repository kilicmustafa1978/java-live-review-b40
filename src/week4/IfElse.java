package week4;

public class IfElse {
    public static void main(String[] args) {
        //🍱 Check hungry:
        boolean hungry = true;
        if (hungry) { //hungry == true
            System.out.println("lets get some snacks");
            System.out.println("Keep coding java");
        } else {
            System.out.println("Not hungry, lets keep coding java");
        }

        System.out.println("------------------------");
        //😷 Check if pandemic lockdown:
        int year = 2025;
        if (year == 2020 || year == 2021) {
            System.out.println("Lockdown!");
            System.out.println("wear mask, stay home , keep coding java");
        } else {
            System.out.println("Go out, meet friends");
            System.out.println("keep coding java");
        }

        System.out.println("------------------------");

        //🚪 Check if a shop is open or closed:
        int hour = 6;
        if (hour < 22) {
            System.out.println("Shop is open");
        } else {
            System.out.println("Shop is closed");
        }

        System.out.println("------------------------");
        //🧑‍🎓 Check if a student passed or failed a test:
        int score = 45, passingScore = 50;

        if (score >= passingScore)
            System.out.println("Passed");
        else
            System.out.println("Failed");


        System.out.println("score = " + score + " passingScore = " + passingScore);

    }
}
