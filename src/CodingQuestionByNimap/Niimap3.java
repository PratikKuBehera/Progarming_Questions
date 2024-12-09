package CodingQuestionByNimap;
import java.util.Scanner;
public class Niimap3 {

    public static void PrimeNumber(int[] arr){

        for(int i=0 ; i<arr.length ; i++){
            if(findPrimeNumber(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }
    public static boolean findPrimeNumber(int n){

        for(int i=2 ; i*i<=n ;i++ ){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        //Print the Prime number from given array ?
        //5
        //12 7 9 11 13
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }

        PrimeNumber(arr);

    }
}
