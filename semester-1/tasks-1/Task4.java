import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your 6 students grades:");
        
        int sum = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("-- grade of student(" + i + ") => ");
            sum += input.nextInt();
        }

        input.close();

        int ans = sum / 6;

        System.out.println("your average grade for the 6 students = " + ans);

        return;
    }
}
/*
 * Write a program that calculates and print out
 * the average grade for 6 students.
 */