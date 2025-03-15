import java.util.Scanner;
import java.util.regex.Pattern;

public class Main{
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);
        String text = get.nextLine();
        String pattern = "[^a-zA-Z0-9']+";
        text = text.replaceAll(pattern, " ").trim();

        String[] word = text.isEmpty() ? new String[0] : text.split("\\s+");
        System.out.println(word.length);
    }
}