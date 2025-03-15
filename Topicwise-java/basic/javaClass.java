public class javaClass {
    int x = 10;
    public static void main(String[] args){
        javaClass jc = new javaClass();
        System.out.println("X = " + jc.x);

        class2 cl2 = new class2();
        System.out.println("y = " + cl2.num);

        Person p = new Person();
        p.firstName = "Niloy";
        p.lastName = "Hasan";
        p.requestName();
        System.out.println("Username: " + p.getName());
    }
}
