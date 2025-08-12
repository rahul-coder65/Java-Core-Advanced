package package2;
import package1.*;
public class C extends A{
    //Access in the same package only.
    int c;
    public void show(){
        System.out.println("Protected variable of A class in different package2 " + a);
    }
}