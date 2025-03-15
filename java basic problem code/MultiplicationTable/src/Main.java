import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);
        int number = get.nextInt();
        int i=1;

        while(i<=10){
            System.out.println(number + " * " + i + " = " + i*number);
            i++;
        }
        
    }
}