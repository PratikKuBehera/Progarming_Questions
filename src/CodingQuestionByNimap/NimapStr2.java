package CodingQuestionByNimap;

import java.util.Scanner;

public class NimapStr2 {

    public static String reverseTheString(String str){
        String reverse = "";
        for(int i = str.length()-1 ; i>=0 ; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static void checkPallindrom(String str){

        String reversedStrings = reverseTheString(str);

        if(reversedStrings.equals(str)){
            System.out.println("It Is palindrome:");
        }
        else{
            System.out.println("It is not a palindrome:");
        }

    }

    public static void main(String[] args) {
        //civic
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        checkPallindrom(str);

    }
}
