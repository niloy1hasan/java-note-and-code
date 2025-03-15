import java.util.Scanner;
import java.util.regex.Pattern;

public class Main{
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);
        char letter = get.next(".").charAt(0);
        Pattern vowel = Pattern.compile("[aeiou]");
        Pattern constant = Pattern.compile("[a-z]");
        if(vowel.matcher(String.valueOf(letter)).matches()){
            System.out.println("Vowel");
        } else if(constant.matcher(String.valueOf(letter)).matches()){
            System.out.println("Constant");
        } else if(Pattern.compile("[0-9]").matcher(String.valueOf(letter)).matches()){
            System.out.println("Number");
        } else if(Pattern.compile("[,.<>?!@#$%^&*|:;]").matcher(String.valueOf(letter)).matches()){
            System.out.println("Special");
        }

    }
}