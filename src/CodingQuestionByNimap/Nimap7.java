package CodingQuestionByNimap;

public class Nimap7 {
    public static void main(String[] args) {
        //Printing the pattern
        //4
        //6 6
        //8 8 8
        //10 10 10 10
//        int row =5;
//        int start=4;
//
//        for(int i=2 ; i<row ; i++){
//            for(int j=1 ; j<=i ;j++){
//                System.out.print(start+" ");
//            }
//            System.out.println();
//            start =start+2;
//        }

        int count=0;

        for(int i=1 ; i<=10; i++){
            for(int j=1 ; j<=10 ; j++){
                count++;
                if(count >=5 && count<=10 ||count >=15 && count<=20 || count >=25 && count<=30 || count >=35 && count<=40 || count >=45 && count<=50 ||
                        count >=55 && count<=60 || count >=65 && count<=70 || count >=75 && count<=80 || count >=85 && count<=90 ||
                        count >=95 && count<=100){
                    System.out.print("*");
                    continue;
                }



                if(count <=9){
                    System.out.print("0");
                }

                System.out.print(count+" ");
            }
            System.out.println();
        }

    }
}
