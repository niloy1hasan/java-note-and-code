import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);
        int n = get.nextInt();
        long odd, even;
        odd=even=0;

        for(int i=1; i<=n; i++){
            if(i%2==0){
                even+=i;
            } else {
                odd+=i;
            }
        }

        System.out.println("Summation of Even: " + even);
        System.out.println("Summation of Odd: " + odd);
    }
}