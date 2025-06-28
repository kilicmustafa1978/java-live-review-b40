package week5;

public class ForLoop {
    public static void main(String[] args) {

        //👋 Print "Hello Friends!" 10 times using a for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello Friends!");
        }

        System.out.println("------------------------");
        //💻 Print java - number 5 times in single line. java - 1 java - 2 java - 3 java - 4 java - 5
        for (int i = 1; i <= 5; i++) {
            System.out.print("java - " + i + " ");
        }
        System.out.println("\n------------------------");

        //⚙️ Print selenium - number 8 times in reverse:
        for (int k = 8; k >= 1; k--) {
            System.out.println("selenium - " + k);
        }

        System.out.println("------------------------");

        //🏦 Calculate investment that grows in value by 20% every year
        double investmentAmount = 10_000.0;

        for(int year = 2025; year <= 2030; year++) {
            double growth = investmentAmount * 0.20;
            investmentAmount += growth;
            System.out.println(year + " - $" + growth + " - $" + investmentAmount);
        }

        System.out.println("------------------------");

        //📚You are looping through 1 million rows of data - 1 row at a time:
        for(int row = 1; row <= 1000_000; row++) {
            if (row % 100_000 == 0)
                System.out.println("Status : row - " + row);
        }
    }
}
