package CodingQuestionByNimap;

import java.util.Scanner;

public class NimapStr3 {

    public static  void  findLongestAndSmallestWord(String str){

        String[] word =str.split(" ");
        String longest = "";

        for(int i=0 ;i < word.length ; i++){
            if(word[i].length() > longest.length()){
                longest = word[i];
            }
        }
        System.out.println("The Longest String is :"+longest);

    }


    public static void main(String[] args) {

        // Finding the Longest and the Shortest Word in the element.
        //In Put : Hello every one good morning have a nice day
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        findLongestAndSmallestWord(str);

    }

}
