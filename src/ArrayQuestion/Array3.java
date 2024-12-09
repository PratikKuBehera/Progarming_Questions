package ArrayQuestion;

import java.util.Scanner;

public class Array3 {

    public static  int findingSmallestReapting(int[] arr){

        int smallestRepeating=0;

        for(int i =0; i<arr.length ;i++){
            for(int j=i ; j<arr.length+1 ; j++){

                if(arr[i] == arr[j]) {

                    return arr[i];
                }
            }
        }
        return -1;

    }



    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int res =findingSmallestReapting(arr);
        System.out.println(res);

    }
}
