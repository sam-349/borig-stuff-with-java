import java.lang.*;
import java.util.Scanner;

class Prime {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n = obj.nextInt();
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(" " + i);
            }

        }
    }

}