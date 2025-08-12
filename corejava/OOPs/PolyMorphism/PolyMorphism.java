
class A{
    public void show(){
        System.out.println("In A class show");
    }
}

class B extends A{
    public void show(){
        System.out.println("In Show B");
    }
}
public class PolyMorphism{
    
    public static void main(String args[]){
        A obj = new A();
        obj.show();
        obj = new B();
        obj.show();
    }
        
}