import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int width =0;
        int height = 0;

        System.out.print("Entre your Rectangle width (cm) => ");
        width = input.nextInt();
        System.out.print("Entre your Rectangle height (cm) => ");
        height = input.nextInt();

        input.close();

        System.out.println("your Rectangle area = " + (width * height)+ " (cm)");
        
        return;
    }
    
}

/* 
 * Write java code to accept the width and height of
 * rectangle from the user and calculate the area
*/
