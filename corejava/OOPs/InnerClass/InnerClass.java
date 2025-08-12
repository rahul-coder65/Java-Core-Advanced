class A {
    int a ;
    public void show(){
        System.out.println("In A Show");
    }
    // Only inner class can be static. 
    static class B {
        public void config(){
            System.out.println("In B Config");
        }
    }
    // class B {
    //     public void config(){
    //         System.out.println("In B Config");
    //     }
    // }
}

public class InnerClass{
    public static void main(String args[]){
          A obj = new A();
          obj.show();
        //   A.B obj2 = obj.new B(); // when B is not a static class 
          A.B obj2 = new A.B();
          obj2.config();

    }
}