import java.util.*;

class BubbleSort {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no.of elements in array:");
        int n = obj.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements:" + n);

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }

    }
}