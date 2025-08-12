/* var is not allowed for class name 
class var{

} */
class A{

}
public class VarDemo{
    // Can't make a instance variable using var 
    // var b = 10;
    public static void main(String args[]){
        var a = 9;
        int c;
        // you can't make a var variable without initializing 
        // var b;

        // var is not a reserved keywork, you can use as varialbe also.
        String var = "Rahul";
        
        // initializing array using var 
        var nums = new int[20];
        
        // initializing class object using var 
        var obj = new A();

    }
}