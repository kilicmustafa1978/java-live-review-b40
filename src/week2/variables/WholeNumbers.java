package week2.variables;

public class WholeNumbers {
    public static void main(String[] args) {
        //-declare variable students
        int students;
        //-assign 128 to students variable. Initialize students with 128
        students = 128;

        System.out.println("students");
        System.out.println(students);//128

        //-change value of students variable to 150 then print again
        students = 150;
        System.out.println(students); //150

        //-declare + initialize int variable teachers with value 5
        int teachers = 5;
        System.out.println(teachers);
        teachers = 15;
        System.out.println(teachers);

        System.out.println("-----------------");

        //byte -> short -> int -> distance
        byte age = 25;
        short year = 2025;
        int population = 100_000;
        long distance = 15000000000L;

        System.out.println(age);
        System.out.println(year);
        System.out.println(population);
        System.out.println(distance);

        System.out.println("---------------");
        /*
        -Declare long variable originalTicketNumber with value 9876543210L
        -Declare long backupTicketNumber and assign value of originalTicketNumber
         */
        long originalTicketNumber = 9876543210L;
        long backupTicketNumber = originalTicketNumber;

        System.out.println(originalTicketNumber);
        System.out.println(backupTicketNumber);

        System.out.println("---------------");

        int count = 31;
        int bananas = count;

        System.out.println(count);
        System.out.println(bananas);
        System.out.println("count of bananas = " + bananas);
    }
}
