import java.util.Scanner;

public class Main {


    public static void gettingLargestAndSmallerst(int[] arr , int sum){

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for(int i=0 ; i< arr.length ; i++){

            if( arr[i]<max){
                max=arr[i];
            }
            if(arr[i]>min){
                min = arr[i];
            }
        }

        int largest =sum-max;
        int smallest =sum-min;

        System.out.println("Lagest Element :" + largest +" "+ "smallest :"+ smallest);
    }


    public static  int sumOfArray(int[] arr){
        int sum =0;
        for(int i=0 ; i<arr.length ; i++){
            sum += arr[i];
        }
       return sum;
    }





    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int sum =sumOfArray(arr);
        gettingLargestAndSmallerst(arr,sum);


    }
}