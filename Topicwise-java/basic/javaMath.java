public class javaMath {
    public static void main(String[] args){
        System.out.println("java Math class's methods");
        byte a = 43;
        byte b = 12;
        System.out.println("Maximum number between a and b: " + Math.max(a, b));
        System.out.println("Minimum number between a and b: " + Math.min(a, b));
        double c = (double) Math.sqrt(340);
        System.out.println("root value of 340: " + c);
        System.out.println("absolute value of 340's root value: " + Math.abs(c));
        System.out.println("Random number: " + (int)(Math.random() * 10));
    }
}
