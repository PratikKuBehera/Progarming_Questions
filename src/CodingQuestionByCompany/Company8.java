package CodingQuestionByCompany;

import java.util.Scanner;

public class Company8 {

    public static void printCharacters(String str , int n){

        for(int i=0 ; i<str.length() ; i=i+3){
            int end = Math.min(i+n , str.length());
            System.out.println(str.substring(i , end));
        }


//        for(int i =0 ; i< str.length() ; i+=n){
//            for(int j = i ; j<i+n && j<str.length() ; j++ ){
//                System.out.print(str.charAt(j));
//            }
//            System.out.println();
//        }

    }

    public static void main(String[] args) {
        //8.Given the string "Abcdefghijk" and the integer N=3, write a program to print the characters in the following pattern:
        //   abc
        //   def
        //   ghi
        //   jk

        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println("Enter the n value:");
        int n = sc.nextInt();



        printCharacters(str , n);









    }
}
