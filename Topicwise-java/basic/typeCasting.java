public class typeCasting {
    public static void main(String[] args){
        System.out.println("Java Type Casting");
        System.out.println("Widening Casting:");
        int number = 54342;
        double castNumber = number;
        System.out.println(number);
        System.out.println(castNumber);

        System.out.println("\nNarrowing casting: ");
        double num = 4544234.342423d;
        int narrowcast = (int) num;
        System.out.println(narrowcast);
    }
}
