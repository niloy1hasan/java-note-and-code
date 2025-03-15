public class EnumPractice {

    enum Day{
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday
    }

    public static void main(String[] args) {
     
        for(Day i:Day.values()){
            System.out.println(i);
        }
        
    }
}
