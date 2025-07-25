package ReverseStr;

import java.util.Scanner;

public class strBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String to be reversed using StringBuffer:");

        String str = sc.nextLine();

        // Using StringBuffer built-in reverse() method
        StringBuffer sb = new StringBuffer(str);
        String reversed = sb.reverse().toString();

        System.out.print(reversed);

        sc.close();
    }
}
