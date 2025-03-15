import java.util.Scanner;

public class simpleGrettings{
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            String name = input.nextLine();
            System.out.println("Hello " + name);
        }
    }
}