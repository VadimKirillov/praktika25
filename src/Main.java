import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String []args){

        String a = "300bucks";
        boolean T = Pattern.matches("300bucks", a);
        System.out.println(T);


        Pattern pattern = Pattern.compile("300(\\w*)");
        Matcher matcher = pattern.matcher("300bucks and 400bucks");

        T = matcher.matches();
        System.out.println(T);


        String b = matcher.replaceAll("500bucks");
        System.out.println(b);

    }
}
