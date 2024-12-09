package CodingQuestionByNimap;

import java.util.Scanner;

public class Nimap9 {


    public static void secondLargest(int[] arr){
        int largest = arr[0];
        int sLargests= arr[0];

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] >largest ){
                sLargests= largest;
                largest =arr[i];
            }
            else if(arr[i] > sLargests && arr[i]!= largest){
                sLargests =arr[i];
            }
        }
        System.out.println(sLargests);
    }


    public static void main(String[] args) {
        // find 2nd lagest number from given array ?
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n= sc.nextInt();
        int[] arr = new int[n];

        for(int i=0 ;i<n ;i++){
            arr[i] = sc.nextInt();
        }

        secondLargest(arr);
    }
}
