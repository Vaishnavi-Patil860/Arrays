import java.util.Scanner;

public class ProductOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the elements  : " );
        int size = sc.nextInt();

        int [] numbers = new int [size];

        System.out.println("enter " + size + " elements ");
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        int pro = 1 ;
        for(int num : numbers ){
            pro *= num;

        }
        System.out.println("product of elements : " + pro);

    }
}
