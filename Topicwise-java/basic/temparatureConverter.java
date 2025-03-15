import java.util.Scanner;
public class temparatureConverter {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Choice the Converter:\n1.Celcius to fahrenheit\n2.fahrenheit to celcius\n");

            byte choice = input.nextByte();
            float celcius, fahrenheit;

            if(choice==1){
                celcius = input.nextFloat();
                fahrenheit = celcius/((float)5/9) + 32;
                System.out.println(celcius + " celcius = " + fahrenheit + " Fahrenheit");
            } else if(choice==2){
                fahrenheit = input.nextFloat();
                celcius = (fahrenheit-32)*((float)5/9);
                System.out.println( fahrenheit + "Fahrenheit = " + celcius + " Celcius");
            } else 
             System.out.println("Wrong Choice");

        }
    }
}
