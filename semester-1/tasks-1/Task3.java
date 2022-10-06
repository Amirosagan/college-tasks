import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number_1 = 0;
        int number_2 = 0;
        
        System.out.print("enter your First number => ");
        number_1 = input.nextInt();
        System.out.print("enter your First number => ");
        number_2 = input.nextInt();

        System.out.println("choose what you opration do you want:\n");
        System.out.println("1- num1+num2");
        System.out.println("2- num1*num2");
        System.out.println("3- num1%num2\n");
        System.out.print("enter your chose(1, 2, 3) => ");
        int key = input.nextInt();

        input.close();

        int ans = 0;

        switch (key) {
            case 1:
                ans = number_1+number_2;
                break;
            case 2:
                ans = number_1*number_2;
                break;
            case 3:
                ans = number_1%number_2;
                break;
            default:
                System.err.println("unhandled choose :(");
                return;
        }

        System.out.println("this you output for your opiration you chosed => "+ ans);
        return;
    }
}

/*
 * Write java program that accept numbers from
 * the user and check choice:
 * – choice=2 //do num1*num2
 * – choice=3 //do num1%num2
 * – choice=1 //do num1+num2
 */
