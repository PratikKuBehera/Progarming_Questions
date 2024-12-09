package ArrayQuestion;

import java.util.Scanner;

public class Array4 {

    public static int largestPair(int[] arr){

        int largestNumber = arr[0];
        int smallestNumber = arr[0];

        for(int i =0 ; i<arr.length ;i++){
            if(arr[i] > largestNumber){
                smallestNumber= largestNumber;
                largestNumber=arr[i];
            }
            else if (arr[i] > smallestNumber && arr[i] !=largestNumber ) {

                smallestNumber= arr[i];

            }
        }
        return  largestNumber*smallestNumber;

    }


    // arr--> 3 2 7 4 9
    public static void main(String[] args) {
        // Finding the largest sum Array pair of an array & smallest pair // also the product

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int res =largestPair(arr);
        System.out.println(res);
    }
}
