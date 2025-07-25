package ReverseStr;

import java.util.Scanner;

public class strBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String to be reversed using stringBuilder:");

        String str = sc.nextLine();

        // Using StringBuilder built-in reverse() method
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();

        System.out.print(reversed);

        sc.close();
    }
}
