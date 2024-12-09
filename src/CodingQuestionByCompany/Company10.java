package CodingQuestionByCompany;

import java.util.Scanner;

public class Company10 {

    public static void LargestSmallest(int[] arr){

        int largest= arr[0];
        int smallest = arr[0];

        for(int ar : arr){
            if(ar > largest){
                largest = ar;
            }
            if(ar<smallest){
                smallest = ar;
            }
        }
        System.out.println("the largest Element is :" + largest);
        System.out.println("The Smallest Element is : "+  smallest);

    }

    public static void main(String[] args) {
        // Largest and Smallest number in array using Single Iteration.


    }
}
