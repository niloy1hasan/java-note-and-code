import java.util.Scanner;

public class Main{
    private static void menu(){
        System.out.println("Choose a Option\n");
        System.out.println("1. Create Account");
        System.out.println("2. Log In");
        System.out.println("0. Exit");
    }
    public static void main(String[] args){
        BankManagement bank = new BankManagement();
        Scanner get = new Scanner(System.in);
        int choose;
        do {
            menu();
            choose = get.nextInt();
            get.nextLine();

            switch (choose){
                case 1:
                    System.out.print("User Name: ");
                    String userName = get.nextLine();
                    System.out.print("Password: ");
                    String password = get.nextLine();
                    bank.createAccount(userName, password);
                    break;
                case 2:
                    System.out.print("Account Number: ");
                    long number = get.nextLong();
                    bank.logIn(number);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Wrong Input");
            }

        } while(choose!=0);


    }
}