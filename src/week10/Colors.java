package week10;



    import java.util.ArrayList;
import java.util.List;

    public class Colors {
        public static void main(String[] args) {
            ArrayList<String> colors = new ArrayList<>(List.of("brown","green","yellow","pink","white","silver","purple"));
            for (int i = 0; i < colors.size(); i++) {
                System.out.println(colors.get(i));
            }
            //remove colors that are less than 6 characters:
            colors.removeIf(color -> color.length() < 6);
            System.out.println("colors = " + colors);

            colors.forEach(color -> System.out.println(color.toUpperCase()));
        }
    }

