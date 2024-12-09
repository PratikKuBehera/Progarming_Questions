package CodingQuestionByNimap;

import java.util.Scanner;

public class Nimap6 {

    public static int reverse(int num){
        int reverse =0;
        while(num !=0){
            int digit = num%10;
            reverse=reverse*10+digit;
            num = num/10;
        }
        return reverse;
    }

    public static void printing(int[]arr){

        for(int i=0 ; i<arr.length ; i++){
            int reversed =reverse(arr[i]);
            if(reversed == arr[i]){
                System.out.println("This Number is palindrome:" + arr[i]);
            }
        }

    }


    public static void main(String[] args) {
        //The Element Present in the array palindrome or not
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        printing(arr);
    }
}
