// abstract class Computer{
//     protected abstract void code();
//     private int a=3;
// }

// Interface is a class in which all the methods are public abstract by default.
//Interfaces are three types 
// 1. Normal Interface - In this interface two or more abstract methods are present.
// 2. Functional / SAM( Single Abstract Method) - As a named Single abstract method only. 
// 3. Marker Interface - In this interface there is not abstract method.
interface Computer{
    void code();
    int a=3;  // Every variable in interface is by default final and static.
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Code, compile and run.");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Code, compile and run : Faster");
    }
}
class Developer{
    public void devApp(Computer com){
        com.code();
    }
}

public class InterfaceDemo{
    public static void main(String args[]){
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer dev = new Developer();
        dev.devApp(lap);
        dev.devApp(desk);
        System.out.println(lap.a);
    }
}