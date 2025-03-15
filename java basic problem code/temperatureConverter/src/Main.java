import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float celsius = input.nextFloat();
        double fahrenheit = (celsius * (9/5.0)) + 32;
        String pattern = "##.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        System.out.println(celsius + "deg celsius = " + decimalFormat.format(fahrenheit) + "deg fahrenheit");
        //more easy format
        System.out.println(celsius + "deg celsius = " + new Formatter().format("%.2f", fahrenheit) + "deg fahrenheit");
    }
}