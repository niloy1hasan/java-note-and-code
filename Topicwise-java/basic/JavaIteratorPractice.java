import java.util.ArrayList;
import java.util.Iterator;


public class JavaIteratorPractice {
    public static void main(String[] args){

        ArrayList<String> name = new ArrayList<String>();
        name.add("Niloy");
        name.add("Mukta");
        name.add("Tamanna");
        name.add("Irfan");
        name.add("Elham");
        name.add("Hasan");


        Iterator<String> it = name.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
            if(it.next()=="Hasan")
              it.remove();
        }

        System.out.println(name);

    }
}
