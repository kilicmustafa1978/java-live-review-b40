package ExtraPractice.day02;

public class StringMethods {
    public static void main(String[] args) {
        System.out.println(firstTwo("java"));
        System.out.println(firstTwo("hi"));
        System.out.println(firstTwo("Q"));
        System.out.println(firstTwo("1234"));

        System.out.println("------reverseString-------");
        String str = reverseString("java");
        System.out.println("str = " + str);

        System.out.println("Strong = " + reverseString("Strong"));
        System.out.println("AB = " + reverseString("AB"));
        System.out.println("J = " + reverseString("J"));
        System.out.println(reverseString(""));

        System.out.println("------Palindrome()-------");
        System.out.println("Race Car = " + isPalindromeString("Race Car"));
        System.out.println("nursesrun= " + isPalindromeString("  Nurses  RUN "));
        System.out.println("level= " + isPalindromeString("level"));
        System.out.println("Java = " + isPalindromeString("Java"));
    }

    /*
    3. method isPalindromeString(String str) accepts a String and returns boolean if str is palindrome
    -> Ignore empty spaces and case differences
    isPalindromeString(" B ob ") -> true
     */
    public static boolean isPalindromeString(String str) {
        str = str.replace(" ","").toLowerCase();
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return str.equals(reversed);
    }

    //2. method reverseString(String str) accepts a String and returns reversed String
    // reverseString("java") => "avaj"
    public static String reverseString(String str) {
        String reversed = "";
        for(int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    /*
    1. method firstTwo(String word) accepts a String and returns first 2 characters of String
    -> if string is less than 2 return string as is
    firstTwo("java") -> "ja"
    firstTwo("hi") -> "hi"
    firstTwo("Q") -> "Q"
     */
    public static String firstTwo(String word) {
        if (word.length() < 2) {
            return word;
        }
        return word.substring(0, 2);
    }
}
