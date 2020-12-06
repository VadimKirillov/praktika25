import java.util.Scanner;

public class Ip{
    public static boolean actualIP (String a) {
        String ip = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";


        if (a.matches(ip)) {
            return true;
        }
        else {
            return false;
        }

    }


    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(actualIP(scanner.nextLine()));
    }


}