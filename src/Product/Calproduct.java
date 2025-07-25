package Product;

import static java.lang.Long.sum;

class product{
    int a ;
    int b ;

    void sum (int a, int b){
        int sum = a * b;
    }
}

public class Calproduct {
    public static void main(String[] args) {

        System.out.println(sum(2,4));
    }
}
