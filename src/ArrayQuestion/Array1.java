package ArrayQuestion;

import java.util.Scanner;

public class Array1 {

    public static  int  productOfArray(int[] arr){

        int p = 1;

        for(int i=0; i<arr.length ; i++){
            p *= arr[i];
        }
        return p;
    }

    public static int[] resultArray(int[] arr , int product){

        int[] res = new int[arr.length];

        for(int i=0 ; i<arr.length ; i++){
            res [i] = product/arr[i];
        }

        return res;

    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int product =productOfArray(arr);

        int[] res =resultArray(arr , product);

        for(int i=0 ; i< res.length ; i++){
            System.out.print(res[i]+ " ");
        }
    }
}
