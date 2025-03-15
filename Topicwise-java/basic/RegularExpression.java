import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("W3Schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3schools.com");
        boolean matchFound = matcher.find();

        if(matchFound){
            System.out.println("W3Schools have on the String");
        } else {
            System.out.println("Not Found");
        }
    }
}
