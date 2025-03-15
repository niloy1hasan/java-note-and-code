import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        byte age = input.nextByte();

        if(age>=18){
            System.out.println("Eligible for Voting, Age is " + age);
        } else {
            System.out.println("Not eligible for voting, Age is " + age);
        }
    }
}