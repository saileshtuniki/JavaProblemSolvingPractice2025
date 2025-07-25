package ReverseStr;

import java.util.Scanner;

public class checkPalindrome {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter a String to check it's palindrome or not:");
        String str = sc.nextLine();

        String lowerCase = str.toLowerCase();

        int start = 0;
        int end = str.length()-1;

        while(start < end){
            char firstChar = lowerCase.charAt(start);
            char endChar = lowerCase.charAt(end);

            if(firstChar != endChar){
                //if not
                System.out.println("Its not palindrome");
                return; //exit the func

            }
            start++;
            end--;
        }
        System.out.println("It is a palindrome");

//        StringBuilder sb = new StringBuilder(str);
//        sb.reverse().toString();
//        System.out.println(sb);


    }
}
