import java.util.Scanner;
import java.lang.*;

public class Fabonacci {
    public static void main(String[] args) {
        int f0 = 0, f1 = 1, f2, sum = 0;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = obj.nextInt();

        System.out.println(" " + f0 + " " + f1);
        for (int i = 1; i <= n; i++) {
            f2 = f0 + f1;
            System.out.print(" " + f2);
            // if (f2 % 2 == 0) {
            // sum += f2;
            // }
            f0 = f1;
            f1 = f2;
        }
        // System.out.println("Sum of even Fabonicci series: " + sum); to get sum of even numbers in fabinacci Series
        
        

    }
}
