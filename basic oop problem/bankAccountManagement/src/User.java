import java.util.Scanner;

public class User {
    String userName;
    String password;
    long accountNumber;
    double balance;

    public User(String userName,String password, long accountNumber){
        this.userName  = userName;
        this.password = password;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(double amount){
        if(amount>0){
            this.balance += amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            this.balance -= amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void checkBalance(){
        System.out.println("Current Balance: " + this.balance);
    }

    public void ChangePassword(String password){
        if(this.password.equals(password)){
            this.password = new Scanner(System.in).nextLine();
            System.out.println("Password change successfully");
        } else {
            System.out.println("given Wrong Password");
        }
    }
}
