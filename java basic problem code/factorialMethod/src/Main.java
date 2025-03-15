import java.util.Scanner;

public class Main{
    static long fact(int n){
        long factorial = 1;

        for(int i=1; i<=n; i++){
            factorial *= i;
        }


     return factorial;
    }

    public static void main(String[] args){
        Scanner get = new Scanner(System.in);
        int n = get.nextInt();

        System.out.println(fact(n));

    }
}