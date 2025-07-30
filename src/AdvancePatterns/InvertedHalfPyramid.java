package AdvancePatterns;

public class InvertedHalfPyramid {

    public static void main(String[] args) {
        int n=4; //lines
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
