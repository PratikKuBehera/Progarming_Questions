package CodingQuestionByNimap;

import java.util.Scanner;

public class Nimap5 {

    public static int findingTheMissingElement(int[] arr ,int n){
        int sum1=0;
        int sum2=0;
        int res=0;
        for(int i= 0 ; i<arr.length; i++){
            sum1 += arr[i];
        }
        n = n+1;
        sum2 = n*(n+1)/2;
        res = sum2-sum1;
        return res;

    }
    public static void main(String[] args) {
        //Find missing number Without using sorting Input :- Int list[ ] = {1,5,6,8,2,7,3,4,10};
        //9
        //1 5 6 8 2 7 3 4 10

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }

        int res = findingTheMissingElement(arr,n);
        System.out.println(res);

    }
}
