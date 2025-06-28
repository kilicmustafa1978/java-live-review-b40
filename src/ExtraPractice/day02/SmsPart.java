package ExtraPractice.day02;

public class SmsPart {
    public static void main(String[] args) {
        String sms = "Sender: <John Doe>. From Number: [+11234567485]. Message: {String are fun!}";
        String sender, number, message;
        sender = sms.substring(sms.indexOf('<')+1, sms.indexOf('>'));
        System.out.println("sender = " + sender);

        int startNumber = sms.indexOf("[")+1;
        int endNumber = sms.indexOf("]");
        number = sms.substring(startNumber, endNumber);
        System.out.println("number = " + number);

        message = sms.substring(sms.indexOf("{")+1, sms.indexOf("}"));
        System.out.println("message = " + message);
        //0   4
        String str = "JavaStrings";
        System.out.println(str.substring(0, 4));
    }
}
