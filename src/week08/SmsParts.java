package week08;

public class SmsParts {
    public static void main(String[] args) {
        String sms = "Sender: <Mike Smith>. From Number: [+165465456]. Message: {Arrays in Java}";

        String sender, number,message;

        sender = sms.substring(sms.indexOf("<") + 1, sms.indexOf(">"));
        System.out.println("sender = " + sender);

        number = sms.substring(sms.indexOf("[") + 1, sms.indexOf("]"));
        System.out.println("number = " + number);

        message = sms.substring(sms.indexOf("{") + 1, sms.indexOf("}"));
        System.out.println("message = " + message);
    }
}


























































