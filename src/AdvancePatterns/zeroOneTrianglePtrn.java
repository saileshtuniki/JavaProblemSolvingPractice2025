package AdvancePatterns;

public class zeroOneTrianglePtrn {
    public static void main(String[] args) {

        int n = 5; //lines rows

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int val = i+j;
                if(val%2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
                //or
                // in shorthand
//                if ((i + j) % 2 == 0) {
//                    System.out.print("1");
//                } else {
//                    System.out.print("0");
//                }
            }
            System.out.println();
        }
    }
}
