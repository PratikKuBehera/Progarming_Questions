package ArrayQuestion;

import java.util.Scanner;

public class Array7 {

    public static void printingSortedArrayElement(int[] arr){

        int count =1;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]== arr[i+1]){
                count++;
            }else{
                System.out.println(arr[i]+"-"+count);
                count=1;
            }
        }
        System.out.println(arr[arr.length-1]+"-"+ count);
    }

    public static void main(String[] args) {
        //Printing the occurrence of each element present in the array && The array is sorted:
        // 8-->size
        //2 2 2 3 4 4 4 23

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        printingSortedArrayElement(arr);
    }
}
