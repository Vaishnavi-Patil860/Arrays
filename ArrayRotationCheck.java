package array;

import java.util.Arrays;  

public class ArrayRotationCheck {
    // Function to check if arr2 is a rotation of arr1
    static boolean areRotations(int[] arr1, int[] arr2) {
        // Check if lengths are different
        if (arr1.length != arr2.length) {
            return false;
        }

        // Convert arrays to string representation
        String str1 = Arrays.toString(arr1);
        String str2 = Arrays.toString(arr2);

        // Create a concatenated string of arr1
        String combined = str1 + str1;

        // Check if arr2 exists within combined string
        return combined.contains(str2);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 1, 2};

        if (areRotations(arr1, arr2)) {
            System.out.println("The arrays are rotations of each other.");
        } else {
            System.out.println("The arrays are NOT rotations of each other.");
        }
    
    }

}
