package array;

public class ArrayUsingRecursion {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        printArray(arr, 0,arr.length);
    }
    public static void printArray(int [] arr, int i, int len)
    {
        System.out.print(arr [i] + " ");
        if(i >= len-1)
        return;
        printArray(arr,++i, len);
    }

}

