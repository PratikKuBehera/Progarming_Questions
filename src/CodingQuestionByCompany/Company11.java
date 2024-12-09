package CodingQuestionByCompany;

import java.util.Arrays;
import java.util.Scanner;

public class Company11 {

    public static boolean checkAnagrams(String str1 , String str2){
        char[]  arr1 =str1.toLowerCase().toCharArray();
        char[] arr2 =str2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return  Arrays.equals(arr1,arr2);

    }

    public static void main(String[] args) {
        //11.Write a program to check whether two given strings are anagrams of each other. For example, given the input:
        //Input:
        //  Listen
        //  Silent
        //Output:
        //True

        Scanner sc1  =new Scanner(System.in);
        Scanner sc2  =new Scanner(System.in);
        System.out.println("Enter the string1:");
        String str1 = sc1.nextLine();
        System.out.println("Enter the string2:");
        String str2 = sc2.nextLine();


        boolean res =checkAnagrams(str1 , str2);
        System.out.println(res);

    }
}
