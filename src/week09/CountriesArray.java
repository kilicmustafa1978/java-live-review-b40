package week09;

public class CountriesArray {
    public static void main(String[] args) {
        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Portugal", "Philippines",
                "Armenia", "Colombia", "Honduras", "Indonesia", "United States"
        };
        //- Find and print all the first and last character
        for (String country : countries) {
            System.out.println(country.charAt(0) + "" + country.charAt(country.length() - 1));
        }
        System.out.println("------------------------------------------");

        for (String country : countries) {
            if (country.charAt(0) == 'C') {// veya .startsWidth("C")
                System.out.println(country);
            }
        }
            System.out.println("-----------------------------------------");
            for (String country : countries) {
                if (country.endsWith("s")) {
                    System.out.println(country);
                }

            }
            System.out.println("-----------------------------------------");
            String longest=countries[0];
            String smallest=countries[0];
            for(String eachCountry : countries) {
                if(eachCountry.length()>longest.length()) {
                    longest=eachCountry;
                }
                if(eachCountry.length()<smallest.length()) {
                    smallest=eachCountry;
                }
            }
        System.out.println("longest = "+longest);
            System.out.println("smallest = "+smallest);
        }
    }

