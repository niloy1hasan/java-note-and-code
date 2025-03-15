import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args){
        
        HashSet<String> Name = new HashSet<String>();

        Name.add("Niloy");
        Name.add("Mukta");
        Name.add("Irfan");
        Name.add("Elham");
        Name.add("Tamanna");
        Name.add("Mukta");

        for(String i: Name){
            System.out.println(i);
        }

    }
}
