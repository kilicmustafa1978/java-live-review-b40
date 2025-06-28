package week10;

public class WrapperClasses {
    public static void main(String[] args) {

        String str1="123", str2="40.87";
        int n1=Integer.parseInt(str1);
        double n2=Double.parseDouble(str2);
        n1+=10;
        n2+=10;
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        System.out.println("---------------------------------");
        
        String value="true";
        
        boolean bl=Boolean.parseBoolean(value);
        System.out.println("bl = " + bl);

        System.out.println("-------------------------");

        System.out.println("Min int = " + Integer.MIN_VALUE);
        System.out.println("Max int = " + Integer.MAX_VALUE);

        System.out.println("Min byte = " + Byte.MIN_VALUE);
        System.out.println("Max byte = " + Byte.MAX_VALUE);

        System.out.println("Min double = " + Double.MIN_VALUE);
        System.out.println("Max double = " + Double.MAX_VALUE);
boolean result=55>10;
if(result==Boolean.TRUE){
    System.out.println("It is True");
}

        System.out.println("-----------------------------------------------");
        //autoboxing& unboxing
        //autoboxing primitive classtan wrapper classa
        int x=10;
        Integer num=x;
        System.out.println("num = " + num);

        //unboxing wrapper class tan primitive class a
        Integer points=120;
        int i=points;
        System.out.println("i = " + i);
        System.out.println("--------------------------------------------");


        char ch='A';
        System.out.println("isLetter = " + Character.isLetter(ch));
        System.out.println("isUpperCase = " + Character.isUpperCase(ch));

        char d='8';

        System.out.println("isDigit = " + Character.isDigit(d));
        System.out.println("A isDigit = " + Character.isDigit(ch));

        System.out.println("-----------------------------------------");

        String name="bob";
        if(Character.isUpperCase(name.charAt(0))){
            System.out.println("Format check passed");
        }else{
            System.out.println("Format check failed");
        }

    }
}
