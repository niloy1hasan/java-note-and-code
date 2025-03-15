import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);
        long number = get.nextLong();
        long reverseNumber = 0;
        do{
            reverseNumber = reverseNumber*10 + number%10;
            number /= 10;
        } while(number>0);

        System.out.println(reverseNumber);

    }
}