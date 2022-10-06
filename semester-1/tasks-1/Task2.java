import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter your number to cheak if it odd or even (positive) => ");
        number = input.nextInt();
        input.close();
        
        if(number >= 0){
            if(number % 2 == 0){
                System.out.println("your number is even");
            }else{
                System.out.println("your number is odd");
            }
        }else{
            System.out.println("your number shold be a positive number");
        }

        return;
    }
}


/*
 * Write program that accept an integer number
 * from user in case these number is positive
 * check and print number is even or odd.
 */