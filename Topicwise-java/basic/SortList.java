import java.util.LinkedList;
import java.util.Scanner;

public class SortList {
   
 public static void main(String[] args){

    Scanner input = new Scanner(System.in);


    LinkedList<Integer> list = new LinkedList<Integer>();
    list.add(12);
    list.add(43);
    list.add(433);
    list.add(83);
    list.add(51);
    int arr[] = {281, 59, 151, 339, 278, 684, 953, 639, 619, 519, 202, 615, 1, 265, 185, 255, 597, 4, 964, 775, 217, 61, 97, 323, 510, 287, 174, 896, 462, 503, 917, 925, 804, 644, 476, 201, 310, 756, 57, 833, 560, 8, 768, 11, 721, 395, 522, 585, 94, 813};

    for(int i=0; i<arr.length; i++)
       list.add(arr[i]);
    
    for(int i=0; i<list.size(); i++)
      System.out.print(list.get(i) + " ");
    
    list.sort(null);
    System.out.println("\n");

    for(int i=0; i<list.size(); i++)
     System.out.println(list.get(i));
 }
}
