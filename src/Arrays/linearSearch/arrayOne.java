package Arrays.linearSearch;

public class arrayOne {

    public static int search(int arrOne[], int key){


        for(int i=1; i<arrOne.length; i++){
            if(arrOne[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arrOne[] = {1,2,3,4,5};
        int index = search(arrOne, 3);

        if(index  == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index:" + index);
        }
    }
}
