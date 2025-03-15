import java.util.Scanner;

public class Main{
    static Scanner get = new Scanner(System.in);
    public void getArray(int[][] arr, int row, int column){
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                arr[i][j] = get.nextInt();
            }
        }
    }

    private void showArray(int[][] arr, int row, int column){
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void arraySum(int[][] arr1, int[][] arr2, int[][] sum){
        int row = arr1.length;
        int column = arr1[0].length;

        if(row!= arr2.length && column!=arr2[0].length){
            System.out.println("Summation is not possible, row and column not matched");
            return;
        }

        for(int i=0;i<row; i++){
            for(int j=0; j<column; j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
    }

    public static void main(String[] args){
        Main array = new Main();

        int[][] matrix1;
        int[][] matrix2;
        int[][] sum;
        int row, column;

        row = get.nextInt();
        column = get.nextInt();
        matrix1 = new int[row][column];
        matrix2 = new int[row][column];
        sum = new int[row][column];
        array.getArray(matrix1,row, column);
        array.getArray(matrix2,row, column);
        array.arraySum(matrix1,matrix2, sum);
        array.showArray(sum, row, column);

        get.close();
    }
}