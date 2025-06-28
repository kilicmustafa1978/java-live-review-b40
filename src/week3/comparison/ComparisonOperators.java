package week3.comparison;

public class ComparisonOperators {
    public static void main(String[] args) {
        //Check if your test score is greater than the passing score:
        int testScore = 85;
        int passMark = 50;
        System.out.println(testScore > passMark);
        boolean passed = testScore > passMark;
        System.out.println("Did you pass? = " + passed);

        //Check if the room temperature is below freezing:
        int temperature = -2;
        System.out.println("Is it freezing? - " + (temperature < 0));
        boolean isFreezing = temperature < 0;
        System.out.println("Is it freezing? - " + isFreezing);

        //Check if your age is enough to vote (18 or older):
        int age = 9;
        boolean canVote = age >= 18;
        System.out.println("canVote = " + canVote);

        //Check if luggage weight is within 23kg airline limit:
        int luggageWeight = 26;
        boolean isWithInLimit = luggageWeight <= 23;
        System.out.println("isWithInLimit = " + isWithInLimit);

        //Check if the entered PIN is correct:
        int enteredPin = 1234;
        int correctPin = 1234;
        boolean isCorrect = enteredPin == correctPin;
        System.out.println("is pin correct? = " + isCorrect);

        //Check if a seat is not already reserved:
        int selectedSeat = 22;
        int reservedSeat = 15;
        boolean seatAvailable = selectedSeat != reservedSeat;
        System.out.println("seatAvailable = " + seatAvailable);
    }
}
