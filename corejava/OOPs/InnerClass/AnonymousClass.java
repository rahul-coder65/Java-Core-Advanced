// class Parent{
//     public void show(){
//         System.out.println("In Parent Show");
//     }
// }

abstract class Parent{
    public abstract void show();
}
public class AnonymousClass {
    public static void main(String args[]){
         
         Parent obj = new Parent(){
            public void show(){
                System.out.print("In Anonymous class show");
            }
         };
         obj.show();
    }
}