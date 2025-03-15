import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int balance = 43245;

        int withdraw = input.nextInt();

        if(withdraw>balance){
            System.out.println("Your Account haven't enough balance to withdraw your given amount");
        } else if(withdraw>0){
            balance -= withdraw;
            System.out.println("Withdraw successfully\nCurrent Balance: " + balance);
        } else {
            System.out.println("Give a valid withdrawal amount");
        }
    }
}