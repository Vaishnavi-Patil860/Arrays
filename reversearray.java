package array;

import java.util.Scanner;

public class reversearray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse the array
        reverseArray(arr);

        // Print the reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    // Function to reverse an array
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
