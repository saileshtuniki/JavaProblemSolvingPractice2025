package checkprime;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean isPrime = true;
        
        if(num <= 1){
            isPrime = false;
        } else {
            for(int i=2; i<= Math.sqrt(num); i++){
                if(num%i == 0){
                    isPrime = false;
                    break;  //without checking the further values.
                }
            }
        }
        System.out.println(isPrime);
    }
}


