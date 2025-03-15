import java.util.Scanner;
public class userInput {
    public static void main(String[] args){
        System.out.println("Java User input");

        try(Scanner input = new Scanner(System.in)) {
        int number = input.nextInt();
        System.out.println("user input number is: " + number);
        }
    }
}
