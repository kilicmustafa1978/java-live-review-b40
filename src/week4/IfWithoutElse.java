package week4;

public class IfWithoutElse {
    public static void main(String[] args) {
        //☀️ We go out if it is sunny:
        boolean sunny = false;
        if (sunny) {
            System.out.println("Let's put on sunglasses and go out");
        }
        System.out.println("After sunny check");

        System.out.println("------------------------");

        //🔋 Check if the battery level is low and show a warning:
        System.out.println("Checking battery :");
        int batteryLevel = 15;
        if (batteryLevel < 20) {
            System.out.println("Battery Low!");
        }

        System.out.println("After battery check");

        System.out.println("------------------------");

        //🌦️ Check if it’s both cloudy and cold, then suggest taking a jacket
        boolean isCloudy = true;
        boolean isCold = true;

        if (isCloudy && isCold) {
            System.out.println("Take a jacket!");
        }

        System.out.println("------------------------");
        //🏦 Check if balance(double) is 0 or less, if true print "Broke"
        double balance = -85.23;
        if (balance <= 0.0) {
            System.out.println("Broke");
        }
        System.out.println("balance = $" + balance);

        System.out.println("------------------------");
        //✅ Check if passed(boolean) is Not true, then print "Test failed, opening a bug report"

        boolean passed = false;
        if (!passed) {
            System.out.println("Test failed, opening a bug report");
        }
        System.out.println("After test execution");
    }
}
