public class stringPractice {
    public static void main(String[] args){
        System.out.println("java string");
        
        String firstName = "Niloy";
        String lastName = "Hasan";
        String fullName = firstName + " " + lastName;
        System.out.println("User Name: " + fullName.toUpperCase());
        System.out.println("Name's Character amount: " + fullName.length());
        System.out.println("Position of \"oy\": " + fullName.indexOf("oy"));

        String wifeFirstName = "Mukta ";
        String wifeLastName = "Hasan";
        String wifeFullName = wifeFirstName.concat(wifeLastName);
        System.out.println(wifeFullName);

    }
}
