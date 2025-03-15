public class Main{
    public static void main(String[] args){
        int[] studentGrade = {53, 83, 82, 94, 43, 65, 85, 73, 78, 58};
        int a, b, c;
        a=b=c=0;

        for(int i: studentGrade){
            if(i>=80){
                a++;
            } else if(i>=60){
                b++;
            } else {
                c++;
            }
        }

        System.out.println("A : " + a);
        System.out.println("B : " + b);
        System.out.println("C : " + c);


    }
}