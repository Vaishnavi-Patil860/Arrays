import java.util.Arrays;

public class TwoDArrayUsingDoWhile {

    public static void main(String[] args) {
     int [][] arr = {{1},{2,3},{4,5,6},{7,8,9,10},{11,12,13,14,15},{16,17,18,19,20,21}};
       
     //forward traversing
     int i=0;
     do{
        System.out.println(Arrays.toString(arr[i++]));
     }

     while(i<arr.length);
        System.out.println();

       //backward traversing
      i = arr.length - 1;
       do{
          System.out.println(Arrays.toString(arr[i--]));
      }
        while(i>0);
    }
}
