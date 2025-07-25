package vehicle;

abstract class Car
{
    abstract void drive();

    public void playmusic(){
        System.out.println("playing music");
    }
}
class BMW extends Car
{
    public void drive() {
        System.out.println("Driving BMW car");
    }
}
public class AbstractClass{
    public static void main(String[] args) {
        Car carObj1 = new BMW();
        carObj1.playmusic();
        carObj1.drive();
    }
}
