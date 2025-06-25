import java.util.Arrays;

public class TwoDArrayUsingForEach {
    public static void main(String[] args) {
                int [][] arr = {{1},{2,3},{4,5,6},{7,8,9,10},{11,12,13,14,15},{16,17,18,19,20,21}};


        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
