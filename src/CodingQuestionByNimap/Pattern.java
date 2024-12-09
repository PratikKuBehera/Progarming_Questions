package CodingQuestionByNimap;

public class Pattern {

//            * * * * *
//            * * * * *
//            * * * * *
//            * * * * *
//            * * * * *


    public static void pattern1(){
        int i;
        int n=5;

        for(i=1 ;i<=n ;i++){
            for(int j =1 ; j<=n ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void pattern2(){

        /*
            1 1 1 1 1
            2 2 2 2 2
            3 3 3 3 3
            4 4 4 4 4
            5 5 5 5 5
         */


        int i;
        int n=5;

        for(i=1 ;i<=n ;i++){
            for(int j =1 ; j<=n ; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void pattern3(){

        /*
           * * * * *
           *       *
           *       *
           *       *
           * * * * *

         */


        int i;
        int n=5;

        for(i=1 ;i<=n ;i++){
            for(int j =1 ; j<=n ; j++){
                if(i==1 || i==5 || j==1 || j==5){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern4(){

        /*
            1 2 3 4 5
            1 2 3 4 5
            1 2 3 4 5
            1 2 3 4 5
            1 2 3 4 5

         */


        int i;
        int n=5;

        for(i=1 ;i<=n ;i++){
            for(int j =1 ; j<=n ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }


    public static void pattern5(){
        /*
            01 02 03 04 05
            06 07 08 09 10
            11 12 13 14 15
            16 17 18 19 20
            21 22 23 24 25
         */

        int i=0,j=0;
        int n=5;
        int count=1;
        for(i=1 ; i<=n ; i++){
            for(j=1 ; j<=n ;j++){
                if(count<=9){
                    System.out.print("0");
                }
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }

    public static void pattern6(){
        /*
            1 2 3 4 5
            2 3 4 5 6
            3 4 5 6 7
            4 5 6 7 8
            5 6 7 8 9

         */
        int i=0,j=0;
        int n=5;
        int count;
        for(i=0 ; i<n ; i++){
            count = i+1;
            for(j=0 ; j<n ;j++){
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }



    public static void pattern7(){
        /*
         *
         * *
         * * *
         * * * *
         * * * * *

         */
        int i=0,j=0;
        int n=5;
        for(i=1 ; i<=n ; i++){
            for(j=1 ; j<=i ;j++){
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }


    public static void pattern8(){
        /*
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5


         */
        int i=0,j=0;
        int n=5;
        for(i=1 ; i<=n ; i++){
            for(j=1 ; j<=i ;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }


    public static void pattern9(){
        /*
            1
            2 2
            3 3 3
            4 4 4 4
            5 5 5 5 5


         */
        int i=0,j=0;
        int n=5;
        for(i=1 ; i<=n ; i++){
            for(j=1 ; j<=i ;j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }

    public static void pattern10(){
        /*
             *
            **
           ***
          ****
         *****


         */

        int n=5;
        for(int i=1 ; i<=n ; i++){
            for(int k=1; k <= n-i ; k++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void pattern11(){
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */

        int n=5;

        for(int i=1 ; i<=n ;i++ ){
            for(int k=1 ; k<=n ;k++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }


    public static void pattern12(){
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */

        int n=5;

        for(int i=1 ; i<=n ;i++){
            for(int k=1 ; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j =1 ; j<=i ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void pattern13(){
        /*
           *
          *  *
         *  *  *
         *  * * *
         * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */

        int n=6;

        for(int i=1 ; i<=n ;i++){
            for(int k=1 ; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j =1 ; j<=i ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for(int i= n-1 ; i>=1 ; i--){
            for(int k =1 ; k<n-i ; k++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print("*"+"  ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        pattern13();



    }

}
