package ArrayQuestion;

import java.util.Scanner;
public class Array5 {
    public static void printingPair(int[] arr){
        for(int i =0 ; i<arr.length-1 ; i++){
            for(int j=i+1 ; j<arr.length ; j++) {
                System.out.println("["+arr[i] + "," + arr[j]+"]");
                System.out.println("-------------------");
            }

        }
    }
    public static void main(String[] args) {
        // printing the  pair present in an array?
        //5-->Size:
        //3 2 5 7 1--> elements:
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        // calling the methode :
        printingPair(arr);
    }
}
