import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[][] matrix = new int[5][3];
            int sum = 0;
            System.out.println("please entre a values of your matrix and i will get you sum of this matrix");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[j].length; j++) {
                    System.out.print("entre your number in matrix (" + i + " , "  + j + ") :");
                    int num = input.nextInt();
                    sum += num;
                }
            }
            System.out.println("the sum of your matrix = " + sum);
        }catch (Exception e) {
            System.out.println("some error in input (be careful should entre number not charcter) : " +  e);
        }
        return;
    }
}





/*
 * Write a program that build a matrix of 5rows
 * ,3column,ask the user to entre values of
 * matrix and print the sum of matrix item.
 */