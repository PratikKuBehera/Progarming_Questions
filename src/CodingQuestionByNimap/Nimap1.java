package CodingQuestionByNimap;

import java.util.Scanner;

public class Nimap1 {

    public static void findingLargestAndSmallest(int[]arr){
        int largestNumber = arr[0];
        int smallestNumber = arr[0];

        for(int i=0 ; i<arr.length ;i++){

            if(arr[i]>largestNumber){
                smallestNumber=largestNumber;
                largestNumber=arr[i];
            }
            else if(arr[i]>smallestNumber && arr[i]!= largestNumber){
                smallestNumber=arr[i];
            }

        }
        System.out.println("LARGEST NUMBER :"+ largestNumber +" "+ "2ndLargest:"+smallestNumber);

    }

    public static void main(String[] args) {
        //find largest and 2nd Largest number from given array?
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        findingLargestAndSmallest(arr);

    }
}
