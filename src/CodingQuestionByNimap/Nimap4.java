package CodingQuestionByNimap;

import java.util.Scanner;

public class Nimap4 {

    public static int findingSecondLargest(int[] arr){

        int largestNumber= arr[0];
        int smallestNumber=arr[0];
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>largestNumber){
                smallestNumber=largestNumber;
                largestNumber=arr[i];
            } else if (arr[i]> smallestNumber) {
                smallestNumber=arr[i];
            }
        }
        return smallestNumber;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }

        int res =findingSecondLargest(arr);
        System.out.println(res);

    }
}
