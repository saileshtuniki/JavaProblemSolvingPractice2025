package ReverseTheGivenNum;

import java.util.Scanner;

public class ReverseGivenNum {
    public static void main(String[] args) {
        System.out.println("Enter any number to reverse:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //initial value
        int rev = 0;

        for(int i=0; n > 0 ; i++){
            //Extract the last digit using modulo operator % 10” for clarity.
            int lastDigit = n % 10;

            // Build reversed number by shifting existing digits left and adding last digit
            rev = (rev * 10) + lastDigit;

            // Remove the last digit from n by dividing by 10 (n = n / 10
            n = n/10;
        }
        System.out.println(rev);

    }

}
