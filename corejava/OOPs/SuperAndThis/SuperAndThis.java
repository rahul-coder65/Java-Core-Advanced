
class A {

    public A(){
        System.out.println("In A Class");
    }
    public A(int n){
        System.out.println("in A int");
    }
    public A(String n){
        System.out.println("In A String");
    }

}
class B extends A{
   
   public B(){
    // super();
    this(3);
    System.out.println("In B class");
   }
   public B(int n){

   
    System.out.println("In B int");
   }

}


public class SuperAndThis{
    public static void main(String args[]){
      B obj;
      new B();  // anonymous object you can't use this.
    }
}