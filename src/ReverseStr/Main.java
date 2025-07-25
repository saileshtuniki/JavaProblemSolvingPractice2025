package ReverseStr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String to be reversed:");

        String str = sc.nextLine();
        String reversed = "";

        // like, if str = "java" , then str.length = 4;
        for(int i=str.length()-1; i>=0 ;i--){

//            reversed += str.charAt(i);
            reversed = reversed + str.charAt(i);
//            System.out.print(str.charAt(i));
//            System.out.println(str.charAt(i));
        }
            System.out.print(reversed);
        sc.close();
    }
}
