package week09;

        public class ReverseSentence {
            public static void main(String[] args) {
                String sentence = "java is much fun";
                String[] words = sentence.split(" ");
                System.out.println("number of words = " + words.length);

                String reversed = "";
                for (int i = words.length - 1; i >= 0; i--) {
                    reversed += words[i] + " ";
                }
                System.out.println("reversed = " + reversed.trim());

                System.out.println(reverse("Today is Sunday Match 23"));
                System.out.println(reverse("java arrays are fun"));
            }

            public static String reverse(String sentence) {
                //split by space into words
                String[] allWords = sentence.split(" ");
                String reversed = "";

                for (int i = allWords.length - 1; i >= 0; i--) {
                    reversed += allWords[i] + " ";
                }

                return reversed.trim();
            }

        }


