class A{
    public void show1(){
        System.out.println("In A Show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("In B Show");
    }
}

public class TypeCasting{
    public static void main(String args[]){
        // A obj = new A();
        // Upcasting implicit, it is equavallent to A obj = (A) new B():
        A obj = new B();
        // obj = (B)
        obj.show1();
        //Down casting explicit.
        B obj2 = (B)obj;
        obj2.show2();
    }
}