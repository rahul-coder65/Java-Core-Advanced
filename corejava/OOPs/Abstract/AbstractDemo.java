// A abstract class can have zero or more abstract method 
// A abstract method can only be define in a abstract class. 
// Definition of abstract method must not be in the class where it has been declared;

abstract class Car{
    public abstract void drive();
    public abstract void fly();

    public void playMusic(){
        System.out.println("Play Music..");
    }
}
abstract class WagnoR extends Car{
    public void drive(){
        System.out.println("Driving....");
    }
}
class WagnoRnew extends WagnoR{   // concret class.
     public void fly(){
        System.out.println("Flying....");
     }
}

public class AbstractDemo{
    public static void main(String args[]){
        Car obj = new WagnoRnew();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}