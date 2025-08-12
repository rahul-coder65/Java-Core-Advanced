// final - variable , class, method

//Stopping the inheritance
// final class Calc {
//     public void show(){
//         System.out.println("In Calc Show");
//     }
//     public void add(int a, int b){
//         System.out.println(a + b);
//     }
// }

class Calc {
    // STOPPING Overriding the method.
     public final void show(){
        System.out.println("In Calc Show");
    }
    public void add(int a, int b){
        System.out.println(a + b);
    }
}
class AdvCalc extends Calc{
    // Not possible because this method is final method.
    // public void show(){
    //     System.out.println("In AdvCalc Show");
    // }
}
public class FinalDemo{
    public static void main(String args[]){
        // final int a = 9;
        // Calc obj = new Calc();
        // obj.show();
        // obj.add(3, 4);
        Calc obj = new AdvCalc();
        obj.show();
    
    }
}