package week2.variables;

public class CharType {
    public static void main(String[] args) {
        //You are assigning each letter of "Java" into separate char variables:
        char first = 'J';
        char second = 'a';
        char third = 118;
        char fourth = 97;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(first +"\n"+ second +"\n"+ third +"\n"+ fourth);

        //You represent game levels using characters: E(Easy), M(Medium), H(Hard)
        //char levelOne = 'E', levelTwo = 'M', levelThree = 72;
        char levelOne = 'E';
        char levelTwo = 'M';
        char levelThree = 72;
        System.out.println("Level One: " + levelOne);
        System.out.println("Level Two: " + levelTwo);
        System.out.println("Level Three: " + levelThree);

        //Let's store and display different currency symbols using Unicode. $, €:
        char dollar = '\u0024';
        char euro = '\u20AC';
        System.out.println(dollar);
        System.out.println(euro);
    }
}
