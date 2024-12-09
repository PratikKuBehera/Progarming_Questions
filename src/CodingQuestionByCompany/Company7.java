package CodingQuestionByCompany;

import java.util.Scanner;

public class Company7 {

    public static void reapting(String str){

        for(int i=0 ; i< str.length() ; i+=2){
            for(int j=0 ; j<3 ; j++){
                System.out.print(str.charAt(i));
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        //Given the string "WORLD", write a program to print the characters in the following pattern:
        //WWW
        // RRR
        // DDD
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        reapting(str);







    }
}
