import java.util.Scanner;

public class Q_seven {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please entre you pounds to convert to kilograms => ");
    double pounds = input.nextDouble();
    input.close();
    double kilograms = pounds * 0.454;

    System.out.println(pounds + " pounds = " + kilograms + " kilograms");

  }
  
}