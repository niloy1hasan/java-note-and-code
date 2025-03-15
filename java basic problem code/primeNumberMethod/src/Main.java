import java.util.Scanner;

public class Main{
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if (n<=3){
            return true;
        }
        if(n%2==0 || n%5==0){
            return false;
        }

        for(int i=5; i*i<=n; i+=6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        Scanner get = new Scanner(System.in);
        int n = get.nextInt();
        System.out.println("is Prime? : " + isPrime(n));
    }
}