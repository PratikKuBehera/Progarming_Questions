package CodingQuestionByCompany;
import java.util.Scanner;

public class Company3 {

    public static void stringTwice(String str){

        StringBuilder res =new StringBuilder();
        for(char c: str.toCharArray()){
            for(int i =0; i<2 ; i++){
                res.append(c);
            }

        }
        System.out.println(res.toString());

    }

    public static void main(String[] args) {

        //Print the characters of a given string twice ex,
        // for a string "hello" output should be "hheelloo"

        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        stringTwice(str);

    }
}
