package CodingQuestionByCompany;

import java.util.Scanner;

public class Company6 {

    public static void  countOfString(String str){
        String[] words =str.split(" ");
        System.out.println(words.length);
    }

    public static void main(String[] args) {
        //count the number of strings in the hello word.

        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        countOfString(str);

    }
}
