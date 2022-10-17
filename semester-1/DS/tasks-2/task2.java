import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int avg = 0;
            int sum = 0;
            System.out.println("please enter 3 numbers to calculate average and sum of theses:");
            for (int i = 1; i < 4; i++) {
                System.out.print("enter number (" + i + ") -> ");
                int num = input.nextInt();
                sum += num;
            }
            avg = sum / 3;
            System.out.println("average of your 3 numbers = " + avg);
            System.out.println("sum of your 3 numbers = " + sum);
        } catch (Exception error) {
            System.out.println("some error with input ( be careful you shold enter number not charcter) : " + error);
        }

        return;
    }
}
