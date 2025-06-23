package array;

import java.util.Arrays;  

public class ArrayRotationCheck {

    static boolean areRotations(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
 }
  
        String str1 = Arrays.toString(arr1);
        String str2 = Arrays.toString(arr2);

        String combined = str1 + str1;

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
