package CodingQuestionByNimap;

public class Partten {

    public static void pattern1(){
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        int n =5;
        for(int i=1 ; i<=n ;i++){
            for(int j =1 ; j<=i ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }


    public static void pattern2(){
        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */
        int n =5;
        for(int i=1 ; i<=n ;i++){
            for(int j =1 ; j<=n ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }


    public static void pattern3(){
        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        int n =5;
        for(int i=1 ; i<=n ;i++){
            for(int j=1 ; j<=n+1-i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void pattern4(){
        /*
            1
            2 2
            3 3 3
            4 4 4 4
            5 5 5 5 5
         */
        int n =5;
        for(int i=1 ; i<=n ;i++){
            for(int j=1 ; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void pattern5(){
        /*
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
         */
        int n =5;
        for(int i=1 ; i<=n ;i++){
            for(int j=1 ; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void pattern6(){
        /*
           12345****
           1112131415***
         */
        int n =5;
        for(int i=1 ; i<=n ;i++){
            System.out.print(i+" ");

        }
        for(int i =0 ; i<=5 ; i++){
            System.out.print("*"+" ");
        }

        System.out.println();

        for(int i=11 ; i<=15 ;i++){
            System.out.print(i+" ");

        }
        for(int i =0 ; i<=5 ; i++){
            System.out.print("*"+" ");
        }

    }

    public static void pattern7(){
        /*
            4 4
            6 6 6
            8 8 8 8
         */

        int start =4;
        int row =3;

        for(int i=2 ; i<=row+1 ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(start+" ");
            }
            System.out.println();
            start+=2;
        }
    }





    public static void main(String[] args) {

        pattern7();

    }
}
