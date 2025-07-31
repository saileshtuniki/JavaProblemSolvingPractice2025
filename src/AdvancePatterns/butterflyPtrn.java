package AdvancePatterns;

public class butterflyPtrn {
    public static void butterfly(int n){
        //1st half
        //lines 1 to n
        for(int i=1; i<=n; i++){
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            //stars - i same as i value
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println(); //new line
        }
        //2nd half
        //But from n to 1 because the pattern looks like same and its inverted
        //just change the lines from n to 1
        for(int i=n; i>=1; i--){
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            //stars - i same as i value
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println(); //new line
        }
    }
    public static void main(String[] args) {
        butterfly(4);
    }
}
