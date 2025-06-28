package week3.comparison;

public class LogicalOperators {
    public static void main(String[] args) {
        //Check if you can unlock a device (must know password and have fingerprint):
        boolean knowsPassword = true;
        boolean hasFingerprint = false;
        System.out.println("Unlocked? = " + (knowsPassword && hasFingerprint));
        boolean unlocked = knowsPassword && hasFingerprint;
        System.out.println("unlocked = " + unlocked);
    }
}
