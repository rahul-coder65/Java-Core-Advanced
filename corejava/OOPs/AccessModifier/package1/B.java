package package1;
public class B{
    // Access from anywhere.
    public int b;
    public void show(){
        System.out.println("Protected variable of A class in same package1" + new A().a);
    }
}