import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);
        double a, b, operation;
        char operator;
        a = get.nextDouble();
        operator = get.next().charAt(0);
        b = get.nextDouble();

        if(operator=='+'){
            operation = a + b;
        } else if(operator=='-'){
            operation = a - b;
        } else if(operator=='*'){
            operation = a * b;
        } else {
            operation = a/b;
        }

        System.out.printf("%.2f %c %.2f = %.2f\n", a, operator, b, operation);

    }
}