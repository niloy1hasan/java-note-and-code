import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Type A number: ");
            int a = input.nextInt();
            if(a==0)
              System.out.println(a + " is not a even nor is odd");
            else if(a%2==0){
                System.out.println(a + " is a Even Number");
            } else 
               System.out.println(a + " is a Odd Number");
        }
    }
    
}
