package week8;

public class StringMethods {
    public static void main(String[] args) {
        System.out.println("1) ----String comparison-----");
        String correctPassword = "Secret123";
        String inputPassword = "secret123";

        if (inputPassword.equals(correctPassword)) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied. Incorrect password.");
        }

        String correctUserName = "secretUser";
        String inputUserName = "SecretUSER";

        if (inputUserName.equalsIgnoreCase(correctUserName)) {
            System.out.println("Username found");
        } else {
            System.out.println("Username not found, try again");
        }

        System.out.println("2) ----concat-----");

        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println("fullName = " + fullName);

        System.out.println("3) ----String case conversion-----");

        String city = "LoNDoN";
        String lowerCaseCity = city.toLowerCase();
        System.out.println("city = " + city);
        System.out.println("lowerCaseCity = " + lowerCaseCity);

        String bookName = "java programming";
        System.out.println(bookName.toUpperCase());
        bookName = bookName.toUpperCase();//convert to uppercase then assign back
        System.out.println("bookName = " + bookName);

        String command = "StArT";
        if (command.toLowerCase().equals("start")) {
            System.out.println("Game is starting...");
        }else{
            System.out.println("Unknown command.");
        }

        String userAnswer = "YES";
        userAnswer = userAnswer.toLowerCase();

        if (userAnswer.equals("yes")) {
            System.out.println("You agreed.");
        } else {
            System.out.println("You declined.");
        }

        System.out.println("3) ----length-----");
        String word = "Java";
        System.out.println("Java length = " + word.length());
        int wordLength = word.length();
        System.out.println(word + " length = " + wordLength);

        String empty = "";
        System.out.println(empty.length());

        String message = "  Java is fun  ";
        System.out.println(message + " length = " + message.length());

        String newPassword = "abc12!@#";
        if (newPassword.length() >= 6) {
            System.out.println("Password accepted.");
        }else {
            System.out.println("Password too short.");
        }

        System.out.println("4) ----charAt(int index)----");
        String city2 = "Rome";
        System.out.println(city2.charAt(0));
        System.out.println(city2.charAt(1));
        System.out.println(city2.charAt(2));
        System.out.println(city2.charAt(3));
        //System.out.println(city2.charAt(4)); //StringIndexOutOfBoundsException

        String code = "XY123Z";
        System.out.println(code.charAt(0) + "" + code.charAt(code.length()-1));

        for (int i = 0; i < code.length(); i++) {
            System.out.println(code.charAt(i));
        }

        System.out.println("5) ----indexOf----");

        String animal = "elephant";
        System.out.println(animal.indexOf('p'));
        System.out.println(animal.indexOf('j'));
        int eIndex = animal.indexOf('e', 1);
        System.out.println("eIndex = " + eIndex);

        String sentence = "Learning Java is fun!";
        System.out.println("'Java' starts at index " + sentence.indexOf("Java"));

        String studentName = "Daniel";
        System.out.println(studentName.indexOf('z'));

        String menu = "Coffee, Tea, Juice";
        if (menu.toLowerCase().indexOf("tea") > -1) {
            System.out.println("tea is in the menu");
        }else {
            System.out.println("tea is not in the menu");
        }

        System.out.println("6) ----lastIndexOf----");
        String word2 = "banana";
        int lastA = word2.lastIndexOf('a');
        System.out.println("lastA = " + lastA);

        String log = "error: file not found. error: retry";
        int lastError = log.lastIndexOf("error");
        System.out.println("Last 'error' starts at index: " + lastError);

        String str = "example";
        char ch = 'a';
        if (str.indexOf(ch) == str.lastIndexOf(ch)) {
            System.out.println(ch + " is unique");
        } else {
            System.out.println(ch + " has duplicates");
        }

        System.out.println("7) ----substring----");

        String fName = "Jonathan Doe";
        //String first = fName.substring(0, 4);
        String first = fName.substring(0, fName.indexOf(" "));
        System.out.println("first = " + first);

        String fileName = "report.xlsx";
        String extension = fileName.substring(fileName.lastIndexOf('.')+1);
        System.out.println("extension = " + extension);

        String link = "www.cydeo.com";
        String company = link.substring(link.indexOf('.')+1, link.lastIndexOf('.'));
        System.out.println("company = " + company);

        System.out.println("8) ----replace----");
        String snack = "banana";
        System.out.println(snack.replace("a","*"));

        String animals = "Cats are cute. Cats love naps.";
        animals = animals.replace("Cats", "Dogs");
        System.out.println("animals = " + animals);

        String discordMsg = "Hello Dear Future SDETs";
        discordMsg = discordMsg.replace(" ","");
        System.out.println("discordMsg = " + discordMsg);

        System.out.println("9) ----replaceAll----");
        String input = "000Order1234Confirmed234";
        input = input.replaceAll("[0-9]", "");
        System.out.println("input = " + input);
    }
}
