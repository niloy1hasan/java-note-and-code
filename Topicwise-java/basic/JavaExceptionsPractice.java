public class JavaExceptionsPractice {

    

    public static void main(String[] args){

        int arr[] = {1, 2,3 };

        try{
        System.out.println(arr[2]);
        } catch(Exception e){
            System.out.println("Something is wrong");
        } finally{
            System.out.println("program completed");
        }

        int age  = 15;

        access(age);
    }

    public static void access(int age){
        if(age<18){
            throw new ArithmeticException("Access denied - you must be atleast 18 years old");
        } else {
            System.out.println("Access granted");
        }
    }
}
