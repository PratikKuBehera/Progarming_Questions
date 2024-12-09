package CodingQuestionByNimap;

import java.util.Scanner;

public class Nimap8 {


    public static void fibonacci(int n){
        int a=0;
        int b=1;
        int c;
        for(int i=1 ; i<=n ; i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }



    public static void main(String[] args) {

        //Fibonacci Series in Java

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range :");
        int n = sc.nextInt();

        fibonacci(n);
    }
}
