package patterns;

public class HalfPyranidCustomNumPtrn {
    public static void main(String[] args) {

        int n = 4;  //no of lines rows

        int num = 1;  // starting num from row 1

        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }

    }
}
