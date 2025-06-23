package array;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter the size of the array: ");

         int size = sc.nextInt();

        int[] numbers = new int[size];

        //input array size
        System.out.println("Enter " + size + " elements:");
          for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
          }

          //calculate sum
          int sum = 0;
          for(int num :numbers){
               sum += num;
          }
        
            System.out.println("Sum of all elements:" + sum);
           sc.close();
        
        }

    }

    

