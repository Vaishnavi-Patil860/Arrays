package array;

import java.util.Scanner;

public class minmax {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of array : ");
    int size = sc.nextInt();
    System.out.println("enter a number");

    int  numbers[] = new int[size];

    for(int i =0; i< size; i++){
       
         numbers[i]= sc.nextInt();
    }
    

    int max = Integer.MIN_VALUE; 
    int min = Integer.MAX_VALUE; 


    for(int i = 0; i< numbers.length; i++){
        if(numbers[i] < min){
            min = numbers[i];
        }

        if(numbers[i] > max){
            max = numbers[i];
        }
   }

       System.out.println("largest num :" + max);
       System.out.println("smallest num :" + min);

 sc.close();
     }
 }
    

