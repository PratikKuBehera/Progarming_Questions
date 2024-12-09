package ArrayQuestion;

import java.util.Scanner;

public class Array2 {

    public static void findingSecondLargest(int[] arr){

        int p=0;
        int vp=0;

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>p){
                vp=p;
                p= arr[i];
            } else if (arr[i] >vp) {
                vp=arr[i];
            }
        }
        System.out.println(vp);

    }



    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        findingSecondLargest(arr);

    }
}
