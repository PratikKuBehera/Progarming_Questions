package ArrayQuestion;

import java.util.Scanner;

public class Array6 {

    public static  void  sumOfPair(int[] arr , int k){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length ; j++){
                int sum = arr[i] + arr[j];
                if(sum > k){
                    System.out.println("["+arr[i]+","+arr[j]+"]");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the k value:");
        int k= sc.nextInt();
        sumOfPair(arr,k);
    }
}