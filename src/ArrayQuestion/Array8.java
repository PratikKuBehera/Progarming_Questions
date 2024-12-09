package ArrayQuestion;

import java.util.Scanner;

public class Array8 {

    public static void  productOfArray(int[] arr){
        int n=2;//---. size of sub array;
        int pro ; // ---> mul value;
        int largest=0; // ---> pro largest number store
        int startIndex =0;
        for(int i = 0 ; i<= arr.length - n  ; i++){
            pro =1;
            for (int j =i ; j<i+n ; j++){
                pro *= arr[j];
            }
            if(pro > largest ){
                largest = pro;
                startIndex = i;
            }
        }
        System.out.println(largest);

        for(int i = startIndex ; i<startIndex+n ; i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void findLagestProduct(int[] arr , int largest){

        int n =2;
        int pro = 1;

        for(int i =0 ; i<=arr.length-n ; i++){
            pro=1;
            for(int j = i ; j<i+n ; j++){
                pro*=arr[j];
            }

            if(pro == largest){
                for(int j =i ; j<i+n ; j++){
                    System.out.print(arr[j]+" ");
                }
            }

        }
        System.out.println(largest);



    }

    public static void main(String[] args) {
        //2 2 2 3 4 4 4 23 highest product of sub array

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        productOfArray(arr);
       // findLagestProduct(arr, res);

    }
}
