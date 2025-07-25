package student;

class Student {
    int id; //instance variable
    String name;

    void insertData(int r, String n){
        id = r;
        name= n;
    }

    void display(){
//        System.out.println(id+ " "+name);
        System.out.println(id+ "\n"+name);
    }

}

public class Main{
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student();

//        std1.id = 101;
//        std1.name = "Sailesh";

        std1.insertData(102, "Vamshi");
        std2.insertData(103, "Sailesh");

        std1.display();

//        System.out.println(std1.id+ " "+ std1.name);
    }
}
