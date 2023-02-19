
import java.util.Scanner;

public class Quardatics {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(" Enter a,b,c Values");
        double a = obj.nextDouble();
        double b = obj.nextDouble();
        double c = obj.nextDouble();
        double root1, root2;

        // calculate the d (b2 - 4ac)

        double d = b * b - 4 * a * c;

        // check if d is greater than 0

        if (d > 0) {

            // two real and distinct roots

            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("\n root1:" + root1 + "\n root2 :" + root2);
        }

        // check if d is equal to 0

        else if (d == 0) {

            // two real and equal roots
            // d is equal to 0
            // so -b + 0 == -b

            root1 = root2 = -b / (2 * a);
            System.out.println("\n Root1 = Root2 = " + root1);
        }

        // if d is less than zero

        else {

            // roots are complex number and distinct

            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-d) / (2 * a);
            System.out.println("\n root1 = " + real + "+" + imaginary);
            System.out.println("\n root2 = " + real + "-" + imaginary);
        }

    }
}
