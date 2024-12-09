package CodingQuestionByNimap;

import java.util.Scanner;

public class NimapStr1 {

    public static void findCharecter(String str){

        int [] fetchChar = new int[256];

        for(int i =0 ; i< str.length() ; i++){
            char ch = str.charAt(i);
            fetchChar[ch]++;
        }

        for(int i =0 ; i< 256 ; i++){
            if(fetchChar[i]>0){ //Printing the character if  present
                System.out.print("["+(char) i +"-->"+ fetchChar[i]+" "+"]");
            }
        }

    }

    public static void main(String[] args) {
        //frequency of each character of given string?
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        findCharecter(str);
    }
}
