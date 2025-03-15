import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);

        System.out.print("Product Price: ");
        float price = get.nextFloat();
        double finalPrice = (price>=500)? (price - price*0.07) : price;
        System.out.println("price : " + finalPrice +  ((price>=500)? "\ndiscount: 7%": ""));
    }
}