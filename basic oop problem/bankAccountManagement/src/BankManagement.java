import java.util.ArrayList;
import java.util.Scanner;

public class BankManagement {
    private ArrayList<User> customer = new ArrayList<>();
    private static long accountNumber = 101;
    Scanner get = new Scanner(System.in);

    public void createAccount(String userName,String password){
        customer.add(new User(userName,password,accountNumber));
        System.out.println("Your Account Number is: " + accountNumber + "\n");
        accountNumber++;
    }

    private void menu(){
        System.out.println("Choose a Option\n");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Change Password");
        System.out.println("0. Exit");

    }

    public void logIn(long accountNumber){
        boolean haveAccount = false;
        int id = 0;
        for (User user: customer){
            if (user.getAccountNumber()==accountNumber){
                haveAccount = true;
                id = customer.indexOf(user);
                break;
            }
        }

        if (!haveAccount){
            return;
        }
        int attempt = 1;

        String pass;
        do {
            if(attempt>3){
                System.out.println("Your account is locked");
                return;
            } else {
                System.out.print("Password: ");
                pass = get.nextLine();
            }
            attempt++;
        } while (!customer.get(id).getPassword().equals(pass));


        boolean notExit = true;
        do{
            menu();
            int choose = get.nextInt();
            double amount;
            switch (choose){
                case 1:
                     amount = get.nextDouble();
                    customer.get(id).deposit(amount);
                    break;
                case 2:
                    amount = get.nextDouble();
                    customer.get(id).withdraw(amount);
                    break;
                case 3:
                    customer.get(id).checkBalance();
                    break;
                case 4:
                    String currentPassword = get.nextLine();
                    customer.get(id).ChangePassword(currentPassword);
                    break;
                case 0:
                    notExit = false;
                    break;
                default:
                    System.out.println("Wrong Choice");
            }

        } while(notExit);


    }
}
