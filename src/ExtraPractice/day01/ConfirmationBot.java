package ExtraPractice.day01;

public class ConfirmationBot {

        public static void main(String[] args) {
            char response = 'H';

            switch(response) {
                case 'y','Y' -> System.out.println("Your request is being processed");
                case 'n','N' -> System.out.println("Thank you for your consideration");
                case 'h','H' -> System.out.println("Sorry, no live agents are currently available");
                default -> System.out.println("Invalid entry, please try again");
            }
        }
    }

