import java.util.Scanner;

public class Q_six {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please entre number 1 => ");
    int num1 = input.nextInt();
    System.out.print("Please entre number 2 => ");
    int num2 = input.nextInt();

    input.close();

    if(num1 == num2)
    {
      System.out.println("These numbers are equal.");
    }else{
      int max = Math.max(num1, num2);
      System.out.println(max  + " is larger.");;
    }
  }
}
