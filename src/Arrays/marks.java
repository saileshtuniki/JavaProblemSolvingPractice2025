package Arrays;

import java.util.Scanner;

public class marks {

    public static void update(int stdMarks[]){

        for(int i=0; i<stdMarks.length; i++){
            stdMarks[i] = stdMarks[i]+1;
        }
    }

    public static void main(String[] args) {

        int stdMarks[] = {95,97, 98};

        update(stdMarks);

        //print our marks

        for(int i=0; i<stdMarks.length; i++){
            System.out.print("New updated marks: "+ stdMarks[i] +" ");
        }
        System.out.println();
    }
}
