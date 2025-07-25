package reverseNumber;

public class ReverseNum {
    public static void main(String[] args) {

        // Declare the number to be reversed
        int n = 241199;

        // using loop to iterate through each element
        // 1. to get the last digit in a numb use % operator num % 10
        // 2. to remove the last digit use / divide operator num/10
        while(n > 0){
            int lastDigit = n%10;  // Ex: in 1st iteration 9
            System.out.print(lastDigit);
            n = n/10;  // the n val will be updated as 24119
        }
        System.out.println();
        System.out.println(n);
    }
}
