import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);
        String text = get.nextLine();
        int length = text.length();
        int i=0;
        boolean isPalin = true;

        while(i<=length) {
            if (text.charAt(i) != text.charAt(length-1)) {
                isPalin = false;
                break;
            }
            i++;
            length--;
        }
        System.out.println(isPalin?"Palindrome": "not palindrome");
    }
}