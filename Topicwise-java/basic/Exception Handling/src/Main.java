import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws CustomException {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int div;

        try{
            div = 5/n;
            System.out.println(div);
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("occur an Arithmetic exception");
            //throw new ArithmeticException("error on 16 no line");
            throw new CustomException("error");
        } finally {
            System.out.println("end the program");
        }
    }
}