package week09;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(anagram("Save", "Vase"));//büyük harfle başlarsa false veriri
        System.out.println(anagram("SİLENT", "listen"));
        System.out.println(anagram("hello", "java8"));
    }

    public static boolean anagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        /*
        act, cat
        act==act
         */
        //convert String to char arrays
        char[] aChars = a.toLowerCase().toCharArray();// büyük kküçük harfi önemsemez
        char[] bChars = b.toLowerCase().toCharArray();
        Arrays.sort(aChars);
        Arrays.sort(bChars);

        //compare if equals
        return Arrays.equals(aChars, bChars);
    }
}


