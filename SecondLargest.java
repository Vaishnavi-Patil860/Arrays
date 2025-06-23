package array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second largest element:" + secondLargest);
    }
    public static int findSecondLargest(int[] arr){
        if (arr.length < 2){
            throw new IllegalArgumentException("array must have at least two elements");
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num:arr){
            if (num > largest){
                secondLargest = largest;
                largest = num;
            }
            else if(num > secondLargest && num<largest){
                secondLargest = num;
            }
        }
        return secondLargest;
        }
    }
    
        
    
    

