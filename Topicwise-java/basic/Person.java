public class Person {
    String firstName;
    String lastName;

    String getName(){
        return firstName + " " + lastName;
    }

    static void requestName(){
        System.out.println("Type your first Name:");
    }
}
