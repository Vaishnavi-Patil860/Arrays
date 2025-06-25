import java.util.Arrays;

public class TwoDArrayUsingWhile {
    
    public static void main(String[] args) {
        int [][] arr = {{1},{2,3},{4,5,6},{7,8,9,10},{11,12,13,14,15},{16,17,18,19,20,21}};
 
        //forward traversing
        int i = 0;
        while(i < arr.length){
            System.out.println(Arrays.toString(arr[i]));
            i++;
        }
            System.out.println();

            //backward traversing
         i = arr.length -1;
        while( i >= 0){
            System.out.println(Arrays.toString(arr[i]));
            i--;
        }
    }
}
