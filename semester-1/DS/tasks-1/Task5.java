import java.util.Scanner;

public class Task5 {

    public static int cheak_odd_even(int number){
        if(number >= 0){
            if(number % 2 == 0){
                return 0;
            }else{
                return 1;
            }
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum_even = 0;
        int sum_odd = 0;
        System.out.println("enter your 10 numbers: ");

        for (int i = 1; i <= 10; i++) {
            System.out.print("-- number(" + i + ") => ");
            int num = input.nextInt();
            int cheaker = cheak_odd_even(num);
            switch (cheaker) {
                case 0:
                    sum_even += num;
                    break;
                case 1:
                    sum_odd += num;
                    break;
                case -1:
                    System.out.println("\n !!!! your number shold be a positive number !!!! \n");
                    i -= 1;
                    break;
            }
            
        }

        input.close();

        System.out.println("your sum of even nums = " + sum_even + "\n");
        System.out.println("your sum of odd nums = " + sum_odd);
        return;
    }
}
/*
 * Write a program that accept 10numbers from the user and
 * print out sum of even numbers and sum of odd numbers.
 */