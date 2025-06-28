package week4;

public class SwitchStatement {
    public static void main(String[] args) {
        //🎮 Game Menu Option:
        int option = 3;

        if (option == 1) {
            System.out.println("Start New Game");
        } else if (option == 2) {
            System.out.println("Resume Game");
        } else if (option == 3) {
            System.out.println("Exit");
        } else {
            System.out.println("Invalid option");
        }

        System.out.println("------SWITCH------");

        switch (option) {
            case 1 -> System.out.println("Start New Game");
            case 2 -> System.out.println("Resume Game");
            case 3 -> System.out.println("Exit");
            default -> System.out.println("Invalid Option");
        }

        System.out.println("-------------------------");
        //🚙 Tesla models starting prices:
        String model = "Model Y";
        double startingPrice;

        switch (model) {
            case "Model 3"-> startingPrice = 34990;
            case "Model Y" -> startingPrice = 37490;
            case "Model S" -> startingPrice = 79990;
            case "Model X" -> startingPrice = 84990;
            case "Cybertruck" -> startingPrice = 62490;
            default -> {
                System.out.println("Invalid Model");
                startingPrice = 0.0;
            }
        }

        System.out.println("model = " + model + " startingPrice = $" + startingPrice);


    }
}
