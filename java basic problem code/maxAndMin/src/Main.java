public class Main{
    public static void main(String[] args){
        int[] arr = {52,423, 53,32, 82, 843, 18, 83, 91, 72, 84, 12, 782, 781,42, 872, 71, 91, 83};

        int max, min;
        max=min=arr[0];

        for(int i:arr){
            if(max<i){
                max = i;
            }

            if(min>i){
                min = i;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}