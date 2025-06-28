package week2.variables;

public class Today {

    public static void main(String[] args) {
        //Let's assign today's date details into variables:
        int year = 2025;
        String month = "May";
        byte day = 3;
        String weekDay = "Saturday";
        int hour = 3;
        int minute = 30;
        System.out.println("year = " + year);
        System.out.println("month = " + month);
        System.out.println("day = " + day);
        System.out.println("weekDay = " + weekDay);//soutv
        System.out.println("hour = " + hour);
        System.out.println("minute = " + minute);

        //"Saturday, May 3, 2025 - 3:30 PM EST"
        System.out.println(weekDay + ", " + month +" "+ day +", "+ year +" - "+ hour +":"+ minute + " PM EST");
    }
}
