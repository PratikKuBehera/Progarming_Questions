package CodingQuestionByCompany;

import java.util.Scanner;

public class Company {

    public static void checkArmstrong( int n ){

        int actualNumber = n , sum=0;

        while(n > 0){

            int digit = n%10;

            sum += digit*digit*digit;

            n /= 10;
        }

        if( sum == actualNumber){
            System.out.println( sum + " " + "The number is Armstrong:::");
        }
        if(sum != actualNumber){
            System.out.println(sum +" "+ "The number is not  Armstrong:::");
        }

    }



    public static void main(String[] args) {
        // 1.Java program to find if a given number is Armstrong number
        /*Input: 153
        Output:
        153 is an Armstrong number.
        Input: 123
        Output:
        123 is not an Armstrong number.

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        checkArmstrong(n);



    }
}
