package CodingQuestionByNimap;

import java.util.Scanner;

public class NimapStr4 {

    public static void longestString(String str){
       String[] words = str.split(" ");
       String longest="";

       for(int i=0 ; i<words.length ; i++){
           if(words[i].length() > longest.length()){
               longest = words[i];
           }
       }
        System.out.println("The Longest Word is :"+longest );

    }

    public static void main(String[] args) {
        //find longest or highest word from sentence Sample
        // input:- "hii Nikhil8053 Rindhe"
        // Output: Nikhil8053
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The String :");
        String str = sc.nextLine();

        longestString(str);

    }
}
