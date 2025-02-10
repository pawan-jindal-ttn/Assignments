import java.util.Scanner;

public class Ques4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of cols: ");
        int cols = input.nextInt();

        int[] row_sum = new int[rows];
        int[] col_sum = new int[cols];

        // Defining and inputting in matrix
        int[][] mat = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = input.nextInt();
            }
        }

        // Calculating row_sum
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++) {
                row_sum[i] += mat[i][j];
            }
        }

        // Calculating col_sum
        for (int j = 0; j < cols; j++){
            for (int i = 0; i < rows; i++){
                col_sum[j] += mat[i][j];
            }
        }

        // Outputting row sums
        System.out.println("Row sums:");
        for (int i = 0; i < rows; i++){
            System.out.print(row_sum[i] + " ");
        }

        // Outputting cols sums
        System.out.println("\nCol sums:");
        for (int i = 0; i < cols; i++){
            System.out.print(col_sum[i] + " ");
        }
    }
}

