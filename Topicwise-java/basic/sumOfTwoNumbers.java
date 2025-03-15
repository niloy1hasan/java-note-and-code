import java.util.Scanner;

public class sumOfTwoNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Type A: ");
        a = input.nextInt();
        System.out.print("Type B: ");
        b = input.nextInt();
        System.out.println("A + B = " + (a+b));
        input.close();
    }
}
