package patterns;

public class CharacterPattern {
    public static void main(String[] args) {

        int n=4;  // lines
        char ch = 'A';

        //outer loop
        for(int row=1; row<=n; row++){
            //inner loop
            for(int col=1; col<=row; col++){
                System.out.print(ch);
                ch++;   // iterates through each char and increment by 1
            }
            System.out.println();
        }
    }
}
