package package2;
import package1.*;
public class D{
    // Access only in the same class only.
    private int d;

    public void showD(){
        System.out.println("Private variable in D class" + d);
    }
  
}