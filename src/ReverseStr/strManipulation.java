package ReverseStr;

import java.util.Scanner;

public class strManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String to manipulate:");

        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                sb.append("X");
            }else{
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
