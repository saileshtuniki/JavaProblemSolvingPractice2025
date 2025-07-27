package patterns;

public class reverseRightAngleTri {
    public static void main(String[] args) {
        int n = 4 ;

        for(int rows = 1; rows<=n ; rows++ ){

            for(int col=1; col <= n-rows+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

