import java.util.Scanner;
import java.util.regex.*;

public class Math {
    private static boolean goodMath(String a) {
        Pattern pattern = Pattern.compile("\\([\\d+/*-]*\\)");
        Matcher matcher = pattern.matcher(a);

        do {

            a = matcher.replaceAll("");
            matcher = pattern.matcher(a);

        } while (matcher.find());


        return a.matches("[\\d+/*-]*");

    }


    public static void main(String []args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println(goodMath(scanner.nextLine()));

    }
}