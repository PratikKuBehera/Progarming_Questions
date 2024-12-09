package CodingQuestionByCompany;

import java.util.Scanner;

public class Company5 {

    public static void  sumOfEvenNumber(int start , int end){
        int sum=0;
        for(int i=start ; i<=end ; i++){
            if(i %2==0){
                sum += i;
            }
        }
        System.out.println("The sum of even number is: "+sum);

    }

    public static void main(String[] args) {

        //Program to find sum of even numbers within a given range

        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the start:");
        int start = sc.nextInt();
        System.out.println("Enter the end :");
        int end = sc.nextInt();

        sumOfEvenNumber(start , end);
    }
}
