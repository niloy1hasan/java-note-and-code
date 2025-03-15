import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {

    static void choiceList(){
        System.out.println("1. Add number");
        System.out.println("2. remove number");
        System.out.println("3. see all numbers");
        System.out.println("4. see a number on a index");
        System.out.println("5. Total elements of Arraylist");
        System.out.print("Type your Choice: ");
    }

    public static void main(String[] args){
    ArrayList<Integer> number = new ArrayList<Integer>();
    Scanner input = new Scanner(System.in);
    int choice;
    int num;
    int index;
    do{ 
        choiceList();
        choice = input.nextInt();

        switch(choice){
            case 1:
            System.out.print("Type the number you want to add: ");
            num = input.nextInt();
            number.add(num);
            break;
            
            case 2:
            System.out.print("Type the index of number you want to remove: ");
            index = input.nextInt();
            number.remove(index);
            break;

            case 3:
            System.out.print("All number of ArrayList is: ");
            for(int i: number){
                System.out.print(i + " ");
            }
            System.out.println("\n");
            break;

            case 4:
            System.out.print("Type the index of number you want to see: ");
            index = input.nextInt();
            System.out.println("on index " + index + "number is: " + number.get(index));
            break;

            case 5:
            System.out.println("Total Element's of arraylist: " + number.size());
            break;

            case 0:
            System.out.println("Thank you for use my program");
            break;

            default:
            System.out.println("wrong input, again try");
        }

        }  while(choice!=0);
    }
}

