package week10;

public class FilterCharacters {
    public static void main(String[] args) {
        String str = "abcd@!#$etyi123lkjhaqwer%^&879";
        String digits = "";
        String letters = "";
        String special = "";

        for(char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                digits += each;
            } else if (Character.isLetter(each)) {
                letters += each;
            } else {
                special += each;
            }
        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("special = " + special);

//        for (int i = 0; i < str.length(); i++) {
//            char each = str.charAt(i);
//
//        }

    }
}