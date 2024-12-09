package CodingQuestionByNimap;

import java.util.Scanner;

public class Nimap10 {

    public static void checkPrime(int n){

        boolean isPrime = true;

        for(int i =2 ; i*i<=n ; i++){
            if( n%i == 0 ){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println("The number is Prime:::");
        }else{
            System.out.println("The number is Not Prime:::");
        }

    }

    public static void main(String[] args) {
        //prime number?
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        checkPrime(n);
    }
}
