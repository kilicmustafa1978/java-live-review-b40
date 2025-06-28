package ExtraPractice.day01;

public class SpeedingTicket {
    public static void main(String[] args) {
        int speedLimit = 25;
        int currentSpeed = 35;

        if (currentSpeed > speedLimit) {
            int ticketAmount = (currentSpeed - speedLimit) * 6 + 51;
            System.out.println("ticketAmount = $" + ticketAmount);
        } else {
            System.out.println("Not speeding");
        }
    }
}
