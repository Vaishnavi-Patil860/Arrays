/*package array;

import java.util.Arrays;

public class SimpleProgram {
    
    public static void main(String[] args) {
    
        
                int[][] array = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
                };
        


    // New line after each row
    System.out.println(Arrays.deepToString(array));
}
}*/

//1D array impkementation----------
package array;

import java.util.Arrays;
//import java.util.Scanner;
import java.util.Scanner;

/*class array{

    public static void main(String[] args) {
      
    
     int []arr = new int[7];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[6] = 7;



        System.out.println(Arrays.toString(arr));
    }
 }*/


 class Array{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;



        System.out.println(Arrays.toString(arr));
        sc.close();
        
    }
 }




