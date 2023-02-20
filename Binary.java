import java.util.*;

public class Binary {
    public static void main(String[] args) {

        int arr[];
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter no.of elements in the array:");
        int n = obj.nextInt();
        arr = new int[n]; // array initialization

        System.out.println("Enter Array elemetns: ");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        System.out.println("Enter the key to search:");
        int key = obj.nextInt();

        Arrays.sort(arr);
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print("| " + arr[i]);
        }
        // creating left and right points to array
        int left = 0, ryt = n - 1;
        while (left <= ryt) {
            int mid = (left + ryt) / 2;

            if (arr[mid] == key) {
                // only gives first occurance of the key when data is replicated.
                System.out.println("\n Key found at index: " + mid);
                break;

            } else if (key < arr[mid]) {
                ryt = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (left > ryt) {
            System.out.println("Key not found in the give array. ");
        }

    }
}
