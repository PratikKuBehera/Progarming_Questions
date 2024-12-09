package CodingQuestionByCompany;

import java.util.Scanner;

public class Company4 {

    public static  void consonantCount(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z' && "aeiou".indexOf(c) == -1) {
                count++;
            }
        }

        System.out.println(count);

    }


    public static void main(String[] args) {
        //write a Java program to count consonants in a given string
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        consonantCount(str);
    }

}
